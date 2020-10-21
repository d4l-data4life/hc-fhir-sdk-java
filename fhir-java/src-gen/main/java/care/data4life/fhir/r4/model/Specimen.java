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
 * Specimen.java
 *
 * A sample to be used for analysis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">Specimen</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Specimen) on 2020-10-19
 */
public class Specimen extends DomainResource  {

	public static final String resourceType = "Specimen";
  
	// External Identifier.
    @Json(name = "identifier")
	@Nullable
	public List<Identifier> identifier;
  
	// Identifier assigned by the lab.
    @Json(name = "accessionIdentifier")
	@Nullable
	public Identifier accessionIdentifier;
  
	// The availability of the specimen.
    @Json(name = "status")
	@Nullable
	public CodeSystemSpecimenStatus status;
  
	// Kind of material that forms the specimen.
    @Json(name = "type")
	@Nullable
	public CodeableConcept type;
  
	// Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample), or a sampling of a substance or a device.
    @Json(name = "subject")
	@Nullable
	public Reference subject;
  
	// The time when specimen was received for processing.
    @Json(name = "receivedTime")
	@Nullable
	public FhirDateTime receivedTime;
  
	// Specimen from which this specimen originated.
    @Json(name = "parent")
	@Nullable
	public List<Reference> parent;
  
	// Why the specimen was collected.
    @Json(name = "request")
	@Nullable
	public List<Reference> request;
  
	// Collection details.
    @Json(name = "collection")
	@Nullable
	public SpecimenCollection collection;
  
	// Processing and processing step details.
    @Json(name = "processing")
	@Nullable
	public List<SpecimenProcessing> processing;
  
	// Direct container of specimen (tube/slide, etc.).
    @Json(name = "container")
	@Nullable
	public List<SpecimenContainer> container;
  
	// State of the specimen.
    @Json(name = "condition")
	@Nullable
	public List<CodeableConcept> condition;
  
	// Comments.
    @Json(name = "note")
	@Nullable
	public List<Annotation> note;

    
	public Specimen() {
	}
	@Override
	public String getResourceType() {
		return Specimen.resourceType;
	}




/**
 * Specimen.java
 *
 * Details concerning the specimen collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">Specimen</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Specimen) on 2020-10-19
 */
public static class SpecimenCollection extends BackboneElement  {

	public static final String resourceType = "SpecimenCollection";
  
	// Who collected the specimen.
    @Json(name = "collector")
	@Nullable
	public Reference collector;
  
	// Collection time.
    @Json(name = "collectedDateTime")
	@Nullable
	public FhirDateTime collectedDateTime;
  
	// Collection time.
    @Json(name = "collectedPeriod")
	@Nullable
	public Period collectedPeriod;
  
	// How long it took to collect specimen.
    @Json(name = "duration")
	@Nullable
	public Duration duration;
  
	// The quantity of specimen collected.
    @Json(name = "quantity")
	@Nullable
	public Quantity quantity;
  
	// Technique used to perform collection.
    @Json(name = "method")
	@Nullable
	public CodeableConcept method;
  
	// Anatomical collection site.
    @Json(name = "bodySite")
	@Nullable
	public CodeableConcept bodySite;
  
	// Whether or how long patient abstained from food and/or drink.
    @Json(name = "fastingStatusCodeableConcept")
	@Nullable
	public CodeableConcept fastingStatusCodeableConcept;
  
	// Whether or how long patient abstained from food and/or drink.
    @Json(name = "fastingStatusDuration")
	@Nullable
	public Duration fastingStatusDuration;

    
	public SpecimenCollection() {
	}
	@Override
	public String getResourceType() {
		return SpecimenCollection.resourceType;
	}


}



/**
 * Specimen.java
 *
 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">Specimen</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Specimen) on 2020-10-19
 */
public static class SpecimenContainer extends BackboneElement  {

	public static final String resourceType = "SpecimenContainer";
  
	// Id for the container.
    @Json(name = "identifier")
	@Nullable
	public List<Identifier> identifier;
  
	// Textual description of the container.
    @Json(name = "description")
	@Nullable
	public String description;
  
	// Kind of container directly associated with specimen.
    @Json(name = "type")
	@Nullable
	public CodeableConcept type;
  
	// Container volume or size.
    @Json(name = "capacity")
	@Nullable
	public Quantity capacity;
  
	// Quantity of specimen within container.
    @Json(name = "specimenQuantity")
	@Nullable
	public Quantity specimenQuantity;
  
	// Additive associated with container.
    @Json(name = "additiveCodeableConcept")
	@Nullable
	public CodeableConcept additiveCodeableConcept;
  
	// Additive associated with container.
    @Json(name = "additiveReference")
	@Nullable
	public Reference additiveReference;

    
	public SpecimenContainer() {
	}
	@Override
	public String getResourceType() {
		return SpecimenContainer.resourceType;
	}


}



/**
 * Specimen.java
 *
 * Details concerning processing and processing steps for the specimen.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">Specimen</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Specimen) on 2020-10-19
 */
public static class SpecimenProcessing extends BackboneElement  {

	public static final String resourceType = "SpecimenProcessing";
  
	// Textual description of procedure.
    @Json(name = "description")
	@Nullable
	public String description;
  
	// Indicates the treatment step  applied to the specimen.
    @Json(name = "procedure")
	@Nullable
	public CodeableConcept procedure;
  
	// Material used in the processing step.
    @Json(name = "additive")
	@Nullable
	public List<Reference> additive;
  
	// Date and time of specimen processing.
    @Json(name = "timeDateTime")
	@Nullable
	public FhirDateTime timeDateTime;
  
	// Date and time of specimen processing.
    @Json(name = "timePeriod")
	@Nullable
	public Period timePeriod;

    
	public SpecimenProcessing() {
	}
	@Override
	public String getResourceType() {
		return SpecimenProcessing.resourceType;
	}


}


}