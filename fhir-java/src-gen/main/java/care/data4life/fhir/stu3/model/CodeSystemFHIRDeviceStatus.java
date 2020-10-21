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
 * The availability status of the device.
 *
 * @see <a href="http://hl7.org/fhir/device-status">FHIRDeviceStatus</a>
 */
public enum CodeSystemFHIRDeviceStatus {

	/**
	* The Device is available for use.  Note: This means for *implanted devices*  the device is implanted in the patient.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* The Device is no longer available for use (e.g. lost, expired, damaged).  Note: This means for *implanted devices*  the device has been removed from the patient.
	*/
	@Json(name = "inactive")
	INACTIVE,

	/**
	* The Device was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* The status of the device has not been determined.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
