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
 * A supported modifier for a search parameter.
 *
 * @see <a href="http://hl7.org/fhir/search-modifier-code">SearchModifierCode</a>
 */
public enum CodeSystemSearchModifierCode {

    /**
     * The search parameter returns resources that have a value or not.
     */
    @Json(name = "missing")
    MISSING,

    /**
     * The search parameter returns resources that have a value that exactly matches the supplied
     * parameter (the whole string, including casing and accents).
     */
    @Json(name = "exact")
    EXACT,

    /**
     * The search parameter returns resources that include the supplied parameter value anywhere
     * within the field being searched.
     */
    @Json(name = "contains")
    CONTAINS,

    /**
     * The search parameter returns resources that do not contain a match.
     */
    @Json(name = "not")
    NOT,

    /**
     * The search parameter is processed as a string that searches text associated with the
     * code/value - either CodeableConcept.text, Coding.display, or Identifier.type.text.
     */
    @Json(name = "text")
    TEXT,

    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the
     * search parameter tests whether the coding is in the specified value set.
     */
    @Json(name = "in")
    IN,

    /**
     * The search parameter is a URI (relative or absolute) that identifies a value set, and the
     * search parameter tests whether the coding is not in the specified value set.
     */
    @Json(name = "not-in")
    NOT_IN,

    /**
     * The search parameter tests whether the value in a resource is subsumed by the specified value
     * (is-a, or hierarchical relationships).
     */
    @Json(name = "below")
    BELOW,

    /**
     * The search parameter tests whether the value in a resource subsumes the specified value
     * (is-a, or hierarchical relationships).
     */
    @Json(name = "above")
    ABOVE,

    /**
     * The search parameter only applies to the Resource Type specified as a modifier (e.g. the
     * modifier is not actually :type, but :Patient etc.).
     */
    @Json(name = "type")
    TYPE,
}
