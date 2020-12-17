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

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

import care.data4life.fhir.r4.model.FhirDate;
import care.data4life.fhir.r4.model.FhirDateTime;
import care.data4life.fhir.r4.model.FhirInstant;
import care.data4life.fhir.r4.model.FhirTime;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FhirInstantTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private boolean exceptionExpected;

    private FhirDateTime dateTime;

    private Date date;
    private String dateString;


    public FhirInstantTest(FhirDateTime dateTime, Date date, String dateString, boolean exceptionExpected) {
        this.dateTime = dateTime;
        this.date = date;
        this.dateString = dateString;
        this.exceptionExpected = exceptionExpected;
    }


    @Parameterized.Parameters(name = "{index}: dateTime: \"{0}\"")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new FhirDateTime(new FhirDate(2018, 5, 12), null, null), null, null, true},
                // no month
                {new FhirDateTime(new FhirDate(2018, null, 12), new FhirTime(12, 13, 14, null, null), TimeZone.getTimeZone("Europe/Paris")), null, null, true},
                // no day
                {new FhirDateTime(new FhirDate(2018, 5, null), new FhirTime(12, 13, 14, null, null), TimeZone.getTimeZone("Europe/Paris")), null, null, true},
                // no second
                {new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, null, null, null), TimeZone.getTimeZone("Europe/Paris")), null, null, true},

                // valid
                {new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getTimeZone("GMT")), new Date(1526127195000L), "2018-05-12T12:13:15Z", false},
                {new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris")), new Date(1526119995000L), "2018-05-12T12:13:15+01:00", false},
                {new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 123, 2), TimeZone.getTimeZone("Europe/Paris")), new Date(1526119995001L), "2018-05-12T12:13:15.00123+01:00", false},
        });
    }

    @Test
    public void test() {
        if (exceptionExpected) {
            exception.expect(IllegalArgumentException.class);
        }

        FhirInstant instant = new FhirInstant(dateTime);

        assertEquals(dateTime, instant.getDateTime());
        assertEquals(date, instant.toDate());
        assertEquals(dateString, instant.toString());
    }

}
