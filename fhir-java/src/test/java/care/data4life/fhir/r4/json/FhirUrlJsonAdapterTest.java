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

import java.net.URL;

import care.data4life.fhir.stu3.json.FhirUrlJsonAdapter;

import static org.junit.Assert.assertEquals;

public class FhirUrlJsonAdapterTest {

    // SUT
    private JsonAdapter<URL> adapter;


    @Before
    public void setup() {
        adapter = new FhirUrlJsonAdapter().lenient();
    }

    @Test
    public void fromJson() throws Exception {
        assertEquals(adapter.fromJson("\"https://www.data4life.care\""), new URL("https://www.data4life.care"));
    }

    @Test
    public void toJson() throws Exception {
        assertEquals("\"https://www.data4life.care\"", adapter.toJson(new URL("https://www.data4life.care")));
    }
}
