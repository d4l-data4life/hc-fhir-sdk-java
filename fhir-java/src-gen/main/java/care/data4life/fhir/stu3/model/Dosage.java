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
 * Dosage.java
 * <p>
 * Indicates how the medication is/was taken or should be taken by the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Dosage">Dosage</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Dosage)
 */
public class Dosage extends Element {

    public static final String resourceType = "Dosage";

    // The order of the dosage instructions.
    @Json(name = "sequence")
    @Nullable
    public Integer sequence;

    // Free text dosage instructions e.g. SIG.
    @Json(name = "text")
    @Nullable
    public String text;

    // Supplemental instruction - e.g. "with meals".
    @Json(name = "additionalInstruction")
    @Nullable
    public List<CodeableConcept> additionalInstruction;

    // Patient or consumer oriented instructions.
    @Json(name = "patientInstruction")
    @Nullable
    public String patientInstruction;

    // When medication should be administered.
    @Json(name = "timing")
    @Nullable
    public Timing timing;

    // Take "as needed" (for x).
    @Json(name = "asNeededBoolean")
    @Nullable
    public Boolean asNeededBoolean;

    // Take "as needed" (for x).
    @Json(name = "asNeededCodeableConcept")
    @Nullable
    public CodeableConcept asNeededCodeableConcept;

    // Body site to administer to.
    @Json(name = "site")
    @Nullable
    public CodeableConcept site;

    // How drug should enter body.
    @Json(name = "route")
    @Nullable
    public CodeableConcept route;

    // Technique for administering medication.
    @Json(name = "method")
    @Nullable
    public CodeableConcept method;

    // Amount of medication per dose.
    @Json(name = "doseRange")
    @Nullable
    public Range doseRange;

    // Amount of medication per dose.
    @Json(name = "doseQuantity")
    @Nullable
    public Quantity doseQuantity;

    // Upper limit on medication per unit of time.
    @Json(name = "maxDosePerPeriod")
    @Nullable
    public Ratio maxDosePerPeriod;

    // Upper limit on medication per administration.
    @Json(name = "maxDosePerAdministration")
    @Nullable
    public Quantity maxDosePerAdministration;

    // Upper limit on medication per lifetime of the patient.
    @Json(name = "maxDosePerLifetime")
    @Nullable
    public Quantity maxDosePerLifetime;

    // Amount of medication per unit of time.
    @Json(name = "rateRatio")
    @Nullable
    public Ratio rateRatio;

    // Amount of medication per unit of time.
    @Json(name = "rateRange")
    @Nullable
    public Range rateRange;

    // Amount of medication per unit of time.
    @Json(name = "rateQuantity")
    @Nullable
    public Quantity rateQuantity;


    public Dosage() {
    }

    @Override
    public String getResourceType() {
        return Dosage.resourceType;
    }


}
