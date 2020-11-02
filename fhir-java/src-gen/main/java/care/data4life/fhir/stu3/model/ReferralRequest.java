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
 * 2020-10-27
 */
public class ReferralRequest extends DomainResource {

    public static final String resourceType = "ReferralRequest";

    // Business identifier.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Instantiates protocol or definition.
    @Json(name = "definition")
    @Nullable
    public List<Reference> definition;

    // Request fulfilled by this request.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Request(s) replaced by this request.
    @Json(name = "replaces")
    @Nullable
    public List<Reference> replaces;

    // Composite request this is part of.
    @Json(name = "groupIdentifier")
    @Nullable
    public Identifier groupIdentifier;

    // The status of the authorization/intention reflected by the referral request record.
    @Json(name = "status")
    public CodeSystemRequestStatus status;

    // Distinguishes the "level" of authorization/demand implicit in this request.
    @Json(name = "intent")
    public CodeSystemRequestIntent intent;

    // Referral/Transition of care request type.
    @Json(name = "type")
    @Nullable
    public CodeableConcept type;

    // An indication of the urgency of referral (or where applicable the type of transfer of care) request.
    @Json(name = "priority")
    @Nullable
    public CodeSystemRequestPriority priority;

    // Actions requested as part of the referral.
    @Json(name = "serviceRequested")
    @Nullable
    public List<CodeableConcept> serviceRequested;

    // Patient referred to care or transfer.
    @Json(name = "subject")
    public Reference subject;

    // Originating encounter.
    @Json(name = "context")
    @Nullable
    public Reference context;

    // When the service(s) requested in the referral should occur.
    @Json(name = "occurrenceDateTime")
    @Nullable
    public FhirDateTime occurrenceDateTime;

    // When the service(s) requested in the referral should occur.
    @Json(name = "occurrencePeriod")
    @Nullable
    public Period occurrencePeriod;

    // Date of creation/activation.
    @Json(name = "authoredOn")
    @Nullable
    public FhirDateTime authoredOn;

    // Who/what is requesting service.
    @Json(name = "requester")
    @Nullable
    public ReferralRequestRequester requester;

    // The clinical specialty (discipline) that the referral is requested for.
    @Json(name = "specialty")
    @Nullable
    public CodeableConcept specialty;

    // Receiver of referral / transfer of care request.
    @Json(name = "recipient")
    @Nullable
    public List<Reference> recipient;

    // Reason for referral / transfer of care request.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why is service needed?.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // A textual description of the referral.
    @Json(name = "description")
    @Nullable
    public String description;

    // Additonal information to support referral or transfer of care request.
    @Json(name = "supportingInfo")
    @Nullable
    public List<Reference> supportingInfo;

    // Comments made about referral request.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Key events in history of request.
    @Json(name = "relevantHistory")
    @Nullable
    public List<Reference> relevantHistory;


    /**
     * Constructor for all required properties.
     *
     * @param status  CodeSystemRequestStatus
     * @param intent  CodeSystemRequestIntent
     * @param subject Reference
     */
    public ReferralRequest(CodeSystemRequestStatus status, CodeSystemRequestIntent intent, Reference subject) {
        this.status = status;
        this.intent = intent;
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
     * 2020-10-27
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
