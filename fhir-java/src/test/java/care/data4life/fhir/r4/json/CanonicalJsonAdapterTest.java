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
import java.io.IOException;
import care.data4life.fhir.r4.model.Canonical;
import static org.junit.Assert.assertEquals;

public class CanonicalJsonAdapterTest {
    private final static String URL = "http://fhir.smart4health.eu/Questionnaire/post-session-questionnaire";
    private final static String DELIMITER = "|";
    private final static String VERSION = "0.1.0";

    // SUT
    private JsonAdapter<Canonical> adapter;


    @Before
    public void setup() {
        adapter = new CanonicalJsonAdapter().lenient();
    }

    
    @Test
    public void given_fromJson_is_called_with_a_url_and_without_a_version_it_returns_a_Canonical()
            throws IOException {
        assertEquals(
                adapter.fromJson("\"" + URL + "\""),
                new Canonical(URL)
        );
    }

    @Test
    public void given_fromJson_is_called_with_a_url_and_wit_a_version_it_returns_a_Canonical() throws Exception {
        assertEquals(
                adapter.fromJson("\"" + URL + DELIMITER + VERSION + "\""),
                new Canonical(URL, VERSION)
        );
    }

    @Test
    public void given_toJson_is_called_with_a_Canonical_which_contains_no_version_it_serializes_it() {
        assertEquals(
                adapter.toJson(new Canonical(URL)),
                "\"" + URL + "\""
        );
    }

    @Test
    public void given_toJson_is_called_with_a_Canonical_which_contains_version_it_serializes_it() {
        assertEquals(
                adapter.toJson(new Canonical(URL, VERSION)),
                "\"" + URL + DELIMITER + VERSION + "\""
        );
    }

    @Test
    public void given_toJson_is_called_with_it_writes_null() {
        assertEquals("null", adapter.toJson(null));
    }
}
