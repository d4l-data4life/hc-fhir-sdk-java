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
 * The Participation status of an appointment.
 *
 * @see <a href="http://hl7.org/fhir/participationstatus">ParticipationStatus</a>
 */
public enum CodeSystemParticipationStatus {

	/**
	* The participant has accepted the appointment.
	*/
	@Json(name = "accepted")
	ACCEPTED,

	/**
	* The participant has declined the appointment and will not participate in the appointment.
	*/
	@Json(name = "declined")
	DECLINED,

	/**
	* The participant has  tentatively accepted the appointment. This could be automatically created by a system and requires further processing before it can be accepted. There is no commitment that attendance will occur.
	*/
	@Json(name = "tentative")
	TENTATIVE,

	/**
	* The participant needs to indicate if they accept the appointment by changing this status to one of the other statuses.
	*/
	@Json(name = "needs-action")
	NEEDS_ACTION,
}
