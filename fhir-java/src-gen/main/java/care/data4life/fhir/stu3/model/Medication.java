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

import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;

/**
 * Medication.java
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication) on 2020-10-19
 */
public class Medication extends DomainResource  {

	public static final String resourceType = "Medication";
  
	// Codes that identify this medication.
    @Json(name = "code")
	@Nullable
	public CodeableConcept code;
  
	// A code to indicate if the medication is in active use.
    @Json(name = "status")
	@Nullable
	public CodeSystemMedicationStatus status;
  
	// True if a brand.
    @Json(name = "isBrand")
	@Nullable
	public Boolean isBrand;
  
	// True if medication does not require a prescription.
    @Json(name = "isOverTheCounter")
	@Nullable
	public Boolean isOverTheCounter;
  
	// Manufacturer of the item.
    @Json(name = "manufacturer")
	@Nullable
	public Reference manufacturer;
  
	// powder | tablets | capsule +.
    @Json(name = "form")
	@Nullable
	public CodeableConcept form;
  
	// Active or inactive ingredient.
    @Json(name = "ingredient")
	@Nullable
	public List<MedicationIngredient> ingredient;
  
	// Details about packaged medications.
    @Json(name = "package")
	@Nullable
	public MedicationPackage fhirPackage;
  
	// Picture of the medication.
    @Json(name = "image")
	@Nullable
	public List<Attachment> image;

    
	public Medication() {
	}
	@Override
	public String getResourceType() {
		return Medication.resourceType;
	}




/**
 * Medication.java
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication) on 2020-10-19
 */
public static class MedicationIngredient extends BackboneElement  {

	public static final String resourceType = "MedicationIngredient";
  
	// The product contained.
    @Json(name = "itemCodeableConcept")
	@Nullable
	public CodeableConcept itemCodeableConcept;
  
	// The product contained.
    @Json(name = "itemReference")
	@Nullable
	public Reference itemReference;
  
	// Active ingredient indicator.
    @Json(name = "isActive")
	@Nullable
	public Boolean isActive;
  
	// Quantity of ingredient present.
    @Json(name = "amount")
	@Nullable
	public Ratio amount;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param item as one of CodeableConcept, Reference*
	 *
	 */
	public MedicationIngredient(Object item) {
		if (item instanceof CodeableConcept) {
			this.itemCodeableConcept = (CodeableConcept) item;
		}
		else if (item instanceof Reference) {
			this.itemReference = (Reference) item;
		}
		else {
			//FIXME Type: (of: item)) for property (item) is invalid, ignoring")
		}
	}@Override
	public String getResourceType() {
		return MedicationIngredient.resourceType;
	}


}



/**
 * Medication.java
 *
 * Information that only applies to packages (not products).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication) on 2020-10-19
 */
public static class MedicationPackage extends BackboneElement  {

	public static final String resourceType = "MedicationPackage";
  
	// E.g. box, vial, blister-pack.
    @Json(name = "container")
	@Nullable
	public CodeableConcept container;
  
	// What is  in the package.
    @Json(name = "content")
	@Nullable
	public List<MedicationPackageContent> content;
  
	// Identifies a single production run.
    @Json(name = "batch")
	@Nullable
	public List<MedicationPackageBatch> batch;

    
	public MedicationPackage() {
	}
	@Override
	public String getResourceType() {
		return MedicationPackage.resourceType;
	}


}



/**
 * Medication.java
 *
 * Information about a group of medication produced or packaged from one production run.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication) on 2020-10-19
 */
public static class MedicationPackageBatch extends BackboneElement  {

	public static final String resourceType = "MedicationPackageBatch";
  
	// Identifier assigned to batch.
    @Json(name = "lotNumber")
	@Nullable
	public String lotNumber;
  
	// When batch will expire.
    @Json(name = "expirationDate")
	@Nullable
	public FhirDateTime expirationDate;

    
	public MedicationPackageBatch() {
	}
	@Override
	public String getResourceType() {
		return MedicationPackageBatch.resourceType;
	}


}



/**
 * Medication.java
 *
 * A set of components that go to make up the described item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication) on 2020-10-19
 */
public static class MedicationPackageContent extends BackboneElement  {

	public static final String resourceType = "MedicationPackageContent";
  
	// The item in the package.
    @Json(name = "itemCodeableConcept")
	@Nullable
	public CodeableConcept itemCodeableConcept;
  
	// The item in the package.
    @Json(name = "itemReference")
	@Nullable
	public Reference itemReference;
  
	// Quantity present in the package.
    @Json(name = "amount")
	@Nullable
	public Quantity amount;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param item as one of CodeableConcept, Reference*
	 *
	 */
	public MedicationPackageContent(Object item) {
		if (item instanceof CodeableConcept) {
			this.itemCodeableConcept = (CodeableConcept) item;
		}
		else if (item instanceof Reference) {
			this.itemReference = (Reference) item;
		}
		else {
			//FIXME Type: (of: item)) for property (item) is invalid, ignoring")
		}
	}@Override
	public String getResourceType() {
		return MedicationPackageContent.resourceType;
	}


}


}