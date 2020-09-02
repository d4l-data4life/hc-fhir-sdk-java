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

package care.data4life.fhir.stu3.util;

import org.junit.Test;

import java.util.TimeZone;

import care.data4life.fhir.stu3.model.FhirDate;
import care.data4life.fhir.stu3.model.FhirDateTime;
import care.data4life.fhir.stu3.model.FhirTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FhirDateTimeParserTest {

    @Test
    public void parseDate_shouldReturnValidFhirDate() {
        assertEquals(
                new FhirDate(1000, null, null),
                FhirDateTimeParser.parseDate("1000")
        );
        assertEquals(
                new FhirDate(9999, null, null),
                FhirDateTimeParser.parseDate("9999")
        );
        assertEquals(
                new FhirDate(2015, 12, null),
                FhirDateTimeParser.parseDate("2015-12")
        );
        assertEquals(
                new FhirDate(2015, 1, null),
                FhirDateTimeParser.parseDate("2015-01")
        );
        assertEquals(
                new FhirDate(2015, 1, 1),
                FhirDateTimeParser.parseDate("2015-01-01")
        );
        assertEquals(
                new FhirDate(2015, 1, 31),
                FhirDateTimeParser.parseDate("2015-01-31")
        );
    }

    @Test
    public void parseDate_shouldThrowException_whenInvalidInput() {
        assertTrue(verifyFhirDateExceptionThrown(""));
        assertTrue(verifyFhirDateExceptionThrown(" "));
        assertTrue(verifyFhirDateExceptionThrown("abc"));

        assertTrue(verifyFhirDateExceptionThrown("999"));
        assertTrue(verifyFhirDateExceptionThrown("10000"));
        assertTrue(verifyFhirDateExceptionThrown("-1"));

        assertTrue(verifyFhirDateExceptionThrown("2017-13"));
        assertTrue(verifyFhirDateExceptionThrown("2017-00"));

        assertTrue(verifyFhirDateExceptionThrown("2017-11-00"));
        assertTrue(verifyFhirDateExceptionThrown("2017-11-32"));
        assertTrue(verifyFhirDateExceptionThrown("2017-00-12"));
        assertTrue(verifyFhirDateExceptionThrown("2017-11-00"));
    }


    @Test
    public void parseDateTime_shouldReturnValidFhirDateTime() {
        assertEquals(
                new FhirDateTime(new FhirDate(1000, null, null), null, null),
                FhirDateTimeParser.parseDateTime("1000")
        );
        assertEquals(
                new FhirDateTime(new FhirDate(9999, null, null), null, null),
                FhirDateTimeParser.parseDateTime("9999")
        );
        assertEquals(
                new FhirDateTime(new FhirDate(2015, 12, null), null, null),
                FhirDateTimeParser.parseDateTime("2015-12")
        );
        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, null), null, null),
                FhirDateTimeParser.parseDateTime("2015-01")
        );
        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 1), null, null),
                FhirDateTimeParser.parseDateTime("2015-01-01")
        );
        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), null, null),
                FhirDateTimeParser.parseDateTime("2015-01-31")
        );


        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, null, null), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 12679, null), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.12679Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 1, 8), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.000000001Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 999999999, null), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.999999999Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, null, null), TimeZone.getTimeZone("GMT+01:00")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52+01:00")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 12679, null), TimeZone.getTimeZone("GMT+01:00")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.12679+01:00")
        );
    }

    @Test
    public void parseDateTime_shouldThrowException_whenInvalidInput() {
        assertTrue(verifyFhirDateTimeExceptionThrown(""));
        assertTrue(verifyFhirDateTimeExceptionThrown(" "));
        assertTrue(verifyFhirDateTimeExceptionThrown("abc"));

        assertTrue(verifyFhirDateTimeExceptionThrown("999"));
        assertTrue(verifyFhirDateTimeExceptionThrown("10000"));
        assertTrue(verifyFhirDateTimeExceptionThrown("-1"));

        assertTrue(verifyFhirDateTimeExceptionThrown("2017-13"));
        assertTrue(verifyFhirDateTimeExceptionThrown("2017-00"));

        assertTrue(verifyFhirDateTimeExceptionThrown("2017-11-00"));
        assertTrue(verifyFhirDateTimeExceptionThrown("2017-11-32"));
        assertTrue(verifyFhirDateTimeExceptionThrown("2017-00-12"));
        assertTrue(verifyFhirDateTimeExceptionThrown("2017-11-00"));

        assertTrue(verifyFhirDateTimeExceptionThrown("2017-11-00T01:12:31"));
    }


    @Test
    public void parseInstant_shouldReturnValidFhirInstant() {
        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, null, null), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 12679, null), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.12679Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 1, 8), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.000000001Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 999999999, null), TimeZone.getTimeZone("GMT")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.999999999Z")
        );

        assertEquals(
                new FhirDateTime(new FhirDate(2015, 1, 31), new FhirTime(21, 32, 52, 12679, null), TimeZone.getTimeZone("GMT+01:00")),
                FhirDateTimeParser.parseDateTime("2015-01-31T21:32:52.12679+01:00")
        );
    }

    @Test
    public void parseInstant_shouldThrowException_whenInvalidInput() {
        assertTrue(verifyFhirInstantExceptionThrown(""));
        assertTrue(verifyFhirInstantExceptionThrown(" "));
        assertTrue(verifyFhirInstantExceptionThrown("abc"));

        assertTrue(verifyFhirInstantExceptionThrown("999"));
        assertTrue(verifyFhirInstantExceptionThrown("10000"));
        assertTrue(verifyFhirInstantExceptionThrown("-1"));

        assertTrue(verifyFhirInstantExceptionThrown("2017-13"));
        assertTrue(verifyFhirInstantExceptionThrown("2017-00"));

        assertTrue(verifyFhirInstantExceptionThrown("2017-11-00"));
        assertTrue(verifyFhirInstantExceptionThrown("2017-11-32"));
        assertTrue(verifyFhirInstantExceptionThrown("2017-00-12"));
        assertTrue(verifyFhirInstantExceptionThrown("2017-11-00"));

        assertTrue(verifyFhirInstantExceptionThrown("2017-11-00T01:12:31"));
        assertTrue(verifyFhirInstantExceptionThrown("2017-11-00T01:12:31Z"));
    }


    @Test
    public void parseTime_shouldReturnValidFhirTime() {
        assertEquals(
                new FhirTime(21, 32, 52, null, null),
                FhirDateTimeParser.parseTime("21:32:52")
        );

        assertEquals(
                new FhirTime(21, 32, 52, 12679, null),
                FhirDateTimeParser.parseTime("21:32:52.12679")
        );

        assertEquals(
                new FhirTime(21, 32, 52, 1, 8),
                FhirDateTimeParser.parseTime("21:32:52.000000001")
        );

        assertEquals(
                new FhirTime(21, 32, 52, 999999999, null),
                FhirDateTimeParser.parseTime("21:32:52.999999999")
        );
    }

    @Test
    public void parseTime_shouldThrowException_whenInvalidInput() {
        assertTrue(verifyFhirTimeExceptionThrown(""));
        assertTrue(verifyFhirTimeExceptionThrown(" "));
        assertTrue(verifyFhirTimeExceptionThrown("abc"));

        // all the parts must be specified
        assertTrue(verifyFhirTimeExceptionThrown("18"));
        assertTrue(verifyFhirTimeExceptionThrown("21:32"));

        // the hour part is out of range
        assertTrue(verifyFhirTimeExceptionThrown("25:25:10"));

        // the minute part is out of range
        assertTrue(verifyFhirTimeExceptionThrown("21:79:10"));

        // the second part is out of range
        assertTrue(verifyFhirTimeExceptionThrown("21:39:72"));

        // negative input
        assertTrue(verifyFhirTimeExceptionThrown("-10:00:00"));

        // all the digits must be supplied)
        assertTrue(verifyFhirTimeExceptionThrown("1:20:10"));

        // no time zone allowed
        assertTrue(verifyFhirTimeExceptionThrown("21:32:52+02:00"));
        assertTrue(verifyFhirTimeExceptionThrown("19:32:52Z"));
    }


    private boolean verifyFhirDateExceptionThrown(String date) {
        try {
            FhirDateTimeParser.parseDate(date);
        } catch (IllegalArgumentException exception) {
            return true;
        }
        return false;
    }

    private boolean verifyFhirDateTimeExceptionThrown(String dateTime) {
        try {
            FhirDateTimeParser.parseDate(dateTime);
        } catch (IllegalArgumentException exception) {
            return true;
        }
        return false;
    }

    private boolean verifyFhirInstantExceptionThrown(String instant) {
        try {
            FhirDateTimeParser.parseInstant(instant);
        } catch (IllegalArgumentException exception) {
            return true;
        }
        return false;
    }

    private boolean verifyFhirTimeExceptionThrown(String time) {
        try {
            FhirDateTimeParser.parseTime(time);
        } catch (IllegalArgumentException exception) {
            return true;
        }
        return false;
    }

}
