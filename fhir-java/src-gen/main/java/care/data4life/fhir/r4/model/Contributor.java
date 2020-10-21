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
 * Contributor.java
 * <p>
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and
 * endorsers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contributor">Contributor</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contributor) on
 * 2020-10-21
 */
public class Contributor extends Element {

    public static final String resourceType = "Contributor";

    // The type of contributor.
    @Json(name = "type")
    public CodeSystemContributorType type;

    // Who contributed the content.
    @Json(name = "name")
    public String name;

    // Contact details of the contributor.
    @Json(name = "contact")
    @Nullable
    public List<ContactDetail> contact;


    /**
     * Constructor for all required properties.
     *
     * @param type CodeSystemContributorType
     * @param name String
     */
    public Contributor(CodeSystemContributorType type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getResourceType() {
        return Contributor.resourceType;
    }


}
