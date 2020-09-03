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

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FhirDateParameterizedTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private boolean exceptionExpected;

    private int year;
    private Integer month;
    private Integer day;

    private Date date;
    private String dateString;


    public FhirDateParameterizedTest(int year, Integer month, Integer day, Date date, String dateString, boolean exceptionExpected) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.date = date;
        this.dateString = dateString;
        this.exceptionExpected = exceptionExpected;
    }


    @Parameterized.Parameters(name = "{index}: year: \"{0}\" month: \"{1}\" day: \"{2}\"")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2015, 13, null, null, null, true},
                {2015, 0, null, null, null, true},
                {2015, -1, null, null, null, true},
                {2015, 11, -1, null, null, true},
                {2015, 11, 0, null, null, true},
                {2015, 11, 32, null, null, true},
                {10000, 2, 2, null, null, true},
                {999, 2, 2, null, null, true},

                // valid
                {2015, null, null, new Date(1420070400000L), "2015", false},
                {1000, null, null, new Date(-30609792000000L), "1000", false},
                {9999, null, null, new Date(253370764800000L), "9999", false},
                {2015, 12, null, new Date(1448928000000L), "2015-12", false},
                {2015, 8, null, new Date(1438387200000L), "2015-08", false},
                {2015, 8, 12, new Date(1439337600000L), "2015-08-12", false},
                {2015, 8, 9, new Date(1439078400000L), "2015-08-09", false},
        });
    }

    @Test
    public void test() {
        if (exceptionExpected) {
            exception.expect(IllegalArgumentException.class);
        }

        FhirDate fhirDate = new FhirDate(year, month, day);

        assertEquals(year, fhirDate.getYear());
        assertEquals(month, fhirDate.getMonth());
        assertEquals(day, fhirDate.getDay());
        assertEquals(date, fhirDate.toDate());
        assertEquals(dateString, fhirDate.toString());
    }
}
