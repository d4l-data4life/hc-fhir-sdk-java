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
 * This value set includes Status codes.
 *
 * @see <a href="http://hl7.org/fhir/fm-status">FinancialResourceStatusCodes</a>
 */
public enum CodeSystemFinancialResourceStatusCodes {

	/**
	* The instance is currently in-force.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* The instance is withdrawn, rescinded or reversed.
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* A new instance the contents of which is not complete.
	*/
	@Json(name = "draft")
	DRAFT,

	/**
	* The instance was entered in error.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
