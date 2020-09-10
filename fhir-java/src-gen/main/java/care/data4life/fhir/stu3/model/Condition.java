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
 * Condition.java
 * <p>
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition) on 2020-07-29
 */
public class Condition extends DomainResource {

    public static final String resourceType = "Condition";

    // If/when in resolution/remission.
    @Json(name = "abatementAge")
    @Nullable
    public Age abatementAge;

    // If/when in resolution/remission.
    @Json(name = "abatementBoolean")
    @Nullable
    public Boolean abatementBoolean;

    // If/when in resolution/remission.
    @Json(name = "abatementDateTime")
    @Nullable
    public FhirDateTime abatementDateTime;

    // If/when in resolution/remission.
    @Json(name = "abatementPeriod")
    @Nullable
    public Period abatementPeriod;

    // If/when in resolution/remission.
    @Json(name = "abatementRange")
    @Nullable
    public Range abatementRange;

    // If/when in resolution/remission.
    @Json(name = "abatementString")
    @Nullable
    public String abatementString;

    // Date record was believed accurate.
    @Json(name = "assertedDate")
    @Nullable
    public FhirDateTime assertedDate;

    // Person who asserts this condition.
    @Json(name = "asserter")
    @Nullable
    public Reference asserter;

    // Anatomical location, if relevant.
    @Json(name = "bodySite")
    @Nullable
    public List<CodeableConcept> bodySite;

    // problem-list-item | encounter-diagnosis.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // active | recurrence | inactive | remission | resolved.
    @Json(name = "clinicalStatus")
    @Nullable
    public String clinicalStatus;

    // Identification of the condition, problem or diagnosis.
    @Json(name = "code")
    @Nullable
    public CodeableConcept code;

    // Encounter or episode when condition first asserted.
    @Json(name = "context")
    @Nullable
    public Reference context;

    // Supporting evidence.
    @Json(name = "evidence")
    @Nullable
    public List<ConditionEvidence> evidence;

    // External Ids for this condition.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Additional information about the Condition.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Estimated or actual date,  date-time, or age.
    @Json(name = "onsetAge")
    @Nullable
    public Age onsetAge;

    // Estimated or actual date,  date-time, or age.
    @Json(name = "onsetDateTime")
    @Nullable
    public FhirDateTime onsetDateTime;

    // Estimated or actual date,  date-time, or age.
    @Json(name = "onsetPeriod")
    @Nullable
    public Period onsetPeriod;

    // Estimated or actual date,  date-time, or age.
    @Json(name = "onsetRange")
    @Nullable
    public Range onsetRange;

    // Estimated or actual date,  date-time, or age.
    @Json(name = "onsetString")
    @Nullable
    public String onsetString;

    // Subjective severity of condition.
    @Json(name = "severity")
    @Nullable
    public CodeableConcept severity;

    // Stage/grade, usually assessed formally.
    @Json(name = "stage")
    @Nullable
    public ConditionStage stage;

    // Who has the condition?.
    @Json(name = "subject")
    public Reference subject;

    // The verification status to support the clinical status of the condition.
    @Json(name = "verificationStatus")
    @Nullable
    public CodeSystems.ConditionVerificationStatus verificationStatus;

    /**
     * Constructor for all required properties.
     *
     * @param subject Reference
     */
    public Condition(Reference subject) {
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return Condition.resourceType;
    }

    /**
     * Condition.java
     * <p>
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition) on 2020-07-29
     */
    public static class ConditionEvidence extends BackboneElement {

        public static final String resourceType = "ConditionEvidence";

        // Manifestation/symptom.
        @Json(name = "code")
        @Nullable
        public List<CodeableConcept> code;

        // Supporting information found elsewhere.
        @Json(name = "detail")
        @Nullable
        public List<Reference> detail;

        public ConditionEvidence() {
        }

        @Override
        public String getResourceType() {
            return ConditionEvidence.resourceType;
        }
    }

    /**
     * Condition.java
     * <p>
     * Clinical stage or grade of a condition. May include formal severity assessments.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition) on 2020-07-29
     */
    public static class ConditionStage extends BackboneElement {

        public static final String resourceType = "ConditionStage";

        // Formal record of assessment.
        @Json(name = "assessment")
        @Nullable
        public List<Reference> assessment;

        // Simple summary (disease specific).
        @Json(name = "summary")
        @Nullable
        public CodeableConcept summary;

        public ConditionStage() {
        }

        @Override
        public String getResourceType() {
            return ConditionStage.resourceType;
        }
    }
}
