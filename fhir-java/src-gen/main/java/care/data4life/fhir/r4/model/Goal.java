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
 * Goal.java
 * <p>
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an
 * activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Goal) on 2021-04-07
 */
public class Goal extends DomainResource {

    public static final String resourceType = "Goal";

    // External Ids for this goal.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // The state of the goal throughout its lifecycle.
    @Json(name = "lifecycleStatus")
    public CodeSystemGoalLifecycleStatus lifecycleStatus;

    // in-progress | improving | worsening | no-change | achieved | sustaining | not-achieved | no-progress | not-attainable.
    @Json(name = "achievementStatus")
    @Nullable
    public CodeableConcept achievementStatus;

    // E.g. Treatment, dietary, behavioral, etc..
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // high-priority | medium-priority | low-priority.
    @Json(name = "priority")
    @Nullable
    public CodeableConcept priority;

    // Code or text describing goal.
    @Json(name = "description")
    public CodeableConcept description;

    // Who this goal is intended for.
    @Json(name = "subject")
    public Reference subject;

    // When goal pursuit begins.
    @Json(name = "startDate")
    @Nullable
    public FhirDate startDate;

    // When goal pursuit begins.
    @Json(name = "startCodeableConcept")
    @Nullable
    public CodeableConcept startCodeableConcept;

    // Target outcome for the goal.
    @Json(name = "target")
    @Nullable
    public List<GoalTarget> target;

    // When goal status took effect.
    @Json(name = "statusDate")
    @Nullable
    public FhirDate statusDate;

    // Reason for current status.
    @Json(name = "statusReason")
    @Nullable
    public String statusReason;

    // Who's responsible for creating Goal?.
    @Json(name = "expressedBy")
    @Nullable
    public Reference expressedBy;

    // Issues addressed by this goal.
    @Json(name = "addresses")
    @Nullable
    public List<Reference> addresses;

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


    /**
     * Constructor for all required properties.
     *
     * @param lifecycleStatus CodeSystemGoalLifecycleStatus
     * @param description     CodeableConcept
     * @param subject         Reference
     */
    public Goal(CodeSystemGoalLifecycleStatus lifecycleStatus, CodeableConcept description, Reference subject) {
        this.lifecycleStatus = lifecycleStatus;
        this.description = description;
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return Goal.resourceType;
    }


    /**
     * Goal.java
     *
     * Indicates what should be done by when.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
     *
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Goal) on 2021-04-07
     */
    public static class GoalTarget extends BackboneElement {

        public static final String resourceType = "GoalTarget";

        // The parameter whose value is being tracked.
        @Json(name = "measure")
        @Nullable
        public CodeableConcept measure;

        // The target value to be achieved.
        @Json(name = "detailQuantity")
        @Nullable
        public Quantity detailQuantity;

        // The target value to be achieved.
        @Json(name = "detailRange")
        @Nullable
        public Range detailRange;

        // The target value to be achieved.
        @Json(name = "detailCodeableConcept")
        @Nullable
        public CodeableConcept detailCodeableConcept;

        // The target value to be achieved.
        @Json(name = "detailString")
        @Nullable
        public String detailString;

        // The target value to be achieved.
        @Json(name = "detailBoolean")
        @Nullable
        public Boolean detailBoolean;

        // The target value to be achieved.
        @Json(name = "detailInteger")
        @Nullable
        public Integer detailInteger;

        // The target value to be achieved.
        @Json(name = "detailRatio")
        @Nullable
        public Ratio detailRatio;

        // Reach goal on or before.
        @Json(name = "dueDate")
        @Nullable
        public FhirDate dueDate;

        // Reach goal on or before.
        @Json(name = "dueDuration")
        @Nullable
        public Duration dueDuration;


        public GoalTarget() {
        }

        @Override
        public String getResourceType() {
            return GoalTarget.resourceType;
        }


    }


}
