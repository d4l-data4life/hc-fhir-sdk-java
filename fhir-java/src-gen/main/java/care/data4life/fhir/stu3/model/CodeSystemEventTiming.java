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
 * Real world event relating to the schedule.
 *
 * @see <a href="http://hl7.org/fhir/event-timing">EventTiming</a>
 */
public enum CodeSystemEventTiming {

	/**
	* event occurs during the morning
	*/
	@Json(name = "MORN")
	MORN,

	/**
	* event occurs during the afternoon
	*/
	@Json(name = "AFT")
	AFT,

	/**
	* event occurs during the evening
	*/
	@Json(name = "EVE")
	EVE,

	/**
	* event occurs during the night
	*/
	@Json(name = "NIGHT")
	NIGHT,

	/**
	* event occurs [offset] after subject goes to sleep
	*/
	@Json(name = "PHS")
	PHS,
}
