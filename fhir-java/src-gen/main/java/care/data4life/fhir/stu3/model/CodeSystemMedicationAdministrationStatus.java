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


/**
 * A set of codes indicating the current status of a MedicationAdministration.
 *
 * @see <a href="http://hl7.org/fhir/medication-admin-status">MedicationAdministrationStatus</a>
 */
public enum CodeSystemMedicationAdministrationStatus {

    /**
     * The administration has started but has not yet completed.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Actions implied by the administration have been temporarily halted, but are expected to
     * continue later. May also be called "suspended".
     */
    @Json(name = "on-hold")
    ON_HOLD,

    /**
     * All actions that are implied by the administration have occurred.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * The administration was entered in error and therefore nullified.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the administration have been permanently halted, before all of them
     * occurred.
     */
    @Json(name = "stopped")
    STOPPED,

    /**
     * The authoring system does not know which of the status values currently applies for this
     * request. Note: This concept is not to be used for "other" - one of the listed statuses is
     * presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
}
