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
 * Current state of the encounter.
 *
 * @see <a href="http://hl7.org/fhir/encounter-status">EncounterStatus</a>
 */
public enum CodeSystemEncounterStatus {

	/**
	* The Encounter has not yet started.
	*/
	@Json(name = "planned")
	PLANNED,

	/**
	* The Patient is present for the encounter, however is not currently meeting with a practitioner.
	*/
	@Json(name = "arrived")
	ARRIVED,

	/**
	* The patient has been assessed for the priority of their treatment based on the severity of their condition.
	*/
	@Json(name = "triaged")
	TRIAGED,

	/**
	* The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
	*/
	@Json(name = "in-progress")
	IN_PROGRESS,

	/**
	* The Encounter has begun, but the patient is temporarily on leave.
	*/
	@Json(name = "onleave")
	ONLEAVE,

	/**
	* The Encounter has ended.
	*/
	@Json(name = "finished")
	FINISHED,

	/**
	* The Encounter has ended before it has begun.
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* This instance should not have been part of this patient's medical record.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* The encounter status is unknown. Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
