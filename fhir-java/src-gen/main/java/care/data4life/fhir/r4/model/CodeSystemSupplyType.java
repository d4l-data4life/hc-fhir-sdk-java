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
 * This value sets refers to a Category of supply.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/supply-kind">SupplyType</a>
 */
public enum CodeSystemSupplyType {

	/**
	* Supply is stored and requested from central supply.
	*/
	@Json(name = "central")
	CENTRAL,

	/**
	* Supply is not onsite and must be requested from an outside vendor using a non-stock requisition.
	*/
	@Json(name = "nonstock")
	NONSTOCK,
}
