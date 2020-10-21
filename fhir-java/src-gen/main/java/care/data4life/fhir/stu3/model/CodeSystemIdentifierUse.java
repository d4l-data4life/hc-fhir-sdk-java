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
 * Identifies the purpose for this identifier, if known .
 *
 * @see <a href="http://hl7.org/fhir/identifier-use">IdentifierUse</a>
 */
public enum CodeSystemIdentifierUse {

	/**
	* The identifier recommended for display and use in real-world interactions.
	*/
	@Json(name = "usual")
	USUAL,

	/**
	* The identifier considered to be most trusted for the identification of this item.
	*/
	@Json(name = "official")
	OFFICIAL,

	/**
	* A temporary identifier.
	*/
	@Json(name = "temp")
	TEMP,

	/**
	* An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.
	*/
	@Json(name = "secondary")
	SECONDARY,
}
