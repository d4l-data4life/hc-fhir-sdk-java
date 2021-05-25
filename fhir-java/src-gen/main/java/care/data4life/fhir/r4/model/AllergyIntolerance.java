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
 * AllergyIntolerance.java
 * <p>
 * Risk of harmful or undesirable, physiological response which is unique to an individual and
 * associated with exposure to a substance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AllergyIntolerance">AllergyIntolerance</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AllergyIntolerance)
 */
public class AllergyIntolerance extends DomainResource {

    public static final String resourceType = "AllergyIntolerance";

    // External ids for this item.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // active | inactive | resolved.
    @Json(name = "clinicalStatus")
    @Nullable
    public CodeableConcept clinicalStatus;

    // unconfirmed | confirmed | refuted | entered-in-error.
    @Json(name = "verificationStatus")
    @Nullable
    public CodeableConcept verificationStatus;

    // Identification of the underlying physiological mechanism for the reaction risk.
    @Json(name = "type")
    @Nullable
    public CodeSystemAllergyIntoleranceType type;

    // Category of the identified substance.
    @Json(name = "category")
    @Nullable
    public List<CodeSystemAllergyIntoleranceCategory> category;

    // Estimate of the potential clinical harm, or seriousness, of the reaction to the identified substance.
    @Json(name = "criticality")
    @Nullable
    public CodeSystemAllergyIntoleranceCriticality criticality;

    // Code that identifies the allergy or intolerance.
    @Json(name = "code")
    @Nullable
    public CodeableConcept code;

    // Who the sensitivity is for.
    @Json(name = "patient")
    public Reference patient;

    // Encounter when the allergy or intolerance was asserted.
    @Json(name = "encounter")
    @Nullable
    public Reference encounter;

    // When allergy or intolerance was identified.
    @Json(name = "onsetDateTime")
    @Nullable
    public FhirDateTime onsetDateTime;

    // When allergy or intolerance was identified.
    @Json(name = "onsetAge")
    @Nullable
    public Age onsetAge;

    // When allergy or intolerance was identified.
    @Json(name = "onsetPeriod")
    @Nullable
    public Period onsetPeriod;

    // When allergy or intolerance was identified.
    @Json(name = "onsetRange")
    @Nullable
    public Range onsetRange;

    // When allergy or intolerance was identified.
    @Json(name = "onsetString")
    @Nullable
    public String onsetString;

    // Date first version of the resource instance was recorded.
    @Json(name = "recordedDate")
    @Nullable
    public FhirDateTime recordedDate;

    // Who recorded the sensitivity.
    @Json(name = "recorder")
    @Nullable
    public Reference recorder;

    // Source of the information about the allergy.
    @Json(name = "asserter")
    @Nullable
    public Reference asserter;

    // Date(/time) of last known occurrence of a reaction.
    @Json(name = "lastOccurrence")
    @Nullable
    public FhirDateTime lastOccurrence;

    // Additional text not captured in other fields.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Adverse Reaction Events linked to exposure to substance.
    @Json(name = "reaction")
    @Nullable
    public List<AllergyIntoleranceReaction> reaction;


    /**
     * Constructor for all required properties.
     *
     * @param patient Reference
     */
    public AllergyIntolerance(Reference patient) {
        this.patient = patient;
    }

    @Override
    public String getResourceType() {
        return AllergyIntolerance.resourceType;
    }


    /**
     * AllergyIntolerance.java
     * <p>
     * Details about each adverse reaction event linked to exposure to the identified substance.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/AllergyIntolerance">AllergyIntolerance</a>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AllergyIntolerance)
     */
    public static class AllergyIntoleranceReaction extends BackboneElement {

        public static final String resourceType = "AllergyIntoleranceReaction";

        // Specific substance or pharmaceutical product considered to be responsible for event.
        @Json(name = "substance")
        @Nullable
        public CodeableConcept substance;

        // Clinical symptoms/signs associated with the Event.
        @Json(name = "manifestation")
        public List<CodeableConcept> manifestation;

        // Description of the event as a whole.
        @Json(name = "description")
        @Nullable
        public String description;

        // Date(/time) when manifestations showed.
        @Json(name = "onset")
        @Nullable
        public FhirDateTime onset;

        // Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
        @Json(name = "severity")
        @Nullable
        public CodeSystemAllergyIntoleranceSeverity severity;

        // How the subject was exposed to the substance.
        @Json(name = "exposureRoute")
        @Nullable
        public CodeableConcept exposureRoute;

        // Text about event not captured in other fields.
        @Json(name = "note")
        @Nullable
        public List<Annotation> note;


        /**
         * Constructor for all required properties.
         *
         * @param manifestation List of CodeableConcept
         */
        public AllergyIntoleranceReaction(List<CodeableConcept> manifestation) {
            this.manifestation = manifestation;
        }

        @Override
        public String getResourceType() {
            return AllergyIntoleranceReaction.resourceType;
        }


    }


}
