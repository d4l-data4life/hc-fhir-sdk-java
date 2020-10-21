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
 * Observation.java
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">Observation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Observation) on 2020-10-19
 */
public class Observation extends DomainResource  {

	public static final String resourceType = "Observation";
  
	// Business Identifier for observation.
    @Json(name = "identifier")
	@Nullable
	public List<Identifier> identifier;
  
	// Fulfills plan, proposal or order.
    @Json(name = "basedOn")
	@Nullable
	public List<Reference> basedOn;
  
	// The status of the result value.
    @Json(name = "status")
	public CodeSystemObservationStatus status;
  
	// Classification of  type of observation.
    @Json(name = "category")
	@Nullable
	public List<CodeableConcept> category;
  
	// Type of observation (code / type).
    @Json(name = "code")
	public CodeableConcept code;
  
	// Who and/or what this is about.
    @Json(name = "subject")
	@Nullable
	public Reference subject;
  
	// Healthcare event during which this observation is made.
    @Json(name = "context")
	@Nullable
	public Reference context;
  
	// Clinically relevant time/time-period for observation.
    @Json(name = "effectiveDateTime")
	@Nullable
	public FhirDateTime effectiveDateTime;
  
	// Clinically relevant time/time-period for observation.
    @Json(name = "effectivePeriod")
	@Nullable
	public Period effectivePeriod;
  
	// Date/Time this was made available.
    @Json(name = "issued")
	@Nullable
	public FhirInstant issued;
  
	// Who is responsible for the observation.
    @Json(name = "performer")
	@Nullable
	public List<Reference> performer;
  
	// Actual result.
    @Json(name = "valueQuantity")
	@Nullable
	public Quantity valueQuantity;
  
	// Actual result.
    @Json(name = "valueCodeableConcept")
	@Nullable
	public CodeableConcept valueCodeableConcept;
  
	// Actual result.
    @Json(name = "valueString")
	@Nullable
	public String valueString;
  
	// Actual result.
    @Json(name = "valueBoolean")
	@Nullable
	public Boolean valueBoolean;
  
	// Actual result.
    @Json(name = "valueRange")
	@Nullable
	public Range valueRange;
  
	// Actual result.
    @Json(name = "valueRatio")
	@Nullable
	public Ratio valueRatio;
  
	// Actual result.
    @Json(name = "valueSampledData")
	@Nullable
	public SampledData valueSampledData;
  
	// Actual result.
    @Json(name = "valueAttachment")
	@Nullable
	public Attachment valueAttachment;
  
	// Actual result.
    @Json(name = "valueTime")
	@Nullable
	public FhirTime valueTime;
  
	// Actual result.
    @Json(name = "valueDateTime")
	@Nullable
	public FhirDateTime valueDateTime;
  
	// Actual result.
    @Json(name = "valuePeriod")
	@Nullable
	public Period valuePeriod;
  
	// Why the result is missing.
    @Json(name = "dataAbsentReason")
	@Nullable
	public CodeableConcept dataAbsentReason;
  
	// High, low, normal, etc..
    @Json(name = "interpretation")
	@Nullable
	public CodeableConcept interpretation;
  
	// Comments about result.
    @Json(name = "comment")
	@Nullable
	public String comment;
  
	// Observed body part.
    @Json(name = "bodySite")
	@Nullable
	public CodeableConcept bodySite;
  
	// How it was done.
    @Json(name = "method")
	@Nullable
	public CodeableConcept method;
  
	// Specimen used for this observation.
    @Json(name = "specimen")
	@Nullable
	public Reference specimen;
  
	// (Measurement) Device.
    @Json(name = "device")
	@Nullable
	public Reference device;
  
	// Provides guide for interpretation.
    @Json(name = "referenceRange")
	@Nullable
	public List<ObservationReferenceRange> referenceRange;
  
	// Resource related to this observation.
    @Json(name = "related")
	@Nullable
	public List<ObservationRelated> related;
  
