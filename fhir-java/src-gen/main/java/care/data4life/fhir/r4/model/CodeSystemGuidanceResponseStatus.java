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
 * The status of a guidance response.
 *
 * @see <a href="http://hl7.org/fhir/guidance-response-status">GuidanceResponseStatus</a>
 */
public enum CodeSystemGuidanceResponseStatus {

	/**
	* The request was processed successfully.
	*/
	@Json(name = "success")
	SUCCESS,

	/**
	* The request was processed successfully, but more data may result in a more complete evaluation.
	*/
	@Json(name = "data-requested")
	DATA_REQUESTED,

	/**
	* The request was processed, but more data is required to complete the evaluation.
	*/
	@Json(name = "data-required")
	DATA_REQUIRED,

	/**
	* The request is currently being processed.
	*/
	@Json(name = "in-progress")
	IN_PROGRESS,

	/**
	* The request was not processed successfully.
	*/
	@Json(name = "failure")
	FAILURE,

	/**
	* The response was entered in error.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
