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

package care.data4life.fhir.r4.util;

import org.junit.Test;

import java.util.TimeZone;

import care.data4life.fhir.r4.model.FhirDate;
import care.data4life.fhir.r4.model.FhirDateTime;
import care.data4life.fhir.r4.model.FhirInstant;
import care.data4life.fhir.r4.model.FhirTime;
import care.data4life.fhir.r4.util.FhirDateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class FhirDateTimeFormatterTest {

    @Test
    public void formatDate_shouldReturnWellFormedString() {
        assertEquals("2015", FhirDateTimeFormatter.formatDate(new FhirDate(2015, null, null)));
        assertEquals("2015-05", FhirDateTimeFormatter.formatDate(new FhirDate(2015, 5, null)));
        assertEquals("2015-11", FhirDateTimeFormatter.formatDate(new FhirDate(2015, 11, null)));
        assertEquals("2015-11-09", FhirDateTimeFormatter.formatDate(new FhirDate(2015, 11, 9)));
        assertEquals("2015-11-25", FhirDateTimeFormatter.formatDate(new FhirDate(2015, 11, 25)));
    }

    @Test
    public void formatDateTime_shouldReturnWellFormedString() {
        // Date check
        assertEquals("2015", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, null, null), null, null)));
        assertEquals("2015-05", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 5, null), null, null)));
        assertEquals("2015-11", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, null), null, null)));
        assertEquals("2015-11-09", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), null, null)));
        assertEquals("2015-11-25", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 25), null, null)));

        // Date, Time and Timezone check
        assertEquals("2015-11-09T00:00:00Z", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(0, 0, null, null, null), TimeZone.getTimeZone("Europe/London"))));
        assertEquals("2015-11-09T12:00:00+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 0, null, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals("2015-11-09T00:12:00+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(0, 12, null, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals("2015-11-09T12:12:00+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, null, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals("2015-11-09T12:12:12+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals("2015-11-09T01:02:03+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(1, 2, 3, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals("2015-11-09T12:12:12.12345+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, 12345, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals("2015-11-09T12:12:12.00001+01:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, 1, 4), TimeZone.getTimeZone("Europe/Berlin"))));
        assertEquals("2015-11-09T12:12:12-05:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("America/New_York"))));
        assertEquals("2015-11-09T12:12:12Z", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("GMT"))));
        assertEquals("2015-11-09T12:12:12+00:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("GMT+00:00"))));
        assertEquals("2015-11-09T12:12:12+00:00", FhirDateTimeFormatter.formatDateTime(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("GMT+0"))));
    }

    @Test
    public void formatInstant_shouldReturnWellFormedString() {
        assertEquals("2015-11-09T12:12:12+01:00", FhirDateTimeFormatter.formatInstant(new FhirInstant(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals("2015-11-09T01:02:03+01:00", FhirDateTimeFormatter.formatInstant(new FhirInstant(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(1, 2, 3, null, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals("2015-11-09T12:12:12.12345+01:00", FhirDateTimeFormatter.formatInstant(new FhirInstant(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, 12345, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals("2015-11-09T12:12:12.00001+01:00", FhirDateTimeFormatter.formatInstant(new FhirInstant(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, 1, 4), TimeZone.getTimeZone("Europe/Berlin")))));
        assertEquals("2015-11-09T12:12:12-05:00", FhirDateTimeFormatter.formatInstant(new FhirInstant(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("America/New_York")))));
        assertEquals("2015-11-09T12:12:12Z", FhirDateTimeFormatter.formatInstant(new FhirInstant(new FhirDateTime(new FhirDate(2015, 11, 9), new FhirTime(12, 12, 12, null, null), TimeZone.getTimeZone("GMT")))));
    }

    @Test
    public void formatTime_shouldReturnWellFormedString() {
        assertEquals("00:00:00", FhirDateTimeFormatter.formatTime(new FhirTime(0, 0, null, null, null)));
        assertEquals("12:00:00", FhirDateTimeFormatter.formatTime(new FhirTime(12, 0, null, null, null)));
        assertEquals("00:12:00", FhirDateTimeFormatter.formatTime(new FhirTime(0, 12, null, null, null)));
        assertEquals("12:12:00", FhirDateTimeFormatter.formatTime(new FhirTime(12, 12, null, null, null)));
        assertEquals("12:12:12", FhirDateTimeFormatter.formatTime(new FhirTime(12, 12, 12, null, null)));
        assertEquals("01:02:03", FhirDateTimeFormatter.formatTime(new FhirTime(1, 2, 3, null, null)));
        assertEquals("12:12:12.12345", FhirDateTimeFormatter.formatTime(new FhirTime(12, 12, 12, 12345, null)));
        assertEquals("12:12:12.00001", FhirDateTimeFormatter.formatTime(new FhirTime(12, 12, 12, 1, 4)));
    }
}
