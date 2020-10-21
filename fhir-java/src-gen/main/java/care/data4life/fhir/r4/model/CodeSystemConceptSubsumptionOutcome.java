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
 * The subsumption relationship between code/Coding "A" and code/Coding "B". There are 4 possible codes to be returned: equivalent, subsumes, subsumed-by, and not-subsumed. If the server is unable to determine the relationship between the codes/Codings, then it returns an error (i.e. an OperationOutcome).
 *
 * @see <a href="http://hl7.org/fhir/concept-subsumption-outcome">ConceptSubsumptionOutcome</a>
 */
public enum CodeSystemConceptSubsumptionOutcome {

	/**
	* The two concepts are equivalent (have the same properties).
	*/
	@Json(name = "equivalent")
	EQUIVALENT,

	/**
	* Coding/code "A" subsumes Coding/code "B" (e.g. B has all the properties A has, and some of it's own).
	*/
	@Json(name = "subsumes")
	SUBSUMES,

	/**
	* Coding/code "A" is subsumed by Coding/code "B" (e.g. A has all the properties B has, and some of it's own).
	*/
	@Json(name = "subsumed-by")
	SUBSUMED_BY,

	/**
	* Coding/code "A" and Coding/code "B" are disjoint (e.g. each has propeties that the other doesn't have).
	*/
	@Json(name = "not-subsumed")
	NOT_SUBSUMED,
}
