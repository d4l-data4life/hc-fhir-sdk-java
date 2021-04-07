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
 * MedicationRequest.java
 * <p>
 * An order or request for both supply of the medication and the instructions for administration of the medication to a
 * patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to
 * generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with
 * workflow patterns.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest) on 2021-04-07
 */
public class MedicationRequest extends DomainResource {

    public static final String resourceType = "MedicationRequest";

    // External ids for this request.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // A code specifying the current state of the order.  Generally, this will be active or completed state.
    @Json(name = "status")
    public CodeSystemMedicationrequestStatus status;

    // Reason for current status.
    @Json(name = "statusReason")
    @Nullable
    public CodeableConcept statusReason;

    // Whether the request is a proposal, plan, or an original order.
    @Json(name = "intent")
    public CodeSystemMedicationRequestIntent intent;

    // Type of medication usage.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Indicates how quickly the Medication Request should be addressed with respect to other requests.
    @Json(name = "priority")
    @Nullable
    public CodeSystemRequestPriority priority;

    // True if request is prohibiting action.
    @Json(name = "doNotPerform")
    @Nullable
    public Boolean doNotPerform;

    // Reported rather than primary record.
    @Json(name = "reportedBoolean")
    @Nullable
    public Boolean reportedBoolean;

    // Reported rather than primary record.
    @Json(name = "reportedReference")
    @Nullable
    public Reference reportedReference;

    // Medication to be taken.
    @Json(name = "medicationCodeableConcept")
    @Nullable
    public CodeableConcept medicationCodeableConcept;

    // Medication to be taken.
    @Json(name = "medicationReference")
    @Nullable
    public Reference medicationReference;

    // Who or group medication request is for.
    @Json(name = "subject")
    public Reference subject;

    // Encounter created as part of encounter/admission/stay.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // Information to support ordering of the medication.
    @Json(name = "supportingInformation")
    @Nullable
    public List<Reference> supportingInformation;

    // When request was initially authored.
    @Json(name = "authoredOn")
    @Nullable
    public FhirDateTime authoredOn;

    // Who/What requested the Request.
    @Json(name = "requester")
    @Nullable
    public Reference requester;

    // Intended performer of administration.
    @Json(name = "performer")
    @Nullable
    public Reference performer;

    // Desired kind of performer of the medication administration.
    @Json(name = "performerType")
    @Nullable
    public CodeableConcept performerType;

    // Person who entered the request.
    @Json(name = "recorder")
    @Nullable
    public Reference recorder;

    // Reason or indication for ordering or not ordering the medication.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Condition or observation that supports why the prescription is being written.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Instantiates FHIR protocol or definition.
    @Json(name = "instantiatesCanonical")
    @Nullable
    public List<Canonical> instantiatesCanonical;

    // Instantiates external protocol or definition.
    @Json(name = "instantiatesUri")
    @Nullable
    public List<String> instantiatesUri;

    // What request fulfills.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Composite request this is part of.
    @Json(name = "groupIdentifier")
    @Nullable
    public Identifier groupIdentifier;

    // Overall pattern of medication administration.
    @Json(name = "courseOfTherapyType")
    @Nullable
    public CodeableConcept courseOfTherapyType;

    // Associated insurance coverage.
    @Json(name = "insurance")
    @Nullable
    public List<Reference> insurance;

    // Information about the prescription.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // How the medication should be taken.
    @Json(name = "dosageInstruction")
    @Nullable
    public List<Dosage> dosageInstruction;

    // Medication supply authorization.
    @Json(name = "dispenseRequest")
    @Nullable
    public MedicationRequestDispenseRequest dispenseRequest;

    // Any restrictions on medication substitution.
    @Json(name = "substitution")
    @Nullable
    public MedicationRequestSubstitution substitution;

    // An order/prescription that is being replaced.
    @Json(name = "priorPrescription")
    @Nullable
    public Reference priorPrescription;

    // Clinical Issue with action.
    @Json(name = "detectedIssue")
    @Nullable
    public List<Reference> detectedIssue;

    // A list of events of interest in the lifecycle.
    @Json(name = "eventHistory")
    @Nullable
    public List<Reference> eventHistory;


