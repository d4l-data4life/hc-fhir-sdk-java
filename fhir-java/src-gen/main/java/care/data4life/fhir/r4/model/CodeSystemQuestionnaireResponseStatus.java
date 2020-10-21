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
 * Lifecycle status of the questionnaire response.
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-answers-status">QuestionnaireResponseStatus</a>
 */
public enum CodeSystemQuestionnaireResponseStatus {

	/**
	* This QuestionnaireResponse has been partially filled out with answers but changes or additions are still expected to be made to it.
	*/
	@Json(name = "in-progress")
	IN_PROGRESS,

	/**
	* This QuestionnaireResponse has been filled out with answers and the current content is regarded as definitive.
	*/
	@Json(name = "completed")
	COMPLETED,

	/**
	* This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
	*/
	@Json(name = "amended")
	AMENDED,

	/**
	* This QuestionnaireResponse was entered in error and voided.
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* This QuestionnaireResponse has been partially filled out with answers but has been abandoned. It is unknown whether changes or additions are expected to be made to it.
	*/
	@Json(name = "stopped")
	STOPPED,
}
