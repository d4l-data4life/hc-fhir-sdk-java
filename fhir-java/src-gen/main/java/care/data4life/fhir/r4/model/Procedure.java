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

import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;

/**
 * Procedure.java
 * <p>
 * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or
 * less invasive like long term services, counseling, or hypnotherapy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure) on 2021-03-26
 */
public class Procedure extends DomainResource {

    public static final String resourceType = "Procedure";

    // External Identifiers for this procedure.
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

    // A request for this procedure.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // Part of referenced event.
    @Json(name = "partOf")
    @Nullable
    public List<Reference> partOf;

    // A code specifying the state of the procedure. Generally, this will be the in-progress or completed state.
    @Json(name = "status")
    public CodeSystemEventStatus status;

    // Reason for current status.
    @Json(name = "statusReason")
    @Nullable
    public CodeableConcept statusReason;

    // Classification of the procedure.
    @Json(name = "category")
    @Nullable
    public CodeableConcept category;

    // Identification of the procedure.
    @Json(name = "code")
    @Nullable
    public CodeableConcept code;

    // Who the procedure was performed on.
    @Json(name = "subject")
    public Reference subject;

    // Encounter created as part of.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // When the procedure was performed.
    @Json(name = "performedDateTime")
    @Nullable
    public FhirDateTime performedDateTime;

    // When the procedure was performed.
    @Json(name = "performedPeriod")
    @Nullable
    public Period performedPeriod;

    // When the procedure was performed.
    @Json(name = "performedString")
    @Nullable
    public String performedString;

    // When the procedure was performed.
    @Json(name = "performedAge")
    @Nullable
    public Age performedAge;

    // When the procedure was performed.
    @Json(name = "performedRange")
    @Nullable
    public Range performedRange;

    // Who recorded the procedure.
    @Json(name = "recorder")
    @Nullable
    public Reference recorder;

    // Person who asserts this procedure.
    @Json(name = "asserter")
    @Nullable
    public Reference asserter;

    // The people who performed the procedure.
    @Json(name = "performer")
    @Nullable
    public List<ProcedurePerformer> performer;

    // Where the procedure happened.
    @Json(name = "location")
    @Nullable
    public Reference location;

    // Coded reason procedure performed.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // The justification that the procedure was performed.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Target body sites.
    @Json(name = "bodySite")
    @Nullable
    public List<CodeableConcept> bodySite;

    // The result of procedure.
    @Json(name = "outcome")
    @Nullable
    public CodeableConcept outcome;

    // Any report resulting from the procedure.
    @Json(name = "report")
    @Nullable
    public List<Reference> report;

    // Complication following the procedure.
    @Json(name = "complication")
    @Nullable
    public List<CodeableConcept> complication;

    // A condition that is a result of the procedure.
    @Json(name = "complicationDetail")
    @Nullable
    public List<Reference> complicationDetail;

    // Instructions for follow up.
    @Json(name = "followUp")
    @Nullable
    public List<CodeableConcept> followUp;

    // Additional information about the procedure.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Manipulated, implanted, or removed device.
    @Json(name = "focalDevice")
    @Nullable
    public List<ProcedureFocalDevice> focalDevice;

    // Items used during procedure.
    @Json(name = "usedReference")
    @Nullable
    public List<Reference> usedReference;

    // Coded items used during the procedure.
    @Json(name = "usedCode")
    @Nullable
    public List<CodeableConcept> usedCode;


    /**
     * Constructor for all required properties.
     *
     * @param status  CodeSystemEventStatus
     * @param subject Reference
     */
    public Procedure(CodeSystemEventStatus status, Reference subject) {
        this.status = status;
        this.subject = subject;
    }

    @Override
    public String getResourceType() {
        return Procedure.resourceType;
    }


    /**
     * Procedure.java
     * <p>
     * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a
     * prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure) on 2021-03-26
     */
    public static class ProcedureFocalDevice extends BackboneElement {

        public static final String resourceType = "ProcedureFocalDevice";

        // Kind of change to device.
        @Json(name = "action")
        @Nullable
        public CodeableConcept action;

        // Device that was changed.
        @Json(name = "manipulated")
        public Reference manipulated;


        /**
         * Constructor for all required properties.
         *
         * @param manipulated Reference
         */
        public ProcedureFocalDevice(Reference manipulated) {
            this.manipulated = manipulated;
        }

        @Override
        public String getResourceType() {
            return ProcedureFocalDevice.resourceType;
        }


    }


    /**
     * Procedure.java
     * <p>
     * Limited to "real" people rather than equipment.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure) on 2021-03-26
     */
    public static class ProcedurePerformer extends BackboneElement {

        public static final String resourceType = "ProcedurePerformer";

        // Type of performance.
        @Json(name = "function")
        @Nullable
        public CodeableConcept function;

        // The reference to the practitioner.
        @Json(name = "actor")
        public Reference actor;

        // Organization the device or practitioner was acting for.
        @Json(name = "onBehalfOf")
        @Nullable
        public Reference onBehalfOf;


        /**
         * Constructor for all required properties.
         *
         * @param actor Reference
         */
        public ProcedurePerformer(Reference actor) {
            this.actor = actor;
        }

        @Override
        public String getResourceType() {
            return ProcedurePerformer.resourceType;
        }


    }


}