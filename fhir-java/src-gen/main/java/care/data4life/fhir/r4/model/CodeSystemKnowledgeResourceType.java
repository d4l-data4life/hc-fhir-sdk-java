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
 * A list of all the knowledge resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/knowledge-resource-types">KnowledgeResourceType</a>
 */
public enum CodeSystemKnowledgeResourceType {

	/**
	* The definition of a specific activity to be taken, independent of any particular patient or context.
	*/
	@Json(name = "ActivityDefinition")
	ACTIVITYDEFINITION,

	/**
	* A set of codes drawn from one or more code systems.
	*/
	@Json(name = "CodeSystem")
	CODESYSTEM,

	/**
	* A map from one set of concepts to one or more other concepts.
	*/
	@Json(name = "ConceptMap")
	CONCEPTMAP,

	/**
	* Represents a library of quality improvement components.
	*/
	@Json(name = "Library")
	LIBRARY,

	/**
	* A quality measure definition.
	*/
	@Json(name = "Measure")
	MEASURE,

	/**
	* The definition of a plan for a series of actions, independent of any specific patient or context.
	*/
	@Json(name = "PlanDefinition")
	PLANDEFINITION,

	/**
	* Structural Definition.
	*/
	@Json(name = "StructureDefinition")
	STRUCTUREDEFINITION,

	/**
	* A Map of relationships between 2 structures that can be used to transform data.
	*/
	@Json(name = "StructureMap")
	STRUCTUREMAP,

	/**
	* A set of codes drawn from one or more code systems.
	*/
	@Json(name = "ValueSet")
	VALUESET,
}
