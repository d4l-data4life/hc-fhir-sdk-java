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
 * The degree of equivalence between concepts.
 *
 * @see <a href="http://hl7.org/fhir/concept-map-equivalence">ConceptMapEquivalence</a>
 */
public enum CodeSystemConceptMapEquivalence {

	/**
	* The concepts are related to each other, and have at least some overlap in meaning, but the exact relationship is not known.
	*/
	@Json(name = "relatedto")
	RELATEDTO,

	/**
	* The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical).
	*/
	@Json(name = "equivalent")
	EQUIVALENT,

	/**
	* The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identical or irrelevant (i.e. intentionally identical).
	*/
	@Json(name = "equal")
	EQUAL,

	/**
	* The target mapping is wider in meaning than the source concept.
	*/
	@Json(name = "wider")
	WIDER,

	/**
	* The target mapping subsumes the meaning of the source concept (e.g. the source is-a target).
	*/
	@Json(name = "subsumes")
	SUBSUMES,

	/**
	* The target mapping is narrower in meaning than the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.
	*/
	@Json(name = "narrower")
	NARROWER,

	/**
	* The target mapping specializes the meaning of the source concept (e.g. the target is-a source).
	*/
	@Json(name = "specializes")
	SPECIALIZES,

	/**
	* The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is inexact SHALL be described in the comments in this case, and applications should be careful when attempting to use these mappings operationally.
	*/
	@Json(name = "inexact")
	INEXACT,

	/**
	* There is no match for this concept in the target code system.
	*/
	@Json(name = "unmatched")
	UNMATCHED,

	/**
	* This is an explicit assertion that there is no mapping between the source and target concept.
	*/
	@Json(name = "disjoint")
	DISJOINT,
}
