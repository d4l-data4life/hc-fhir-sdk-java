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
 * CodeSystem.java
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem) on 2020-10-19
 */
public class CodeSystem extends DomainResource  {

	public static final String resourceType = "CodeSystem";
  
	// Canonical identifier for this code system, represented as a URI (globally unique) (Coding.system).
    @Json(name = "url")
	@Nullable
	public String url;
  
	// Additional identifier for the code system (business identifier).
    @Json(name = "identifier")
	@Nullable
	public List<Identifier> identifier;
  
	// Business version of the code system (Coding.version).
    @Json(name = "version")
	@Nullable
	public String version;
  
	// Name for this code system (computer friendly).
    @Json(name = "name")
	@Nullable
	public String name;
  
	// Name for this code system (human friendly).
    @Json(name = "title")
	@Nullable
	public String title;
  
	// The date (and optionally time) when the code system resource was created or revised.
    @Json(name = "status")
	public CodeSystemPublicationStatus status;
  
	// For testing purposes, not real usage.
    @Json(name = "experimental")
	@Nullable
	public Boolean experimental;
  
	// Date last changed.
    @Json(name = "date")
	@Nullable
	public FhirDateTime date;
  
	// Name of the publisher (organization or individual).
    @Json(name = "publisher")
	@Nullable
	public String publisher;
  
	// Contact details for the publisher.
    @Json(name = "contact")
	@Nullable
	public List<ContactDetail> contact;
  
	// Natural language description of the code system.
    @Json(name = "description")
	@Nullable
	public String description;
  
	// The context that the content is intended to support.
    @Json(name = "useContext")
	@Nullable
	public List<UsageContext> useContext;
  
	// Intended jurisdiction for code system (if applicable).
    @Json(name = "jurisdiction")
	@Nullable
	public List<CodeableConcept> jurisdiction;
  
	// Why this code system is defined.
    @Json(name = "purpose")
	@Nullable
	public String purpose;
  
	// Use and/or publishing restrictions.
    @Json(name = "copyright")
	@Nullable
	public String copyright;
  
	// If code comparison is case sensitive.
    @Json(name = "caseSensitive")
	@Nullable
	public Boolean caseSensitive;
  
	// Canonical reference to the value set with entire code system.
    @Json(name = "valueSet")
	@Nullable
	public Canonical valueSet;
  
	// The meaning of the hierarchy of concepts as represented in this resource.
    @Json(name = "hierarchyMeaning")
	@Nullable
	public CodeSystemCodeSystemHierarchyMeaning hierarchyMeaning;
  
	// If code system defines a compositional grammar.
    @Json(name = "compositional")
	@Nullable
	public Boolean compositional;
  
	// If definitions are not stable.
    @Json(name = "versionNeeded")
	@Nullable
	public Boolean versionNeeded;
  
	// The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
    @Json(name = "content")
	public CodeSystemCodeSystemContentMode content;
  
	// Canonical URL of Code System this adds designations and properties to.
    @Json(name = "supplements")
	@Nullable
	public Canonical supplements;
  
	// Total concepts in the code system.
    @Json(name = "count")
	@Nullable
	public Integer count;
  
	// Filter that can be used in a value set.
    @Json(name = "filter")
	@Nullable
	public List<CodeSystemFilter> filter;
  
	// Additional information supplied about each concept.
    @Json(name = "property")
	@Nullable
	public List<CodeSystemProperty> property;
  
	// Concepts in the code system.
    @Json(name = "concept")
	@Nullable
	public List<CodeSystemConcept> concept;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param status CodeSystemPublicationStatus
	 *
	 * @param content CodeSystemCodeSystemContentMode
	 *
	 */
	public CodeSystem(CodeSystemPublicationStatus status, CodeSystemCodeSystemContentMode content) {
		this.status = status;
		this.content = content;
	}@Override
	public String getResourceType() {
		return CodeSystem.resourceType;
	}




/**
 * CodeSystem.java
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem) on 2020-10-19
 */
public static class CodeSystemConcept extends BackboneElement  {

	public static final String resourceType = "CodeSystemConcept";
  
	// Code that identifies concept.
    @Json(name = "code")
	public String code;
  
	// Text to display to the user.
    @Json(name = "display")
	@Nullable
	public String display;
  
	// Formal definition.
    @Json(name = "definition")
	@Nullable
	public String definition;
  
	// Additional representations for the concept.
    @Json(name = "designation")
	@Nullable
	public List<CodeSystemConceptDesignation> designation;
  
	// Property value for the concept.
    @Json(name = "property")
	@Nullable
	public List<CodeSystemConceptProperty> property;
  
	// Child Concepts (is-a/contains/categorizes).
    @Json(name = "concept")
	@Nullable
	public List<CodeSystemConcept> concept;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param code String
	 *
	 */
	public CodeSystemConcept(String code) {
		this.code = code;
	}@Override
	public String getResourceType() {
		return CodeSystemConcept.resourceType;
	}


}



/**
 * CodeSystem.java
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem) on 2020-10-19
 */
public static class CodeSystemConceptDesignation extends BackboneElement  {

