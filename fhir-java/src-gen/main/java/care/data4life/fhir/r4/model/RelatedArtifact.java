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
 * RelatedArtifact.java
 * <p>
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RelatedArtifact">RelatedArtifact</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RelatedArtifact) on
 * 2020-10-15
 */
public class RelatedArtifact extends Element {

    public static final String resourceType = "RelatedArtifact";

    // The type of relationship to the related artifact.
    @Json(name = "type")
    public CodeSystemRelatedArtifactType type;

    // Short label.
    @Json(name = "label")
    @Nullable
    public String label;

    // Brief description of the related artifact.
    @Json(name = "display")
    @Nullable
    public String display;

    // Bibliographic citation for the artifact.
    @Json(name = "citation")
    @Nullable
    public String citation;

    // Where the artifact can be accessed.
    @Json(name = "url")
    @Nullable
    public Url url;

    // What document is being referenced.
    @Json(name = "document")
    @Nullable
    public Attachment document;

    // What resource is being referenced.
    @Json(name = "resource")
    @Nullable
    public Canonical resource;


    /**
     * Constructor for all required properties.
     *
     * @param type CodeSystemRelatedArtifactType
     */
    public RelatedArtifact(CodeSystemRelatedArtifactType type) {
        this.type = type;
    }

    @Override
    public String getResourceType() {
        return RelatedArtifact.resourceType;
    }


}
