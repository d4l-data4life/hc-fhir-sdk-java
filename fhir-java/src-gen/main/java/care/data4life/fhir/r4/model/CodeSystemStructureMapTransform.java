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
 * How data is copied/created.
 *
 * @see <a href="http://hl7.org/fhir/map-transform">StructureMapTransform</a>
 */
public enum CodeSystemStructureMapTransform {

    /**
     * create(type : string) - type is passed through to the application on the standard API, and
     * must be known by it.
     */
    @Json(name = "create")
    CREATE,

    /**
     * copy(source).
     */
    @Json(name = "copy")
    COPY,

    /**
     * truncate(source, length) - source must be stringy type.
     */
    @Json(name = "truncate")
    TRUNCATE,

    /**
     * escape(source, fmt1, fmt2) - change source from one kind of escaping to another (plain, java,
     * xml, json). note that this is for when the string itself is escaped.
     */
    @Json(name = "escape")
    ESCAPE,

    /**
     * cast(source, type?) - case source from one type to another. target type can be left as
     * implicit if there is one and only one target type known.
     */
    @Json(name = "cast")
    CAST,

    /**
     * append(source...) - source is element or string.
     */
    @Json(name = "append")
    APPEND,

    /**
     * translate(source, uri_of_map) - use the translate operation.
     */
    @Json(name = "translate")
    TRANSLATE,

    /**
     * reference(source : object) - return a string that references the provided tree properly.
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * Perform a date operation. *Parameters to be documented*.
     */
    @Json(name = "dateOp")
    DATEOP,

    /**
     * Generate a random UUID (in lowercase). No Parameters.
     */
    @Json(name = "uuid")
    UUID,

    /**
     * Return the appropriate string to put in a reference that refers to the resource provided as a
     * parameter.
     */
    @Json(name = "pointer")
    POINTER,

    /**
     * Execute the supplied FHIRPath expression and use the value returned by that.
     */
    @Json(name = "evaluate")
    EVALUATE,

    /**
     * Create a CodeableConcept. Parameters = (text) or (system. Code[, display]).
     */
    @Json(name = "cc")
    CC,

    /**
     * Create a Coding. Parameters = (system. Code[, display]).
     */
    @Json(name = "c")
    C,

    /**
     * Create a quantity. Parameters = (text) or (value, unit, [system, code]) where text is the
     * natural representation e.g. [comparator]value[space]unit.
     */
    @Json(name = "qty")
    QTY,

    /**
     * Create an identifier. Parameters = (system, value[, type]) where type is a code from the
     * identifier type value set.
     */
    @Json(name = "id")
    ID,

    /**
     * Create a contact details. Parameters = (value) or (system, value). If no system is provided,
     * the system should be inferred from the content of the value.
     */
    @Json(name = "cp")
    CP,
}
