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
 * FamilyMemberHistory.java
 * <p>
 * Significant health conditions for a person related to the patient relevant in the context of care
 * for the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistory</a>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
 */
public class FamilyMemberHistory extends DomainResource {

    public static final String resourceType = "FamilyMemberHistory";

    // External Id(s) for this record.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Instantiates FHIR protocol or definition.
    @Json(name = "instantiatesCanonical")
    @Nullable
    public List<Canonical> instantiatesCanonical;

    // Instantiates external protocol or definition.
    @Json(name = "instantiatesUri")
    @Nullable
    public List<String> instantiatesUri;

    // A code specifying the status of the record of the family history of a specific family member.
    @Json(name = "status")
    public CodeSystemFamilyHistoryStatus status;

    // subject-unknown | withheld | unable-to-obtain | deferred.
    @Json(name = "dataAbsentReason")
    @Nullable
    public CodeableConcept dataAbsentReason;

    // Patient history is about.
    @Json(name = "patient")
    public Reference patient;

    // When history was recorded or last updated.
    @Json(name = "date")
    @Nullable
    public FhirDateTime date;

    // The family member described.
    @Json(name = "name")
    @Nullable
    public String name;

    // Relationship to the subject.
    @Json(name = "relationship")
    public CodeableConcept relationship;

    // male | female | other | unknown.
    @Json(name = "sex")
    @Nullable
    public CodeableConcept sex;

    // (approximate) date of birth.
    @Json(name = "bornPeriod")
    @Nullable
    public Period bornPeriod;

    // (approximate) date of birth.
    @Json(name = "bornDate")
    @Nullable
    public FhirDate bornDate;

    // (approximate) date of birth.
    @Json(name = "bornString")
    @Nullable
    public String bornString;

    // (approximate) age.
    @Json(name = "ageAge")
    @Nullable
    public Age ageAge;

    // (approximate) age.
    @Json(name = "ageRange")
    @Nullable
    public Range ageRange;

    // (approximate) age.
    @Json(name = "ageString")
    @Nullable
    public String ageString;

    // Age is estimated?.
    @Json(name = "estimatedAge")
    @Nullable
    public Boolean estimatedAge;

    // Dead? How old/when?.
    @Json(name = "deceasedBoolean")
    @Nullable
    public Boolean deceasedBoolean;

    // Dead? How old/when?.
    @Json(name = "deceasedAge")
    @Nullable
    public Age deceasedAge;

    // Dead? How old/when?.
    @Json(name = "deceasedRange")
    @Nullable
    public Range deceasedRange;

    // Dead? How old/when?.
    @Json(name = "deceasedDate")
    @Nullable
    public FhirDate deceasedDate;

    // Dead? How old/when?.
    @Json(name = "deceasedString")
    @Nullable
    public String deceasedString;

    // Why was family member history performed?.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why was family member history performed?.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // General note about related person.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Condition that the related person had.
    @Json(name = "condition")
    @Nullable
    public List<FamilyMemberHistoryCondition> condition;


    /**
     * Constructor for all required properties.
     *
     * @param status       CodeSystemFamilyHistoryStatus
     * @param patient      Reference
     * @param relationship CodeableConcept
     */
    public FamilyMemberHistory(CodeSystemFamilyHistoryStatus status, Reference patient, CodeableConcept relationship) {
        this.status = status;
        this.patient = patient;
        this.relationship = relationship;
    }

    @Override
    public String getResourceType() {
        return FamilyMemberHistory.resourceType;
    }


    /**
     * FamilyMemberHistory.java
     * <p>
     * The significant Conditions (or condition) that the family member had. This is a repeating
     * section to allow a system to represent more than one condition per resource, though there is
     * nothing stopping multiple resources - one per condition.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistory</a>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
     */
    public static class FamilyMemberHistoryCondition extends BackboneElement {

        public static final String resourceType = "FamilyMemberHistoryCondition";

        // Condition suffered by relation.
        @Json(name = "code")
        public CodeableConcept code;

        // deceased | permanent disability | etc..
        @Json(name = "outcome")
        @Nullable
        public CodeableConcept outcome;

        // Whether the condition contributed to the cause of death.
        @Json(name = "contributedToDeath")
        @Nullable
        public Boolean contributedToDeath;

        // When condition first manifested.
        @Json(name = "onsetAge")
        @Nullable
        public Age onsetAge;

        // When condition first manifested.
        @Json(name = "onsetRange")
        @Nullable
        public Range onsetRange;

        // When condition first manifested.
        @Json(name = "onsetPeriod")
        @Nullable
        public Period onsetPeriod;

        // When condition first manifested.
        @Json(name = "onsetString")
        @Nullable
        public String onsetString;

        // Extra information about condition.
        @Json(name = "note")
        @Nullable
        public List<Annotation> note;


        /**
         * Constructor for all required properties.
         *
         * @param code CodeableConcept
         */
        public FamilyMemberHistoryCondition(CodeableConcept code) {
            this.code = code;
        }

        @Override
        public String getResourceType() {
            return FamilyMemberHistoryCondition.resourceType;
        }


    }


}
