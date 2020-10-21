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
 * This value set defines a set of codes that can be used to indicate the kinds of special arrangements in place for a patients visit.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/encounter-special-arrangements">SpecialArrangements</a>
 */
public enum CodeSystemSpecialArrangements {

	/**
	* The patient requires a wheelchair to be made available for the encounter.
	*/
	@Json(name = "wheel")
	WHEEL,

	/**
	* An additional bed made available for a person accompanying the patient, for example a parent accompanying a child.
	*/
	@Json(name = "add-bed")
	ADD_BED,

	/**
	* The patient is not fluent in the local language and requires an interpreter to be available. Refer to the Patient.Language property for the type of interpreter required.
	*/
	@Json(name = "int")
	INT,

	/**
	* A person who accompanies a patient to provide assistive services necessary for the patient's care during the encounter.
	*/
	@Json(name = "att")
	ATT,

	/**
	* The patient has a guide dog and the location used for the encounter should be able to support the presence of the service animal.
	*/
	@Json(name = "dog")
	DOG,
}
