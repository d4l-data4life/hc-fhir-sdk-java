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
 * The criteria by which a question is enabled.
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-enable-operator">QuestionnaireItemOperator</a>
 */
public enum CodeSystemQuestionnaireItemOperator {

    /**
     * True if whether an answer exists is equal to the enableWhen answer (which must be a boolean).
     */
    @Json(name = "exists")
    EXISTS,

    /**
     * True if whether at least one answer has a value that is equal to the enableWhen answer.
     */
    @Json(name = "=")
    EQUAL,

    /**
     * True if whether at least no answer has a value that is equal to the enableWhen answer.
     */
    @Json(name = "!=")
    NOT_EQUAL,

    /**
     * True if whether at least no answer has a value that is greater than the enableWhen answer.
     */
    @Json(name = ">")
    GREATER_THAN,

    /**
     * True if whether at least no answer has a value that is less than the enableWhen answer.
     */
    @Json(name = "<")
    LESS_THAN,

    /**
     * True if whether at least no answer has a value that is greater or equal to the enableWhen answer.
     */
    @Json(name = ">=")
    GREATER_OR_EQUAL,

    /**
     * True if whether at least no answer has a value that is less or equal to the enableWhen answer.
     */
    @Json(name = "<=")
    LESS_OR_EQUAL,
}
