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
 * Consent.java
 * <p>
 * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or
 * recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
public class Consent extends DomainResource {

    public static final String resourceType = "Consent";

    // Identifier for this record (external references).
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Indicates the current state of this consent.
    @Json(name = "status")
    public CodeSystemConsentState status;

    // Which of the four areas this resource covers (extensible).
    @Json(name = "scope")
    public CodeableConcept scope;

    // Classification of the consent statement - for indexing/retrieval.
    @Json(name = "category")
    public List<CodeableConcept> category;

    // Who the consent applies to.
    @Json(name = "patient")
    @Nullable
    public Reference patient;

    // When this Consent was created or indexed.
    @Json(name = "dateTime")
    @Nullable
    public FhirDateTime dateTime;

    // Who is agreeing to the policy and rules.
    @Json(name = "performer")
    @Nullable
    public List<Reference> performer;

    // Custodian of the consent.
    @Json(name = "organization")
    @Nullable
    public List<Reference> organization;

    // Source from which this consent is taken.
    @Json(name = "sourceAttachment")
    @Nullable
    public Attachment sourceAttachment;

    // Source from which this consent is taken.
    @Json(name = "sourceReference")
    @Nullable
    public Reference sourceReference;

    // Policies covered by this consent.
    @Json(name = "policy")
    @Nullable
    public List<ConsentPolicy> policy;

    // Regulation that this consents to.
    @Json(name = "policyRule")
    @Nullable
    public CodeableConcept policyRule;

    // Consent Verified by patient or family.
    @Json(name = "verification")
    @Nullable
    public List<ConsentVerification> verification;

    // Constraints to the base Consent.policyRule.
    @Json(name = "provision")
    @Nullable
    public ConsentProvision provision;


    /**
     * Constructor for all required properties.
     *
     * @param status   CodeSystemConsentState
     * @param scope    CodeableConcept
     * @param category List of CodeableConcept
     */
    public Consent(CodeSystemConsentState status, CodeableConcept scope, List<CodeableConcept> category) {
        this.status = status;
        this.scope = scope;
        this.category = category;
    }

    @Override
    public String getResourceType() {
        return Consent.resourceType;
    }


    /**
     * Consent.java
     * <p>
     * The references to the policies that are included in this consent scope. Policies may be
     * organizational, but are often defined jurisdictionally, or in law.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
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


    /**
     * Consent.java
     * <p>
     * An exception to the base policy of this consent. An exception can be an addition or removal
     * of access permissions.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentProvision extends BackboneElement {

        public static final String resourceType = "ConsentProvision";

        // Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
        @Json(name = "type")
        @Nullable
        public CodeSystemConsentProvisionType type;

        // Timeframe for this rule.
        @Json(name = "period")
        @Nullable
        public Period period;

        // Who|what controlled by this rule (or group, by role).
        @Json(name = "actor")
        @Nullable
        public List<ConsentProvisionActor> actor;

        // Actions controlled by this rule.
        @Json(name = "action")
        @Nullable
        public List<CodeableConcept> action;

        // Security Labels that define affected resources.
        @Json(name = "securityLabel")
        @Nullable
        public List<Coding> securityLabel;

        // Context of activities covered by this rule.
        @Json(name = "purpose")
        @Nullable
        public List<Coding> purpose;

        // e.g. Resource Type, Profile, CDA, etc..
        @Json(name = "class")
        @Nullable
        public List<Coding> clazz;

        // e.g. LOINC or SNOMED CT code, etc. in the content.
        @Json(name = "code")
        @Nullable
        public List<CodeableConcept> code;

        // Timeframe for data controlled by this rule.
        @Json(name = "dataPeriod")
        @Nullable
        public Period dataPeriod;

        // Data controlled by this rule.
        @Json(name = "data")
        @Nullable
        public List<ConsentProvisionData> data;

        // Nested Exception Rules.
        @Json(name = "provision")
        @Nullable
        public List<ConsentProvision> provision;


        public ConsentProvision() {
        }

        @Override
        public String getResourceType() {
            return ConsentProvision.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * Who or what is controlled by this rule. Use group to identify a set of actors by some
     * property they share (e.g. 'admitting officers').
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentProvisionActor extends BackboneElement {

        public static final String resourceType = "ConsentProvisionActor";

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
        public ConsentProvisionActor(CodeableConcept role, Reference reference) {
            this.role = role;
            this.reference = reference;
        }

        @Override
        public String getResourceType() {
            return ConsentProvisionActor.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * The resources controlled by this rule if specific resources are referenced.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentProvisionData extends BackboneElement {

        public static final String resourceType = "ConsentProvisionData";

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
        public ConsentProvisionData(CodeSystemConsentDataMeaning meaning, Reference reference) {
            this.meaning = meaning;
            this.reference = reference;
        }

        @Override
        public String getResourceType() {
            return ConsentProvisionData.resourceType;
        }


    }


    /**
     * Consent.java
     * <p>
     * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the
     * patient, his/her family or another authorized person.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
     */
    public static class ConsentVerification extends BackboneElement {

        public static final String resourceType = "ConsentVerification";

        // Has been verified.
        @Json(name = "verified")
        public Boolean verified;

        // Person who verified.
        @Json(name = "verifiedWith")
        @Nullable
        public Reference verifiedWith;

        // When consent verified.
        @Json(name = "verificationDate")
        @Nullable
        public FhirDateTime verificationDate;


        /**
         * Constructor for all required properties.
         *
         * @param verified Boolean
         */
        public ConsentVerification(Boolean verified) {
            this.verified = verified;
        }

        @Override
        public String getResourceType() {
            return ConsentVerification.resourceType;
        }


    }


}
