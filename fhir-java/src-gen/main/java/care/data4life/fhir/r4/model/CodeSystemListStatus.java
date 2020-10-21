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
 * The current state of the list.
 *
 * @see <a href="http://hl7.org/fhir/list-status">ListStatus</a>
 */
public enum CodeSystemListStatus {

	/**
	* The list is considered to be an active part of the patient's record.
	*/
	@Json(name = "current")
	CURRENT,

	/**
	* The list is "old" and should no longer be considered accurate or relevant.
	*/
	@Json(name = "retired")
	RETIRED,

	/**
	* The list was never accurate.  It is retained for medico-legal purposes only.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
