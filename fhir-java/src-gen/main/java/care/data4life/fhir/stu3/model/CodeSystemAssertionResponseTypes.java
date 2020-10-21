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
 * The type of response code to use for assertion.
 *
 * @see <a href="http://hl7.org/fhir/assert-response-code-types">AssertionResponseTypes</a>
 */
public enum CodeSystemAssertionResponseTypes {

    /**
     * Response code is 200.
     */
    @Json(name = "okay")
    OKAY,

    /**
     * Response code is 201.
     */
    @Json(name = "created")
    CREATED,

    /**
     * Response code is 204.
     */
    @Json(name = "noContent")
    NOCONTENT,

    /**
     * Response code is 304.
     */
    @Json(name = "notModified")
    NOTMODIFIED,

    /**
     * Response code is 400.
     */
    @Json(name = "bad")
    BAD,

    /**
     * Response code is 403.
     */
    @Json(name = "forbidden")
    FORBIDDEN,

    /**
     * Response code is 404.
     */
    @Json(name = "notFound")
    NOTFOUND,

    /**
     * Response code is 405.
     */
    @Json(name = "methodNotAllowed")
    METHODNOTALLOWED,

    /**
     * Response code is 409.
     */
    @Json(name = "conflict")
    CONFLICT,

    /**
     * Response code is 410.
     */
    @Json(name = "gone")
    GONE,

    /**
     * Response code is 412.
     */
    @Json(name = "preconditionFailed")
    PRECONDITIONFAILED,

    /**
     * Response code is 422.
     */
    @Json(name = "unprocessable")
    UNPROCESSABLE,
}
