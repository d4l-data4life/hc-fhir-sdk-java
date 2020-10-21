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
 * Codes providing the status/availability of a specimen.
 *
 * @see <a href="http://hl7.org/fhir/specimen-status">SpecimenStatus</a>
 */
public enum CodeSystemSpecimenStatus {

	/**
	* The physical specimen is present and in good condition.
	*/
	@Json(name = "available")
	AVAILABLE,

	/**
	* There is no physical specimen because it is either lost, destroyed or consumed.
	*/
	@Json(name = "unavailable")
	UNAVAILABLE,

	/**
	* The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.
	*/
	@Json(name = "unsatisfactory")
	UNSATISFACTORY,

	/**
	* The specimen was entered in error and therefore nullified.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