    /**
     * Constructor for all required properties.
     *
     * @param status     CodeSystemMedicationrequestStatus
     * @param intent     CodeSystemMedicationRequestIntent
     * @param medication as one of CodeableConcept, Reference*
     * @param subject    Reference
     */
    public MedicationRequest(CodeSystemMedicationrequestStatus status, CodeSystemMedicationRequestIntent intent, Object medication, Reference subject) {
        this.status = status;
        this.intent = intent;
        if (medication instanceof CodeableConcept) {
            this.medicationCodeableConcept = (CodeableConcept) medication;
        } else if (medication instanceof Reference) {
            this.medicationReference = (Reference) medication;
        } else {
            //FIXME Type: (of: medication)) for property (medication) is invalid, ignoring")
        }
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return MedicationRequest.resourceType;
    }


    /**
     * MedicationRequest.java
     * <p>
     * Indicates the specific details for the dispense or medication supply part of a medication request (also known as
     * a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.
     * There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense
     * details in the pharmacy department.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest) on 2021-04-07
     */
    public static class MedicationRequestDispenseRequest extends BackboneElement {

        public static final String resourceType = "MedicationRequestDispenseRequest";

        // First fill details.
        @Json(name = "initialFill")
        @Nullable
        public MedicationRequestDispenseRequestInitialFill initialFill;

        // Minimum period of time between dispenses.
        @Json(name = "dispenseInterval")
        @Nullable
        public Duration dispenseInterval;

        // Time period supply is authorized for.
        @Json(name = "validityPeriod")
        @Nullable
        public Period validityPeriod;

        // Number of refills authorized.
        @Json(name = "numberOfRepeatsAllowed")
        @Nullable
        public Integer numberOfRepeatsAllowed;

        // Amount of medication to supply per dispense.
        @Json(name = "quantity")
        @Nullable
        public Quantity quantity;

        // Number of days supply per dispense.
        @Json(name = "expectedSupplyDuration")
        @Nullable
        public Duration expectedSupplyDuration;

        // Intended dispenser.
        @Json(name = "performer")
        @Nullable
        public Reference performer;


        public MedicationRequestDispenseRequest() {
        }

        @Override
        public String getResourceType() {
            return MedicationRequestDispenseRequest.resourceType;
        }


    }


    /**
     * MedicationRequest.java
     *
     * Indicates the quantity or duration for the first dispense of the medication.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
     *
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest) on 2021-04-07
     */
    public static class MedicationRequestDispenseRequestInitialFill extends BackboneElement {

        public static final String resourceType = "MedicationRequestDispenseRequestInitialFill";

        // First fill quantity.
        @Json(name = "quantity")
        @Nullable
        public Quantity quantity;

        // First fill duration.
        @Json(name = "duration")
        @Nullable
        public Duration duration;


        public MedicationRequestDispenseRequestInitialFill() {
        }

        @Override
        public String getResourceType() {
            return MedicationRequestDispenseRequestInitialFill.resourceType;
        }


    }


    /**
     * MedicationRequest.java
     *
     * Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
     *
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest) on 2021-04-07
     */
    public static class MedicationRequestSubstitution extends BackboneElement {

        public static final String resourceType = "MedicationRequestSubstitution";

        // Whether substitution is allowed or not.
        @Json(name = "allowedBoolean")
        @Nullable
        public Boolean allowedBoolean;

        // Whether substitution is allowed or not.
        @Json(name = "allowedCodeableConcept")
        @Nullable
        public CodeableConcept allowedCodeableConcept;

        // Why should (not) substitution be made.
        @Json(name = "reason")
        @Nullable
        public CodeableConcept reason;


        /**
         * Constructor for all required properties.
         *
         * @param allowed as one of Boolean, CodeableConcept*
         *
         */
        public MedicationRequestSubstitution(Object allowed) {
            if (allowed instanceof Boolean) {
                this.allowedBoolean = (Boolean) allowed;
            } else if (allowed instanceof CodeableConcept) {
                this.allowedCodeableConcept = (CodeableConcept) allowed;
            } else {
                //FIXME Type: (of: allowed)) for property (allowed) is invalid, ignoring")
            }
        }

        @Override
        public String getResourceType() {
            return MedicationRequestSubstitution.resourceType;
        }


    }


}
