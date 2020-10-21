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
 * The quality rating of the subcomponent of a quality of evidence rating.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/certainty-subcomponent-rating">CertaintySubcomponentRating</a>
 */
public enum CodeSystemCertaintySubcomponentRating {

	/**
	* no change to quality rating.
	*/
	@Json(name = "no-change")
	NO_CHANGE,

	/**
	* reduce quality rating by 1.
	*/
	@Json(name = "downcode1")
	DOWNCODE1,

	/**
	* reduce quality rating by 2.
	*/
	@Json(name = "downcode2")
	DOWNCODE2,

	/**
	* reduce quality rating by 3.
	*/
	@Json(name = "downcode3")
	DOWNCODE3,

	/**
	* increase quality rating by 1.
	*/
	@Json(name = "upcode1")
	UPCODE1,

	/**
	* increase quality rating by 2.
	*/
	@Json(name = "upcode2")
	UPCODE2,

	/**
	* no serious concern.
	*/
	@Json(name = "no-concern")
	NO_CONCERN,

	/**
	* serious concern.
	*/
	@Json(name = "serious-concern")
	SERIOUS_CONCERN,

	/**
	* critical concern.
	*/
	@Json(name = "critical-concern")
	CRITICAL_CONCERN,

	/**
	* possible reason for increasing quality rating was checked and found to bepresent.
	*/
	@Json(name = "present")
	PRESENT,

	/**
	* possible reason for increasing quality rating was checked and found to be absent.
	*/
	@Json(name = "absent")
	ABSENT,
}
