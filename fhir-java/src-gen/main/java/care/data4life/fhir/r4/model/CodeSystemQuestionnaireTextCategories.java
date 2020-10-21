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
 * Codes defining the purpose of a Questionnaire item of type 'text'.
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-display-category">QuestionnaireTextCategories</a>
 */
public enum CodeSystemQuestionnaireTextCategories {

    /**
     * The text provides guidance on how to populate or use a portion of the questionnaire (or the
     * questionnaire as a whole).
     */
    @Json(name = "instructions")
    INSTRUCTIONS,

    /**
     * The text provides guidance on how the information should be or will be handled from a
     * security/confidentiality/access control perspective when completed
     */
    @Json(name = "security")
    SECURITY,

    /**
     * The text provides additional guidance on populating the containing item.  Help text isn't
     * necessarily expected to be rendered as part of the form, but may instead be made available
     * through fly-over, pop-up button, link to a "help" page, etc.
     */
    @Json(name = "help")
    HELP,
}
