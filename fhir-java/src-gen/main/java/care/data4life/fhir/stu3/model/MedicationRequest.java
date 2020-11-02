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
 * MedicationRequest.java
 * <p>
 * An order or request for both supply of the medication and the instructions for administration of
 * the medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and
 * outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest) on
 * 2020-10-27
 */
public class MedicationRequest extends DomainResource {

    public static final String resourceType = "MedicationRequest";

    // External ids for this request.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Protocol or definition.
    @Json(name = "definition")
    @Nullable
    public List<Reference> definition;

    // What request fulfills.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Composite request this is part of.
    @Json(name = "groupIdentifier")
    @Nullable
    public Identifier groupIdentifier;

    // A code specifying the current state of the order.  Generally this will be active or completed state.
    @Json(name = "status")
    @Nullable
    public CodeSystemMedicationRequestStatus status;

    // Whether the request is a proposal, plan, or an original order.
    @Json(name = "intent")
    public CodeSystemMedicationRequestIntent intent;

    // Type of medication usage.
    @Json(name = "category")
    @Nullable
    public CodeableConcept category;

    // Indicates how quickly the Medication Request should be addressed with respect to other requests.
    @Json(name = "priority")
    @Nullable
    public CodeSystemMedicationRequestPriority priority;

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

    // Created during encounter/admission/stay.
    @Json(name = "context")
    @Nullable
    public Reference context;

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
    public MedicationRequestRequester requester;

    // Person who entered the request.
    @Json(name = "recorder")
    @Nullable
    public Reference recorder;

    // Reason or indication for writing the prescription.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Condition or Observation that supports why the prescription is being written.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

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
     * @param intent     CodeSystemMedicationRequestIntent
     * @param medication as one of CodeableConcept, Reference*
     * @param subject    Reference
     */
    public MedicationRequest(CodeSystemMedicationRequestIntent intent, Object medication, Reference subject) {
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
     * Indicates the specific details for the dispense or medication supply part of a medication
     * request (also known as a Medication Prescription or Medication Order).  Note that this
     * information is not always sent with the order.  There may be in some settings (e.g.
     * hospitals) institutional or system support for completing the dispense details in the
     * pharmacy department.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
     * on 2020-10-27
     */
    public static class MedicationRequestDispenseRequest extends BackboneElement {

        public static final String resourceType = "MedicationRequestDispenseRequest";

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
     * <p>
     * The individual, organization or device that initiated the request and has responsibility for
     * its activation.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
     * on 2020-10-27
     */
    public static class MedicationRequestRequester extends BackboneElement {

        public static final String resourceType = "MedicationRequestRequester";

        // Who ordered the initial medication(s).
        @Json(name = "agent")
        public Reference agent;

        // Organization agent is acting for.
        @Json(name = "onBehalfOf")
        @Nullable
        public Reference onBehalfOf;


        /**
         * Constructor for all required properties.
         *
         * @param agent Reference
         */
        public MedicationRequestRequester(Reference agent) {
            this.agent = agent;
        }

        @Override
        public String getResourceType() {
            return MedicationRequestRequester.resourceType;
        }


    }


    /**
     * MedicationRequest.java
     * <p>
     * Indicates whether or not substitution can or should be part of the dispense. In some cases
     * substitution must happen, in other cases substitution must not happen. This block explains
     * the prescriber's intent. If nothing is specified substitution may be done.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
     * on 2020-10-27
     */
    public static class MedicationRequestSubstitution extends BackboneElement {

        public static final String resourceType = "MedicationRequestSubstitution";

        // Whether substitution is allowed or not.
        @Json(name = "allowed")
        public Boolean allowed;

        // Why should (not) substitution be made.
        @Json(name = "reason")
        @Nullable
        public CodeableConcept reason;


        /**
         * Constructor for all required properties.
         *
         * @param allowed Boolean
         */
        public MedicationRequestSubstitution(Boolean allowed) {
            this.allowed = allowed;
        }

        @Override
        public String getResourceType() {
            return MedicationRequestSubstitution.resourceType;
        }


    }


}
