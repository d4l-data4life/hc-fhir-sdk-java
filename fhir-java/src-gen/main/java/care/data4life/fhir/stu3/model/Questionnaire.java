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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire) on
 * 2020-10-21
 */
public class Questionnaire extends DomainResource {

    public static final String resourceType = "Questionnaire";

    // Logical URI to reference this questionnaire (globally unique).
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

    // The status of this questionnaire. Enables tracking the life-cycle of the content.
    @Json(name = "status")
    public CodeSystemPublicationStatus status;

    // For testing purposes, not real usage.
    @Json(name = "experimental")
    @Nullable
    public Boolean experimental;

    // Date this was last changed.
    @Json(name = "date")
    @Nullable
    public FhirDateTime date;

    // Name of the publisher (organization or individual).
    @Json(name = "publisher")
    @Nullable
    public String publisher;

    // Natural language description of the questionnaire.
    @Json(name = "description")
    @Nullable
    public String description;

    // Why this questionnaire is defined.
    @Json(name = "purpose")
    @Nullable
    public String purpose;

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

    // Context the content is intended to support.
    @Json(name = "useContext")
    @Nullable
    public List<UsageContext> useContext;

    // Intended jurisdiction for questionnaire (if applicable).
    @Json(name = "jurisdiction")
    @Nullable
    public List<CodeableConcept> jurisdiction;

    // Contact details for the publisher.
    @Json(name = "contact")
    @Nullable
    public List<ContactDetail> contact;

    // Use and/or publishing restrictions.
    @Json(name = "copyright")
    @Nullable
    public String copyright;

    // Concept that represents the overall questionnaire.
    @Json(name = "code")
    @Nullable
    public List<Coding> code;

    // The types of subjects that can be the subject of responses created for the questionnaire.
    @Json(name = "subjectType")
    @Nullable
    public List<CodeSystemResourceType> subjectType;

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
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire) on
     * 2020-10-21
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
        @Json(name = "options")
        @Nullable
        public Reference options;

        // Permitted answer.
        @Json(name = "option")
        @Nullable
        public List<QuestionnaireItemOption> option;

        // Default value when item is first rendered.
        @Json(name = "initialBoolean")
        @Nullable
        public Boolean initialBoolean;

        // Default value when item is first rendered.
        @Json(name = "initialDecimal")
        @Nullable
        public FhirDecimal initialDecimal;

        // Default value when item is first rendered.
        @Json(name = "initialInteger")
        @Nullable
        public Integer initialInteger;

        // Default value when item is first rendered.
        @Json(name = "initialDate")
        @Nullable
        public FhirDate initialDate;

        // Default value when item is first rendered.
        @Json(name = "initialDateTime")
        @Nullable
        public FhirDateTime initialDateTime;

        // Default value when item is first rendered.
        @Json(name = "initialTime")
        @Nullable
        public FhirTime initialTime;

        // Default value when item is first rendered.
        @Json(name = "initialString")
        @Nullable
        public String initialString;

        // Default value when item is first rendered.
        @Json(name = "initialUri")
        @Nullable
        public String initialUri;

        // Default value when item is first rendered.
        @Json(name = "initialAttachment")
        @Nullable
        public Attachment initialAttachment;

        // Default value when item is first rendered.
        @Json(name = "initialCoding")
        @Nullable
        public Coding initialCoding;

        // Default value when item is first rendered.
        @Json(name = "initialQuantity")
        @Nullable
        public Quantity initialQuantity;

        // Default value when item is first rendered.
        @Json(name = "initialReference")
        @Nullable
        public Reference initialReference;

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
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be
     * captured) when the specified condition is true.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire) on
     * 2020-10-21
     */
    public static class QuestionnaireItemEnableWhen extends BackboneElement {

        public static final String resourceType = "QuestionnaireItemEnableWhen";

        // Question that determines whether item is enabled.
        @Json(name = "question")
        public String question;

        // Enable when answered or not.
        @Json(name = "hasAnswer")
        @Nullable
        public Boolean hasAnswer;

        // Value question must have.
        @Json(name = "answerBoolean")
        @Nullable
        public Boolean answerBoolean;

        // Value question must have.
        @Json(name = "answerDecimal")
        @Nullable
        public FhirDecimal answerDecimal;

        // Value question must have.
        @Json(name = "answerInteger")
        @Nullable
        public Integer answerInteger;

        // Value question must have.
        @Json(name = "answerDate")
        @Nullable
        public FhirDate answerDate;

        // Value question must have.
        @Json(name = "answerDateTime")
        @Nullable
        public FhirDateTime answerDateTime;

        // Value question must have.
        @Json(name = "answerTime")
        @Nullable
        public FhirTime answerTime;

        // Value question must have.
        @Json(name = "answerString")
        @Nullable
        public String answerString;

        // Value question must have.
        @Json(name = "answerUri")
        @Nullable
        public String answerUri;

        // Value question must have.
        @Json(name = "answerAttachment")
        @Nullable
        public Attachment answerAttachment;

        // Value question must have.
        @Json(name = "answerCoding")
        @Nullable
        public Coding answerCoding;

        // Value question must have.
        @Json(name = "answerQuantity")
        @Nullable
        public Quantity answerQuantity;

        // Value question must have.
        @Json(name = "answerReference")
        @Nullable
        public Reference answerReference;


        /**
         * Constructor for all required properties.
         *
         * @param question String
         */
        public QuestionnaireItemEnableWhen(String question) {
            this.question = question;
        }

        @Override
        public String getResourceType() {
            return QuestionnaireItemEnableWhen.resourceType;
        }


    }


    /**
     * Questionnaire.java
     * <p>
     * One of the permitted answers for a "choice" or "open-choice" question.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire) on
     * 2020-10-21
     */
    public static class QuestionnaireItemOption extends BackboneElement {

        public static final String resourceType = "QuestionnaireItemOption";

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


        /**
         * Constructor for all required properties.
         *
         * @param value as one of Coding, FhirDate, Integer, String, FhirTime*
         */
        public QuestionnaireItemOption(Object value) {
            if (value instanceof Coding) {
                this.valueCoding = (Coding) value;
            } else if (value instanceof FhirDate) {
                this.valueDate = (FhirDate) value;
            } else if (value instanceof Integer) {
                this.valueInteger = (Integer) value;
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
            return QuestionnaireItemOption.resourceType;
        }


    }


}
