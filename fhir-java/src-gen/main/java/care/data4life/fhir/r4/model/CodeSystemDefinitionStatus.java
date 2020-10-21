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
 * Codes identifying the lifecycle stage of a definition.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/definition-status">DefinitionStatus</a>
 */
public enum CodeSystemDefinitionStatus {

	/**
	* The definition is in the design stage and is not yet considered to be "ready for use".
	*/
	@Json(name = "draft")
	DRAFT,

	/**
	* The definition is considered ready for use.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* The definition should no longer be used.
	*/
	@Json(name = "withdrawn")
	WITHDRAWN,

	/**
	* The authoring/source system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
