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
import care.data4life.fhir.r4.model.FhirTime;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FhirDateTimeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private boolean exceptionExpected;

    private FhirDate fhirDate;
    private FhirTime fhirTime;
    private TimeZone timeZone;

    private Date date;
    private String dateString;


    public FhirDateTimeTest(FhirDate fhirDate, FhirTime fhirTime, TimeZone timeZone, Date date, String dateString, boolean exceptionExpected) {
        this.exceptionExpected = exceptionExpected;
        this.fhirDate = fhirDate;
        this.fhirTime = fhirTime;
        this.timeZone = timeZone;
        this.date = date;
        this.dateString = dateString;
    }

    @Parameterized.Parameters(name = "{index}: date: \"{0}\" fhirTime: \"{1}\" timeZone: \"{2}\"")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, null, null, null, null, true},
                {new FhirDate(2018, 5, 12), new FhirTime(12, 13, 14, null, null), null, null, null, true},
                {new FhirDate(2018, 5, 12), null, TimeZone.getTimeZone("Europe/Paris"), null, null, true},

                // valid
                {new FhirDate(2018, 5, 12), null, null, new Date(1526083200000L), "2018-05-12", false},
                {new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris"), new Date(1526119995000L), "2018-05-12T12:13:15+01:00", false},
        });
    }

    @Test
    public void test() {
        if (exceptionExpected) {
            if (fhirDate == null) {
                exception.expect(NullPointerException.class);
            } else {
                exception.expect(IllegalArgumentException.class);
            }
        }

        FhirDateTime dateTime = new FhirDateTime(fhirDate, fhirTime, timeZone);

        assertEquals(fhirDate, dateTime.getDate());
        assertEquals(fhirTime, dateTime.getTime());
        assertEquals(timeZone, dateTime.getTimeZone());
        assertEquals(date, dateTime.toDate());
        assertEquals(dateString, dateTime.toString());
    }

}