	// Component results.
    @Json(name = "component")
	@Nullable
	public List<ObservationComponent> component;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param status CodeSystemObservationStatus
	 *
	 * @param code CodeableConcept
	 *
	 */
	public Observation(CodeSystemObservationStatus status, CodeableConcept code) {
		this.status = status;
		this.code = code;
	}@Override
	public String getResourceType() {
		return Observation.resourceType;
	}




/**
 * Observation.java
 *
 * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">Observation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Observation) on 2020-10-19
 */
public static class ObservationComponent extends BackboneElement  {

	public static final String resourceType = "ObservationComponent";
  
	// Type of component observation (code / type).
    @Json(name = "code")
	public CodeableConcept code;
  
	// Actual component result.
    @Json(name = "valueQuantity")
	@Nullable
	public Quantity valueQuantity;
  
	// Actual component result.
    @Json(name = "valueCodeableConcept")
	@Nullable
	public CodeableConcept valueCodeableConcept;
  
	// Actual component result.
    @Json(name = "valueString")
	@Nullable
	public String valueString;
  
	// Actual component result.
    @Json(name = "valueRange")
	@Nullable
	public Range valueRange;
  
	// Actual component result.
    @Json(name = "valueRatio")
	@Nullable
	public Ratio valueRatio;
  
	// Actual component result.
    @Json(name = "valueSampledData")
	@Nullable
	public SampledData valueSampledData;
  
	// Actual component result.
    @Json(name = "valueAttachment")
	@Nullable
	public Attachment valueAttachment;
  
	// Actual component result.
    @Json(name = "valueTime")
	@Nullable
	public FhirTime valueTime;
  
	// Actual component result.
    @Json(name = "valueDateTime")
	@Nullable
	public FhirDateTime valueDateTime;
  
	// Actual component result.
    @Json(name = "valuePeriod")
	@Nullable
	public Period valuePeriod;
  
	// Why the component result is missing.
    @Json(name = "dataAbsentReason")
	@Nullable
	public CodeableConcept dataAbsentReason;
  
	// High, low, normal, etc..
    @Json(name = "interpretation")
	@Nullable
	public CodeableConcept interpretation;
  
	// Provides guide for interpretation of component result.
    @Json(name = "referenceRange")
	@Nullable
	public List<ObservationReferenceRange> referenceRange;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param code CodeableConcept
	 *
	 */
	public ObservationComponent(CodeableConcept code) {
		this.code = code;
	}@Override
	public String getResourceType() {
		return ObservationComponent.resourceType;
	}


}



/**
 * Observation.java
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">Observation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Observation) on 2020-10-19
 */
public static class ObservationReferenceRange extends BackboneElement  {

	public static final String resourceType = "ObservationReferenceRange";
  
	// Low Range, if relevant.
    @Json(name = "low")
	@Nullable
	public Quantity low;
  
	// High Range, if relevant.
    @Json(name = "high")
	@Nullable
	public Quantity high;
  
	// Reference range qualifier.
    @Json(name = "type")
	@Nullable
	public CodeableConcept type;
  
	// Reference range population.
    @Json(name = "appliesTo")
	@Nullable
	public List<CodeableConcept> appliesTo;
  
	// Applicable age range, if relevant.
    @Json(name = "age")
	@Nullable
	public Range age;
  
	// Text based reference range in an observation.
    @Json(name = "text")
	@Nullable
	public String text;

    
	public ObservationReferenceRange() {
	}
	@Override
	public String getResourceType() {
		return ObservationReferenceRange.resourceType;
	}


}



/**
 * Observation.java
 *
 * A  reference to another resource (usually another Observation) whose relationship is defined by the relationship type code.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">Observation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Observation) on 2020-10-19
 */
public static class ObservationRelated extends BackboneElement  {

	public static final String resourceType = "ObservationRelated";
  
	// A code specifying the kind of relationship that exists with the target resource.
    @Json(name = "type")
	@Nullable
	public CodeSystemObservationRelationshipType type;
  
	// Resource that is related to this one.
    @Json(name = "target")
	public Reference target;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param target Reference
	 *
	 */
	public ObservationRelated(Reference target) {
		this.target = target;
	}@Override
	public String getResourceType() {
		return ObservationRelated.resourceType;
	}


}


}