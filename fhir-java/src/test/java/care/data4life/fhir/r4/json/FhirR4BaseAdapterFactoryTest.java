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

import java.lang.reflect.Type;

import care.data4life.fhir.r4.json.FhirR4BaseAdapter;
import care.data4life.fhir.r4.json.FhirR4BaseAdapterFactory;
import care.data4life.fhir.r4.model.FhirR4Base;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class FhirR4BaseAdapterFactoryTest {

    private Moshi mockMoshi = mock(Moshi.class);


    // SUT
    private FhirR4BaseAdapterFactory factory;


    @Before
    public void setup() {
        factory = new FhirR4BaseAdapterFactory();
    }

    @Test
    public void create_shouldReturnFhirStu3BaseAdapter_whenTypeFhirStu3BaseClass() {
        // Given
        Type type = FhirR4Base.class;

        // When
        JsonAdapter adapter = factory.create(type, null, mockMoshi);

        // Then
        assertThat(adapter, instanceOf(FhirR4BaseAdapter.class));
    }


    @Test
    public void create_shouldReturnNull_whenTypeNotFhirStu3BaseClass() {
        // Given
        Type type = Object.class;

        // When
        JsonAdapter adapter = factory.create(type, null, mockMoshi);

        // Then
        assertNull(adapter);
    }
}
