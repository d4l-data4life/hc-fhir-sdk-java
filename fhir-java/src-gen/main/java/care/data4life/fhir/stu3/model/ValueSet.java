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
 * ValueSet.java
 * <p>
 * A value set specifies a set of codes drawn from one or more code systems.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-15
 */
public class ValueSet extends DomainResource {

    public static final String resourceType = "ValueSet";

    // Logical URI to reference this value set (globally unique).
    @Json(name = "url")
    @Nullable
    public String url;

    // Additional identifier for the value set.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Business version of the value set.
    @Json(name = "version")
    @Nullable
    public String version;

    // Name for this value set (computer friendly).
    @Json(name = "name")
    @Nullable
    public String name;

    // Name for this value set (human friendly).
    @Json(name = "title")
    @Nullable
    public String title;

    // The status of this value set. Enables tracking the life-cycle of the content.
    @Json(name = "status")
    public CodeSystemPublicationStatus status;

    // For testing purposes, not real usage.
    @Json(name = "experimental")
    @Nullable
    public Boolean experimental;

    // Date this was last changed.
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

    // Natural language description of the value set.
    @Json(name = "description")
    @Nullable
    public String description;

    // Context the content is intended to support.
    @Json(name = "useContext")
    @Nullable
    public List<UsageContext> useContext;

    // Intended jurisdiction for value set (if applicable).
    @Json(name = "jurisdiction")
    @Nullable
    public List<CodeableConcept> jurisdiction;

    // Indicates whether or not any change to the content logical definition may occur.
    @Json(name = "immutable")
    @Nullable
    public Boolean immutable;

    // Why this value set is defined.
    @Json(name = "purpose")
    @Nullable
    public String purpose;

    // Use and/or publishing restrictions.
    @Json(name = "copyright")
    @Nullable
    public String copyright;

    // Whether this is intended to be used with an extensible binding.
    @Json(name = "extensible")
    @Nullable
    public Boolean extensible;

    // Definition of the content of the value set (CLD).
    @Json(name = "compose")
    @Nullable
    public ValueSetCompose compose;

    // Used when the value set is "expanded".
    @Json(name = "expansion")
    @Nullable
    public ValueSetExpansion expansion;


    /**
     * Constructor for all required properties.
     *
     * @param status CodeSystemPublicationStatus
     */
    public ValueSet(CodeSystemPublicationStatus status) {
        this.status = status;
    }

    @Override
    public String getResourceType() {
        return ValueSet.resourceType;
    }


    /**
     * ValueSet.java
     * <p>
     * A set of criteria that define the content logical definition of the value set by including or
     * excluding codes from outside this value set. This I also known as the "Content Logical
     * Definition" (CLD).
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetCompose extends BackboneElement {

        public static final String resourceType = "ValueSetCompose";

        // Fixed date for version-less references (transitive).
        @Json(name = "lockedDate")
        @Nullable
        public FhirDate lockedDate;

        // Whether inactive codes are in the value set.
        @Json(name = "inactive")
        @Nullable
        public Boolean inactive;

        // Include one or more codes from a code system or other value set(s).
        @Json(name = "include")
        public List<ValueSetComposeInclude> include;

        // Explicitly exclude codes from a code system or other value sets.
        @Json(name = "exclude")
        @Nullable
        public List<ValueSetComposeInclude> exclude;


        /**
         * Constructor for all required properties.
         *
         * @param include List of ValueSetComposeInclude
         */
        public ValueSetCompose(List<ValueSetComposeInclude> include) {
            this.include = include;
        }

