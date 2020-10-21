/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package care.data4life.fhir.r4.json;

import com.squareup.moshi.BigDecimalDelegateJsonReader;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import care.data4life.fhir.r4.model.DomainResource;
import care.data4life.fhir.r4.model.FhirR4Base;
import care.data4life.fhir.r4.model.Resource;

public class FhirR4BaseAdapter extends JsonAdapter<FhirR4Base> {

    private static final String JSON_KEY_RESOURCE_TYPE = "resourceType";
    private static final String JSON_KEY_CONTAINED = "contained";

    private Moshi moshi;


    public FhirR4BaseAdapter(Moshi moshi) {
        this.moshi = moshi;
    }

    @Nullable
    @Override
    public FhirR4Base fromJson(JsonReader reader) throws IOException {
        return fromJson(new BigDecimalDelegateJsonReader(reader));
    }

    @Nullable
    @SuppressWarnings("unchecked")
    FhirR4Base fromJson(BigDecimalDelegateJsonReader reader) throws IOException {
        if (reader.peek() == JsonReader.Token.NULL) {
            return null;
        }

        Object jsonObject = reader.readJsonValueBigDecimal();

        if (jsonObject instanceof Map) {
            Map<String, Object> jsonMap = (Map<String, Object>) jsonObject;

            Object resourceType = jsonMap.get(JSON_KEY_RESOURCE_TYPE);

            if (resourceType instanceof String) {
                try {
                    Class<?> clazz = Class.forName(FhirR4Base.class.getPackage().getName() + "." + resourceType);

                    JsonAdapter<?> jsonAdapter = moshi.adapter(clazz);

                    if (jsonAdapter != null) {
                        if (jsonMap.containsKey(JSON_KEY_CONTAINED)) {
                            List<Resource> containedResources = fromContainedResources(jsonMap);
                            if (containedResources != null) {
                                jsonMap.remove(JSON_KEY_CONTAINED);
                            }


                            DomainResource resource = (DomainResource) jsonAdapter.fromJsonValue(jsonObject);
                            if (resource != null) {
                                resource.contained = containedResources;
                            }

                            return resource;

                        } else {
                            return (FhirR4Base) jsonAdapter.fromJsonValue(jsonObject);
                        }
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    private List<Resource> fromContainedResources(Map<String, Object> jsonMap) {
        List<Resource> containedResourceList = new ArrayList<>();

        Object jsonContainedObject = jsonMap.get(JSON_KEY_CONTAINED);
        if (jsonContainedObject instanceof List) {
            List<Object> jsonContainedList = (List<Object>) jsonContainedObject;

            for (Object containedObject : jsonContainedList) {
                if (containedObject instanceof Map) {
                    Map<String, Object> jsonContainedMap = (Map<String, Object>) containedObject;
                    Object containedResourceType = jsonContainedMap.get(JSON_KEY_RESOURCE_TYPE);
                    if (containedResourceType instanceof String) {
                        try {
                            Class<?> containedClazz = Class.forName(FhirR4Base.class.getPackage().getName() + "." + containedResourceType);

                            JsonAdapter<?> containedJsonAdapter = moshi.adapter(containedClazz);

                            Resource fhirContainedObject = (Resource) containedJsonAdapter.fromJsonValue(jsonContainedMap);
                            if (fhirContainedObject != null) {
                                containedResourceList.add(fhirContainedObject);
                            }

                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return containedResourceList;
    }


    @Override
    @SuppressWarnings("unchecked")
    public void toJson(JsonWriter writer, @Nullable FhirR4Base value) throws IOException {
        if (value == null) {
            return;
        }

        List<Map<String, Object>> containedObjectMapList = null;
        if (value instanceof DomainResource) {
            DomainResource domainResource = (DomainResource) value;
            if (domainResource.contained != null) {
                containedObjectMapList = toContainedResources(domainResource.contained);
            }
        }

        Class type = value.getClass();
        JsonAdapter jsonAdapter = moshi.adapter(type);
        if (jsonAdapter != null) {
            Object jsonObject = jsonAdapter.toJsonValue(value);
            if (jsonObject instanceof Map) {
                Map<String, Object> jsonMap = (Map<String, Object>) jsonObject;

                if (containedObjectMapList != null) {
                    jsonMap.put(JSON_KEY_CONTAINED, containedObjectMapList);
                }

                jsonMap.put(JSON_KEY_RESOURCE_TYPE, value.getResourceType());

                JsonAdapter mapJsonAdapter = moshi.adapter(Map.class);
                mapJsonAdapter.toJson(writer, jsonMap);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> toContainedResources(List<Resource> resourceList) {
        List<Map<String, Object>> containedObjectMapList = new ArrayList<>();

        for (Resource resource : resourceList) {
            JsonAdapter<Resource> containedJsonAdapter = (JsonAdapter<Resource>) moshi.adapter(resource.getClass());
            if (containedJsonAdapter != null) {
                Object containedObject = containedJsonAdapter.toJsonValue(resource);
                if (containedObject instanceof Map) {
                    Map<String, Object> containedObjectMap = (Map<String, Object>) containedObject;
                    containedObjectMap.put(JSON_KEY_RESOURCE_TYPE, resource.getResourceType());
                    containedObjectMapList.add(containedObjectMap);
                }
            }
        }

        return containedObjectMapList;
    }

}
