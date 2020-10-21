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
 * Codes specifying the state of the request. Describes the lifecycle of the nutrition order.
 *
 * @see <a href="http://hl7.org/fhir/nutrition-request-status">NutritionOrderStatus</a>
 */
public enum CodeSystemNutritionOrderStatus {

	/**
	* The request has been proposed.
	*/
	@Json(name = "proposed")
	PROPOSED,

	/**
	* The request is in preliminary form prior to being sent.
	*/
	@Json(name = "draft")
	DRAFT,

	/**
	* The request has been planned.
	*/
	@Json(name = "planned")
	PLANNED,

	/**
	* The request has been placed.
	*/
	@Json(name = "requested")
	REQUESTED,

	/**
	* The request is 'actionable', but not all actions that are implied by it have occurred yet.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* Actions implied by the request have been temporarily halted, but are expected to continue later. May also be called "suspended".
	*/
	@Json(name = "on-hold")
	ON_HOLD,

	/**
	* All actions that are implied by the order have occurred and no continuation is planned (this will rarely be made explicit).
	*/
	@Json(name = "completed")
	COMPLETED,

	/**
	* The request has been withdrawn and is no longer actionable.
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The request was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
