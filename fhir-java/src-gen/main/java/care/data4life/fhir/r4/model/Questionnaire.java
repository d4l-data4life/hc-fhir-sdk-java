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
 * Questionnaire.java
 * <p>
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to
 * allow coherent, consistent data collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire) on
 * 2020-10-15
 */
public class Questionnaire extends DomainResource {

    public static final String resourceType = "Questionnaire";

    // Canonical identifier for this questionnaire, represented as a URI (globally unique).
    @Json(name = "url")
    @Nullable
    public String url;

    // Additional identifier for the questionnaire.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Business version of the questionnaire.
    @Json(name = "version")
    @Nullable
    public String version;

    // Name for this questionnaire (computer friendly).
    @Json(name = "name")
    @Nullable
    public String name;

    // Name for this questionnaire (human friendly).
    @Json(name = "title")
    @Nullable
    public String title;

    // Instantiates protocol or definition.
    @Json(name = "derivedFrom")
    @Nullable
    public List<Canonical> derivedFrom;

    // The status of this questionnaire. Enables tracking the life-cycle of the content.
    @Json(name = "status")
    public CodeSystemPublicationStatus status;

    // For testing purposes, not real usage.
    @Json(name = "experimental")
    @Nullable
    public Boolean experimental;

    // The types of subjects that can be the subject of responses created for the questionnaire.
    @Json(name = "subjectType")
    @Nullable
    public List<CodeSystemResourceType> subjectType;

    // Date last changed.
    @Json(name = "date")
    @Nullable
    public FhirDateTime date;

    // Name of the publisher (organization or individual).
    @Json(name = "publisher")
    @Nullable
    public String publisher;

    // Contact details for the publisher.
    @Json(name = "contact")
    @Nullable
    public List<ContactDetail> contact;

    // Natural language description of the questionnaire.
    @Json(name = "description")
    @Nullable
    public String description;

    // The context that the content is intended to support.
    @Json(name = "useContext")
    @Nullable
    public List<UsageContext> useContext;

    // Intended jurisdiction for questionnaire (if applicable).
    @Json(name = "jurisdiction")
    @Nullable
    public List<CodeableConcept> jurisdiction;

    // Why this questionnaire is defined.
    @Json(name = "purpose")
    @Nullable
    public String purpose;

    // Use and/or publishing restrictions.
    @Json(name = "copyright")
    @Nullable
    public String copyright;

    // When the questionnaire was approved by publisher.
    @Json(name = "approvalDate")
    @Nullable
    public FhirDate approvalDate;

    // When the questionnaire was last reviewed.
    @Json(name = "lastReviewDate")
    @Nullable
    public FhirDate lastReviewDate;

    // When the questionnaire is expected to be used.
    @Json(name = "effectivePeriod")
    @Nullable
    public Period effectivePeriod;

    // Concept that represents the overall questionnaire.
    @Json(name = "code")
    @Nullable
    public List<Coding> code;

    // Questions and sections within the Questionnaire.
    @Json(name = "item")
    @Nullable
    public List<QuestionnaireItem> item;


    /**
     * Constructor for all required properties.
     *
     * @param status CodeSystemPublicationStatus
     */
    public Questionnaire(CodeSystemPublicationStatus status) {
        this.status = status;
    }

    @Override
    public String getResourceType() {
        return Questionnaire.resourceType;
    }


    /**
     * Questionnaire.java
     * <p>
     * A particular question, question grouping or display text that is part of the questionnaire.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
     * on 2020-10-15
     */
    public static class QuestionnaireItem extends BackboneElement {

        public static final String resourceType = "QuestionnaireItem";

        // Unique id for item in questionnaire.
        @Json(name = "linkId")
        public String linkId;

        // ElementDefinition - details for the item.
        @Json(name = "definition")
        @Nullable
        public String definition;

        // Corresponding concept for this item in a terminology.
        @Json(name = "code")
        @Nullable
        public List<Coding> code;

        // E.g. "1(a)", "2.5.3".
        @Json(name = "prefix")
        @Nullable
        public String prefix;

        // Primary text for the item.
        @Json(name = "text")
        @Nullable
        public String text;

        // The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
        @Json(name = "type")
        public CodeSystemQuestionnaireItemType type;

        // Only allow data when.
        @Json(name = "enableWhen")
        @Nullable
        public List<QuestionnaireItemEnableWhen> enableWhen;

        // Controls how multiple enableWhen values are interpreted -  whether all or any must be true.
        @Json(name = "enableBehavior")
        @Nullable
        public CodeSystemEnableWhenBehavior enableBehavior;

        // Whether the item must be included in data results.
        @Json(name = "required")
        @Nullable
        public Boolean required;

        // Whether the item may repeat.
        @Json(name = "repeats")
        @Nullable
        public Boolean repeats;

        // Don't allow human editing.
        @Json(name = "readOnly")
        @Nullable
        public Boolean readOnly;

