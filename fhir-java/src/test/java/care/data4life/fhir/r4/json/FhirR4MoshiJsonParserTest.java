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

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import care.data4life.fhir.r4.model.DocumentReference;
import care.data4life.fhir.r4.model.FhirR4Base;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FhirR4MoshiJsonParserTest {

    private static final String FHIR_JSON = "fhirJson";


    private Moshi mockMoshi = mock(Moshi.class);
    private JsonAdapter mockAdapter = mock(JsonAdapter.class);


    // SUT
    private FhirR4MoshiJsonParser parser;


    @Before
    public void setup() {
        parser = new FhirR4MoshiJsonParser(mockMoshi);

    }


    @Test
    public void fromJson() throws Exception {
        // Given
        Class type = DocumentReference.class;
        DocumentReference mockDocument = mock(DocumentReference.class);

        when(mockMoshi.adapter(FhirR4Base.class)).thenReturn(mockAdapter);
        when(mockAdapter.fromJson(FHIR_JSON)).thenReturn(mockDocument);

        // When
        Object result = parser.fromJson(type, FHIR_JSON);

        // Then
        assertThat(result, instanceOf(type));

        InOrder inOrder = inOrder(mockMoshi, mockAdapter);
        inOrder.verify(mockMoshi).adapter(FhirR4Base.class);
        inOrder.verify(mockAdapter).fromJson(FHIR_JSON);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void toJson() throws Exception {
        // Given
        Class type = FhirR4Base.class;
        DocumentReference mockDocument = mock(DocumentReference.class);

        when(mockMoshi.adapter(type)).thenReturn(mockAdapter);
        when(mockAdapter.toJson(mockDocument)).thenReturn(FHIR_JSON);

        // When
        String result = parser.toJson(mockDocument);

        // Then
        assertEquals(FHIR_JSON, result);

        InOrder inOrder = inOrder(mockMoshi, mockAdapter);
        inOrder.verify(mockMoshi).adapter(type);
        inOrder.verify(mockAdapter).toJson(mockDocument);
        inOrder.verifyNoMoreInteractions();
    }
}
