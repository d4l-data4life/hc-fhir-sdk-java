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
 * Immunization.java
 * <p>
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
public class Immunization extends DomainResource {

    public static final String resourceType = "Immunization";

    // Business identifier.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Indicates the current status of the immunization event.
    // Only use: ['completed', 'entered-in-error', 'not-done']
    @Json(name = "status")
    public CodeSystemEventStatus status;

    // Reason not done.
    @Json(name = "statusReason")
    @Nullable
    public CodeableConcept statusReason;

    // Vaccine product administered.
    @Json(name = "vaccineCode")
    public CodeableConcept vaccineCode;

    // Who was immunized.
    @Json(name = "patient")
    public Reference patient;

    // Encounter immunization was part of.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // Vaccine administration date.
    @Json(name = "occurrenceDateTime")
    @Nullable
    public FhirDateTime occurrenceDateTime;

    // Vaccine administration date.
    @Json(name = "occurrenceString")
    @Nullable
    public String occurrenceString;

    // When the immunization was first captured in the subject's record.
    @Json(name = "recorded")
    @Nullable
    public FhirDateTime recorded;

    // Indicates context the data was recorded in.
    @Json(name = "primarySource")
    @Nullable
    public Boolean primarySource;

    // Indicates the source of a secondarily reported record.
    @Json(name = "reportOrigin")
    @Nullable
    public CodeableConcept reportOrigin;

    // Where immunization occurred.
    @Json(name = "location")
    @Nullable
    public Reference location;

    // Vaccine manufacturer.
    @Json(name = "manufacturer")
    @Nullable
    public Reference manufacturer;

    // Vaccine lot number.
    @Json(name = "lotNumber")
    @Nullable
    public String lotNumber;

    // Vaccine expiration date.
    @Json(name = "expirationDate")
    @Nullable
    public FhirDate expirationDate;

    // Body site vaccine  was administered.
    @Json(name = "site")
    @Nullable
    public CodeableConcept site;

    // How vaccine entered body.
    @Json(name = "route")
    @Nullable
    public CodeableConcept route;

    // Amount of vaccine administered.
    @Json(name = "doseQuantity")
    @Nullable
    public Quantity doseQuantity;

    // Who performed event.
    @Json(name = "performer")
    @Nullable
    public List<ImmunizationPerformer> performer;

    // Additional immunization notes.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Why immunization occurred.
    @Json(name = "reasonCode")
    @Nullable
    public List<CodeableConcept> reasonCode;

    // Why immunization occurred.
    @Json(name = "reasonReference")
    @Nullable
    public List<Reference> reasonReference;

    // Dose potency.
    @Json(name = "isSubpotent")
    @Nullable
    public Boolean isSubpotent;

    // Reason for being subpotent.
    @Json(name = "subpotentReason")
    @Nullable
    public List<CodeableConcept> subpotentReason;

    // Educational material presented to patient.
    @Json(name = "education")
    @Nullable
    public List<ImmunizationEducation> education;

    // Patient eligibility for a vaccination program.
    @Json(name = "programEligibility")
    @Nullable
    public List<CodeableConcept> programEligibility;

    // Funding source for the vaccine.
    @Json(name = "fundingSource")
    @Nullable
    public CodeableConcept fundingSource;

    // Details of a reaction that follows immunization.
    @Json(name = "reaction")
    @Nullable
    public List<ImmunizationReaction> reaction;

    // Protocol followed by the provider.
    @Json(name = "protocolApplied")
    @Nullable
    public List<ImmunizationProtocolApplied> protocolApplied;


    /**
     * Constructor for all required properties.
     *
     * @param status      CodeSystemEventStatus
     * @param vaccineCode CodeableConcept
     * @param patient     Reference
     * @param occurrence  as one of FhirDateTime, String*
     */
    public Immunization(CodeSystemEventStatus status, CodeableConcept vaccineCode, Reference patient, Object occurrence) {
        this.status = status;
        this.vaccineCode = vaccineCode;
        this.patient = patient;
        if (occurrence instanceof FhirDateTime) {
            this.occurrenceDateTime = (FhirDateTime) occurrence;
        } else if (occurrence instanceof String) {
            this.occurrenceString = (String) occurrence;
        } else {
            //FIXME Type: (of: occurrence)) for property (occurrence) is invalid, ignoring")
        }
    }

