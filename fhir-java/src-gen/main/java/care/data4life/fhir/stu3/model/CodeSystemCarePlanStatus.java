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
 * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
 *
 * @see <a href="http://hl7.org/fhir/care-plan-status">CarePlanStatus</a>
 */
public enum CodeSystemCarePlanStatus {

	/**
	* The plan is in development or awaiting use but is not yet intended to be acted upon.
	*/
	@Json(name = "draft")
	DRAFT,

	/**
	* The plan is intended to be followed and used as part of patient care.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* The plan has been temporarily stopped but is expected to resume in the future.
	*/
	@Json(name = "suspended")
	SUSPENDED,

	/**
	* The plan is no longer in use and is not expected to be followed or used in patient care.
	*/
	@Json(name = "completed")
	COMPLETED,

	/**
	* The plan was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* The plan has been terminated prior to reaching completion (though it may have been replaced by a new plan).
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The authoring system doesn't know the current state of the care plan.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
