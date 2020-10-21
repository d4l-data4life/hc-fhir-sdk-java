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
 * Substance.java
 *
 * A homogeneous material with a definite composition
 * 
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">Substance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Substance) on 2020-10-19
 */
public class Substance extends DomainResource  {

	public static final String resourceType = "Substance";
  
	// Unique identifier.
    @Json(name = "identifier")
	@Nullable
	public List<Identifier> identifier;
  
	// A code to indicate if the substance is actively used.
    @Json(name = "status")
	@Nullable
	public CodeSystemFHIRSubstanceStatus status;
  
	// What class/type of substance this is.
    @Json(name = "category")
	@Nullable
	public List<CodeableConcept> category;
  
	// What substance this is.
    @Json(name = "code")
	public CodeableConcept code;
  
	// Textual description of the substance, comments.
    @Json(name = "description")
	@Nullable
	public String description;
  
	// If this describes a specific package/container of the substance.
    @Json(name = "instance")
	@Nullable
	public List<SubstanceInstance> instance;
  
	// Composition information about the substance.
    @Json(name = "ingredient")
	@Nullable
	public List<SubstanceIngredient> ingredient;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param code CodeableConcept
	 *
	 */
	public Substance(CodeableConcept code) {
		this.code = code;
	}@Override
	public String getResourceType() {
		return Substance.resourceType;
	}




/**
 * Substance.java
 *
 * A substance can be composed of other substances.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">Substance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Substance) on 2020-10-19
 */
public static class SubstanceIngredient extends BackboneElement  {

	public static final String resourceType = "SubstanceIngredient";
  
	// Optional amount (concentration).
    @Json(name = "quantity")
	@Nullable
	public Ratio quantity;
  
	// A component of the substance.
    @Json(name = "substanceCodeableConcept")
	@Nullable
	public CodeableConcept substanceCodeableConcept;
  
	// A component of the substance.
    @Json(name = "substanceReference")
	@Nullable
	public Reference substanceReference;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param substance as one of CodeableConcept, Reference*
	 *
	 */
	public SubstanceIngredient(Object substance) {
		if (substance instanceof CodeableConcept) {
			this.substanceCodeableConcept = (CodeableConcept) substance;
		}
		else if (substance instanceof Reference) {
			this.substanceReference = (Reference) substance;
		}
		else {
			//FIXME Type: (of: substance)) for property (substance) is invalid, ignoring")
		}
	}@Override
	public String getResourceType() {
		return SubstanceIngredient.resourceType;
	}


}



/**
 * Substance.java
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">Substance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Substance) on 2020-10-19
 */
public static class SubstanceInstance extends BackboneElement  {

	public static final String resourceType = "SubstanceInstance";
  
	// Identifier of the package/container.
    @Json(name = "identifier")
	@Nullable
	public Identifier identifier;
  
	// When no longer valid to use.
    @Json(name = "expiry")
	@Nullable
	public FhirDateTime expiry;
  
	// Amount of substance in the package.
    @Json(name = "quantity")
	@Nullable
	public Quantity quantity;

    
	public SubstanceInstance() {
	}
	@Override
	public String getResourceType() {
		return SubstanceInstance.resourceType;
	}


}


}