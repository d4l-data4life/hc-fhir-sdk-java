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
 * DocumentReference.java
 * <p>
 * A reference to a document
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentReference) on
 * 2020-07-29
 */
public class DocumentReference extends DomainResource {

    public static final String resourceType = "DocumentReference";

    // Who/what authenticated the document.
    @Json(name = "authenticator")
    @Nullable
    public Reference authenticator;

    // Who and/or what authored the document.
    @Json(name = "author")
    @Nullable
    public List<Reference> author;

    // Categorization of document.
    @Json(name = "class")
    @Nullable
    public CodeableConcept clazz;

    // Document referenced.
    @Json(name = "content")
    public List<DocumentReferenceContent> content;

    // Clinical context of document.
    @Json(name = "context")
    @Nullable
    public DocumentReferenceContext context;

    // Document creation time.
    @Json(name = "created")
    @Nullable
    public FhirDateTime created;

    // Organization which maintains the document.
    @Json(name = "custodian")
    @Nullable
    public Reference custodian;

    // Human-readable description (title).
    @Json(name = "description")
    @Nullable
    public String description;

    // The status of the underlying document.
    @Json(name = "docStatus")
    @Nullable
    public CodeSystems.CompositionStatus docStatus;

    // Other identifiers for the document.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // When this document reference was created.
    @Json(name = "indexed")
    public FhirInstant indexed;

    // Master Version Specific Identifier.
    @Json(name = "masterIdentifier")
    @Nullable
    public Identifier masterIdentifier;

    // Relationships to other documents.
    @Json(name = "relatesTo")
    @Nullable
    public List<DocumentReferenceRelatesTo> relatesTo;

    // Document security-tags.
    @Json(name = "securityLabel")
    @Nullable
    public List<CodeableConcept> securityLabel;

    // The status of this document reference.
    @Json(name = "status")
    public CodeSystems.DocumentReferenceStatus status;

    // Who/what is the subject of the document.
    @Json(name = "subject")
    @Nullable
    public Reference subject;

    // Kind of document (LOINC if possible).
    @Json(name = "type")
    public CodeableConcept type;

    /**
     * Constructor for all required properties.
     *
     * @param content List of DocumentReferenceContent
     * @param indexed FhirInstant
     * @param status  CodeSystems.DocumentReferenceStatus
     * @param type    CodeableConcept
     */
    public DocumentReference(List<DocumentReferenceContent> content, FhirInstant indexed,
                             CodeSystems.DocumentReferenceStatus status, CodeableConcept type) {
        this.content = content;
        this.indexed = indexed;
        this.status = status;
        this.type = type;
    }

    @Override
    public String getResourceType() {
        return DocumentReference.resourceType;
    }

    /**
     * DocumentReference.java
     * <p>
     * The document and format referenced. There may be multiple content element repetitions, each
     * with a different format.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
     * on 2020-07-29
     */
    public static class DocumentReferenceContent extends BackboneElement {

        public static final String resourceType = "DocumentReferenceContent";

        // Where to access the document.
        @Json(name = "attachment")
        public Attachment attachment;

        // Format/content rules for the document.
        @Json(name = "format")
        @Nullable
        public Coding format;

        /**
         * Constructor for all required properties.
         *
         * @param attachment Attachment
         */
        public DocumentReferenceContent(Attachment attachment) {
            this.attachment = attachment;
        }

        @Override
        public String getResourceType() {
            return DocumentReferenceContent.resourceType;
        }
    }

    /**
     * DocumentReference.java
     * <p>
     * The clinical context in which the document was prepared.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
     * on 2020-07-29
     */
    public static class DocumentReferenceContext extends BackboneElement {

        public static final String resourceType = "DocumentReferenceContext";

        // Context of the document  content.
        @Json(name = "encounter")
        @Nullable
        public Reference encounter;

        // Main clinical acts documented.
        @Json(name = "event")
        @Nullable
        public List<CodeableConcept> event;

        // Kind of facility where patient was seen.
        @Json(name = "facilityType")
        @Nullable
        public CodeableConcept facilityType;

        // Time of service that is being documented.
        @Json(name = "period")
        @Nullable
        public Period period;

        // Additional details about where the content was created (e.g. clinical specialty).
        @Json(name = "practiceSetting")
        @Nullable
        public CodeableConcept practiceSetting;

        // Related identifiers or resources.
        @Json(name = "related")
        @Nullable
        public List<DocumentReferenceContextRelated> related;

        // Patient demographics from source.
        @Json(name = "sourcePatientInfo")
        @Nullable
        public Reference sourcePatientInfo;

        public DocumentReferenceContext() {
        }

        @Override
        public String getResourceType() {
            return DocumentReferenceContext.resourceType;
        }
    }

    /**
     * DocumentReference.java
     * <p>
     * Related identifiers or resources associated with the DocumentReference.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
     * on 2020-07-29
     */
    public static class DocumentReferenceContextRelated extends BackboneElement {

        public static final String resourceType = "DocumentReferenceContextRelated";

        // Identifier of related objects or events.
        @Json(name = "identifier")
        @Nullable
        public Identifier identifier;

        // Related Resource.
        @Json(name = "ref")
        @Nullable
        public Reference ref;

        public DocumentReferenceContextRelated() {
        }

        @Override
        public String getResourceType() {
            return DocumentReferenceContextRelated.resourceType;
        }
    }

    /**
     * DocumentReference.java
     * <p>
     * Relationships that this document has with other document references that already exist.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
     * on 2020-07-29
     */
    public static class DocumentReferenceRelatesTo extends BackboneElement {

        public static final String resourceType = "DocumentReferenceRelatesTo";

        // The type of relationship that this document has with anther document.
        @Json(name = "code")
        public CodeSystems.DocumentRelationshipType code;

        // Target of the relationship.
        @Json(name = "target")
        public Reference target;

        /**
         * Constructor for all required properties.
         *
         * @param code   CodeSystems.DocumentRelationshipType
         * @param target Reference
         */
        public DocumentReferenceRelatesTo(CodeSystems.DocumentRelationshipType code, Reference target) {
            this.code = code;
            this.target = target;
        }

        @Override
        public String getResourceType() {
            return DocumentReferenceRelatesTo.resourceType;
        }
    }
}
