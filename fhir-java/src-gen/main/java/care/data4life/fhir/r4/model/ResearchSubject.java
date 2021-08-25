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
 * ResearchSubject.java
 * <p>
 * A physical entity which is the primary unit of operational and/or administrative interest in a
 * study.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchSubject">ResearchSubject</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchSubject)
 */
public class ResearchSubject extends DomainResource {

    public static final String resourceType = "ResearchSubject";

    // Business Identifier for research subject in a study.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // The current state of the subject.
    @Json(name = "status")
    public CodeSystemResearchSubjectStatus status;

    // Start and end of participation.
    @Json(name = "period")
    @Nullable
    public Period period;

    // Study subject is part of.
    @Json(name = "study")
    public Reference study;

    // Who is part of study.
    @Json(name = "individual")
    public Reference individual;

    // What path should be followed.
    @Json(name = "assignedArm")
    @Nullable
    public String assignedArm;

    // What path was followed.
    @Json(name = "actualArm")
    @Nullable
    public String actualArm;

    // Agreement to participate in study.
    @Json(name = "consent")
    @Nullable
    public Reference consent;


    /**
     * Constructor for all required properties.
     *
     * @param status     CodeSystemResearchSubjectStatus
     * @param study      Reference
     * @param individual Reference
     */
    public ResearchSubject(CodeSystemResearchSubjectStatus status, Reference study, Reference individual) {
        this.status = status;
        this.study = study;
        this.individual = individual;
    }

    @Override
    public String getResourceType() {
        return ResearchSubject.resourceType;
    }


}
