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
 * Defines the types of relationships between actions
 *
 * @see <a href="http://hl7.org/fhir/action-relationship-type">ActionRelationshipType</a>
 */
public enum CodeSystemActionRelationshipType {

	/**
	* The action must be performed before the start of the related action
	*/
	@Json(name = "before-start")
	BEFORE_START,

	/**
	* The action must be performed before the related action
	*/
	@Json(name = "before")
	BEFORE,

	/**
	* The action must be performed before the end of the related action
	*/
	@Json(name = "before-end")
	BEFORE_END,

	/**
	* The action must be performed concurrent with the start of the related action
	*/
	@Json(name = "concurrent-with-start")
	CONCURRENT_WITH_START,

	/**
	* The action must be performed concurrent with the related action
	*/
	@Json(name = "concurrent")
	CONCURRENT,

	/**
	* The action must be performed concurrent with the end of the related action
	*/
	@Json(name = "concurrent-with-end")
	CONCURRENT_WITH_END,

	/**
	* The action must be performed after the start of the related action
	*/
	@Json(name = "after-start")
	AFTER_START,

	/**
	* The action must be performed after the related action
	*/
	@Json(name = "after")
	AFTER,

	/**
	* The action must be performed after the end of the related action
	*/
	@Json(name = "after-end")
	AFTER_END,
}
