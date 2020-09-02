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

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.TimeZone;

import care.data4life.fhir.stu3.model.FhirDate;
import care.data4life.fhir.stu3.model.FhirDateTime;
import care.data4life.fhir.stu3.model.FhirInstant;
import care.data4life.fhir.stu3.model.FhirTime;

import static org.junit.Assert.assertEquals;

public class FhirDateTimeConverterTest {

    @Before
    public void setup() {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
    }

    @Test
    public void toFhirDate() {
        assertEquals(FhirDateTimeConverter.toFhirDate(new Date(1420070400000L)), new FhirDate(2015, 1, 1));
        assertEquals(FhirDateTimeConverter.toFhirDate(new Date(1448928000000L)), new FhirDate(2015, 12, 1));
        assertEquals(FhirDateTimeConverter.toFhirDate(new Date(1439337600000L)), new FhirDate(2015, 8, 12));
    }

    @Test
    public void fromFhirDate() {
        assertEquals(new Date(1420070400000L), FhirDateTimeConverter.fromFhirDate(new FhirDate(2015, null, null)));
        assertEquals(new Date(1448928000000L), FhirDateTimeConverter.fromFhirDate(new FhirDate(2015, 12, null)));
        assertEquals(new Date(1439337600000L), FhirDateTimeConverter.fromFhirDate(new FhirDate(2015, 8, 12)));
    }

    @Test
    public void toFhirDateTime() {
        assertEquals(FhirDateTimeConverter.toFhirDateTime(new Date(1526083200000L)), new FhirDateTime(new FhirDate(2018, 5, 12), null, null));
        assertEquals(FhirDateTimeConverter.toFhirDateTime(new Date(1526119995000L)), new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getDefault()));
        assertEquals(FhirDateTimeConverter.toFhirDateTime(new Date(1526119995000L)), new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getDefault()));
        assertEquals(FhirDateTimeConverter.toFhirDateTime(new Date(1526119995123L)), new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 123, null), TimeZone.getDefault()));
        assertEquals(FhirDateTimeConverter.toFhirDateTime(new Date(1526119995001L)), new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1, 2), TimeZone.getDefault()));
        assertEquals(FhirDateTimeConverter.toFhirDateTime(new Date(1526119995011L)), new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 11, 1), TimeZone.getDefault()));
    }

    @Test
    public void fromFhirDateTime() {
        assertEquals(new Date(1526083200000L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), null, null)));
        assertEquals(new Date(1526119995000L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526127195000L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(14, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526119995123L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 123, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526119995123L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1234, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526119995124L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1236, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526119995001L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1234, 2), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526119995001L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1234567, 2), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(new Date(1526119995000L), FhirDateTimeConverter.fromFhirDateTime(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 12345, 5), TimeZone.getTimeZone("Europe/Paris"))));
    }

    @Test
    public void toFhirInstant() {
        assertEquals(FhirDateTimeConverter.toFhirInstant(new Date(1526119995000L)), new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(FhirDateTimeConverter.toFhirInstant(new Date(1526119995123L)), new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 123, null), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(FhirDateTimeConverter.toFhirInstant(new Date(1526119995001L)), new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1, 2), TimeZone.getTimeZone("Europe/Paris"))));
        assertEquals(FhirDateTimeConverter.toFhirInstant(new Date(1526119980000L)), new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 0, null, null), TimeZone.getTimeZone("Europe/Paris"))));
    }

    @Test
    public void fromFhirInstant() {
        assertEquals(new Date(1526119995000L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526127195000L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(14, 13, 15, null, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526119995123L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 123, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526119995123L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1234, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526119995124L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1236, null), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526119995001L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 1234, 2), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526119995000L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 15, 12345, 5), TimeZone.getTimeZone("Europe/Paris")))));
        assertEquals(new Date(1526119980000L), FhirDateTimeConverter.fromFhirInstant(new FhirInstant(new FhirDateTime(new FhirDate(2018, 5, 12), new FhirTime(12, 13, 0, null, null), TimeZone.getTimeZone("Europe/Paris")))));
    }

    @Test
    public void toFhirTime() {
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(0L)), new FhirTime(0, 0, null, null, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(75600000L)), new FhirTime(21, 0, null, null, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(780000L)), new FhirTime(0, 13, null, null, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(14880000L)), new FhirTime(4, 8, null, null, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(77520000L)), new FhirTime(21, 32, null, null, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(77535000L)), new FhirTime(21, 32, 15, null, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(77535123L)), new FhirTime(21, 32, 15, 123, null));
        assertEquals(FhirDateTimeConverter.toFhirTime(new Date(77535001L)), new FhirTime(21, 32, 15, 1, 2));
    }

    @Test
    public void fromFhirTime() {
        assertEquals(new Date(0L), FhirDateTimeConverter.fromFhirTime(new FhirTime(0, 0, null, null, null)));
        assertEquals(new Date(75600000L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 0, null, null, null)));
        assertEquals(new Date(780000L), FhirDateTimeConverter.fromFhirTime(new FhirTime(0, 13, null, null, null)));
        assertEquals(new Date(14880000L), FhirDateTimeConverter.fromFhirTime(new FhirTime(4, 8, null, null, null)));
        assertEquals(new Date(77520000L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 32, null, null, null)));
        assertEquals(new Date(77535000L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 32, 15, null, null)));
        assertEquals(new Date(77535123L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 32, 15, 12345, null)));
        assertEquals(new Date(77535124L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 32, 15, 1235, null)));
        assertEquals(new Date(77535001L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 32, 15, 1235, 2)));
        assertEquals(new Date(77535000L), FhirDateTimeConverter.fromFhirTime(new FhirTime(21, 32, 15, 1, 4)));
    }
}
