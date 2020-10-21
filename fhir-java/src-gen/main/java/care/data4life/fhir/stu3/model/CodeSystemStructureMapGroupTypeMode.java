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
 * If this is the default rule set to apply for the source type, or this combination of types
 *
 * @see <a href="http://hl7.org/fhir/map-group-type-mode">StructureMapGroupTypeMode</a>
 */
public enum CodeSystemStructureMapGroupTypeMode {

	/**
	* This group is not a default group for the types
	*/
	@Json(name = "none")
	NONE,

	/**
	* This group is a default mapping group for the specified types and for the primary source type
	*/
	@Json(name = "types")
	TYPES,

	/**
	* This group is a default mapping group for the specified types
	*/
	@Json(name = "type-and-types")
	TYPE_AND_TYPES,
}
