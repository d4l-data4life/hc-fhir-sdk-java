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

import javax.annotation.Nullable;

import care.data4life.fhir.r4.util.FhirDateCodec;
import care.data4life.fhir.r4.util.FhirDateTimeConverter;
import care.data4life.fhir.r4.util.FhirDateTimeFormatter;
import care.data4life.fhir.util.Preconditions;

/**
 * FhirDate
 * <p>
 * A date, or partial date (e.g. just year or year + month) as used in human communication. There is
 * no time zone. Dates SHALL be valid dates. Month and day are optional.
 * <p>
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?
 *
 * @see <a href="http://hl7.org/fhir/datatypes.html#date">Date</a>
 */
public class FhirDate extends Element implements FhirDateCodec {

    private int year;

    @Nullable
    private Integer month;

    @Nullable
    private Integer day;

    /**
     * Constructor
     *
     * @param year  Year of the date, limited from 1000 to 9999
     * @param month Month of the year
     * @param day   Day of the month
     */
    public FhirDate(int year, @Nullable Integer month, @Nullable Integer day) {
        Preconditions.checkArgument(year >= 1000, "year should be >= 1000");
        Preconditions.checkArgument(year <= 9999, "month should be <= 9999");

        if (month != null) {
            Preconditions.checkArgument(month >= 1, "month should be >= 1");
            Preconditions.checkArgument(month <= 12, "month should be <= 12");
        }

        if (day != null) {
            Preconditions.checkArgument(day >= 1, "day should be >= 1");
            Preconditions.checkArgument(day <= 31, "day should be <= 12");
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    @Nullable
    public Integer getMonth() {
        return month;
    }

    @Nullable
    public Integer getDay() {
        return day;
    }

    @Override
    public String toString() {
        return FhirDateTimeFormatter.formatDate(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FhirDate date = (FhirDate) o;
        return year == date.year &&
                Objects.equals(month, date.month) &&
                Objects.equals(day, date.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }


    @Override
    public Date toDate() {
        return FhirDateTimeConverter.fromFhirDate(this);
    }

}
