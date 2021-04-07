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

package care.data4life.fhir.r4.model;

import com.squareup.moshi.Json;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Meta.java
 * <p>
 * The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to
 * the content might not always be associated with version changes to the resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Meta">Meta</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Meta) on 2021-04-07
 */
public class Meta extends Element {

    public static final String resourceType = "Meta";

    // Version specific identifier.
    @Json(name = "versionId")
    @Nullable
    public String versionId;

    // When the resource version last changed.
    @Json(name = "lastUpdated")
    @Nullable
    public FhirInstant lastUpdated;

    // Identifies where the resource comes from.
    @Json(name = "source")
    @Nullable
    public String source;

    // Profiles this resource claims to conform to.
    @Json(name = "profile")
    @Nullable
    public List<Canonical> profile;

    // Security Labels applied to this resource.
    @Json(name = "security")
    @Nullable
    public List<Coding> security;

    // Tags applied to this resource.
    @Json(name = "tag")
    @Nullable
    public List<Coding> tag;


    public Meta() {
    }

    @Override
    public String getResourceType() {
        return Meta.resourceType;
    }


}
