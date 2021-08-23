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
 * Consent.java
 * <p>
 * A record of a healthcare consumer’s policy choices, which permits or denies identified
 * recipient(s) or recipient role(s) to perform one or more actions within a given policy context,
 * for specific purposes and periods of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
public class Consent extends DomainResource {

    public static final String resourceType = "Consent";

    // Identifier for this record (external references).
    @Json(name = "identifier")
    @Nullable
    public Identifier identifier;

    // Indicates the current state of this consent.
    @Json(name = "status")
    public CodeSystemConsentState status;

    // Classification of the consent statement - for indexing/retrieval.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Who the consent applies to.
    @Json(name = "patient")
    public Reference patient;

    // Period that this consent applies.
    @Json(name = "period")
    @Nullable
    public Period period;

    // When this Consent was created or indexed.
    @Json(name = "dateTime")
    @Nullable
    public FhirDateTime dateTime;

    // Who is agreeing to the policy and exceptions.
    @Json(name = "consentingParty")
    @Nullable
    public List<Reference> consentingParty;

    // Who|what controlled by this consent (or group, by role).
    @Json(name = "actor")
    @Nullable
    public List<ConsentActor> actor;

    // Actions controlled by this consent.
    @Json(name = "action")
    @Nullable
    public List<CodeableConcept> action;

    // Custodian of the consent.
    @Json(name = "organization")
    @Nullable
    public List<Reference> organization;

    // Source from which this consent is taken.
    @Json(name = "sourceAttachment")
    @Nullable
    public Attachment sourceAttachment;

    // Source from which this consent is taken.
    @Json(name = "sourceIdentifier")
    @Nullable
    public Identifier sourceIdentifier;

    // Source from which this consent is taken.
    @Json(name = "sourceReference")
    @Nullable
    public Reference sourceReference;

    // Policies covered by this consent.
    @Json(name = "policy")
    @Nullable
    public List<ConsentPolicy> policy;

    // Policy that this consents to.
    @Json(name = "policyRule")
    @Nullable
    public String policyRule;

    // Security Labels that define affected resources.
    @Json(name = "securityLabel")
    @Nullable
    public List<Coding> securityLabel;

    // Context of activities for which the agreement is made.
    @Json(name = "purpose")
    @Nullable
    public List<Coding> purpose;

    // Timeframe for data controlled by this consent.
    @Json(name = "dataPeriod")
    @Nullable
    public Period dataPeriod;

    // Data controlled by this consent.
    @Json(name = "data")
    @Nullable
    public List<ConsentData> data;

    // Additional rule -  addition or removal of permissions.
    @Json(name = "except")
    @Nullable
    public List<ConsentExcept> except;


    /**
     * Constructor for all required properties.
     *
     * @param status  CodeSystemConsentState
     * @param patient Reference
     */
    public Consent(CodeSystemConsentState status, Reference patient) {
        this.status = status;
        this.patient = patient;
    }

    @Override
    public String getResourceType() {
        return Consent.resourceType;
    }


    /**
     * Consent.java
     * <p>
     * Who or what is controlled by this consent. Use group to identify a set of actors by some
     * property they share (e.g. 'admitting officers').
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentActor extends BackboneElement {

        public static final String resourceType = "ConsentActor";

        // How the actor is involved.
        @Json(name = "role")
        public CodeableConcept role;

        // Resource for the actor (or group, by role).
        @Json(name = "reference")
        public Reference reference;


        /**
         * Constructor for all required properties.
         *
         * @param role      CodeableConcept
         * @param reference Reference
         */
        public ConsentActor(CodeableConcept role, Reference reference) {
            this.role = role;
            this.reference = reference;
        }

