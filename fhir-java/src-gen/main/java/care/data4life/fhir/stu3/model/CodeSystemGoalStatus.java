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
 * Indicates whether the goal has been met and is still being targeted
 *
 * @see <a href="http://hl7.org/fhir/goal-status">GoalStatus</a>
 */
public enum CodeSystemGoalStatus {

	/**
	* A goal is proposed for this patient
	*/
	@Json(name = "proposed")
	PROPOSED,

	/**
	* A proposed goal was accepted or acknowledged
	*/
	@Json(name = "accepted")
	ACCEPTED,

	/**
	* A goal is planned for this patient
	*/
	@Json(name = "planned")
	PLANNED,

	/**
	* The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again)
	*/
	@Json(name = "in-progress")
	IN_PROGRESS,

	/**
	* The goal is on schedule for the planned timelines
	*/
	@Json(name = "on-target")
	ON_TARGET,

	/**
	* The goal is ahead of the planned timelines
	*/
	@Json(name = "ahead-of-target")
	AHEAD_OF_TARGET,

	/**
	* The goal is behind the planned timelines
	*/
	@Json(name = "behind-target")
	BEHIND_TARGET,

	/**
	* The goal has been met, but ongoing activity is needed to sustain the goal objective
	*/
	@Json(name = "sustaining")
	SUSTAINING,

	/**
	* The goal has been met and no further action is needed
	*/
	@Json(name = "achieved")
	ACHIEVED,

	/**
	* The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
	*/
	@Json(name = "on-hold")
	ON_HOLD,

	/**
	* The previously accepted goal is no longer being sought
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The goal was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* A proposed goal was rejected
	*/
	@Json(name = "rejected")
	REJECTED,
}
