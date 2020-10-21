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
 * What Search Comparator Codes are supported in search.
 *
 * @see <a href="http://hl7.org/fhir/search-comparator">SearchComparator</a>
 */
public enum CodeSystemSearchComparator {

	/**
	* the value for the parameter in the resource is equal to the provided value.
	*/
	@Json(name = "eq")
	EQ,

	/**
	* the value for the parameter in the resource is not equal to the provided value.
	*/
	@Json(name = "ne")
	NE,

	/**
	* the value for the parameter in the resource is greater than the provided value.
	*/
	@Json(name = "gt")
	GT,

	/**
	* the value for the parameter in the resource is less than the provided value.
	*/
	@Json(name = "lt")
	LT,

	/**
	* the value for the parameter in the resource is greater or equal to the provided value.
	*/
	@Json(name = "ge")
	GE,

	/**
	* the value for the parameter in the resource is less or equal to the provided value.
	*/
	@Json(name = "le")
	LE,

	/**
	* the value for the parameter in the resource starts after the provided value.
	*/
	@Json(name = "sa")
	SA,

	/**
	* the value for the parameter in the resource ends before the provided value.
	*/
	@Json(name = "eb")
	EB,

	/**
	* the value for the parameter in the resource is approximately the same to the provided value.
	*/
	@Json(name = "ap")
	AP,
}
