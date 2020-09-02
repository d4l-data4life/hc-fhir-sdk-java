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

import java.util.Date;
import java.util.Objects;

import javax.annotation.Nullable;

import care.data4life.fhir.stu3.util.FhirDateCodec;
import care.data4life.fhir.stu3.util.FhirDateTimeConverter;
import care.data4life.fhir.stu3.util.FhirDateTimeFormatter;
import care.data4life.fhir.util.Preconditions;

/**
 * FhirTime
 * <p>
 * A time during the day, with no date specified (can be converted to a Duration since midnight).
 * Seconds must be provided due to schema type constraints but may be zero-filled and may be
 * ignored.
 * <p>
 * The time "24:00" is not allowed, and neither is a time zone.
 * <p>
 * Regex: ([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?
 *
 * @see <a href="http://hl7.org/fhir/datatypes.html#time">Time</a>
 */
public class FhirTime extends Element implements FhirDateCodec {

    private int hour;

    private int minute;

    @Nullable
    private Integer second;

    @Nullable
    private Integer fractionOfSecond;

    @Nullable
    private Integer fractionPadding;


    /**
     * Constructor
     *
     * @param hour             Hour of day, allowed range from 0 to 23
     * @param minute           Minute of the hour, allowed range from 0 to 59
     * @param second           Second of the minute, allowed range form 0 to 59
     * @param fractionOfSecond Fraction of the second
     * @param fractionPadding  Left padding of the fraction for leading zeros, e.g. 00001 = padding
     *                         of 4
     */
    public FhirTime(int hour, int minute, @Nullable Integer second, @Nullable Integer fractionOfSecond, @Nullable Integer fractionPadding) {
        Preconditions.checkArgument(hour >= 0, "hour should be >= 0");
        Preconditions.checkArgument(hour <= 23, "hour should be <= 23");

        Preconditions.checkArgument(minute >= 0, "minute should be >= 0");
        Preconditions.checkArgument(minute <= 59, "minute should be <= 59");

        if (second != null) {
            Preconditions.checkArgument(second >= 0, "second should be >= 0");
            Preconditions.checkArgument(second <= 59, "second should be <= 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.fractionOfSecond = fractionOfSecond;
        this.fractionPadding = fractionPadding;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Nullable
    public Integer getSecond() {
        return second;
    }

    @Nullable
    public Integer getFractionOfSecond() {
        return fractionOfSecond;
    }

    @Nullable
    public Integer getFractionPadding() {
        return fractionPadding;
    }

    @Override
    public String toString() {
        return FhirDateTimeFormatter.formatTime(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FhirTime fhirTime = (FhirTime) o;
        return hour == fhirTime.hour &&
                minute == fhirTime.minute &&
                Objects.equals(second, fhirTime.second) &&
                Objects.equals(fractionOfSecond, fhirTime.fractionOfSecond) &&
                Objects.equals(fractionPadding, fhirTime.fractionPadding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second, fractionOfSecond, fractionPadding);
    }

    @Override
    public Date toDate() {
        return FhirDateTimeConverter.fromFhirTime(this);
    }
}
