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
 * A list of all the request resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/request-resource-types">RequestResourceType</a>
 */
public enum CodeSystemRequestResourceType {

    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
     */
    @Json(name = "Appointment")
    APPOINTMENT,

    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
     */
    @Json(name = "AppointmentResponse")
    APPOINTMENTRESPONSE,

    /**
     * Healthcare plan for patient or group.
     */
    @Json(name = "CarePlan")
    CAREPLAN,

    /**
     * Claim, Pre-determination or Pre-authorization.
     */
    @Json(name = "Claim")
    CLAIM,

    /**
     * A request for information to be sent to a receiver.
     */
    @Json(name = "CommunicationRequest")
    COMMUNICATIONREQUEST,

    /**
     * Legal Agreement.
     */
    @Json(name = "Contract")
    CONTRACT,

    /**
     * Medical device request.
     */
    @Json(name = "DeviceRequest")
    DEVICEREQUEST,

    /**
     * Enrollment request.
     */
    @Json(name = "EnrollmentRequest")
    ENROLLMENTREQUEST,

    /**
     * Guidance or advice relating to an immunization.
     */
    @Json(name = "ImmunizationRecommendation")
    IMMUNIZATIONRECOMMENDATION,

    /**
     * Ordering of medication for patient or group.
     */
    @Json(name = "MedicationRequest")
    MEDICATIONREQUEST,

    /**
     * Diet, formula or nutritional supplement request.
     */
    @Json(name = "NutritionOrder")
    NUTRITIONORDER,

    /**
     * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
     */
    @Json(name = "ServiceRequest")
    SERVICEREQUEST,

    /**
     * Request for a medication, substance or device.
     */
    @Json(name = "SupplyRequest")
    SUPPLYREQUEST,

    /**
     * A task to be performed.
     */
    @Json(name = "Task")
    TASK,

    /**
     * Prescription for vision correction products for a patient.
     */
    @Json(name = "VisionPrescription")
    VISIONPRESCRIPTION,
}
