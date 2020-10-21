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
 * Codes specifying how two observations are related.
 *
 * @see <a href="http://hl7.org/fhir/observation-relationshiptypes">ObservationRelationshipType</a>
 */
public enum CodeSystemObservationRelationshipType {

	/**
	* This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
	*/
	@Json(name = "has-member")
	HAS_MEMBER,

	/**
	* The target resource (Observation or QuestionnaireResponse) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  "derived-from" is the only logical choice when referencing QuestionnaireResponse.
	*/
	@Json(name = "derived-from")
	DERIVED_FROM,

	/**
	* This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test).
	*/
	@Json(name = "sequel-to")
	SEQUEL_TO,

	/**
	* This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete.
	*/
	@Json(name = "replaces")
	REPLACES,

	/**
	* The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipemia measure target from a plasma measure).
	*/
	@Json(name = "qualified-by")
	QUALIFIED_BY,

	/**
	* The value of the target observation interferes (degrades quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure, which has no value).
	*/
	@Json(name = "interfered-by")
	INTERFERED_BY,
}
