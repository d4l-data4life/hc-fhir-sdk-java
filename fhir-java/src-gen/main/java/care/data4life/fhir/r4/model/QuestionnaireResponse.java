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

import java.util.List;

import javax.annotation.Nullable;

/**
 * QuestionnaireResponse.java
 * <p>
 * A structured set of questions and their answers. The questions are ordered and grouped into
 * coherent subsets, corresponding to the structure of the grouping of the questionnaire being
 * responded to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse">QuestionnaireResponse</a>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse)
 * on 2021-04-08
 */
public class QuestionnaireResponse extends DomainResource {

    public static final String resourceType = "QuestionnaireResponse";

    // Unique id for this set of answers.
    @Json(name = "identifier")
    @Nullable
    public Identifier identifier;

    // Request fulfilled by this QuestionnaireResponse.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Part of this action.
    @Json(name = "partOf")
    @Nullable
    public List<Reference> partOf;

    // Form being answered.
    @Json(name = "questionnaire")
    @Nullable
    public Canonical questionnaire;

    // The position of the questionnaire response within its overall lifecycle.
    @Json(name = "status")
    public CodeSystemQuestionnaireResponseStatus status;

    // The subject of the questions.
    @Json(name = "subject")
    @Nullable
    public Reference subject;

    // Encounter created as part of.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // Date the answers were gathered.
    @Json(name = "authored")
    @Nullable
    public FhirDateTime authored;

    // Person who received and recorded the answers.
    @Json(name = "author")
    @Nullable
    public Reference author;

    // The person who answered the questions.
    @Json(name = "source")
    @Nullable
    public Reference source;

    // Groups and questions.
    @Json(name = "item")
    @Nullable
    public List<QuestionnaireResponseItem> item;


    /**
     * Constructor for all required properties.
     *
     * @param status CodeSystemQuestionnaireResponseStatus
     */
    public QuestionnaireResponse(CodeSystemQuestionnaireResponseStatus status) {
        this.status = status;
    }

    @Override
    public String getResourceType() {
        return QuestionnaireResponse.resourceType;
    }


    /**
     * QuestionnaireResponse.java
     * <p>
     * A group or question item from the original questionnaire for which answers are provided.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse">QuestionnaireResponse</a>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse)
     * on 2021-04-08
     */
    public static class QuestionnaireResponseItem extends BackboneElement {

        public static final String resourceType = "QuestionnaireResponseItem";

        // Pointer to specific item from Questionnaire.
        @Json(name = "linkId")
        public String linkId;

        // ElementDefinition - details for the item.
        @Json(name = "definition")
        @Nullable
        public String definition;

        // Name for group or question text.
        @Json(name = "text")
        @Nullable
        public String text;

        // The response(s) to the question.
        @Json(name = "answer")
        @Nullable
        public List<QuestionnaireResponseItemAnswer> answer;

        // Nested questionnaire response items.
        @Json(name = "item")
        @Nullable
        public List<QuestionnaireResponseItem> item;


        /**
         * Constructor for all required properties.
         *
         * @param linkId String
         */
        public QuestionnaireResponseItem(String linkId) {
            this.linkId = linkId;
        }

        @Override
        public String getResourceType() {
            return QuestionnaireResponseItem.resourceType;
        }


    }


    /**
     * QuestionnaireResponse.java
     * <p>
     * The respondent's answer(s) to the question.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse">QuestionnaireResponse</a>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse)
     * on 2021-04-08
     */
    public static class QuestionnaireResponseItemAnswer extends BackboneElement {

        public static final String resourceType = "QuestionnaireResponseItemAnswer";

        // Single-valued answer to the question.
        @Json(name = "valueBoolean")
        @Nullable
        public Boolean valueBoolean;

        // Single-valued answer to the question.
        @Json(name = "valueDecimal")
        @Nullable
        public FhirDecimal valueDecimal;

        // Single-valued answer to the question.
        @Json(name = "valueInteger")
        @Nullable
        public Integer valueInteger;

        // Single-valued answer to the question.
        @Json(name = "valueDate")
        @Nullable
        public FhirDate valueDate;

        // Single-valued answer to the question.
        @Json(name = "valueDateTime")
        @Nullable
        public FhirDateTime valueDateTime;

        // Single-valued answer to the question.
        @Json(name = "valueTime")
        @Nullable
        public FhirTime valueTime;

        // Single-valued answer to the question.
        @Json(name = "valueString")
        @Nullable
        public String valueString;

        // Single-valued answer to the question.
        @Json(name = "valueUri")
        @Nullable
        public String valueUri;

        // Single-valued answer to the question.
        @Json(name = "valueAttachment")
        @Nullable
        public Attachment valueAttachment;

        // Single-valued answer to the question.
        @Json(name = "valueCoding")
        @Nullable
        public Coding valueCoding;

        // Single-valued answer to the question.
        @Json(name = "valueQuantity")
        @Nullable
        public Quantity valueQuantity;

        // Single-valued answer to the question.
        @Json(name = "valueReference")
        @Nullable
        public Reference valueReference;

        // Nested groups and questions.
        @Json(name = "item")
        @Nullable
        public List<QuestionnaireResponseItem> item;


        public QuestionnaireResponseItemAnswer() {
        }

        @Override
        public String getResourceType() {
            return QuestionnaireResponseItemAnswer.resourceType;
        }


    }


}
