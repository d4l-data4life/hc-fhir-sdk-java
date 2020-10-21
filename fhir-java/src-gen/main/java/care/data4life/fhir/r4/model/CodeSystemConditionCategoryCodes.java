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
 * Preferred value set for Condition Categories.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/condition-category">ConditionCategoryCodes</a>
 */
public enum CodeSystemConditionCategoryCodes {

	/**
	* An item on a problem list that can be managed over time and can be expressed by a practitioner (e.g. physician, nurse), patient, or related person.
	*/
	@Json(name = "problem-list-item")
	PROBLEM_LIST_ITEM,

	/**
	* A point in time diagnosis (e.g. from a physician or nurse) in context of an encounter.
	*/
	@Json(name = "encounter-diagnosis")
	ENCOUNTER_DIAGNOSIS,
}
