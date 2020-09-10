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
 * FamilyMemberHistory.java
 * <p>
 * Significant health events and conditions for a person related to the patient relevant in the
 * context of care for the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistory</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory) on
 * 2020-07-29
 */
public class FamilyMemberHistory extends DomainResource {

    public static final String resourceType = "FamilyMemberHistory";

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

    // (approximate) date of birth.
    @Json(name = "bornDate")
    @Nullable
    public FhirDate bornDate;

    // (approximate) date of birth.
    @Json(name = "bornPeriod")
    @Nullable
    public Period bornPeriod;

    // (approximate) date of birth.
    @Json(name = "bornString")
    @Nullable
    public String bornString;

    // Condition that the related person had.
    @Json(name = "condition")
    @Nullable
    public List<FamilyMemberHistoryCondition> condition;

    // When history was captured/updated.
    @Json(name = "date")
    @Nullable
    public FhirDateTime date;

    // Dead? How old/when?.
    @Json(name = "deceasedAge")
    @Nullable
    public Age deceasedAge;

    // Dead? How old/when?.
    @Json(name = "deceasedBoolean")
    @Nullable
    public Boolean deceasedBoolean;

    // Dead? How old/when?.
    @Json(name = "deceasedDate")
    @Nullable
    public FhirDate deceasedDate;

    // Dead? How old/when?.
    @Json(name = "deceasedRange")
    @Nullable
    public Range deceasedRange;

    // Dead? How old/when?.
    @Json(name = "deceasedString")
    @Nullable
    public String deceasedString;

    // Instantiates protocol or definition.
    @Json(name = "definition")
    @Nullable
    public List<Reference> definition;

    // Age is estimated?.
    @Json(name = "estimatedAge")
    @Nullable
    public Boolean estimatedAge;

    // Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
    @Json(name = "gender")
    @Nullable
    public CodeSystems.AdministrativeGender gender;

    // External Id(s) for this record.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // The family member described.
    @Json(name = "name")
    @Nullable
    public String name;

    // The taking of a family member's history did not occur.
    @Json(name = "notDone")
    @Nullable
    public Boolean notDone;

    // subject-unknown | withheld | unable-to-obtain | deferred.
    @Json(name = "notDoneReason")
    @Nullable
    public CodeableConcept notDoneReason;

    // General note about related person.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Patient history is about.
    @Json(name = "patient")
    public Reference patient;

    // Why was family member history performed?.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why was family member history performed?.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Relationship to the subject.
    @Json(name = "relationship")
    public CodeableConcept relationship;

    // A code specifying the status of the record of the family history of a specific family member.
    @Json(name = "status")
    public CodeSystems.FamilyHistoryStatus status;

    /**
     * Constructor for all required properties.
     *
     * @param patient      Reference
     * @param relationship CodeableConcept
     * @param status       CodeSystems.FamilyHistoryStatus
     */
    public FamilyMemberHistory(Reference patient, CodeableConcept relationship,
                               CodeSystems.FamilyHistoryStatus status) {
        this.patient = patient;
        this.relationship = relationship;
        this.status = status;
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
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
     * on 2020-07-29
     */
    public static class FamilyMemberHistoryCondition extends BackboneElement {

        public static final String resourceType = "FamilyMemberHistoryCondition";

        // Condition suffered by relation.
        @Json(name = "code")
        public CodeableConcept code;

        // Extra information about condition.
        @Json(name = "note")
        @Nullable
        public List<Annotation> note;

        // When condition first manifested.
        @Json(name = "onsetAge")
        @Nullable
        public Age onsetAge;

        // When condition first manifested.
        @Json(name = "onsetPeriod")
        @Nullable
        public Period onsetPeriod;

        // When condition first manifested.
        @Json(name = "onsetRange")
        @Nullable
        public Range onsetRange;

        // When condition first manifested.
        @Json(name = "onsetString")
        @Nullable
        public String onsetString;

        // deceased | permanent disability | etc..
        @Json(name = "outcome")
        @Nullable
        public CodeableConcept outcome;

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
