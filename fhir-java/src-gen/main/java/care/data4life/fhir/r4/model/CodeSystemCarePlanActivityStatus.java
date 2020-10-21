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
 * Codes that reflect the current state of a care plan activity within its overall life cycle.
 *
 * @see <a href="http://hl7.org/fhir/care-plan-activity-status">CarePlanActivityStatus</a>
 */
public enum CodeSystemCarePlanActivityStatus {

	/**
	* Care plan activity is planned but no action has yet been taken.
	*/
	@Json(name = "not-started")
	NOT_STARTED,

	/**
	* Appointment or other booking has occurred but activity has not yet begun.
	*/
	@Json(name = "scheduled")
	SCHEDULED,

	/**
	* Care plan activity has been started but is not yet complete.
	*/
	@Json(name = "in-progress")
	IN_PROGRESS,

	/**
	* Care plan activity was started but has temporarily ceased with an expectation of resumption at a future time.
	*/
	@Json(name = "on-hold")
	ON_HOLD,

	/**
	* Care plan activity has been completed (more or less) as planned.
	*/
	@Json(name = "completed")
	COMPLETED,

	/**
	* The planned care plan activity has been withdrawn.
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The planned care plan activity has been ended prior to completion after the activity was started.
	*/
	@Json(name = "stopped")
	STOPPED,

	/**
	* The current state of the care plan activity is not known.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which one.
	*/
	@Json(name = "unknown")
	UNKNOWN,

	/**
	* Care plan activity was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
