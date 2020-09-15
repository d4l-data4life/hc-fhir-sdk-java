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

import java.util.List;

import javax.annotation.Nullable;

/**
 * CareTeam.java
 * <p>
 * The Care Team includes all the people and organizations who plan to participate in the
 * coordination and delivery of care for a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeam</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam) on 2020-07-29
 */
public class CareTeam extends DomainResource {

    public static final String resourceType = "CareTeam";

    // Type of team.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Encounter or episode associated with CareTeam.
    @Json(name = "context")
    @Nullable
    public Reference context;

    // External Ids for this team.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Organization responsible for the care team.
    @Json(name = "managingOrganization")
    @Nullable
    public List<Reference> managingOrganization;

    // Name of the team, such as crisis assessment team.
    @Json(name = "name")
    @Nullable
    public String name;

    // Comments made about the CareTeam.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Members of the team.
    @Json(name = "participant")
    @Nullable
    public List<CareTeamParticipant> participant;

    // Time period team covers.
    @Json(name = "period")
    @Nullable
    public Period period;

    // Why the care team exists.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why the care team exists.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Indicates the current state of the care team.
    @Json(name = "status")
    @Nullable
    public CodeSystems.CareTeamStatus status;

    // Who care team is for.
    @Json(name = "subject")
    @Nullable
    public Reference subject;

    public CareTeam() {
    }

    @Override
    public String getResourceType() {
        return CareTeam.resourceType;
    }

    /**
     * CareTeam.java
     * <p>
     * Identifies all people and organizations who are expected to be involved in the care team.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeam</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam) on
     * 2020-07-29
     */
    public static class CareTeamParticipant extends BackboneElement {

        public static final String resourceType = "CareTeamParticipant";

        // Who is involved.
        @Json(name = "member")
        @Nullable
        public Reference member;

        // Organization of the practitioner.
        @Json(name = "onBehalfOf")
        @Nullable
        public Reference onBehalfOf;

        // Time period of participant.
        @Json(name = "period")
        @Nullable
        public Period period;

        // Type of involvement.
        @Json(name = "role")
        @Nullable
        public CodeableConcept role;

        public CareTeamParticipant() {
        }

        @Override
        public String getResourceType() {
            return CareTeamParticipant.resourceType;
        }
    }
}
