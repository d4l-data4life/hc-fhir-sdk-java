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
 * DiagnosticReport.java
 * <p>
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReport</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport) on 2021-03-26
 */
public class DiagnosticReport extends DomainResource {

    public static final String resourceType = "DiagnosticReport";

    // Business identifier for report.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // What was requested.
    @Json(name = "basedOn")
    @Nullable
    public List<Reference> basedOn;

    // The status of the diagnostic report.
    @Json(name = "status")
    public CodeSystemDiagnosticReportStatus status;

    // Service category.
    @Json(name = "category")
    @Nullable
    public List<CodeableConcept> category;

    // Name/Code for this diagnostic report.
    @Json(name = "code")
    public CodeableConcept code;

    // The subject of the report - usually, but not always, the patient.
    @Json(name = "subject")
    @Nullable
    public Reference subject;

    // Health care event when test ordered.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // Clinically relevant time/time-period for report.
    @Json(name = "effectiveDateTime")
    @Nullable
    public FhirDateTime effectiveDateTime;

    // Clinically relevant time/time-period for report.
    @Json(name = "effectivePeriod")
    @Nullable
    public Period effectivePeriod;

    // DateTime this version was made.
    @Json(name = "issued")
    @Nullable
    public FhirInstant issued;

    // Responsible Diagnostic Service.
    @Json(name = "performer")
    @Nullable
    public List<Reference> performer;

    // Primary result interpreter.
    @Json(name = "resultsInterpreter")
    @Nullable
    public List<Reference> resultsInterpreter;

    // Specimens this report is based on.
    @Json(name = "specimen")
    @Nullable
    public List<Reference> specimen;

    // Observations.
    @Json(name = "result")
    @Nullable
    public List<Reference> result;

    // Reference to full details of imaging associated with the diagnostic report.
    @Json(name = "imagingStudy")
    @Nullable
    public List<Reference> imagingStudy;

    // Key images associated with this report.
    @Json(name = "media")
    @Nullable
    public List<DiagnosticReportMedia> media;

    // Clinical conclusion (interpretation) of test results.
    @Json(name = "conclusion")
    @Nullable
    public String conclusion;

    // Codes for the clinical conclusion of test results.
    @Json(name = "conclusionCode")
    @Nullable
    public List<CodeableConcept> conclusionCode;

    // Entire report as issued.
    @Json(name = "presentedForm")
    @Nullable
    public List<Attachment> presentedForm;


    /**
     * Constructor for all required properties.
     *
     * @param status CodeSystemDiagnosticReportStatus
     * @param code   CodeableConcept
     */
    public DiagnosticReport(CodeSystemDiagnosticReportStatus status, CodeableConcept code) {
        this.status = status;
        this.code = code;
    }

    @Override
    public String getResourceType() {
        return DiagnosticReport.resourceType;
    }


    /**
     * DiagnosticReport.java
     * <p>
     * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReport</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport) on 2021-03-26
     */
    public static class DiagnosticReportMedia extends BackboneElement {

        public static final String resourceType = "DiagnosticReportMedia";

        // Comment about the image (e.g. explanation).
        @Json(name = "comment")
        @Nullable
        public String comment;

        // Reference to the image source.
        @Json(name = "link")
        public Reference link;


        /**
         * Constructor for all required properties.
         *
         * @param link Reference
         */
        public DiagnosticReportMedia(Reference link) {
            this.link = link;
        }

        @Override
        public String getResourceType() {
            return DiagnosticReportMedia.resourceType;
        }


    }


}