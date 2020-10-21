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
 * This example value set defines a set of codes that can be used to indicate the current state of the animal's reproductive organs.
 *
 * @see <a href="http://hl7.org/fhir/animal-genderstatus">GenderStatus</a>
 */
public enum CodeSystemGenderStatus {

	/**
	* The animal has been sterilized, castrated or otherwise made infertile.
	*/
	@Json(name = "neutered")
	NEUTERED,

	/**
	* The animal's reproductive organs are intact.
	*/
	@Json(name = "intact")
	INTACT,

	/**
	* Unable to determine whether the animal has been neutered.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
