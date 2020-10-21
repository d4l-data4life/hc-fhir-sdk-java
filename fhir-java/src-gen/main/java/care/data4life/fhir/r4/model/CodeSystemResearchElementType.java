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
 * The possible types of research elements (E.g. Population, Exposure, Outcome).
 *
 * @see <a href="http://hl7.org/fhir/research-element-type">ResearchElementType</a>
 */
public enum CodeSystemResearchElementType {

	/**
	* The element defines the population that forms the basis for research.
	*/
	@Json(name = "population")
	POPULATION,

	/**
	* The element defines an exposure within the population that is being researched.
	*/
	@Json(name = "exposure")
	EXPOSURE,

	/**
	* The element defines an outcome within the population that is being researched.
	*/
	@Json(name = "outcome")
	OUTCOME,
}
