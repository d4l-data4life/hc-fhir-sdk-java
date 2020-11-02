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
 * A code that indicates how the server supports conditional read.
 *
 * @see <a href="http://hl7.org/fhir/conditional-read-status">ConditionalReadStatus</a>
 */
public enum CodeSystemConditionalReadStatus {

    /**
     * No support for conditional reads.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * Conditional reads are supported, but only with the If-Modified-Since HTTP Header.
     */
    @Json(name = "modified-since")
    MODIFIED_SINCE,

    /**
     * Conditional reads are supported, but only with the If-None-Match HTTP Header.
     */
    @Json(name = "not-match")
    NOT_MATCH,

    /**
     * Conditional reads are supported, with both If-Modified-Since and If-None-Match HTTP Headers.
     */
    @Json(name = "full-support")
    FULL_SUPPORT,
}
