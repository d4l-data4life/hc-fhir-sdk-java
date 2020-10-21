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
 * HTTP verbs (in the HTTP command line). See [HTTP rfc](https://tools.ietf.org/html/rfc7231) for
 * details.
 *
 * @see <a href="http://hl7.org/fhir/http-verb">HTTPVerb</a>
 */
public enum CodeSystemHTTPVerb {

    /**
     * HTTP GET Command.
     */
    @Json(name = "GET")
    GET,

    /**
     * HTTP HEAD Command.
     */
    @Json(name = "HEAD")
    HEAD,

    /**
     * HTTP POST Command.
     */
    @Json(name = "POST")
    POST,

    /**
     * HTTP PUT Command.
     */
    @Json(name = "PUT")
    PUT,

    /**
     * HTTP DELETE Command.
     */
    @Json(name = "DELETE")
    DELETE,

    /**
     * HTTP PATCH Command.
     */
    @Json(name = "PATCH")
    PATCH,
}