        // No more than this many characters.
        @Json(name = "maxLength")
        @Nullable
        public Integer maxLength;

        // Valueset containing permitted answers.
        @Json(name = "answerValueSet")
        @Nullable
        public Canonical answerValueSet;

        // Permitted answer.
        @Json(name = "answerOption")
        @Nullable
        public List<QuestionnaireItemAnswerOption> answerOption;

        // Initial value(s) when item is first rendered.
        @Json(name = "initial")
        @Nullable
        public List<QuestionnaireItemInitial> initial;

        // Nested questionnaire items.
        @Json(name = "item")
        @Nullable
        public List<QuestionnaireItem> item;


        /**
         * Constructor for all required properties.
         *
         * @param linkId String
         * @param type   CodeSystemQuestionnaireItemType
         */
        public QuestionnaireItem(String linkId, CodeSystemQuestionnaireItemType type) {
            this.linkId = linkId;
            this.type = type;
        }

        @Override
        public String getResourceType() {
            return QuestionnaireItem.resourceType;
        }


    }


    /**
     * Questionnaire.java
     * <p>
     * One of the permitted answers for a "choice" or "open-choice" question.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
     * on 2020-10-15
     */
    public static class QuestionnaireItemAnswerOption extends BackboneElement {

        public static final String resourceType = "QuestionnaireItemAnswerOption";

        // Answer value.
        @Json(name = "valueInteger")
        @Nullable
        public Integer valueInteger;

        // Answer value.
        @Json(name = "valueDate")
        @Nullable
        public FhirDate valueDate;

        // Answer value.
        @Json(name = "valueTime")
        @Nullable
        public FhirTime valueTime;

        // Answer value.
        @Json(name = "valueString")
        @Nullable
        public String valueString;

        // Answer value.
        @Json(name = "valueCoding")
        @Nullable
        public Coding valueCoding;

        // Answer value.
        @Json(name = "valueReference")
        @Nullable
        public Reference valueReference;

        // Whether option is selected by default.
        @Json(name = "initialSelected")
        @Nullable
        public Boolean initialSelected;


        /**
         * Constructor for all required properties.
         *
         * @param value as one of Coding, FhirDate, Integer, Reference, String, FhirTime*
         */
        public QuestionnaireItemAnswerOption(Object value) {
            if (value instanceof Coding) {
                this.valueCoding = (Coding) value;
            } else if (value instanceof FhirDate) {
                this.valueDate = (FhirDate) value;
            } else if (value instanceof Integer) {
                this.valueInteger = (Integer) value;
            } else if (value instanceof Reference) {
                this.valueReference = (Reference) value;
            } else if (value instanceof String) {
                this.valueString = (String) value;
            } else if (value instanceof FhirTime) {
                this.valueTime = (FhirTime) value;
            } else {
                //FIXME Type: (of: value)) for property (value) is invalid, ignoring")
            }
        }

        @Override
        public String getResourceType() {
            return QuestionnaireItemAnswerOption.resourceType;
        }


    }


    /**
     * Questionnaire.java
     * <p>
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be
     * captured) when the specified condition is true.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
     * on 2020-10-15
     */
    public static class QuestionnaireItemEnableWhen extends BackboneElement {

        public static final String resourceType = "QuestionnaireItemEnableWhen";

        // Question that determines whether item is enabled.
        @Json(name = "question")
        public String question;

        // Specifies the criteria by which the question is enabled.
        @Json(name = "operator")
        public CodeSystemQuestionnaireItemOperator operator;

        // Value for question comparison based on operator.
        @Json(name = "answerBoolean")
        @Nullable
        public Boolean answerBoolean;

        // Value for question comparison based on operator.
        @Json(name = "answerDecimal")
        @Nullable
        public FhirDecimal answerDecimal;

        // Value for question comparison based on operator.
        @Json(name = "answerInteger")
        @Nullable
        public Integer answerInteger;

        // Value for question comparison based on operator.
        @Json(name = "answerDate")
        @Nullable
        public FhirDate answerDate;

        // Value for question comparison based on operator.
        @Json(name = "answerDateTime")
        @Nullable
        public FhirDateTime answerDateTime;

        // Value for question comparison based on operator.
        @Json(name = "answerTime")
        @Nullable
        public FhirTime answerTime;

        // Value for question comparison based on operator.
        @Json(name = "answerString")
        @Nullable
        public String answerString;

        // Value for question comparison based on operator.
        @Json(name = "answerCoding")
        @Nullable
        public Coding answerCoding;

        // Value for question comparison based on operator.
        @Json(name = "answerQuantity")
        @Nullable
        public Quantity answerQuantity;

        // Value for question comparison based on operator.
        @Json(name = "answerReference")
        @Nullable
        public Reference answerReference;


