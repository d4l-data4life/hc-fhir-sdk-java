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

import javax.annotation.Nullable;

/**
 * Expression.java
 * <p>
 * A expression that is evaluated in a specified context and returns a value. The context of use of the expression must
 * specify the context in which the expression is evaluated, and how the result of the expression is used.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Expression">Expression</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Expression) on 2021-03-26
 */
public class Expression extends Element {

    public static final String resourceType = "Expression";

    // Natural language description of the condition.
    @Json(name = "description")
    @Nullable
    public String description;

    // Short name assigned to expression for reuse.
    @Json(name = "name")
    @Nullable
    public String name;

    // text/cql | text/fhirpath | application/x-fhir-query | etc..
    @Json(name = "language")
    public String language;

    // Expression in specified language.
    @Json(name = "expression")
    @Nullable
    public String expression;

    // Where the expression is found.
    @Json(name = "reference")
    @Nullable
    public String reference;


    /**
     * Constructor for all required properties.
     *
     * @param language String
     */
    public Expression(String language) {
        this.language = language;
    }

    @Override
    public String getResourceType() {
        return Expression.resourceType;
    }


}