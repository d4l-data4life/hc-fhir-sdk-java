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
 * CarePlan.java
 * <p>
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific
 * condition or set of conditions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlan</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CarePlan) on
 * 2020-10-21
 */
public class CarePlan extends DomainResource {

    public static final String resourceType = "CarePlan";

    // External Ids for this plan.
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

    // Fulfills CarePlan.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // CarePlan replaced by this CarePlan.
    @Json(name = "replaces")
    @Nullable
    public List<Reference> replaces;

    // Part of referenced CarePlan.
    @Json(name = "partOf")
    @Nullable
    public List<Reference> partOf;

    // Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
    @Json(name = "status")
    public CodeSystemRequestStatus status;

    // Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
    // Only use: ['proposal', 'plan', 'order', 'option']
    @Json(name = "intent")
    public CodeSystemRequestIntent intent;

    // Type of plan.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Human-friendly name for the care plan.
    @Json(name = "title")
    @Nullable
    public String title;

    // Summary of nature of plan.
    @Json(name = "description")
    @Nullable
    public String description;

    // Who the care plan is for.
    @Json(name = "subject")
    public Reference subject;

    // Encounter created as part of.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // Time period plan covers.
    @Json(name = "period")
    @Nullable
    public Period period;

    // Date record was first recorded.
    @Json(name = "created")
    @Nullable
    public FhirDateTime created;

    // Who is the designated responsible party.
    @Json(name = "author")
    @Nullable
    public Reference author;

    // Who provided the content of the care plan.
    @Json(name = "contributor")
    @Nullable
    public List<Reference> contributor;

    // Who's involved in plan?.
    @Json(name = "careTeam")
    @Nullable
    public List<Reference> careTeam;

    // Health issues this plan addresses.
    @Json(name = "addresses")
    @Nullable
    public List<Reference> addresses;

    // Information considered as part of plan.
    @Json(name = "supportingInfo")
    @Nullable
    public List<Reference> supportingInfo;

    // Desired outcome of plan.
    @Json(name = "goal")
    @Nullable
    public List<Reference> goal;

    // Action to occur as part of plan.
    @Json(name = "activity")
    @Nullable
    public List<CarePlanActivity> activity;

    // Comments about the plan.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;


    /**
     * Constructor for all required properties.
     *
     * @param status  CodeSystemRequestStatus
     * @param intent  CodeSystemRequestIntent
     * @param subject Reference
     */
    public CarePlan(CodeSystemRequestStatus status, CodeSystemRequestIntent intent, Reference subject) {
        this.status = status;
        this.intent = intent;
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return CarePlan.resourceType;
    }


    /**
     * CarePlan.java
     * <p>
     * Identifies a planned action to occur as part of the plan.  For example, a medication to be
     * used, lab tests to perform, self-monitoring, education, etc.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlan</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CarePlan) on
     * 2020-10-21
     */
    public static class CarePlanActivity extends BackboneElement {

        public static final String resourceType = "CarePlanActivity";

        // Results of the activity.
        @Json(name = "outcomeCodeableConcept")
        @Nullable
        public List<CodeableConcept> outcomeCodeableConcept;

        // Appointment, Encounter, Procedure, etc..
        @Json(name = "outcomeReference")
        @Nullable
        public List<Reference> outcomeReference;

        // Comments about the activity status/progress.
        @Json(name = "progress")
        @Nullable
        public List<Annotation> progress;

        // Activity details defined in specific resource.
        @Json(name = "reference")
        @Nullable
        public Reference reference;

        // In-line definition of activity.
        @Json(name = "detail")
        @Nullable
        public CarePlanActivityDetail detail;


        public CarePlanActivity() {
        }

        @Override
        public String getResourceType() {
            return CarePlanActivity.resourceType;
        }


    }


    /**
     * CarePlan.java
     * <p>
     * A simple summary of a planned activity suitable for a general care plan system (e.g. form
     * driven) that doesn't know about specific resources such as procedure etc.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlan</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CarePlan) on
     * 2020-10-21
     */
    public static class CarePlanActivityDetail extends BackboneElement {

        public static final String resourceType = "CarePlanActivityDetail";

        // A description of the kind of resource the in-line definition of a care plan activity is representing.  The CarePlan.activity.detail is an in-line definition when a resource is not referenced using CarePlan.activity.reference.  For example, a MedicationRequest, a ServiceRequest, or a CommunicationRequest.
        // Only use: ['Appointment', 'CommunicationRequest', 'DeviceRequest', 'MedicationRequest', 'NutritionOrder', 'Task', 'ServiceRequest', 'VisionPrescription']
        @Json(name = "kind")
        @Nullable
        public CodeSystemResourceType kind;

        // Instantiates FHIR protocol or definition.
        @Json(name = "instantiatesCanonical")
        @Nullable
        public List<Canonical> instantiatesCanonical;

        // Instantiates external protocol or definition.
        @Json(name = "instantiatesUri")
        @Nullable
        public List<String> instantiatesUri;

        // Detail type of activity.
        @Json(name = "code")
        @Nullable
        public CodeableConcept code;

        // Why activity should be done or why activity was prohibited.
        @Json(name = "reasonCode")
        @Nullable
        public List<CodeableConcept> reasonCode;

        // Why activity is needed.
        @Json(name = "reasonReference")
        @Nullable
        public List<Reference> reasonReference;

        // Goals this activity relates to.
        @Json(name = "goal")
        @Nullable
        public List<Reference> goal;

        // Identifies what progress is being made for the specific activity.
        @Json(name = "status")
        public CodeSystemCarePlanActivityStatus status;

        // Reason for current status.
        @Json(name = "statusReason")
        @Nullable
        public CodeableConcept statusReason;

        // If true, activity is prohibiting action.
        @Json(name = "doNotPerform")
        @Nullable
        public Boolean doNotPerform;

        // When activity is to occur.
        @Json(name = "scheduledTiming")
        @Nullable
        public Timing scheduledTiming;

        // When activity is to occur.
        @Json(name = "scheduledPeriod")
        @Nullable
        public Period scheduledPeriod;

        // When activity is to occur.
        @Json(name = "scheduledString")
        @Nullable
        public String scheduledString;

        // Where it should happen.
        @Json(name = "location")
        @Nullable
        public Reference location;

        // Who will be responsible?.
        @Json(name = "performer")
        @Nullable
        public List<Reference> performer;

        // What is to be administered/supplied.
        @Json(name = "productCodeableConcept")
        @Nullable
        public CodeableConcept productCodeableConcept;

        // What is to be administered/supplied.
        @Json(name = "productReference")
        @Nullable
        public Reference productReference;

        // How to consume/day?.
        @Json(name = "dailyAmount")
        @Nullable
        public Quantity dailyAmount;

        // How much to administer/supply/consume.
        @Json(name = "quantity")
        @Nullable
        public Quantity quantity;

        // Extra info describing activity to perform.
        @Json(name = "description")
        @Nullable
        public String description;


        /**
         * Constructor for all required properties.
         *
         * @param status CodeSystemCarePlanActivityStatus
         */
        public CarePlanActivityDetail(CodeSystemCarePlanActivityStatus status) {
            this.status = status;
        }

        @Override
        public String getResourceType() {
            return CarePlanActivityDetail.resourceType;
        }


    }


}
