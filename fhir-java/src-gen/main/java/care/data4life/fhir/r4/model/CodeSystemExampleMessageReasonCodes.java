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
 * Example Message Reasons. These are the set of codes that might be used an updating an encounter using admin-update.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/message-reasons-encounter">ExampleMessageReasonCodes</a>
 */
public enum CodeSystemExampleMessageReasonCodes {

	/**
	* The patient has been admitted.
	*/
	@Json(name = "admit")
	ADMIT,

	/**
	* The patient has been discharged.
	*/
	@Json(name = "discharge")
	DISCHARGE,

	/**
	* The patient has temporarily left the institution.
	*/
	@Json(name = "absent")
	ABSENT,

	/**
	* The patient has returned from a temporary absence.
	*/
	@Json(name = "return")
	RETURN,

	/**
	* The patient has been moved to a new location.
	*/
	@Json(name = "moved")
	MOVED,

	/**
	* Encounter details have been updated (e.g. to correct a coding error).
	*/
	@Json(name = "edit")
	EDIT,
}
