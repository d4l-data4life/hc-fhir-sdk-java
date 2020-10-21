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
 * Defines the kinds of conditions that can appear on actions
 *
 * @see <a href="http://hl7.org/fhir/action-condition-kind">ActionConditionKind</a>
 */
public enum CodeSystemActionConditionKind {

	/**
	* The condition describes whether or not a given action is applicable
	*/
	@Json(name = "applicability")
	APPLICABILITY,

	/**
	* The condition is a starting condition for the action
	*/
	@Json(name = "start")
	START,

	/**
	* The condition is a stop, or exit condition for the action
	*/
	@Json(name = "stop")
	STOP,
}
