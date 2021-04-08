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
 * Indicates the type of use for which the code is defined.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/codesystem-altcode-kind">AlternativeCodeKind</a>
 */
public enum CodeSystemAlternativeCodeKind {

    /**
     * The code is an alternative code that can be used in any of the circumstances that the primary
     * code can be used.
     */
    @Json(name = "alternate")
    ALTERNATE,

    /**
     * The code should no longer be used, but was used in the past.
     */
    @Json(name = "deprecated")
    DEPRECATED,

    /**
     * The code is an alternative to be used when a case insensitive code is required (when the
     * primary codes are case sensitive).
     */
    @Json(name = "case-insensitive")
    CASE_INSENSITIVE,

    /**
     * The code is an alternative to be used when a case sensitive code is required (when the
     * primary codes are case insensitive).
     */
    @Json(name = "case-sensitive")
    CASE_SENSITIVE,

    /**
     * The code is an alternative for the primary code that is built using the expression grammar
     * defined by the code system.
     */
    @Json(name = "expression")
    EXPRESSION,
}
