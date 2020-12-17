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

import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

import javax.annotation.Nullable;

import care.data4life.fhir.r4.util.FhirDateCodec;
import care.data4life.fhir.r4.util.FhirDateTimeConverter;
import care.data4life.fhir.r4.util.FhirDateTimeFormatter;
import care.data4life.fhir.util.Preconditions;

/**
 * FhirDateTime
 * <p>
 * A date, date-time or partial date (e.g. just year or year + month) as used in human
 * communication. If hours and minutes are specified, a time zone SHALL be populated. Seconds must
 * be provided due to schema type constraints but may be zero-filled and may be ignored. Dates SHALL
 * be valid dates. The time "24:00" is not allowed.
 * <p>
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?(Z|(\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?
 *
 * @see <a href="http://hl7.org/fhir/datatypes.html#datetime">DateTime</a>
 */
public class FhirDateTime extends Element implements FhirDateCodec {

    private FhirDate date;

    @Nullable
    private FhirTime time;

    @Nullable
    private TimeZone timeZone;


    /**
     * Constructor, takes a date and optionally a time and a timezone.
     * <p>
     * If time is given, timezone must be given too.
     *
     * @param date     The FhirDate of the dateTime
     * @param time     The FhirTime of the dateTime (optional)
     * @param timeZone The TimeZone of the dateTime (optional)
     */
    public FhirDateTime(FhirDate date, @Nullable FhirTime time, @Nullable TimeZone timeZone) {
        Preconditions.checkNotNull(date);

        if (time != null || timeZone != null) {
            Preconditions.checkArgument(time != null, "if timezone is provided, time is needed too");
            Preconditions.checkArgument(timeZone != null, "if time is provided, timezone is needed too");
        }

        this.date = date;
        this.time = time;
        this.timeZone = timeZone;
    }

    public FhirDate getDate() {
        return date;
    }

    @Nullable
    public FhirTime getTime() {
        return time;
    }

    @Nullable
    public TimeZone getTimeZone() {
        return timeZone;
    }

    @Override
    public String toString() {
        return FhirDateTimeFormatter.formatDateTime(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FhirDateTime that = (FhirDateTime) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(time, that.time) &&
                Objects.equals(timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time, timeZone);
    }

    @Override
    public Date toDate() {
        return FhirDateTimeConverter.fromFhirDateTime(this);
    }
}
