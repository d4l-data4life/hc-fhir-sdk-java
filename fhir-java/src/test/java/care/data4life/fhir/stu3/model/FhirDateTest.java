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

package care.data4life.fhir.stu3.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FhirDateTest {

    private static final int YEAR = 2015;
    private static final Integer MONTH = 8;
    private static final Integer DAY = 9;


    // FhirDate
    FhirDate date;


    @Before
    public void setup() {
        date = new FhirDate(YEAR, MONTH, DAY);
    }


    @Test
    public void getYear() {
        assertEquals(YEAR, date.getYear());
    }

    @Test
    public void getMonth() {
        assertEquals(MONTH, date.getMonth());
    }

    @Test
    public void getDay() {
        assertEquals(DAY, date.getDay());
    }

    @Test
    public void test_toString() {
        assertEquals("2015-08-09", date.toString());
    }

    @Test
    public void test_equals() {
        FhirDate expected = new FhirDate(YEAR, MONTH, DAY);
        assertTrue(date.equals(expected));
    }

    @Test
    public void test_hashCode() {
        assertEquals(1966463, date.hashCode());
    }

    @Test
    public void toDate() {
        assertEquals(new Date(1439078400000L), date.toDate());
    }
}
