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
 * ReferralRequest.java
 * <p>
 * Used to record and send details about a request for referral service or transfer of a patient to
 * the care of another provider or provider organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequest</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest) on
 * 2020-07-29
 */
public class ReferralRequest extends DomainResource {

    public static final String resourceType = "ReferralRequest";

    // Date of creation/activation.
    @Json(name = "authoredOn")
    @Nullable
    public FhirDateTime authoredOn;

    // Request fulfilled by this request.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Originating encounter.
    @Json(name = "context")
    @Nullable
    public Reference context;

    // Instantiates protocol or definition.
    @Json(name = "definition")
    @Nullable
    public List<Reference> definition;

    // A textual description of the referral.
    @Json(name = "description")
    @Nullable
    public String description;

    // Composite request this is part of.
    @Json(name = "groupIdentifier")
    @Nullable
    public Identifier groupIdentifier;

    // Business identifier.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Distinguishes the "level" of authorization/demand implicit in this request.
    @Json(name = "intent")
    public CodeSystems.RequestIntent intent;

    // Comments made about referral request.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // When the service(s) requested in the referral should occur.
    @Json(name = "occurrenceDateTime")
    @Nullable
    public FhirDateTime occurrenceDateTime;

    // When the service(s) requested in the referral should occur.
    @Json(name = "occurrencePeriod")
    @Nullable
    public Period occurrencePeriod;

    // An indication of the urgency of referral (or where applicable the type of transfer of care) request.
    @Json(name = "priority")
    @Nullable
    public CodeSystems.RequestPriority priority;

    // Reason for referral / transfer of care request.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why is service needed?.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Receiver of referral / transfer of care request.
    @Json(name = "recipient")
    @Nullable
    public List<Reference> recipient;

    // Key events in history of request.
    @Json(name = "relevantHistory")
    @Nullable
    public List<Reference> relevantHistory;

    // Request(s) replaced by this request.
    @Json(name = "replaces")
    @Nullable
    public List<Reference> replaces;

    // Who/what is requesting service.
    @Json(name = "requester")
    @Nullable
    public ReferralRequestRequester requester;

    // Actions requested as part of the referral.
    @Json(name = "serviceRequested")
    @Nullable
    public List<CodeableConcept> serviceRequested;

    // The clinical specialty (discipline) that the referral is requested for.
    @Json(name = "specialty")
    @Nullable
    public CodeableConcept specialty;

    // The status of the authorization/intention reflected by the referral request record.
    @Json(name = "status")
    public CodeSystems.RequestStatus status;

    // Patient referred to care or transfer.
    @Json(name = "subject")
    public Reference subject;

    // Additonal information to support referral or transfer of care request.
    @Json(name = "supportingInfo")
    @Nullable
    public List<Reference> supportingInfo;

    // Referral/Transition of care request type.
    @Json(name = "type")
    @Nullable
    public CodeableConcept type;

    /**
     * Constructor for all required properties.
     *
     * @param intent  CodeSystems.RequestIntent
     * @param status  CodeSystems.RequestStatus
     * @param subject Reference
     */
    public ReferralRequest(CodeSystems.RequestIntent intent, CodeSystems.RequestStatus status,
                           Reference subject) {
        this.intent = intent;
        this.status = status;
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return ReferralRequest.resourceType;
    }

    /**
     * ReferralRequest.java
     * <p>
     * The individual who initiated the request and has responsibility for its activation.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequest</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest) on
     * 2020-07-29
     */
    public static class ReferralRequestRequester extends BackboneElement {

        public static final String resourceType = "ReferralRequestRequester";

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
        public ReferralRequestRequester(Reference agent) {
            this.agent = agent;
        }

        @Override
        public String getResourceType() {
            return ReferralRequestRequester.resourceType;
        }
    }
}
