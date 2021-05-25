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
 * DeviceUseStatement.java
 * <p>
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceUseStatement">DeviceUseStatement</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceUseStatement)
 */
public class DeviceUseStatement extends DomainResource {

    public static final String resourceType = "DeviceUseStatement";

    // External identifier for this record.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Fulfills plan, proposal or order.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed.
    @Json(name = "status")
    public CodeSystemDeviceUseStatementStatus status;

    // Patient using device.
    @Json(name = "subject")
    public Reference subject;

    // Supporting information.
    @Json(name = "derivedFrom")
    @Nullable
    public List<Reference> derivedFrom;

    // How often  the device was used.
    @Json(name = "timingTiming")
    @Nullable
    public Timing timingTiming;

    // How often  the device was used.
    @Json(name = "timingPeriod")
    @Nullable
    public Period timingPeriod;

    // How often  the device was used.
    @Json(name = "timingDateTime")
    @Nullable
    public FhirDateTime timingDateTime;

    // When statement was recorded.
    @Json(name = "recordedOn")
    @Nullable
    public FhirDateTime recordedOn;

    // Who made the statement.
    @Json(name = "source")
    @Nullable
    public Reference source;

    // Reference to device used.
    @Json(name = "device")
    public Reference device;

    // Why device was used.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why was DeviceUseStatement performed?.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Target body site.
    @Json(name = "bodySite")
    @Nullable
    public CodeableConcept bodySite;

    // Addition details (comments, instructions).
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;


    /**
     * Constructor for all required properties.
     *
     * @param status  CodeSystemDeviceUseStatementStatus
     * @param subject Reference
     * @param device  Reference
     */
    public DeviceUseStatement(CodeSystemDeviceUseStatementStatus status, Reference subject, Reference device) {
        this.status = status;
        this.subject = subject;
        this.device = device;
    }

    @Override
    public String getResourceType() {
        return DeviceUseStatement.resourceType;
    }


}
