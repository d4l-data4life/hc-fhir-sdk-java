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

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CanonicalTest {

    private static final String URL = "https://theway.to/go";
    private static final String VERSION = "NX-42";
    private static final String RESOURCE_TYPE = "Canonical";


    // Canonical
    Canonical canonical;


    @Before
    public void setup() {
        canonical = new Canonical(URL, VERSION);
    }


    @Test
    public void it_contains_a_url() { assertEquals(URL, canonical.url); }

    @Test
    public void it_contains_a_version() { assertEquals(VERSION, canonical.version); }

    @Test
    public void it_contains_a_resourceType() { assertEquals(RESOURCE_TYPE, canonical.getResourceType()); }

    @Test
    public void given_another_canonical_equals_it_returns_true() {
        Canonical expected = new Canonical(URL, VERSION);
        assertEquals(expected, expected);
    }

    @Test
    public void given_hash_is_called_it_returns_a_stable_hashcode() {
        assertEquals(-1407719353, canonical.hashCode());
    }
}
