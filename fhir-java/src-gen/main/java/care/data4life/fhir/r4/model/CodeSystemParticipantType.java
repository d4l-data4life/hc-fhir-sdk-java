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
 * This value set defines a set of codes that can be used to indicate how an individual participates in an encounter.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/participant-type">ParticipantType</a>
 */
public enum CodeSystemParticipantType {

	/**
	* A translator who is facilitating communication with the patient during the encounter.
	*/
	@Json(name = "translator")
	TRANSLATOR,

	/**
	* A person to be contacted in case of an emergency during the encounter.
	*/
	@Json(name = "emergency")
	EMERGENCY,
}
