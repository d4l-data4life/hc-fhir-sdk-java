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
 * Used to specify why the normally expected content of the data element is missing.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/data-absent-reason">DataAbsentReason</a>
 */
public enum CodeSystemDataAbsentReason {

    /**
     * The value is expected to exist but is not known.
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * The source was asked but does not know the value.
     */
    @Json(name = "asked-unknown")
    ASKED_UNKNOWN,

    /**
     * There is reason to expect (from the workflow) that the value may become known.
     */
    @Json(name = "temp-unknown")
    TEMP_UNKNOWN,

    /**
     * The workflow didn't lead to this value being known.
     */
    @Json(name = "not-asked")
    NOT_ASKED,

    /**
     * The source was asked but declined to answer.
     */
    @Json(name = "asked-declined")
    ASKED_DECLINED,

    /**
     * The information is not available due to security, privacy or related reasons.
     */
    @Json(name = "masked")
    MASKED,

    /**
     * There is no proper value for this element (e.g. last menstrual period for a male).
     */
    @Json(name = "not-applicable")
    NOT_APPLICABLE,

    /**
     * The source system wasn't capable of supporting this element.
     */
    @Json(name = "unsupported")
    UNSUPPORTED,

    /**
     * The content of the data is represented in the resource narrative.
     */
    @Json(name = "as-text")
    AS_TEXT,

    /**
     * Some system or workflow process error means that the information is not available.
     */
    @Json(name = "error")
    ERROR,

    /**
     * The numeric value is undefined or unrepresentable due to a floating point processing error.
     */
    @Json(name = "not-a-number")
    NOT_A_NUMBER,

    /**
     * The numeric value is excessively low and unrepresentable due to a floating point processing
     * error.
     */
    @Json(name = "negative-infinity")
    NEGATIVE_INFINITY,

    /**
     * The numeric value is excessively high and unrepresentable due to a floating point processing
     * error.
     */
    @Json(name = "positive-infinity")
    POSITIVE_INFINITY,

    /**
     * The value is not available because the observation procedure (test, etc.) was not performed.
     */
    @Json(name = "not-performed")
    NOT_PERFORMED,

    /**
     * The value is not permitted in this context (e.g. due to profiles, or the base data types).
     */
    @Json(name = "not-permitted")
    NOT_PERMITTED,
}
