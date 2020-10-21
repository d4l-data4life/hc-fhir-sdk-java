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
 * Defines organization behavior of a group.
 *
 * @see <a href="http://hl7.org/fhir/action-grouping-behavior">ActionGroupingBehavior</a>
 */
public enum CodeSystemActionGroupingBehavior {

	/**
	* Any group marked with this behavior should be displayed as a visual group to the end user.
	*/
	@Json(name = "visual-group")
	VISUAL_GROUP,

	/**
	* A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.
	*/
	@Json(name = "logical-group")
	LOGICAL_GROUP,

	/**
	* A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required action, in which case, it would be "ExactlyOne".
	*/
	@Json(name = "sentence-group")
	SENTENCE_GROUP,
}
