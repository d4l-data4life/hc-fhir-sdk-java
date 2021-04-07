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
 * Narrative.java
 * <p>
 * A human-readable summary of the resource conveying the essential clinical and business information for the resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Narrative">Narrative</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Narrative) on 2021-04-07
 */
public class Narrative extends Element {

    public static final String resourceType = "Narrative";

    // The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
    @Json(name = "status")
    public CodeSystemNarrativeStatus status;

    // Limited xhtml content.
    @Json(name = "div")
    public String div;


    /**
     * Constructor for all required properties.
     *
     * @param status CodeSystemNarrativeStatus
     * @param div    String
     */
    public Narrative(CodeSystemNarrativeStatus status, String div) {
        this.status = status;
        this.div = div;
    }

    @Override
    public String getResourceType() {
        return Narrative.resourceType;
    }


}
