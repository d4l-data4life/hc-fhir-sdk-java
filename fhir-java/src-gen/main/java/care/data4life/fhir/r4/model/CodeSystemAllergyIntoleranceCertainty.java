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
 * Statement about the degree of clinical certainty that a specific substance was the cause of the manifestation in a reaction event.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/reaction-event-certainty">AllergyIntoleranceCertainty</a>
 */
public enum CodeSystemAllergyIntoleranceCertainty {

	/**
	* There is a low level of clinical certainty that the reaction was caused by the identified substance.
	*/
	@Json(name = "unlikely")
	UNLIKELY,

	/**
	* There is a high level of clinical certainty that the reaction was caused by the identified substance.
	*/
	@Json(name = "likely")
	LIKELY,

	/**
	* There is a very high level of clinical certainty that the reaction was due to the identified substance, which may include clinical evidence by testing or rechallenge.
	*/
	@Json(name = "confirmed")
	CONFIRMED,

	/**
	* The clinical certainty that the reaction was caused by the identified substance is unknown.  It is an explicit assertion that certainty is not known.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
