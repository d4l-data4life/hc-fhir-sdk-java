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
 * Provenance.java
 * <p>
 * Provenance of a resource is a record that describes entities and processes involved in producing
 * and delivering or otherwise influencing that resource. Provenance provides a critical foundation
 * for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions
 * are a form of contextual metadata and can themselves become important records with their own
 * provenance. Provenance statement indicates clinical significance in terms of confidence in
 * authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document
 * Completion - has the artifact been legally authenticated), all of which may impact security,
 * privacy, and trust policies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Provenance">Provenance</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Provenance) on
 * 2020-10-21
 */
public class Provenance extends DomainResource {

    public static final String resourceType = "Provenance";

    // Target Reference(s) (usually version specific).
    @Json(name = "target")
    public List<Reference> target;

    // When the activity occurred.
    @Json(name = "occurredPeriod")
    @Nullable
    public Period occurredPeriod;

    // When the activity occurred.
    @Json(name = "occurredDateTime")
    @Nullable
    public FhirDateTime occurredDateTime;

    // When the activity was recorded / updated.
    @Json(name = "recorded")
    public FhirInstant recorded;

    // Policy or plan the activity was defined by.
    @Json(name = "policy")
    @Nullable
    public List<String> policy;

    // Where the activity occurred, if relevant.
    @Json(name = "location")
    @Nullable
    public Reference location;

    // Reason the activity is occurring.
    @Json(name = "reason")
    @Nullable
    public List<CodeableConcept> reason;

    // Activity that occurred.
    @Json(name = "activity")
    @Nullable
    public CodeableConcept activity;

    // Actor involved.
    @Json(name = "agent")
    public List<ProvenanceAgent> agent;

    // An entity used in this activity.
    @Json(name = "entity")
    @Nullable
    public List<ProvenanceEntity> entity;

    // Signature on target.
    @Json(name = "signature")
    @Nullable
    public List<Signature> signature;


    /**
     * Constructor for all required properties.
     *
     * @param target   List of Reference
     * @param recorded FhirInstant
     * @param agent    List of ProvenanceAgent
     */
    public Provenance(List<Reference> target, FhirInstant recorded, List<ProvenanceAgent> agent) {
        this.target = target;
        this.recorded = recorded;
        this.agent = agent;
    }

    @Override
    public String getResourceType() {
        return Provenance.resourceType;
    }


    /**
     * Provenance.java
     * <p>
     * An actor taking a role in an activity  for which it can be assigned some degree of
     * responsibility for the activity taking place.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Provenance">Provenance</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Provenance) on
     * 2020-10-21
     */
    public static class ProvenanceAgent extends BackboneElement {

        public static final String resourceType = "ProvenanceAgent";

        // How the agent participated.
        @Json(name = "type")
        @Nullable
        public CodeableConcept type;

        // What the agents role was.
        @Json(name = "role")
        @Nullable
        public List<CodeableConcept> role;

        // Who participated.
        @Json(name = "who")
        public Reference who;

        // Who the agent is representing.
        @Json(name = "onBehalfOf")
        @Nullable
        public Reference onBehalfOf;


        /**
         * Constructor for all required properties.
         *
         * @param who Reference
         */
        public ProvenanceAgent(Reference who) {
            this.who = who;
        }

        @Override
        public String getResourceType() {
            return ProvenanceAgent.resourceType;
        }


    }


    /**
     * Provenance.java
     * <p>
     * An entity used in this activity
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Provenance">Provenance</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Provenance) on
     * 2020-10-21
     */
    public static class ProvenanceEntity extends BackboneElement {

        public static final String resourceType = "ProvenanceEntity";

        // How the entity was used during the activity.
        @Json(name = "role")
        public CodeSystemProvenanceEntityRole role;

        // Identity of entity.
        @Json(name = "what")
        public Reference what;

        // Entity is attributed to this agent.
        @Json(name = "agent")
        @Nullable
        public List<ProvenanceAgent> agent;


        /**
         * Constructor for all required properties.
         *
         * @param role CodeSystemProvenanceEntityRole
         * @param what Reference
         */
        public ProvenanceEntity(CodeSystemProvenanceEntityRole role, Reference what) {
            this.role = role;
            this.what = what;
        }

        @Override
        public String getResourceType() {
            return ProvenanceEntity.resourceType;
        }


    }


}
