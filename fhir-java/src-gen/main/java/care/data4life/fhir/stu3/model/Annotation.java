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

import javax.annotation.Nullable;

/**
 * Annotation.java
 * <p>
 * A  text note which also  contains information about who made the statement and when.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Annotation">Annotation</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Annotation) on
 * 2020-10-21
 */
public class Annotation extends Element {

    public static final String resourceType = "Annotation";

    // Individual responsible for the annotation.
    @Json(name = "authorReference")
    @Nullable
    public Reference authorReference;

    // Individual responsible for the annotation.
    @Json(name = "authorString")
    @Nullable
    public String authorString;

    // When the annotation was made.
    @Json(name = "time")
    @Nullable
    public FhirDateTime time;

    // The annotation  - text content.
    @Json(name = "text")
    public String text;


    /**
     * Constructor for all required properties.
     *
     * @param text String
     */
    public Annotation(String text) {
        this.text = text;
    }

    @Override
    public String getResourceType() {
        return Annotation.resourceType;
    }


}
