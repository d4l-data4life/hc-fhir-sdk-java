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

import com.squareup.moshi.Json;


/**
 * Permitted data type for observation value.
 *
 * @see <a href="http://hl7.org/fhir/permitted-data-type">ObservationDataType</a>
 */
public enum CodeSystemObservationDataType {

    /**
     * A measured amount.
     */
    @Json(name = "Quantity")
    QUANTITY,

    /**
     * A coded concept from a reference terminology and/or text.
     */
    @Json(name = "CodeableConcept")
    CODEABLECONCEPT,

    /**
     * A sequence of Unicode characters.
     */
    @Json(name = "string")
    STRING,

    /**
     * true or false.
     */
    @Json(name = "boolean")
    BOOLEAN,

    /**
     * A signed integer.
     */
    @Json(name = "integer")
    INTEGER,

    /**
     * A set of values bounded by low and high.
     */
    @Json(name = "Range")
    RANGE,

    /**
     * A ratio of two Quantity values - a numerator and a denominator.
     */
    @Json(name = "Ratio")
    RATIO,

    /**
     * A series of measurements taken by a device.
     */
    @Json(name = "SampledData")
    SAMPLEDDATA,

    /**
     * A time during the day, in the format hh:mm:ss.
     */
    @Json(name = "time")
    TIME,

    /**
     * A date, date-time or partial date (e.g. just year or year + month) as used in human communication.
     */
    @Json(name = "dateTime")
    DATETIME,

    /**
     * A time range defined by start and end date/time.
     */
    @Json(name = "Period")
    PERIOD,
}
