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

import java.math.BigDecimal;

import care.data4life.fhir.r4.model.FhirDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FhirDecimalTest {

    private static String DECIMAL = "7.0100100";

    BigDecimal bigDecimal;

    // SUT
    FhirDecimal decimal;


    @Before
    public void setup() {
        bigDecimal = new BigDecimal(DECIMAL);

        decimal = new FhirDecimal(bigDecimal);
    }

    @Test
    public void getDecimal() {
        assertEquals(bigDecimal, decimal.getDecimal());
    }

    @Test
    public void test_toString() {
        assertEquals(bigDecimal.toPlainString(), decimal.toString());
    }

    @Test
    public void test_equals() {
        FhirDecimal expected = new FhirDecimal(bigDecimal);
        assertTrue(decimal.equals(expected));
    }

    @Test
    public void test_hashCode() {
        assertEquals(-2121864158, decimal.hashCode());
    }
}
