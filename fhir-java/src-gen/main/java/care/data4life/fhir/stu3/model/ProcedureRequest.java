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
 * ProcedureRequest.java
 * <p>
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcedureRequest">ProcedureRequest</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcedureRequest) on
 * 2020-10-21
 */
public class ProcedureRequest extends DomainResource {

    public static final String resourceType = "ProcedureRequest";

    // Identifiers assigned to this order.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Protocol or definition.
    @Json(name = "definition")
    @Nullable
    public List<Reference> definition;

    // What request fulfills.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // What request replaces.
    @Json(name = "replaces")
    @Nullable
    public List<Reference> replaces;

    // Composite Request ID.
    @Json(name = "requisition")
    @Nullable
    public Identifier requisition;

    // The status of the order.
    @Json(name = "status")
    public CodeSystemRequestStatus status;

    // Whether the request is a proposal, plan, an original order or a reflex order.
    @Json(name = "intent")
    public CodeSystemRequestIntent intent;

    // Indicates how quickly the ProcedureRequest should be addressed with respect to other requests.
    @Json(name = "priority")
    @Nullable
    public CodeSystemRequestPriority priority;

    // True if procedure should not be performed.
    @Json(name = "doNotPerform")
    @Nullable
    public Boolean doNotPerform;

    // Classification of procedure.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // What is being requested/ordered.
    @Json(name = "code")
    public CodeableConcept code;

    // Individual the service is ordered for.
    @Json(name = "subject")
    public Reference subject;

    // Encounter or Episode during which request was created.
    @Json(name = "context")
    @Nullable
    public Reference context;

    // When procedure should occur.
    @Json(name = "occurrenceDateTime")
    @Nullable
    public FhirDateTime occurrenceDateTime;

    // When procedure should occur.
    @Json(name = "occurrencePeriod")
    @Nullable
    public Period occurrencePeriod;

    // When procedure should occur.
    @Json(name = "occurrenceTiming")
    @Nullable
    public Timing occurrenceTiming;

    // Preconditions for procedure or diagnostic.
    @Json(name = "asNeededBoolean")
    @Nullable
    public Boolean asNeededBoolean;

    // Preconditions for procedure or diagnostic.
    @Json(name = "asNeededCodeableConcept")
    @Nullable
    public CodeableConcept asNeededCodeableConcept;

    // Date request signed.
    @Json(name = "authoredOn")
    @Nullable
    public FhirDateTime authoredOn;

    // Who/what is requesting procedure or diagnostic.
    @Json(name = "requester")
    @Nullable
    public ProcedureRequestRequester requester;

    // Performer role.
    @Json(name = "performerType")
    @Nullable
    public CodeableConcept performerType;

    // Requested perfomer.
    @Json(name = "performer")
    @Nullable
    public Reference performer;

    // Explanation/Justification for test.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Explanation/Justification for test.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Additional clinical information.
    @Json(name = "supportingInfo")
    @Nullable
    public List<Reference> supportingInfo;

    // Procedure Samples.
    @Json(name = "specimen")
    @Nullable
    public List<Reference> specimen;

    // Location on Body.
    @Json(name = "bodySite")
    @Nullable
    public List<CodeableConcept> bodySite;

    // Comments.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Request provenance.
    @Json(name = "relevantHistory")
    @Nullable
    public List<Reference> relevantHistory;


    /**
     * Constructor for all required properties.
     *
     * @param status  CodeSystemRequestStatus
     * @param intent  CodeSystemRequestIntent
     * @param code    CodeableConcept
     * @param subject Reference
     */
    public ProcedureRequest(CodeSystemRequestStatus status, CodeSystemRequestIntent intent, CodeableConcept code, Reference subject) {
        this.status = status;
        this.intent = intent;
        this.code = code;
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return ProcedureRequest.resourceType;
    }


    /**
     * ProcedureRequest.java
     * <p>
     * The individual who initiated the request and has responsibility for its activation.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcedureRequest">ProcedureRequest</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcedureRequest) on
     * 2020-10-21
     */
    public static class ProcedureRequestRequester extends BackboneElement {

        public static final String resourceType = "ProcedureRequestRequester";

        // Individual making the request.
        @Json(name = "agent")
        public Reference agent;

        // Organization agent is acting for.
        @Json(name = "onBehalfOf")
        @Nullable
        public Reference onBehalfOf;


        /**
         * Constructor for all required properties.
         *
         * @param agent Reference
         */
        public ProcedureRequestRequester(Reference agent) {
            this.agent = agent;
        }

        @Override
        public String getResourceType() {
            return ProcedureRequestRequester.resourceType;
        }


    }


}
