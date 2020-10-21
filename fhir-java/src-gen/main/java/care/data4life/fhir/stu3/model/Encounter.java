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
 * Encounter.java
 * <p>
 * An interaction between a patient and healthcare provider(s) for the purpose of providing
 * healthcare service(s) or assessing the health status of a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
 * 2020-10-21
 */
public class Encounter extends DomainResource {

    public static final String resourceType = "Encounter";

    // Identifier(s) by which this encounter is known.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // None
    @Json(name = "status")
    public CodeSystemEncounterStatus status;

    // List of past encounter statuses.
    @Json(name = "statusHistory")
    @Nullable
    public List<EncounterStatusHistory> statusHistory;

    // inpatient | outpatient | ambulatory | emergency +.
    @Json(name = "class")
    @Nullable
    public Coding clazz;

    // List of past encounter classes.
    @Json(name = "classHistory")
    @Nullable
    public List<EncounterClassHistory> classHistory;

    // Specific type of encounter.
    @Json(name = "type")
    @Nullable
    public List<CodeableConcept> type;

    // Indicates the urgency of the encounter.
    @Json(name = "priority")
    @Nullable
    public CodeableConcept priority;

    // The patient ro group present at the encounter.
    @Json(name = "subject")
    @Nullable
    public Reference subject;

    // Episode(s) of care that this encounter should be recorded against.
    @Json(name = "episodeOfCare")
    @Nullable
    public List<Reference> episodeOfCare;

    // The ReferralRequest that initiated this encounter.
    @Json(name = "incomingReferral")
    @Nullable
    public List<Reference> incomingReferral;

    // List of participants involved in the encounter.
    @Json(name = "participant")
    @Nullable
    public List<EncounterParticipant> participant;

    // The appointment that scheduled this encounter.
    @Json(name = "appointment")
    @Nullable
    public Reference appointment;

    // The start and end time of the encounter.
    @Json(name = "period")
    @Nullable
    public Period period;

    // Quantity of time the encounter lasted (less time absent).
    @Json(name = "length")
    @Nullable
    public Duration length;

    // Reason the encounter takes place (code).
    @Json(name = "reason")
    @Nullable
    public List<CodeableConcept> reason;

    // The list of diagnosis relevant to this encounter.
    @Json(name = "diagnosis")
    @Nullable
    public List<EncounterDiagnosis> diagnosis;

    // The set of accounts that may be used for billing for this Encounter.
    @Json(name = "account")
    @Nullable
    public List<Reference> account;

    // Details about the admission to a healthcare service.
    @Json(name = "hospitalization")
    @Nullable
    public EncounterHospitalization hospitalization;

    // List of locations where the patient has been.
    @Json(name = "location")
    @Nullable
    public List<EncounterLocation> location;

    // The custodian organization of this Encounter record.
    @Json(name = "serviceProvider")
    @Nullable
    public Reference serviceProvider;

    // Another Encounter this encounter is part of.
    @Json(name = "partOf")
    @Nullable
    public Reference partOf;


    /**
     * Constructor for all required properties.
     *
     * @param status CodeSystemEncounterStatus
     */
    public Encounter(CodeSystemEncounterStatus status) {
        this.status = status;
    }

    @Override
    public String getResourceType() {
        return Encounter.resourceType;
    }


    /**
     * Encounter.java
     * <p>
     * The class history permits the tracking of the encounters transitions without needing to go
     * through the resource history.
     * <p>
     * This would be used for a case where an admission starts of as an emergency encounter, then
     * transisions into an inpatient scenario. Doing this and not restarting a new encounter ensures
     * that any lab/diagnostic results can more easily follow the patient and not require
     * re-processing and not get lost or cancelled during a kindof discharge from emergency to
     * inpatient.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
     * 2020-10-21
     */
    public static class EncounterClassHistory extends BackboneElement {

        public static final String resourceType = "EncounterClassHistory";

        // inpatient | outpatient | ambulatory | emergency +.
        @Json(name = "class")
        public Coding clazz;

        // The time that the episode was in the specified class.
        @Json(name = "period")
        public Period period;


        /**
         * Constructor for all required properties.
         *
         * @param clazz  Coding
         * @param period Period
         */
        public EncounterClassHistory(Coding clazz, Period period) {
            this.clazz = clazz;
            this.period = period;
        }

        @Override
        public String getResourceType() {
            return EncounterClassHistory.resourceType;
        }


    }


    /**
     * Encounter.java
     * <p>
     * The list of diagnosis relevant to this encounter
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
     * 2020-10-21
     */
    public static class EncounterDiagnosis extends BackboneElement {

