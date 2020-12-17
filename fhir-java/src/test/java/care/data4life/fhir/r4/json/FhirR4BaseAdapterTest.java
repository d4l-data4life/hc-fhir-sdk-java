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

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import care.data4life.fhir.r4.model.CodeSystemDocumentReferenceStatus;
import care.data4life.fhir.r4.model.DiagnosticReport;
import care.data4life.fhir.r4.model.DocumentReference;
import care.data4life.fhir.r4.model.FhirR4Base;
import care.data4life.fhir.r4.model.Resource;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FhirR4BaseAdapterTest {

    private static final String JSON_KEY_RESOURCE_TYPE = "resourceType";
    private static final String JSON_KEY_CONTAINED = "contained";

    private static final String RESOURCE_TYPE = DocumentReference.resourceType;
    private static final String CONTAINED_RESOURCE_TYPE = DiagnosticReport.resourceType;

    private Moshi mockMoshi;
    private JsonReader mockReader;
    private BigDecimalDelegateJsonReader mockBidDecimalReader;
    private JsonWriter mockWriter;
    private Map<String, Object> mockJsonObjectMap;


    // SUT
    private FhirR4BaseAdapter adapter;


    @Before
    public void setup() {
        mockMoshi = mock(Moshi.class);
        mockReader = mock(JsonReader.class);
        mockWriter = mock(JsonWriter.class);
        mockJsonObjectMap = mock(Map.class);
        mockBidDecimalReader = mock(BigDecimalDelegateJsonReader.class);

        adapter = new FhirR4BaseAdapter(mockMoshi);
    }


    @Test
    public void fromJson_shouldReturnFhirObject_whenFhirJson() throws Exception {
        // Given
        Class type = DocumentReference.class;
        DocumentReference mockDocument = mock(DocumentReference.class);

        JsonAdapter mockAdapter = mock(JsonAdapter.class);

        when(mockBidDecimalReader.readJsonValueBigDecimal()).thenReturn(mockJsonObjectMap);
        when(mockJsonObjectMap.get(JSON_KEY_RESOURCE_TYPE)).thenReturn(RESOURCE_TYPE);
        when(mockMoshi.adapter(type)).thenReturn(mockAdapter);
        when(mockAdapter.fromJsonValue(mockJsonObjectMap)).thenReturn(mockDocument);

        // When
        Object result = adapter.fromJson(mockBidDecimalReader);

        // Then
        assertThat(result, instanceOf(type));

        InOrder inOrder = inOrder(mockMoshi, mockReader, mockBidDecimalReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockBidDecimalReader).readJsonValueBigDecimal();
        inOrder.verify(mockJsonObjectMap).get(JSON_KEY_RESOURCE_TYPE);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verify(mockAdapter).fromJsonValue(mockJsonObjectMap);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void fromJson_shouldReturnFhirObject_whenFhirJsonWithContainedResources() throws Exception {
        // Given
        Class type = DocumentReference.class;
        Class containedType = DiagnosticReport.class;
        DocumentReference mockDocument = mock(DocumentReference.class);

        JsonAdapter mockAdapter = mock(JsonAdapter.class);
        JsonAdapter mockContainedAdapter = mock(JsonAdapter.class);

        DiagnosticReport mockContainedObject = mock(DiagnosticReport.class);
        Map mockContainedObjectMap = mock(Map.class);
        List containedList = asList(mockContainedObjectMap);

        when(mockBidDecimalReader.readJsonValueBigDecimal()).thenReturn(mockJsonObjectMap);
        when(mockJsonObjectMap.get(JSON_KEY_RESOURCE_TYPE)).thenReturn(RESOURCE_TYPE);
        when(mockJsonObjectMap.containsKey(JSON_KEY_CONTAINED)).thenReturn(true);
        when(mockJsonObjectMap.get(JSON_KEY_CONTAINED)).thenReturn(containedList);
        when(mockContainedObjectMap.get(JSON_KEY_RESOURCE_TYPE)).thenReturn(CONTAINED_RESOURCE_TYPE);
        when(mockMoshi.adapter(type)).thenReturn(mockAdapter);
        when(mockMoshi.adapter(containedType)).thenReturn(mockContainedAdapter);
        when(mockContainedAdapter.fromJsonValue(mockContainedObjectMap)).thenReturn(mockContainedObject);
        when(mockAdapter.fromJsonValue(mockJsonObjectMap)).thenReturn(mockDocument);

        // When
        Object result = adapter.fromJson(mockBidDecimalReader);

        // Then
        assertThat(result, instanceOf(type));

        InOrder inOrder = inOrder(mockMoshi, mockReader, mockBidDecimalReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockBidDecimalReader).readJsonValueBigDecimal();
        inOrder.verify(mockJsonObjectMap).get(JSON_KEY_RESOURCE_TYPE);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verify(mockAdapter).fromJsonValue(mockJsonObjectMap);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void fromJson_shouldReturnNull_whenFhirJsonNull() throws Exception {
        // Given
        JsonAdapter mockAdapter = mock(JsonAdapter.class);

        when(mockBidDecimalReader.peek()).thenReturn(JsonReader.Token.NULL);


        // When
        Object result = adapter.fromJson(mockBidDecimalReader);

        // Then
        assertNull(result);

        InOrder inOrder = inOrder(mockMoshi, mockReader, mockBidDecimalReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockBidDecimalReader).peek();
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void fromJson_shouldReturnNull_whenFhirJsonNotMap() throws Exception {
        // Given
        JsonAdapter mockAdapter = mock(JsonAdapter.class);

        when(mockBidDecimalReader.readJsonValueBigDecimal()).thenReturn(mock(Object.class));

        // When
        Object result = adapter.fromJson(mockBidDecimalReader);

        // Then
        assertNull(result);

        InOrder inOrder = inOrder(mockMoshi, mockReader, mockBidDecimalReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockBidDecimalReader).readJsonValueBigDecimal();
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void fromJson_shouldReturnNull_whenNoResourceTypePresent() throws Exception {
        // Given
        JsonAdapter mockAdapter = mock(JsonAdapter.class);

        when(mockBidDecimalReader.readJsonValueBigDecimal()).thenReturn(mockJsonObjectMap);
        when(mockJsonObjectMap.get(JSON_KEY_RESOURCE_TYPE)).thenReturn(null);

        // When
        Object result = adapter.fromJson(mockBidDecimalReader);

        // Then
        assertNull(result);

        InOrder inOrder = inOrder(mockMoshi, mockReader, mockBidDecimalReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockBidDecimalReader).readJsonValueBigDecimal();
        inOrder.verify(mockJsonObjectMap).get(JSON_KEY_RESOURCE_TYPE);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void fromJson_shouldReturnNull_whenFhirJsonTypeUnknown() throws Exception {
        // Given
        JsonAdapter mockAdapter = mock(JsonAdapter.class);

        when(mockBidDecimalReader.readJsonValueBigDecimal()).thenReturn(mockJsonObjectMap);
        when(mockJsonObjectMap.get(JSON_KEY_RESOURCE_TYPE)).thenReturn("unknown");

        // When
        Object result = adapter.fromJson(mockBidDecimalReader);

        // Then
        assertNull(result);

        InOrder inOrder = inOrder(mockMoshi, mockReader, mockBidDecimalReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockBidDecimalReader).readJsonValueBigDecimal();
        inOrder.verify(mockJsonObjectMap).get(JSON_KEY_RESOURCE_TYPE);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void toJson_shouldWriteFhirObjectWithResourceType() throws Exception {
        // Given
        Class type = DocumentReference.class;
        DocumentReference input = mock(DocumentReference.class);
        JsonAdapter mockAdapter = mock(JsonAdapter.class);
        JsonAdapter mockMapAdapter = mock(JsonAdapter.class);

        when(mockMoshi.adapter(type)).thenReturn(mockAdapter);
        when(mockAdapter.toJsonValue(input)).thenReturn(mockJsonObjectMap);
        when(input.getResourceType()).thenReturn(DocumentReference.resourceType);
        when(mockMoshi.adapter(Map.class)).thenReturn(mockMapAdapter);

        // When
        adapter.toJson(mockWriter, input);

        // Then
        InOrder inOrder = inOrder(mockMoshi, mockReader, mockJsonObjectMap, mockAdapter, mockMapAdapter);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verify(mockAdapter).toJsonValue(input);
        inOrder.verify(mockJsonObjectMap).put(JSON_KEY_RESOURCE_TYPE, DocumentReference.resourceType);
        inOrder.verify(mockMoshi).adapter(Map.class);
        inOrder.verify(mockMapAdapter).toJson(mockWriter, mockJsonObjectMap);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void toJson_shouldWriteFhirObjectWithContainedResourceType() throws Exception {
        // Given
        Class type = DocumentReference.class;
        DocumentReference input = new DocumentReference(
                CodeSystemDocumentReferenceStatus.CURRENT,
                new ArrayList<DocumentReference.DocumentReferenceContent>()
        );
        DiagnosticReport mockDiagnosticReport = mock(DiagnosticReport.class);
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(mockDiagnosticReport);

        input.contained = resourceList;


        JsonAdapter mockAdapter = mock(JsonAdapter.class);
        JsonAdapter mockMapAdapter = mock(JsonAdapter.class);
        JsonAdapter mockContainedAdapter = mock(JsonAdapter.class);

        Map mockContainedObjectMap = mock(Map.class);


        when(mockJsonObjectMap.containsKey(JSON_KEY_CONTAINED)).thenReturn(true);
        when(mockMoshi.adapter(type)).thenReturn(mockAdapter);
        when(mockAdapter.toJsonValue(input)).thenReturn(mockJsonObjectMap);
        when(mockMoshi.adapter(Map.class)).thenReturn(mockMapAdapter);
        when(mockMoshi.adapter(DiagnosticReport.class)).thenReturn(mockContainedAdapter);
        when(mockContainedAdapter.toJsonValue(mockDiagnosticReport)).thenReturn(mockContainedObjectMap);

        // When
        adapter.toJson(mockWriter, input);

        // Then
        InOrder inOrder = inOrder(mockMoshi, mockReader, mockJsonObjectMap, mockAdapter, mockMapAdapter, mockContainedAdapter, mockContainedObjectMap);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verify(mockAdapter).toJsonValue(input);
        inOrder.verify(mockJsonObjectMap).put(JSON_KEY_RESOURCE_TYPE, DocumentReference.resourceType);
        inOrder.verify(mockMoshi).adapter(Map.class);
        inOrder.verify(mockMapAdapter).toJson(mockWriter, mockJsonObjectMap);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void toJson_shouldNotWrite_whenJsonObjectNoMap() throws Exception {
        // Given
        Class type = DocumentReference.class;
        DocumentReference input = mock(DocumentReference.class);
        JsonAdapter mockAdapter = mock(JsonAdapter.class);

        when(mockMoshi.adapter(type)).thenReturn(mockAdapter);
        when(mockAdapter.toJsonValue(input)).thenReturn(Object.class);

        // When
        adapter.toJson(mockWriter, input);

        // Then
        InOrder inOrder = inOrder(mockMoshi, mockReader, mockJsonObjectMap, mockAdapter);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verify(mockAdapter).toJsonValue(input);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void toJson_shouldNotWrite_whenNoAdapter() throws Exception {
        // Given
        Class type = DocumentReference.class;
        DocumentReference input = mock(DocumentReference.class);

        when(mockMoshi.adapter(type)).thenReturn(null);

        // When
        adapter.toJson(mockWriter, input);

        // Then
        InOrder inOrder = inOrder(mockMoshi, mockReader, mockJsonObjectMap);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verifyNoMoreInteractions();
    }


    @Test
    public void toJson_shouldNotWrite_whenNullInput() throws Exception {
        // Given
        FhirR4Base input = null;

        // When
        adapter.toJson(mockWriter, input);

        // Then
        InOrder inOrder = inOrder(mockMoshi, mockReader, mockJsonObjectMap);
        inOrder.verifyNoMoreInteractions();
    }

}