	public static final String resourceType = "CodeSystemConceptDesignation";
  
	// Human language of the designation.
    @Json(name = "language")
	@Nullable
	public String language;
  
	// Details how this designation would be used.
    @Json(name = "use")
	@Nullable
	public Coding use;
  
	// The text value for this designation.
    @Json(name = "value")
	public String value;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param value String
	 *
	 */
	public CodeSystemConceptDesignation(String value) {
		this.value = value;
	}@Override
	public String getResourceType() {
		return CodeSystemConceptDesignation.resourceType;
	}


}



/**
 * CodeSystem.java
 *
 * A property value for this concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem) on 2020-10-19
 */
public static class CodeSystemConceptProperty extends BackboneElement  {

	public static final String resourceType = "CodeSystemConceptProperty";
  
	// Reference to CodeSystem.property.code.
    @Json(name = "code")
	public String code;
  
	// Value of the property for this concept.
    @Json(name = "valueCode")
	@Nullable
	public String valueCode;
  
	// Value of the property for this concept.
    @Json(name = "valueCoding")
	@Nullable
	public Coding valueCoding;
  
	// Value of the property for this concept.
    @Json(name = "valueString")
	@Nullable
	public String valueString;
  
	// Value of the property for this concept.
    @Json(name = "valueInteger")
	@Nullable
	public Integer valueInteger;
  
	// Value of the property for this concept.
    @Json(name = "valueBoolean")
	@Nullable
	public Boolean valueBoolean;
  
	// Value of the property for this concept.
    @Json(name = "valueDateTime")
	@Nullable
	public FhirDateTime valueDateTime;
  
	// Value of the property for this concept.
    @Json(name = "valueDecimal")
	@Nullable
	public FhirDecimal valueDecimal;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param code String
	 *
	 * @param value as one of Boolean, String, Coding, FhirDateTime, FhirDecimal, Integer, String*
	 *
	 */
	public CodeSystemConceptProperty(String code, Object value) {
		this.code = code;
		if (value instanceof Boolean) {
			this.valueBoolean = (Boolean) value;
		}
		else if (value instanceof String) {
			this.valueCode = (String) value;
		}
		else if (value instanceof Coding) {
			this.valueCoding = (Coding) value;
		}
		else if (value instanceof FhirDateTime) {
			this.valueDateTime = (FhirDateTime) value;
		}
		else if (value instanceof FhirDecimal) {
			this.valueDecimal = (FhirDecimal) value;
		}
		else if (value instanceof Integer) {
			this.valueInteger = (Integer) value;
		}
		else if (value instanceof String) {
			this.valueString = (String) value;
		}
		else {
			//FIXME Type: (of: value)) for property (value) is invalid, ignoring")
		}
	}@Override
	public String getResourceType() {
		return CodeSystemConceptProperty.resourceType;
	}


}



/**
 * CodeSystem.java
 *
 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem) on 2020-10-19
 */
public static class CodeSystemFilter extends BackboneElement  {

	public static final String resourceType = "CodeSystemFilter";
  
	// Code that identifies the filter.
    @Json(name = "code")
	public String code;
  
	// How or why the filter is used.
    @Json(name = "description")
	@Nullable
	public String description;
  
	// A list of operators that can be used with the filter.
    @Json(name = "operator")
	public List<CodeSystemFilterOperator> operator;
  
	// What to use for the value.
    @Json(name = "value")
	public String value;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param code String
	 *
	 * @param operator List of CodeSystemFilterOperator
	 *
	 * @param value String
	 *
	 */
	public CodeSystemFilter(String code, List<CodeSystemFilterOperator> operator, String value) {
		this.code = code;
		this.operator = operator;
		this.value = value;
	}@Override
	public String getResourceType() {
		return CodeSystemFilter.resourceType;
	}


}



/**
 * CodeSystem.java
 *
 * A property defines an additional slot through which additional information can be provided about a concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem) on 2020-10-19
 */
public static class CodeSystemProperty extends BackboneElement  {

	public static final String resourceType = "CodeSystemProperty";
  
	// Identifies the property on the concepts, and when referred to in operations.
    @Json(name = "code")
	public String code;
  
	// Formal identifier for the property.
    @Json(name = "uri")
	@Nullable
	public String uri;
  
	// Why the property is defined, and/or what it conveys.
    @Json(name = "description")
	@Nullable
	public String description;
  
	// The type of the property value. Properties of type "code" contain a code defined by the code system (e.g. a reference to another defined concept).
    @Json(name = "type")
	public CodeSystemPropertyType type;

    
	/**
	 * Constructor for all required properties.
	 *
	 * @param code String
	 *
	 * @param type CodeSystemPropertyType
	 *
	 */
	public CodeSystemProperty(String code, CodeSystemPropertyType type) {
		this.code = code;
		this.type = type;
	}@Override
	public String getResourceType() {
		return CodeSystemProperty.resourceType;
	}


}


}