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
 * Codes describing the purpose or content of the communication.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/communication-topic">CommunicationTopic</a>
 */
public enum CodeSystemCommunicationTopic {

	/**
	* The purpose or content of the communication is a prescription refill request.
	*/
	@Json(name = "prescription-refill-request")
	PRESCRIPTION_REFILL_REQUEST,

	/**
	* The purpose or content of the communication is a progress update.
	*/
	@Json(name = "progress-update")
	PROGRESS_UPDATE,

	/**
	* The purpose or content of the communication is to report labs.
	*/
	@Json(name = "report-labs")
	REPORT_LABS,

	/**
	* The purpose or content of the communication is an appointment reminder.
	*/
	@Json(name = "appointment-reminder")
	APPOINTMENT_REMINDER,

	/**
	* The purpose or content of the communication is a phone consult.
	*/
	@Json(name = "phone-consult")
	PHONE_CONSULT,

	/**
	* The purpose or content of the communication is a summary report.
	*/
	@Json(name = "summary-report")
	SUMMARY_REPORT,
}
