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
 * MedicationRequest Course of Therapy Codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/medicationrequest-course-of-therapy">MedicationRequestCourseOfTherapyCodes</a>
 */
public enum CodeSystemMedicationRequestCourseOfTherapyCodes {

	/**
	* A medication which is expected to be continued beyond the present order and which the patient should be assumed to be taking unless explicitly stopped.
	*/
	@Json(name = "continuous")
	CONTINUOUS,

	/**
	* A medication which the patient is only expected to consume for the duration of the current order and which is not expected to be renewed.
	*/
	@Json(name = "acute")
	ACUTE,

	/**
	* A medication which is expected to be used on a part time basis at certain times of the year
	*/
	@Json(name = "seasonal")
	SEASONAL,
}
