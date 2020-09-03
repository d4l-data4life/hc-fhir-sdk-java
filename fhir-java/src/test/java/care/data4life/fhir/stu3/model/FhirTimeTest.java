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
public class FhirTimeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private boolean exceptionExpected;

    private int hour;
    private int minute;
    private Integer second;
    private Integer fractionOfSecond;
    private Integer fractionPadding;

    private Date date;
    private String timeString;

    public FhirTimeTest(int hour, int minute, Integer second, Integer fractionOfSecond, Integer fractionPadding, Date date, String timeString, boolean exceptionExpected) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.fractionOfSecond = fractionOfSecond;
        this.fractionPadding = fractionPadding;
        this.date = date;
        this.timeString = timeString;
        this.exceptionExpected = exceptionExpected;
    }

    @Parameterized.Parameters(name = "{index}: hour: \"{0}\" minute: \"{1}\" second: \"{2}\" fractionOfSecond: \"{3}\" fractionPadding: \"{4}\"")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // the hour part is out of range
                {24, 12, 10, null, null, null, null, true},
                // the minute part is out of range
                {21, 79, 10, null, null, null, null, true},
                // the second part is out of range
                {21, 29, 72, null, null, null, null, true},
                // negative input
                {-21, 29, 72, 12345, null, null, null, true},
                {-21, 29, 72, 12345, null, null, null, true},
                {21, -29, 72, 12345, null, null, null, true},
                {21, 29, -72, 12345, null, null, null, true},
                {21, 29, -72, -12345, null, null, null, true},

                {0, 0, null, null, null, new Date(0L), "00:00:00", false},
                {21, 0, null, null, null, new Date(75600000L), "21:00:00", false},
                {0, 13, null, null, null, new Date(780000L), "00:13:00", false},
                {4, 8, null, null, null, new Date(14880000L), "04:08:00", false},
                {21, 32, null, null, null, new Date(77520000L), "21:32:00", false},
                {21, 32, 15, null, null, new Date(77535000L), "21:32:15", false},
                {21, 32, 15, 12345, null, new Date(77535123L), "21:32:15.12345", false},
                {21, 32, 15, 1235, null, new Date(77535124L), "21:32:15.1235", false},
                {21, 32, 15, 1235, 2, new Date(77535001L), "21:32:15.001235", false},
                {21, 32, 15, 1, 4, new Date(77535000L), "21:32:15.00001", false},
        });
    }

    @Test
    public void test() {
        if (exceptionExpected) {
            exception.expect(IllegalArgumentException.class);
        }

        FhirTime time = new FhirTime(hour, minute, second, fractionOfSecond, fractionPadding);

        assertEquals(hour, time.getHour());
        assertEquals(minute, time.getMinute());
        assertEquals(second, time.getSecond());
        assertEquals(fractionOfSecond, time.getFractionOfSecond());
        assertEquals(fractionPadding, time.getFractionPadding());
        assertEquals(date, time.toDate());
        assertEquals(timeString, time.toString());
    }

}