        @Override
        public String getResourceType() {
            return ConsentActor.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * The resources controlled by this consent, if specific resources are referenced.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentData extends BackboneElement {

        public static final String resourceType = "ConsentData";

        // How the resource reference is interpreted when testing consent restrictions.
        @Json(name = "meaning")
        public CodeSystemConsentDataMeaning meaning;

        // The actual data reference.
        @Json(name = "reference")
        public Reference reference;


        /**
         * Constructor for all required properties.
         *
         * @param meaning   CodeSystemConsentDataMeaning
         * @param reference Reference
         */
        public ConsentData(CodeSystemConsentDataMeaning meaning, Reference reference) {
            this.meaning = meaning;
            this.reference = reference;
        }

        @Override
        public String getResourceType() {
            return ConsentData.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * An exception to the base policy of this consent. An exception can be an addition or removal
     * of access permissions.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentExcept extends BackboneElement {

        public static final String resourceType = "ConsentExcept";

        // Action  to take - permit or deny - when the exception conditions are met.
        @Json(name = "type")
        public CodeSystemConsentExceptType type;

        // Timeframe for this exception.
        @Json(name = "period")
        @Nullable
        public Period period;

        // Who|what controlled by this exception (or group, by role).
        @Json(name = "actor")
        @Nullable
        public List<ConsentExceptActor> actor;

        // Actions controlled by this exception.
        @Json(name = "action")
        @Nullable
        public List<CodeableConcept> action;

        // Security Labels that define affected resources.
        @Json(name = "securityLabel")
        @Nullable
        public List<Coding> securityLabel;

        // Context of activities covered by this exception.
        @Json(name = "purpose")
        @Nullable
        public List<Coding> purpose;

        // e.g. Resource Type, Profile, or CDA etc.
        @Json(name = "class")
        @Nullable
        public List<Coding> clazz;

        // e.g. LOINC or SNOMED CT code, etc in the content.
        @Json(name = "code")
        @Nullable
        public List<Coding> code;

        // Timeframe for data controlled by this exception.
        @Json(name = "dataPeriod")
        @Nullable
        public Period dataPeriod;

        // Data controlled by this exception.
        @Json(name = "data")
        @Nullable
        public List<ConsentExceptData> data;


        /**
         * Constructor for all required properties.
         *
         * @param type CodeSystemConsentExceptType
         */
        public ConsentExcept(CodeSystemConsentExceptType type) {
            this.type = type;
        }

        @Override
        public String getResourceType() {
            return ConsentExcept.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * Who or what is controlled by this Exception. Use group to identify a set of actors by some
     * property they share (e.g. 'admitting officers').
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentExceptActor extends BackboneElement {

        public static final String resourceType = "ConsentExceptActor";

        // How the actor is involved.
        @Json(name = "role")
        public CodeableConcept role;

        // Resource for the actor (or group, by role).
        @Json(name = "reference")
        public Reference reference;


        /**
         * Constructor for all required properties.
         *
         * @param role      CodeableConcept
         * @param reference Reference
         */
        public ConsentExceptActor(CodeableConcept role, Reference reference) {
            this.role = role;
            this.reference = reference;
        }

        @Override
        public String getResourceType() {
            return ConsentExceptActor.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * The resources controlled by this exception, if specific resources are referenced.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentExceptData extends BackboneElement {

        public static final String resourceType = "ConsentExceptData";

        // How the resource reference is interpreted when testing consent restrictions.
        @Json(name = "meaning")
        public CodeSystemConsentDataMeaning meaning;

        // The actual data reference.
        @Json(name = "reference")
        public Reference reference;


        /**
         * Constructor for all required properties.
         *
         * @param meaning   CodeSystemConsentDataMeaning
         * @param reference Reference
         */
        public ConsentExceptData(CodeSystemConsentDataMeaning meaning, Reference reference) {
            this.meaning = meaning;
            this.reference = reference;
        }

        @Override
        public String getResourceType() {
            return ConsentExceptData.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * The references to the policies that are included in this consent scope. Policies may be
     * organizational, but are often defined jurisdictionally, or in law.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentPolicy extends BackboneElement {

        public static final String resourceType = "ConsentPolicy";

        // Enforcement source for policy.
        @Json(name = "authority")
        @Nullable
        public String authority;

        // Specific policy covered by this consent.
        @Json(name = "uri")
        @Nullable
        public String uri;


        public ConsentPolicy() {
        }

        @Override
        public String getResourceType() {
            return ConsentPolicy.resourceType;
        }


    }


}
