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

import care.data4life.fhir.r4.util.FhirDateCodec;
import care.data4life.fhir.r4.util.FhirDateTimeConverter;
import care.data4life.fhir.r4.util.FhirDateTimeFormatter;
import care.data4life.fhir.stu3.model.Element;
import care.data4life.fhir.util.Preconditions;

/**
 * FhirInstant
 * <p>
 * An instant in time - known at least to the second and always includes a time zone.
 * <p>
 * Note: This is intended for precisely observed times (typically system logs etc.), and not
 * human-reported times - for them, use date and dateTime. instant is a more constrained dateTime
 * <p>
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?(Z|(\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))))
 *
 * @see <a href="http://hl7.org/fhir/datatypes.html#instant">Instant</a>
 */
public class FhirInstant extends Element implements FhirDateCodec {

    private FhirDateTime dateTime;

    /**
     * Constructor, takes a DateTime that is defined at least to the second and always includes a
     * time zone
     *
     * @param dateTime DateTime of the FhirInstant.
     */
    public FhirInstant(FhirDateTime dateTime) {
        Preconditions.checkArgument(dateTime.getDate().getMonth() != null, "");
        Preconditions.checkArgument(dateTime.getDate().getDay() != null, "");
        Preconditions.checkArgument(dateTime.getTime() != null, "");
        Preconditions.checkArgument(dateTime.getTime().getSecond() != null, "");
        Preconditions.checkArgument(dateTime.getTimeZone() != null, "");

        this.dateTime = dateTime;
    }


    public FhirDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return FhirDateTimeFormatter.formatInstant(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FhirInstant that = (FhirInstant) o;
        return Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }

    @Override
    public Date toDate() {
        return FhirDateTimeConverter.fromFhirInstant(this);
    }
}
