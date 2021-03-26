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


/**
 * A list of all the event resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/event-resource-types">EventResourceType</a>
 */
public enum CodeSystemEventResourceType {

    /**
     * Item containing charge code(s) associated with the provision of healthcare provider products.
     */
    @Json(name = "ChargeItem")
    CHARGEITEM,

    /**
     * Remittance resource.
     */
    @Json(name = "ClaimResponse")
    CLAIMRESPONSE,

    /**
     * A clinical assessment performed when planning treatments and management strategies for a patient.
     */
    @Json(name = "ClinicalImpression")
    CLINICALIMPRESSION,

    /**
     * A record of information transmitted from a sender to a receiver.
     */
    @Json(name = "Communication")
    COMMUNICATION,

    /**
     * A set of resources composed into a single coherent clinical statement with clinical attestation.
     */
    @Json(name = "Composition")
    COMPOSITION,

    /**
     * Detailed information about conditions, problems or diagnoses.
     */
    @Json(name = "Condition")
    CONDITION,

    /**
     * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific
     * purposes and periods of time.
     */
    @Json(name = "Consent")
    CONSENT,

    /**
     * Insurance or medical plan or a payment agreement.
     */
    @Json(name = "Coverage")
    COVERAGE,

    /**
     * Record of use of a device.
     */
    @Json(name = "DeviceUseStatement")
    DEVICEUSESTATEMENT,

    /**
     * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as
     * formatted reports.
     */
    @Json(name = "DiagnosticReport")
    DIAGNOSTICREPORT,

    /**
     * A list that defines a set of documents.
     */
    @Json(name = "DocumentManifest")
    DOCUMENTMANIFEST,

    /**
     * A reference to a document.
     */
    @Json(name = "DocumentReference")
    DOCUMENTREFERENCE,

    /**
     * An interaction during which services are provided to the patient.
     */
    @Json(name = "Encounter")
    ENCOUNTER,

    /**
     * EnrollmentResponse resource.
     */
    @Json(name = "EnrollmentResponse")
    ENROLLMENTRESPONSE,

    /**
     * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the
     * Organization assumes some level of responsibility.
     */
    @Json(name = "EpisodeOfCare")
    EPISODEOFCARE,

    /**
     * Explanation of Benefit resource.
     */
    @Json(name = "ExplanationOfBenefit")
    EXPLANATIONOFBENEFIT,

    /**
     * Information about patient's relatives, relevant for patient.
     */
    @Json(name = "FamilyMemberHistory")
    FAMILYMEMBERHISTORY,

    /**
     * The formal response to a guidance request.
     */
    @Json(name = "GuidanceResponse")
    GUIDANCERESPONSE,

    /**
     * A set of images produced in single study (one or more series of references images).
     */
    @Json(name = "ImagingStudy")
    IMAGINGSTUDY,

    /**
     * Immunization event information.
     */
    @Json(name = "Immunization")
    IMMUNIZATION,

    /**
     * Results of a measure evaluation.
     */
    @Json(name = "MeasureReport")
    MEASUREREPORT,

    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided
     * by direct reference.
     */
    @Json(name = "Media")
    MEDIA,

    /**
     * Administration of medication to a patient.
     */
    @Json(name = "MedicationAdministration")
    MEDICATIONADMINISTRATION,

    /**
     * Dispensing a medication to a named patient.
     */
    @Json(name = "MedicationDispense")
    MEDICATIONDISPENSE,

    /**
     * Record of medication being taken by a patient.
     */
    @Json(name = "MedicationStatement")
    MEDICATIONSTATEMENT,

    /**
     * Measurements and simple assertions.
     */
    @Json(name = "Observation")
    OBSERVATION,

    /**
     * PaymentNotice request.
     */
    @Json(name = "PaymentNotice")
    PAYMENTNOTICE,

    /**
     * PaymentReconciliation resource.
     */
    @Json(name = "PaymentReconciliation")
    PAYMENTRECONCILIATION,

    /**
     * An action that is being or was performed on a patient.
     */
    @Json(name = "Procedure")
    PROCEDURE,

    /**
     * ProcessResponse resource.
     */
    @Json(name = "ProcessResponse")
    PROCESSRESPONSE,

    /**
     * A structured set of questions and their answers.
     */
    @Json(name = "QuestionnaireResponse")
    QUESTIONNAIRERESPONSE,

    /**
     * Potential outcomes for a subject with likelihood.
     */
    @Json(name = "RiskAssessment")
    RISKASSESSMENT,

    /**
     * Delivery of bulk Supplies.
     */
    @Json(name = "SupplyDelivery")
    SUPPLYDELIVERY,

    /**
     * A task to be performed.
     */
    @Json(name = "Task")
    TASK,
}
