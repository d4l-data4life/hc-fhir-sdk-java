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
 * Data types allowed to be used for search parameters.
 *
 * @see <a href="http://hl7.org/fhir/search-param-type">SearchParamType</a>
 */
public enum CodeSystemSearchParamType {

    /**
     * Search parameter SHALL be a number (a whole number, or a decimal).
     */
    @Json(name = "number")
    NUMBER,

    /**
     * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be
     * supported.
     */
    @Json(name = "date")
    DATE,

    /**
     * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May
     * match just the start of a string. String parameters may contain spaces.
     */
    @Json(name = "string")
    STRING,

    /**
     * Search parameter on a coded element or identifier. May be used to search through the text, display, code and
     * code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of
     * namespace and value, separated by a "|", depending on the modifier used.
     */
    @Json(name = "token")
    TOKEN,

    /**
     * A reference to another resource (Reference or canonical).
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * A composite search parameter that combines a search on two values together.
     */
    @Json(name = "composite")
    COMPOSITE,

    /**
     * A search parameter that searches on a quantity.
     */
    @Json(name = "quantity")
    QUANTITY,

    /**
     * A search parameter that searches on a URI (RFC 3986).
     */
    @Json(name = "uri")
    URI,

    /**
     * Special logic applies to this parameter per the description of the search parameter.
     */
    @Json(name = "special")
    SPECIAL,
}