        public static final String resourceType = "EncounterDiagnosis";

        // Reason the encounter takes place (resource).
        @Json(name = "condition")
        public Reference condition;

        // Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
        @Json(name = "role")
        @Nullable
        public CodeableConcept role;

        // Ranking of the diagnosis (for each role type).
        @Json(name = "rank")
        @Nullable
        public Integer rank;


        /**
         * Constructor for all required properties.
         *
         * @param condition Reference
         */
        public EncounterDiagnosis(Reference condition) {
            this.condition = condition;
        }

        @Override
        public String getResourceType() {
            return EncounterDiagnosis.resourceType;
        }


    }


    /**
     * Encounter.java
     * <p>
     * Details about the admission to a healthcare service
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
     * 2020-10-21
     */
    public static class EncounterHospitalization extends BackboneElement {

        public static final String resourceType = "EncounterHospitalization";

        // Pre-admission identifier.
        @Json(name = "preAdmissionIdentifier")
        @Nullable
        public Identifier preAdmissionIdentifier;

        // The location from which the patient came before admission.
        @Json(name = "origin")
        @Nullable
        public Reference origin;

        // From where patient was admitted (physician referral, transfer).
        @Json(name = "admitSource")
        @Nullable
        public CodeableConcept admitSource;

        // The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission.
        @Json(name = "reAdmission")
        @Nullable
        public CodeableConcept reAdmission;

        // Diet preferences reported by the patient.
        @Json(name = "dietPreference")
        @Nullable
        public List<CodeableConcept> dietPreference;

        // Special courtesies (VIP, board member).
        @Json(name = "specialCourtesy")
        @Nullable
        public List<CodeableConcept> specialCourtesy;

        // Wheelchair, translator, stretcher, etc..
        @Json(name = "specialArrangement")
        @Nullable
        public List<CodeableConcept> specialArrangement;

        // Location to which the patient is discharged.
        @Json(name = "destination")
        @Nullable
        public Reference destination;

        // Category or kind of location after discharge.
        @Json(name = "dischargeDisposition")
        @Nullable
        public CodeableConcept dischargeDisposition;


        public EncounterHospitalization() {
        }

        @Override
        public String getResourceType() {
            return EncounterHospitalization.resourceType;
        }


    }


    /**
     * Encounter.java
     * <p>
     * List of locations where  the patient has been during this encounter.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
     * 2020-10-21
     */
    public static class EncounterLocation extends BackboneElement {

        public static final String resourceType = "EncounterLocation";

        // Location the encounter takes place.
        @Json(name = "location")
        public Reference location;

        // The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time.
        @Json(name = "status")
        @Nullable
        public CodeSystemEncounterLocationStatus status;

        // Time period during which the patient was present at the location.
        @Json(name = "period")
        @Nullable
        public Period period;


        /**
         * Constructor for all required properties.
         *
         * @param location Reference
         */
        public EncounterLocation(Reference location) {
            this.location = location;
        }

        @Override
        public String getResourceType() {
            return EncounterLocation.resourceType;
        }


    }


    /**
     * Encounter.java
     * <p>
     * The list of people responsible for providing the service.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
     * 2020-10-21
     */
    public static class EncounterParticipant extends BackboneElement {

        public static final String resourceType = "EncounterParticipant";

        // Role of participant in encounter.
        @Json(name = "type")
        @Nullable
        public List<CodeableConcept> type;

        // Period of time during the encounter that the participant participated.
        @Json(name = "period")
        @Nullable
        public Period period;

        // Persons involved in the encounter other than the patient.
        @Json(name = "individual")
        @Nullable
        public Reference individual;


        public EncounterParticipant() {
        }

        @Override
        public String getResourceType() {
            return EncounterParticipant.resourceType;
        }


    }


    /**
     * Encounter.java
     * <p>
     * The status history permits the encounter resource to contain the status history without
     * needing to read through the historical versions of the resource, or even have the server
     * store them.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Encounter) on
     * 2020-10-21
     */
    public static class EncounterStatusHistory extends BackboneElement {

        public static final String resourceType = "EncounterStatusHistory";

        // None
        @Json(name = "status")
        public CodeSystemEncounterStatus status;

        // The time that the episode was in the specified status.
        @Json(name = "period")
        public Period period;


        /**
         * Constructor for all required properties.
         *
         * @param status CodeSystemEncounterStatus
         * @param period Period
         */
        public EncounterStatusHistory(CodeSystemEncounterStatus status, Period period) {
            this.status = status;
            this.period = period;
        }

        @Override
        public String getResourceType() {
            return EncounterStatusHistory.resourceType;
        }


    }


}
