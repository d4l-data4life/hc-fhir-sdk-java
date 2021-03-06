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

package care.data4life.fhir.stu3.json;

import com.squareup.moshi.JsonAdapter;

import org.junit.Before;
import org.junit.Test;

import java.util.TimeZone;

import care.data4life.fhir.stu3.model.FhirDate;
import care.data4life.fhir.stu3.model.FhirDateTime;
import care.data4life.fhir.stu3.model.FhirInstant;
import care.data4life.fhir.stu3.model.FhirTime;

import static org.junit.Assert.assertEquals;

public class FhirInstantJsonAdapterTest {

    // SUT
    private JsonAdapter<FhirInstant> adapter;


    @Before
    public void setup() {
        adapter = new FhirInstantJsonAdapter().lenient();
    }


    @Test
    public void fromJson() throws Exception {
        assertEquals(adapter.fromJson("\"2018-11-13T04:59:21Z\""), new FhirInstant(new FhirDateTime(new FhirDate(2018, 11, 13), new FhirTime(4, 59, 21, null, null), TimeZone.getTimeZone("GMT"))));
    }

    @Test
    public void toJson_shouldWrite_whenValue() {
        FhirInstant instant = new FhirInstant(new FhirDateTime(new FhirDate(2018, 11, 13), new FhirTime(4, 59, 21, null, null), TimeZone.getTimeZone("GMT")));

        assertEquals("\"2018-11-13T04:59:21Z\"", adapter.toJson(instant));
    }

    @Test
    public void toJson_shouldNotWrite_whenNullValue() {
        FhirInstant instant = null;

        assertEquals("", adapter.toJson(instant));
    }
}
