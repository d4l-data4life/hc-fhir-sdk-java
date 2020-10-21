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
 * The type of a property value.
 *
 * @see <a href="http://hl7.org/fhir/concept-property-type">PropertyType</a>
 */
public enum CodeSystemPropertyType {

	/**
	* The property value is a code that identifies a concept defined in the code system.
	*/
	@Json(name = "code")
	CODE,

	/**
	* The property  value is a code defined in an external code system. This may be used for translations, but is not the intent.
	*/
	@Json(name = "Coding")
	CODING,

	/**
	* The property value is a string.
	*/
	@Json(name = "string")
	STRING,

	/**
	* The property value is a string (often used to assign ranking values to concepts for supporting score assessments).
	*/
	@Json(name = "integer")
	INTEGER,

	/**
	* The property value is a boolean true | false.
	*/
	@Json(name = "boolean")
	BOOLEAN,

	/**
	* The property is a date or a date + time.
	*/
	@Json(name = "dateTime")
	DATETIME,

	/**
	* The property value is a decimal number.
	*/
	@Json(name = "decimal")
	DECIMAL,
}
