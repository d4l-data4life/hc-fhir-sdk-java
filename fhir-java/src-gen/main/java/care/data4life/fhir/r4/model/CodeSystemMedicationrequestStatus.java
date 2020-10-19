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
 * MedicationRequest Status Codes
 *
 * @see <a href="http://hl7.org/fhir/CodeSystem/medicationrequest-status">MedicationrequestStatus</a>
 */
public enum CodeSystemMedicationrequestStatus {

    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred
     * yet.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * Actions implied by the prescription are to be temporarily halted, but are expected to
     * continue later.  May also be called 'suspended'.
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * The prescription has been withdrawn before any administrations have occurred
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * All actions that are implied by the prescription have occurred.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * Some of the actions that are implied by the medication request may have occurred.  For
     * example, the medication may have been dispensed and the patient may have taken some of the
     * medication.  Clinical decision support systems should take this status into account
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the prescription are to be permanently halted, before all of the
     * administrations occurred. This should not be used if the original order was entered in error
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * The prescription is not yet 'actionable', e.g. it is a work in progress, requires sign-off,
     * verification or needs to be run through decision support process.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this observation. Note: This concept is not to be used for 'other' - one of the listed
     * statuses is presumed to apply, but the authoring/source system does not know which.
     */
    @Json(name = "unknown")
    UNKNOWN,
}
