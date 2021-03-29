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
 * MedicationStatement.java
 * <p>
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient
 * may be taking the medication now or has taken the medication in the past or will be taking the medication in the
 * future.  The source of this information can be the patient, significant other (such as a family member or spouse), or
 * a clinician.  A common scenario where this information is captured is during the history taking process during a
 * patient visit or stay.   The medication information may come from sources such as the patient's memory, from a
 * prescription bottle,  or from a list of medications the patient, clinician or other party maintains.
 * <p>
 * The primary difference between a medication statement and a medication administration is that the medication
 * administration has complete administration information and is based on actual administration information from the
 * person who administered the medication.  A medication statement is often, if not always, less specific.  There is no
 * required date/time when the medication was administered, in fact we only know that a source has reported the patient
 * is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete
 * or missing or less precise.  As stated earlier, the medication statement information may come from the patient's
 * memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.
 * Medication administration is more formal and is not missing detailed information.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationStatement">MedicationStatement</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationStatement) on 2021-03-26
 */
public class MedicationStatement extends DomainResource {

    public static final String resourceType = "MedicationStatement";

    // External identifier.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Fulfils plan, proposal or order.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Part of referenced event.
    @Json(name = "partOf")
    @Nullable
    public List<Reference> partOf;

    // A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally, this will be active or completed.
    @Json(name = "status")
    public CodeSystemMedicationStatusCodes status;

    // Reason for current status.
    @Json(name = "statusReason")
    @Nullable
    public List<CodeableConcept> statusReason;

    // Type of medication usage.
    @Json(name = "category")
    @Nullable
    public CodeableConcept category;

    // What medication was taken.
    @Json(name = "medicationCodeableConcept")
    @Nullable
    public CodeableConcept medicationCodeableConcept;

    // What medication was taken.
    @Json(name = "medicationReference")
    @Nullable
    public Reference medicationReference;

    // Who is/was taking  the medication.
    @Json(name = "subject")
    public Reference subject;

    // Encounter / Episode associated with MedicationStatement.
    @Json(name = "context")
    @Nullable
    public Reference context;

    // The date/time or interval when the medication is/was/will be taken.
    @Json(name = "effectiveDateTime")
    @Nullable
    public FhirDateTime effectiveDateTime;

    // The date/time or interval when the medication is/was/will be taken.
    @Json(name = "effectivePeriod")
    @Nullable
    public Period effectivePeriod;

    // When the statement was asserted?.
    @Json(name = "dateAsserted")
    @Nullable
    public FhirDateTime dateAsserted;

    // Person or organization that provided the information about the taking of this medication.
    @Json(name = "informationSource")
    @Nullable
    public Reference informationSource;

    // Additional supporting information.
    @Json(name = "derivedFrom")
    @Nullable
    public List<Reference> derivedFrom;

    // Reason for why the medication is being/was taken.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Condition or observation that supports why the medication is being/was taken.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Further information about the statement.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Details of how medication is/was taken or should be taken.
    @Json(name = "dosage")
    @Nullable
    public List<Dosage> dosage;


    /**
     * Constructor for all required properties.
     *
     * @param status     CodeSystemMedicationStatusCodes
     * @param medication as one of CodeableConcept, Reference*
     * @param subject    Reference
     */
    public MedicationStatement(CodeSystemMedicationStatusCodes status, Object medication, Reference subject) {
        this.status = status;
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
        return MedicationStatement.resourceType;
    }


}