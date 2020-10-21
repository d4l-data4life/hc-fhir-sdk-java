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
 * Defines the type of structure that a definition is describing.
 *
 * @see <a href="http://hl7.org/fhir/structure-definition-kind">StructureDefinitionKind</a>
 */
public enum CodeSystemStructureDefinitionKind {

	/**
	* A primitive type that has a value and an extension. These can be used throughout Resource and extension definitions. Only the base specification can define primitive types.
	*/
	@Json(name = "primitive-type")
	PRIMITIVE_TYPE,

	/**
	* A  complex structure that defines a set of data elements. These can be used throughout Resource and extension definitions, and in logical models.
	*/
	@Json(name = "complex-type")
	COMPLEX_TYPE,

	/**
	* A resource defined by the FHIR specification.
	*/
	@Json(name = "resource")
	RESOURCE,

	/**
	* A conceptual package of data that will be mapped to resources for implementation.
	*/
	@Json(name = "logical")
	LOGICAL,
}
