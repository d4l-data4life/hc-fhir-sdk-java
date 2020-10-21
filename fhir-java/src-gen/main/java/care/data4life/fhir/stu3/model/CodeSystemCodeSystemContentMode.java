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
 * How much of the content of the code system - the concepts and codes it defines - are represented in a code system resource
 *
 * @see <a href="http://hl7.org/fhir/codesystem-content-mode">CodeSystemContentMode</a>
 */
public enum CodeSystemCodeSystemContentMode {

	/**
	* None of the concepts defined by the code system are included in the code system resource
	*/
	@Json(name = "not-present")
	NOT_PRESENT,

	/**
	* A few representative concepts are included in the code system resource
	*/
	@Json(name = "example")
	EXAMPLE,

	/**
	* A subset of the code system concepts are included in the code system resource
	*/
	@Json(name = "fragment")
	FRAGMENT,

	/**
	* All the concepts defined by the code system are included in the code system resource
	*/
	@Json(name = "complete")
	COMPLETE,
}