        /**
         * Constructor for all required properties.
         *
         * @param question String
         * @param operator CodeSystemQuestionnaireItemOperator
         * @param answer   as one of Boolean, Coding, FhirDate, FhirDateTime, FhirDecimal, Integer,
         *                 Quantity, Reference, String, FhirTime*
         */
        public QuestionnaireItemEnableWhen(String question, CodeSystemQuestionnaireItemOperator operator, Object answer) {
            this.question = question;
            this.operator = operator;
            if (answer instanceof Boolean) {
                this.answerBoolean = (Boolean) answer;
            } else if (answer instanceof Coding) {
                this.answerCoding = (Coding) answer;
            } else if (answer instanceof FhirDate) {
                this.answerDate = (FhirDate) answer;
            } else if (answer instanceof FhirDateTime) {
                this.answerDateTime = (FhirDateTime) answer;
            } else if (answer instanceof FhirDecimal) {
                this.answerDecimal = (FhirDecimal) answer;
            } else if (answer instanceof Integer) {
                this.answerInteger = (Integer) answer;
            } else if (answer instanceof Quantity) {
                this.answerQuantity = (Quantity) answer;
            } else if (answer instanceof Reference) {
                this.answerReference = (Reference) answer;
            } else if (answer instanceof String) {
                this.answerString = (String) answer;
            } else if (answer instanceof FhirTime) {
                this.answerTime = (FhirTime) answer;
            } else {
                //FIXME Type: (of: answer)) for property (answer) is invalid, ignoring")
            }
        }

        @Override
        public String getResourceType() {
            return QuestionnaireItemEnableWhen.resourceType;
        }


    }


    /**
     * Questionnaire.java
     * <p>
     * One or more values that should be pre-populated in the answer when initially rendering the
     * questionnaire for user input.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
     * on 2020-10-15
     */
    public static class QuestionnaireItemInitial extends BackboneElement {

        public static final String resourceType = "QuestionnaireItemInitial";

        // Actual value for initializing the question.
        @Json(name = "valueBoolean")
        @Nullable
        public Boolean valueBoolean;

        // Actual value for initializing the question.
        @Json(name = "valueDecimal")
        @Nullable
        public FhirDecimal valueDecimal;

        // Actual value for initializing the question.
        @Json(name = "valueInteger")
        @Nullable
        public Integer valueInteger;

        // Actual value for initializing the question.
        @Json(name = "valueDate")
        @Nullable
        public FhirDate valueDate;

        // Actual value for initializing the question.
        @Json(name = "valueDateTime")
        @Nullable
        public FhirDateTime valueDateTime;

        // Actual value for initializing the question.
        @Json(name = "valueTime")
        @Nullable
        public FhirTime valueTime;

        // Actual value for initializing the question.
        @Json(name = "valueString")
        @Nullable
        public String valueString;

        // Actual value for initializing the question.
        @Json(name = "valueUri")
        @Nullable
        public String valueUri;

        // Actual value for initializing the question.
        @Json(name = "valueAttachment")
        @Nullable
        public Attachment valueAttachment;

        // Actual value for initializing the question.
        @Json(name = "valueCoding")
        @Nullable
        public Coding valueCoding;

        // Actual value for initializing the question.
        @Json(name = "valueQuantity")
        @Nullable
        public Quantity valueQuantity;

        // Actual value for initializing the question.
        @Json(name = "valueReference")
        @Nullable
        public Reference valueReference;


        /**
         * Constructor for all required properties.
         *
         * @param value as one of Attachment, Boolean, Coding, FhirDate, FhirDateTime, FhirDecimal,
         *              Integer, Quantity, Reference, String, FhirTime, String*
         */
        public QuestionnaireItemInitial(Object value) {
            if (value instanceof Attachment) {
                this.valueAttachment = (Attachment) value;
            } else if (value instanceof Boolean) {
                this.valueBoolean = (Boolean) value;
            } else if (value instanceof Coding) {
                this.valueCoding = (Coding) value;
            } else if (value instanceof FhirDate) {
                this.valueDate = (FhirDate) value;
            } else if (value instanceof FhirDateTime) {
                this.valueDateTime = (FhirDateTime) value;
            } else if (value instanceof FhirDecimal) {
                this.valueDecimal = (FhirDecimal) value;
            } else if (value instanceof Integer) {
                this.valueInteger = (Integer) value;
            } else if (value instanceof Quantity) {
                this.valueQuantity = (Quantity) value;
            } else if (value instanceof Reference) {
                this.valueReference = (Reference) value;
            } else if (value instanceof String) {
                this.valueString = (String) value;
            } else if (value instanceof FhirTime) {
                this.valueTime = (FhirTime) value;
            } else if (value instanceof String) {
                this.valueUri = (String) value;
            } else {
                //FIXME Type: (of: value)) for property (value) is invalid, ignoring")
            }
        }

        @Override
        public String getResourceType() {
            return QuestionnaireItemInitial.resourceType;
        }


    }


}
