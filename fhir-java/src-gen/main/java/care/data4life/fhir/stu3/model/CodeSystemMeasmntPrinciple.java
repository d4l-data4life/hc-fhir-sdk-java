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
 * Different measurement principle supported by the device.
 *
 * @see <a href="http://hl7.org/fhir/measurement-principle">MeasmntPrinciple</a>
 */
public enum CodeSystemMeasmntPrinciple {

	/**
	* Measurement principle isn't in the list.
	*/
	@Json(name = "other")
	OTHER,

	/**
	* Measurement is done using the chemical principle.
	*/
	@Json(name = "chemical")
	CHEMICAL,

	/**
	* Measurement is done using the electrical principle.
	*/
	@Json(name = "electrical")
	ELECTRICAL,

	/**
	* Measurement is done using the impedance principle.
	*/
	@Json(name = "impedance")
	IMPEDANCE,

	/**
	* Measurement is done using the nuclear principle.
	*/
	@Json(name = "nuclear")
	NUCLEAR,

	/**
	* Measurement is done using the optical principle.
	*/
	@Json(name = "optical")
	OPTICAL,

	/**
	* Measurement is done using the thermal principle.
	*/
	@Json(name = "thermal")
	THERMAL,

	/**
	* Measurement is done using the biological principle.
	*/
	@Json(name = "biological")
	BIOLOGICAL,

	/**
	* Measurement is done using the mechanical principle.
	*/
	@Json(name = "mechanical")
	MECHANICAL,

	/**
	* Measurement is done using the acoustical principle.
	*/
	@Json(name = "acoustical")
	ACOUSTICAL,

	/**
	* Measurement is done using the manual principle.
	*/
	@Json(name = "manual")
	MANUAL,
}
