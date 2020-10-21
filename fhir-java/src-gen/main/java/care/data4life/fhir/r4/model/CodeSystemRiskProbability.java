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
 * Codes representing the likelihood of a particular outcome in a risk assessment.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/risk-probability">RiskProbability</a>
 */
public enum CodeSystemRiskProbability {

	/**
	* The specified outcome is exceptionally unlikely.
	*/
	@Json(name = "negligible")
	NEGLIGIBLE,

	/**
	* The specified outcome is possible but unlikely.
	*/
	@Json(name = "low")
	LOW,

	/**
	* The specified outcome has a reasonable likelihood of occurrence.
	*/
	@Json(name = "moderate")
	MODERATE,

	/**
	* The specified outcome is more likely to occur than not.
	*/
	@Json(name = "high")
	HIGH,

	/**
	* The specified outcome is effectively guaranteed.
	*/
	@Json(name = "certain")
	CERTAIN,
}
