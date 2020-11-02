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
 * Distinguishes groups from questions and display text and indicates data type for questions
 *
 * @see <a href="http://hl7.org/fhir/item-type">QuestionnaireItemType</a>
 */
public enum CodeSystemQuestionnaireItemType {

    /**
     * An item with no direct answer but should have at least one child item.
     */
    @Json(name = "group")
    GROUP,

    /**
     * Text for display that will not capture an answer or have child items.
     */
    @Json(name = "display")
    DISPLAY,

    /**
     * An item that defines a specific answer to be captured, and may have child items. (the answer
     * provided in the QuestionnaireResponse should be of the defined datatype)
     */
    @Json(name = "question")
    QUESTION,

    /**
     * Question with a yes/no answer (valueBoolean)
     */
    @Json(name = "boolean")
    BOOLEAN,

    /**
     * Question with is a real number answer (valueDecimal)
     */
    @Json(name = "decimal")
    DECIMAL,

    /**
     * Question with an integer answer (valueInteger)
     */
    @Json(name = "integer")
    INTEGER,

    /**
     * Question with a date answer (valueDate)
     */
    @Json(name = "date")
    DATE,

    /**
     * Question with a date and time answer (valueDateTime)
     */
    @Json(name = "dateTime")
    DATETIME,

    /**
     * Question with a time (hour:minute:second) answer independent of date. (valueTime)
     */
    @Json(name = "time")
    TIME,

    /**
     * Question with a short (few words to short sentence) free-text entry answer (valueString)
     */
    @Json(name = "string")
    STRING,

    /**
     * Question with a long (potentially multi-paragraph) free-text entry answer (valueString)
     */
    @Json(name = "text")
    TEXT,

    /**
     * Question with a URL (website, FTP site, etc.) answer (valueUri)
     */
    @Json(name = "url")
    URL,

    /**
     * Question with a Coding drawn from a list of options (specified in either the option property,
     * or via the valueset referenced in the options property) as an answer (valueCoding)
     */
    @Json(name = "choice")
    CHOICE,

    /**
     * Answer is a Coding drawn from a list of options (as with the choice type) or a free-text
     * entry in a string (valueCoding or valueString)
     */
    @Json(name = "open-choice")
    OPEN_CHOICE,

    /**
     * Question with binary content such as a image, PDF, etc. as an answer (valueAttachment)
     */
    @Json(name = "attachment")
    ATTACHMENT,

    /**
     * Question with a reference to another resource (practitioner, organization, etc.) as an answer
     * (valueReference)
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * Question with a combination of a numeric value and unit, potentially with a comparator (<, >,
     * etc.) as an answer. (valueQuantity) There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit'
     * that can be used to define what unit whould be captured (or the a unit that has a ucum
     * conversion from the provided unit)
     */
    @Json(name = "quantity")
    QUANTITY,
}