    @Override
    public String getResourceType() {
        return Immunization.resourceType;
    }


    /**
     * Immunization.java
     * <p>
     * Educational material presented to the patient (or guardian) at the time of vaccine
     * administration.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
     */
    public static class ImmunizationEducation extends BackboneElement {

        public static final String resourceType = "ImmunizationEducation";

        // Educational material document identifier.
        @Json(name = "documentType")
        @Nullable
        public String documentType;

        // Educational material reference pointer.
        @Json(name = "reference")
        @Nullable
        public String reference;

        // Educational material publication date.
        @Json(name = "publicationDate")
        @Nullable
        public FhirDateTime publicationDate;

        // Educational material presentation date.
        @Json(name = "presentationDate")
        @Nullable
        public FhirDateTime presentationDate;


        public ImmunizationEducation() {
        }

        @Override
        public String getResourceType() {
            return ImmunizationEducation.resourceType;
        }


    }


    /**
     * Immunization.java
     * <p>
     * Indicates who performed the immunization event.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
     */
    public static class ImmunizationPerformer extends BackboneElement {

        public static final String resourceType = "ImmunizationPerformer";

        // What type of performance was done.
        @Json(name = "function")
        @Nullable
        public CodeableConcept function;

        // Individual or organization who was performing.
        @Json(name = "actor")
        public Reference actor;


        /**
         * Constructor for all required properties.
         *
         * @param actor Reference
         */
        public ImmunizationPerformer(Reference actor) {
            this.actor = actor;
        }

        @Override
        public String getResourceType() {
            return ImmunizationPerformer.resourceType;
        }


    }


    /**
     * Immunization.java
     * <p>
     * The protocol (set of recommendations) being followed by the provider who administered the
     * dose.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
     */
    public static class ImmunizationProtocolApplied extends BackboneElement {

        public static final String resourceType = "ImmunizationProtocolApplied";

        // Name of vaccine series.
        @Json(name = "series")
        @Nullable
        public String series;

        // Who is responsible for publishing the recommendations.
        @Json(name = "authority")
        @Nullable
        public Reference authority;

        // Vaccine preventatable disease being targetted.
        @Json(name = "targetDisease")
        @Nullable
        public List<CodeableConcept> targetDisease;

        // Dose number within series.
        @Json(name = "doseNumberPositiveInt")
        @Nullable
        public Integer doseNumberPositiveInt;

        // Dose number within series.
        @Json(name = "doseNumberString")
        @Nullable
        public String doseNumberString;

        // Recommended number of doses for immunity.
        @Json(name = "seriesDosesPositiveInt")
        @Nullable
        public Integer seriesDosesPositiveInt;

        // Recommended number of doses for immunity.
        @Json(name = "seriesDosesString")
        @Nullable
        public String seriesDosesString;


        /**
         * Constructor for all required properties.
         *
         * @param doseNumber as one of Integer, String*
         */
        public ImmunizationProtocolApplied(Object doseNumber) {
            if (doseNumber instanceof Integer) {
                this.doseNumberPositiveInt = (Integer) doseNumber;
            } else if (doseNumber instanceof String) {
                this.doseNumberString = (String) doseNumber;
            } else {
                //FIXME Type: (of: doseNumber)) for property (doseNumber) is invalid, ignoring")
            }
        }

        @Override
        public String getResourceType() {
            return ImmunizationProtocolApplied.resourceType;
        }


    }


    /**
     * Immunization.java
     * <p>
     * Categorical data indicating that an adverse event is associated in time to an immunization.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
     */
    public static class ImmunizationReaction extends BackboneElement {

        public static final String resourceType = "ImmunizationReaction";

        // When reaction started.
        @Json(name = "date")
        @Nullable
        public FhirDateTime date;

        // Additional information on reaction.
        @Json(name = "detail")
        @Nullable
        public Reference detail;

        // Indicates self-reported reaction.
        @Json(name = "reported")
        @Nullable
        public Boolean reported;


        public ImmunizationReaction() {
        }

        @Override
        public String getResourceType() {
            return ImmunizationReaction.resourceType;
        }


    }


}
