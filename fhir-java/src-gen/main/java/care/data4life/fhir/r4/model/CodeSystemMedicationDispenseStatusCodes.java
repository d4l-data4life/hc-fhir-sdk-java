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
 * MedicationDispense Status Codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/medicationdispense-status">MedicationDispenseStatusCodes</a>
 */
public enum CodeSystemMedicationDispenseStatusCodes {

	/**
	* The core event has not started yet, but some staging activities have begun (e.g. initial compounding or packaging of medication). Preparation stages may be tracked for billing purposes.
	*/
	@Json(name = "preparation")
	PREPARATION,

	/**
	* The dispensed product is ready for pickup.
	*/
	@Json(name = "in-progress")
	IN_PROGRESS,

	/**
	* The dispensed product was not and will never be picked up by the patient.
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The dispense process is paused while waiting for an external event to reactivate the dispense.  For example, new stock has arrived or the prescriber has called.
	*/
	@Json(name = "on-hold")
	ON_HOLD,

	/**
	* The dispensed product has been picked up.
	*/
	@Json(name = "completed")
	COMPLETED,

	/**
	* The dispense was entered in error and therefore nullified.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* Actions implied by the dispense have been permanently halted, before all of them occurred.
	*/
	@Json(name = "stopped")
	STOPPED,

	/**
	* The dispense was declined and not performed.
	*/
	@Json(name = "declined")
	DECLINED,

	/**
	* The authoring system does not know which of the status values applies for this medication dispense.  Note: this concept is not to be used for other - one of the listed statuses is presumed to apply, it's just now known which one.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
