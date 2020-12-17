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

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import care.data4life.fhir.r4.json.FhirDecimalJsonAdapter;
import care.data4life.fhir.r4.model.FhirDecimal;

import static org.junit.Assert.assertEquals;

public class FhirDecimalJsonAdapterTest {

    // SUT
    private JsonAdapter<FhirDecimal> adapter;


    @Before
    public void setup() {
        adapter = new FhirDecimalJsonAdapter().lenient();
    }


    @Test
    public void fromJson() throws Exception {
        assertEquals(adapter.fromJson("7.10"), new FhirDecimal(new BigDecimal("7.10")));
        assertEquals(adapter.fromJson("7"), new FhirDecimal(new BigDecimal("7")));
    }

    @Test
    public void toJson_shouldWrite_whenValue() {
        FhirDecimal decimal = new FhirDecimal(new BigDecimal("7.1001100"));

        assertEquals("7.1001100", adapter.toJson(decimal));
    }

    @Test
    public void toJson_shouldNotWrite_whenNullValue() {
        assertEquals("", adapter.toJson(null));
    }
}
