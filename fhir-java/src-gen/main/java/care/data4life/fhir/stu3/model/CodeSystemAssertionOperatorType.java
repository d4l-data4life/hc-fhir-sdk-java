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

import com.squareup.moshi.Json;


/**
 * The type of operator to use for assertion.
 *
 * @see <a href="http://hl7.org/fhir/assert-operator-codes">AssertionOperatorType</a>
 */
public enum CodeSystemAssertionOperatorType {

    /**
     * Default value. Equals comparison.
     */
    @Json(name = "equals")
    EQUALS,

    /**
     * Not equals comparison.
     */
    @Json(name = "notEquals")
    NOTEQUALS,

    /**
     * Compare value within a known set of values.
     */
    @Json(name = "in")
    IN,

    /**
     * Compare value not within a known set of values.
     */
    @Json(name = "notIn")
    NOTIN,

    /**
     * Compare value to be greater than a known value.
     */
    @Json(name = "greaterThan")
    GREATERTHAN,

    /**
     * Compare value to be less than a known value.
     */
    @Json(name = "lessThan")
    LESSTHAN,

    /**
     * Compare value is empty.
     */
    @Json(name = "empty")
    EMPTY,

    /**
     * Compare value is not empty.
     */
    @Json(name = "notEmpty")
    NOTEMPTY,

    /**
     * Compare value string contains a known value.
     */
    @Json(name = "contains")
    CONTAINS,

    /**
     * Compare value string does not contain a known value.
     */
    @Json(name = "notContains")
    NOTCONTAINS,

    /**
     * Evaluate the fluentpath expression as a boolean condition.
     */
    @Json(name = "eval")
    EVAL,
}
