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
 * EnteralFormulaAdditiveType: Codes for the type of modular component such as protein, carbohydrate or fiber to be provided in addition to or mixed with the base formula. This value set is provided as a suggestive example.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/entformula-additive">EnteralFormulaAdditiveTypeCode</a>
 */
public enum CodeSystemEnteralFormulaAdditiveTypeCode {

	/**
	* Modular lipid enteral formula component
	*/
	@Json(name = "lipid")
	LIPID,

	/**
	* Modular protein enteral formula component
	*/
	@Json(name = "protein")
	PROTEIN,

	/**
	* Modular carbohydrate enteral formula component
	*/
	@Json(name = "carbohydrate")
	CARBOHYDRATE,

	/**
	* Modular fiber enteral formula component
	*/
	@Json(name = "fiber")
	FIBER,

	/**
	* Added water
	*/
	@Json(name = "water")
	WATER,
}
