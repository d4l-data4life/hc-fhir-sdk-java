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

import java.util.List;

import javax.annotation.Nullable;

/**
 * CodeableConcept.java
 * <p>
 * A concept that may be defined by a formal reference to a terminology or ontology or may be
 * provided by text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeableConcept">CodeableConcept</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeableConcept)
 */
public class CodeableConcept extends Element {

    public static final String resourceType = "CodeableConcept";

    // Code defined by a terminology system.
    @Json(name = "coding")
    @Nullable
    public List<Coding> coding;

    // Plain text representation of the concept.
    @Json(name = "text")
    @Nullable
    public String text;


    public CodeableConcept() {
    }

    @Override
    public String getResourceType() {
        return CodeableConcept.resourceType;
    }


}
