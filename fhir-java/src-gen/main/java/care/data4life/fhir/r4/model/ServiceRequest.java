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
 * ServiceRequest.java
 * <p>
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ServiceRequest">ServiceRequest</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ServiceRequest) on 2021-04-07
 */
public class ServiceRequest extends DomainResource {

    public static final String resourceType = "ServiceRequest";

    // Identifiers assigned to this order.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Instantiates FHIR protocol or definition.
    @Json(name = "instantiatesCanonical")
    @Nullable
    public List<Canonical> instantiatesCanonical;

    // Instantiates external protocol or definition.
    @Json(name = "instantiatesUri")
    @Nullable
    public List<String> instantiatesUri;

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

    // Classification of service.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
    @Json(name = "priority")
    @Nullable
    public CodeSystemRequestPriority priority;

    // True if service/procedure should not be performed.
    @Json(name = "doNotPerform")
    @Nullable
    public Boolean doNotPerform;

    // What is being requested/ordered.
    @Json(name = "code")
    @Nullable
    public CodeableConcept code;

    // Additional order information.
    @Json(name = "orderDetail")
    @Nullable
    public List<CodeableConcept> orderDetail;

    // Service amount.
    @Json(name = "quantityQuantity")
    @Nullable
    public Quantity quantityQuantity;

    // Service amount.
    @Json(name = "quantityRatio")
    @Nullable
    public Ratio quantityRatio;

    // Service amount.
    @Json(name = "quantityRange")
    @Nullable
    public Range quantityRange;

    // Individual or Entity the service is ordered for.
    @Json(name = "subject")
    public Reference subject;

    // Encounter in which the request was created.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // When service should occur.
    @Json(name = "occurrenceDateTime")
    @Nullable
    public FhirDateTime occurrenceDateTime;

    // When service should occur.
    @Json(name = "occurrencePeriod")
    @Nullable
    public Period occurrencePeriod;

    // When service should occur.
    @Json(name = "occurrenceTiming")
    @Nullable
    public Timing occurrenceTiming;

    // Preconditions for service.
    @Json(name = "asNeededBoolean")
    @Nullable
    public Boolean asNeededBoolean;

    // Preconditions for service.
    @Json(name = "asNeededCodeableConcept")
    @Nullable
    public CodeableConcept asNeededCodeableConcept;

    // Date request signed.
    @Json(name = "authoredOn")
    @Nullable
    public FhirDateTime authoredOn;

    // Who/what is requesting service.
    @Json(name = "requester")
    @Nullable
    public Reference requester;

    // Performer role.
    @Json(name = "performerType")
    @Nullable
    public CodeableConcept performerType;

    // Requested performer.
    @Json(name = "performer")
    @Nullable
    public List<Reference> performer;

    // Requested location.
    @Json(name = "locationCode")
    @Nullable
    public List<CodeableConcept> locationCode;

    // Requested location.
    @Json(name = "locationReference")
    @Nullable
    public List<Reference> locationReference;

    // Explanation/Justification for procedure or service.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Explanation/Justification for service or service.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Associated insurance coverage.
    @Json(name = "insurance")
    @Nullable
    public List<Reference> insurance;

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

    // Patient or consumer-oriented instructions.
    @Json(name = "patientInstruction")
    @Nullable
    public String patientInstruction;

    // Request provenance.
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
    public ServiceRequest(CodeSystemRequestStatus status, CodeSystemRequestIntent intent, Reference subject) {
        this.status = status;
        this.intent = intent;
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return ServiceRequest.resourceType;
    }


}
