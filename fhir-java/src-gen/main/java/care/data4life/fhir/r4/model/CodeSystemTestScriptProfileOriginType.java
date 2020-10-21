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
 * This value set defines a set of codes that are used to indicate the profile type of a test system when acting as the origin within a TestScript.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/testscript-profile-origin-types">TestScriptProfileOriginType</a>
 */
public enum CodeSystemTestScriptProfileOriginType {

	/**
	* General FHIR client used to initiate operations against a FHIR server.
	*/
	@Json(name = "FHIR-Client")
	FHIR_CLIENT,

	/**
	* A FHIR client acting as a Structured Data Capture Form Filler.
	*/
	@Json(name = "FHIR-SDC-FormFiller")
	FHIR_SDC_FORMFILLER,
}
