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
 * Codes that reflect the current state of a goal and whether the goal is still being targeted.
 *
 * @see <a href="http://hl7.org/fhir/goal-status">GoalLifecycleStatus</a>
 */
public enum CodeSystemGoalLifecycleStatus {

	/**
	* A goal is proposed for this patient.
	*/
	@Json(name = "proposed")
	PROPOSED,

	/**
	* A goal is planned for this patient.
	*/
	@Json(name = "planned")
	PLANNED,

	/**
	* A proposed goal was accepted or acknowledged.
	*/
	@Json(name = "accepted")
	ACCEPTED,

	/**
	* The goal is being sought actively.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
	*/
	@Json(name = "on-hold")
	ON_HOLD,

	/**
	* The goal is no longer being sought.
	*/
	@Json(name = "completed")
	COMPLETED,

	/**
	* The goal has been abandoned.
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The goal was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* A proposed goal was rejected.
	*/
	@Json(name = "rejected")
	REJECTED,
}