        @Override
        public String getResourceType() {
            return ValueSetCompose.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * Include one or more codes from a code system or other value set(s)
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetComposeInclude extends BackboneElement {

        public static final String resourceType = "ValueSetComposeInclude";

        // The system the codes come from.
        @Json(name = "system")
        @Nullable
        public String system;

        // Specific version of the code system referred to.
        @Json(name = "version")
        @Nullable
        public String version;

        // A concept defined in the system.
        @Json(name = "concept")
        @Nullable
        public List<ValueSetComposeIncludeConcept> concept;

        // Select codes/concepts by their properties (including relationships).
        @Json(name = "filter")
        @Nullable
        public List<ValueSetComposeIncludeFilter> filter;

        // Select only contents included in this value set.
        @Json(name = "valueSet")
        @Nullable
        public List<String> valueSet;


        public ValueSetComposeInclude() {
        }

        @Override
        public String getResourceType() {
            return ValueSetComposeInclude.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * Specifies a concept to be included or excluded.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetComposeIncludeConcept extends BackboneElement {

        public static final String resourceType = "ValueSetComposeIncludeConcept";

        // Code or expression from system.
        @Json(name = "code")
        public String code;

        // Text to display for this code for this value set in this valueset.
        @Json(name = "display")
        @Nullable
        public String display;

        // Additional representations for this concept.
        @Json(name = "designation")
        @Nullable
        public List<ValueSetComposeIncludeConceptDesignation> designation;


        /**
         * Constructor for all required properties.
         *
         * @param code String
         */
        public ValueSetComposeIncludeConcept(String code) {
            this.code = code;
        }

        @Override
        public String getResourceType() {
            return ValueSetComposeIncludeConcept.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * Additional representations for this concept when used in this value set - other languages,
     * aliases, specialized purposes, used for particular purposes, etc.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetComposeIncludeConceptDesignation extends BackboneElement {

        public static final String resourceType = "ValueSetComposeIncludeConceptDesignation";

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
         */
        public ValueSetComposeIncludeConceptDesignation(String value) {
            this.value = value;
        }

        @Override
        public String getResourceType() {
            return ValueSetComposeIncludeConceptDesignation.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * Select concepts by specify a matching criteria based on the properties (including
     * relationships) defined by the system. If multiple filters are specified, they SHALL all be
     * true.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetComposeIncludeFilter extends BackboneElement {

        public static final String resourceType = "ValueSetComposeIncludeFilter";

        // A property defined by the code system.
        @Json(name = "property")
        public String property;

        // The kind of operation to perform as a part of the filter criteria.
        @Json(name = "op")
        public CodeSystemFilterOperator op;

        // Code from the system, or regex criteria, or boolean value for exists.
        @Json(name = "value")
        public String value;


        /**
         * Constructor for all required properties.
         *
         * @param property String
         * @param op       CodeSystemFilterOperator
         * @param value    String
         */
        public ValueSetComposeIncludeFilter(String property, CodeSystemFilterOperator op, String value) {
            this.property = property;
            this.op = op;
            this.value = value;
        }

        @Override
        public String getResourceType() {
            return ValueSetComposeIncludeFilter.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * A value set can also be "expanded", where the value set is turned into a simple collection of
     * enumerated codes. This element holds the expansion, if it has been performed.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetExpansion extends BackboneElement {

        public static final String resourceType = "ValueSetExpansion";

        // Uniquely identifies this expansion.
        @Json(name = "identifier")
        public String identifier;

        // Time ValueSet expansion happened.
        @Json(name = "timestamp")
        public FhirDateTime timestamp;

        // Total number of codes in the expansion.
        @Json(name = "total")
        @Nullable
        public Integer total;

        // Offset at which this resource starts.
        @Json(name = "offset")
        @Nullable
        public Integer offset;

        // Parameter that controlled the expansion process.
        @Json(name = "parameter")
        @Nullable
        public List<ValueSetExpansionParameter> parameter;

        // Codes in the value set.
        @Json(name = "contains")
        @Nullable
        public List<ValueSetExpansionContains> contains;


        /**
         * Constructor for all required properties.
         *
         * @param identifier String
         * @param timestamp  FhirDateTime
         */
        public ValueSetExpansion(String identifier, FhirDateTime timestamp) {
            this.identifier = identifier;
            this.timestamp = timestamp;
        }

        @Override
        public String getResourceType() {
            return ValueSetExpansion.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * The codes that are contained in the value set expansion.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetExpansionContains extends BackboneElement {

        public static final String resourceType = "ValueSetExpansionContains";

        // System value for the code.
        @Json(name = "system")
        @Nullable
        public String system;

        // If user cannot select this entry.
        @Json(name = "abstract")
        @Nullable
        public Boolean abstrakt;

        // If concept is inactive in the code system.
        @Json(name = "inactive")
        @Nullable
        public Boolean inactive;

        // Version in which this code/display is defined.
        @Json(name = "version")
        @Nullable
        public String version;

        // Code - if blank, this is not a selectable code.
        @Json(name = "code")
        @Nullable
        public String code;

        // User display for the concept.
        @Json(name = "display")
        @Nullable
        public String display;

        // Additional representations for this item.
        @Json(name = "designation")
        @Nullable
        public List<ValueSetComposeIncludeConceptDesignation> designation;

        // Codes contained under this entry.
        @Json(name = "contains")
        @Nullable
        public List<ValueSetExpansionContains> contains;


        public ValueSetExpansionContains() {
        }

        @Override
        public String getResourceType() {
            return ValueSetExpansionContains.resourceType;
        }


    }


    /**
     * ValueSet.java
     * <p>
     * A parameter that controlled the expansion process. These parameters may be used by users of
     * expanded value sets to check whether the expansion is suitable for a particular purpose, or
     * to pick the correct expansion.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on
     * 2020-10-15
     */
    public static class ValueSetExpansionParameter extends BackboneElement {

        public static final String resourceType = "ValueSetExpansionParameter";

        // Name as assigned by the server.
        @Json(name = "name")
        public String name;

        // Value of the named parameter.
        @Json(name = "valueString")
        @Nullable
        public String valueString;

        // Value of the named parameter.
        @Json(name = "valueBoolean")
        @Nullable
        public Boolean valueBoolean;

        // Value of the named parameter.
        @Json(name = "valueInteger")
        @Nullable
        public Integer valueInteger;

        // Value of the named parameter.
        @Json(name = "valueDecimal")
        @Nullable
        public FhirDecimal valueDecimal;

        // Value of the named parameter.
        @Json(name = "valueUri")
        @Nullable
        public String valueUri;

        // Value of the named parameter.
        @Json(name = "valueCode")
        @Nullable
        public String valueCode;


        /**
         * Constructor for all required properties.
         *
         * @param name String
         */
        public ValueSetExpansionParameter(String name) {
            this.name = name;
        }

        @Override
        public String getResourceType() {
            return ValueSetExpansionParameter.resourceType;
        }


    }


}
