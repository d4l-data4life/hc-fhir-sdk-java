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
 * Goal.java
 * <p>
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal) on 2020-07-29
 */
public class Goal extends DomainResource {

    public static final String resourceType = "Goal";

    // Issues addressed by this goal.
    @Json(name = "addresses")
    @Nullable
    public List<Reference> addresses;

    // E.g. Treatment, dietary, behavioral, etc..
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Code or text describing goal.
    @Json(name = "description")
    public CodeableConcept description;

    // Who's responsible for creating Goal?.
    @Json(name = "expressedBy")
    @Nullable
    public Reference expressedBy;

    // External Ids for this goal.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Comments about the goal.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // What result was achieved regarding the goal?.
    @Json(name = "outcomeCode")
    @Nullable
    public List<CodeableConcept> outcomeCode;

    // Observation that resulted from goal.
    @Json(name = "outcomeReference")
    @Nullable
    public List<Reference> outcomeReference;

    // high-priority | medium-priority | low-priority.
    @Json(name = "priority")
    @Nullable
    public CodeableConcept priority;

    // When goal pursuit begins.
    @Json(name = "startCodeableConcept")
    @Nullable
    public CodeableConcept startCodeableConcept;

    // When goal pursuit begins.
    @Json(name = "startDate")
    @Nullable
    public FhirDate startDate;

    // Indicates whether the goal has been reached and is still considered relevant.
    @Json(name = "status")
    public CodeSystems.GoalStatus status;

    // When goal status took effect.
    @Json(name = "statusDate")
    @Nullable
    public FhirDate statusDate;

    // Reason for current status.
    @Json(name = "statusReason")
    @Nullable
    public String statusReason;

    // Who this goal is intended for.
    @Json(name = "subject")
    @Nullable
    public Reference subject;

    // Target outcome for the goal.
    @Json(name = "target")
    @Nullable
    public GoalTarget target;

    /**
     * Constructor for all required properties.
     *
     * @param description CodeableConcept
     * @param status      CodeSystems.GoalStatus
     */
    public Goal(CodeableConcept description, CodeSystems.GoalStatus status) {
        this.description = description;
        this.status = status;
    }

    @Override
    public String getResourceType() {
        return Goal.resourceType;
    }

    /**
     * Goal.java
     * <p>
     * Indicates what should be done by when.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal) on 2020-07-29
     */
    public static class GoalTarget extends BackboneElement {

        public static final String resourceType = "GoalTarget";

        // The target value to be achieved.
        @Json(name = "detailCodeableConcept")
        @Nullable
        public CodeableConcept detailCodeableConcept;

        // The target value to be achieved.
        @Json(name = "detailQuantity")
        @Nullable
        public Quantity detailQuantity;

        // The target value to be achieved.
        @Json(name = "detailRange")
        @Nullable
        public Range detailRange;

        // Reach goal on or before.
        @Json(name = "dueDate")
        @Nullable
        public FhirDate dueDate;

        // Reach goal on or before.
        @Json(name = "dueDuration")
        @Nullable
        public Duration dueDuration;

        // The parameter whose value is being tracked.
        @Json(name = "measure")
        @Nullable
        public CodeableConcept measure;

        public GoalTarget() {
        }

        @Override
        public String getResourceType() {
            return GoalTarget.resourceType;
        }
    }
}
