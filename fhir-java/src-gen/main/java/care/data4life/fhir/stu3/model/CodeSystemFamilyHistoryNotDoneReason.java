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
 * Codes describing the reason why a family member history was not done.
 *
 * @see <a href="http://hl7.org/fhir/history-not-done-reason">FamilyHistoryNotDoneReason</a>
 */
public enum CodeSystemFamilyHistoryNotDoneReason {

	/**
	* Patient does not know the subject, e.g. the biological parent of an adopted patient.
	*/
	@Json(name = "subject-unknown")
	SUBJECT_UNKNOWN,

	/**
	* The patient withheld or refused to share the information.
	*/
	@Json(name = "withheld")
	WITHHELD,

	/**
	* Information cannot be obtained; e.g. unconscious patient
	*/
	@Json(name = "unable-to-obtain")
	UNABLE_TO_OBTAIN,

	/**
	* Patient does not have the information now, but can provide the information at a later date.
	*/
	@Json(name = "deferred")
	DEFERRED,
}
