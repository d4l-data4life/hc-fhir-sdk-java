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
 * Medication.java
 * <p>
 * This resource is primarily used for the identification and definition of a medication for the
 * purposes of prescribing, dispensing, and administering a medication as well as for making
 * statements about medication use.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
public class Medication extends DomainResource {

    public static final String resourceType = "Medication";

    // Business identifier for this medication.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Codes that identify this medication.
    @Json(name = "code")
    @Nullable
    public CodeableConcept code;

    // A code to indicate if the medication is in active use.
    @Json(name = "status")
    @Nullable
    public CodeSystemMedicationStatusCodes status;

    // Manufacturer of the item.
    @Json(name = "manufacturer")
    @Nullable
    public Reference manufacturer;

    // powder | tablets | capsule +.
    @Json(name = "form")
    @Nullable
    public CodeableConcept form;

    // Amount of drug in package.
    @Json(name = "amount")
    @Nullable
    public Ratio amount;

    // Active or inactive ingredient.
    @Json(name = "ingredient")
    @Nullable
    public List<MedicationIngredient> ingredient;

    // Details about packaged medications.
    @Json(name = "batch")
    @Nullable
    public MedicationBatch batch;


    public Medication() {
    }

    @Override
    public String getResourceType() {
        return Medication.resourceType;
    }


    /**
     * Medication.java
     * <p>
     * Information that only applies to packages (not products).
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Medication)
     */
    public static class MedicationBatch extends BackboneElement {

        public static final String resourceType = "MedicationBatch";

        // Identifier assigned to batch.
        @Json(name = "lotNumber")
        @Nullable
        public String lotNumber;

        // When batch will expire.
        @Json(name = "expirationDate")
        @Nullable
        public FhirDateTime expirationDate;


        public MedicationBatch() {
        }

        @Override
        public String getResourceType() {
            return MedicationBatch.resourceType;
        }


    }


    /**
     * Medication.java
     * <p>
     * Identifies a particular constituent of interest in the product.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Medication)
     */
    public static class MedicationIngredient extends BackboneElement {

        public static final String resourceType = "MedicationIngredient";

        // The actual ingredient or content.
        @Json(name = "itemCodeableConcept")
        @Nullable
        public CodeableConcept itemCodeableConcept;

        // The actual ingredient or content.
        @Json(name = "itemReference")
        @Nullable
        public Reference itemReference;

        // Active ingredient indicator.
        @Json(name = "isActive")
        @Nullable
        public Boolean isActive;

        // Quantity of ingredient present.
        @Json(name = "strength")
        @Nullable
        public Ratio strength;


        /**
         * Constructor for all required properties.
         *
         * @param item as one of CodeableConcept, Reference*
         */
        public MedicationIngredient(Object item) {
            if (item instanceof CodeableConcept) {
                this.itemCodeableConcept = (CodeableConcept) item;
            } else if (item instanceof Reference) {
                this.itemReference = (Reference) item;
            } else {
                //FIXME Type: (of: item)) for property (item) is invalid, ignoring")
            }
        }

        @Override
        public String getResourceType() {
            return MedicationIngredient.resourceType;
        }


    }


}
