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
 * The risk of an adverse reaction (allergy or intolerance) for this patient upon exposure to the substance (including pharmaceutical products).
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/allerg-intol-substance-exp-risk">AllergyIntoleranceSubstanceExposureRisk</a>
 */
public enum CodeSystemAllergyIntoleranceSubstanceExposureRisk {

	/**
	* Known risk of allergy or intolerance reaction upon exposure to the specified substance.
	*/
	@Json(name = "known-reaction-risk")
	KNOWN_REACTION_RISK,

	/**
	* No known risk of allergy or intolerance reaction upon exposure to the specified substance.
	*/
	@Json(name = "no-known-reaction-risk")
	NO_KNOWN_REACTION_RISK,
}
