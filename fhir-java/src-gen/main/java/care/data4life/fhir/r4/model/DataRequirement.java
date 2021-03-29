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
 * DataRequirement.java
 * <p>
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters
 * of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement) on 2021-03-26
 */
public class DataRequirement extends Element {

    public static final String resourceType = "DataRequirement";

    // The type of the required data.
    @Json(name = "type")
    public String type;

    // The profile of the required data.
    @Json(name = "profile")
    @Nullable
    public List<Canonical> profile;

    // E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
    @Json(name = "subjectCodeableConcept")
    @Nullable
    public CodeableConcept subjectCodeableConcept;

    // E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
    @Json(name = "subjectReference")
    @Nullable
    public Reference subjectReference;

    // Indicates specific structure elements that are referenced by the knowledge module.
    @Json(name = "mustSupport")
    @Nullable
    public List<String> mustSupport;

    // What codes are expected.
    @Json(name = "codeFilter")
    @Nullable
    public List<DataRequirementCodeFilter> codeFilter;

    // What dates/date ranges are expected.
    @Json(name = "dateFilter")
    @Nullable
    public List<DataRequirementDateFilter> dateFilter;

    // Number of results.
    @Json(name = "limit")
    @Nullable
    public Integer limit;

    // Order of the results.
    @Json(name = "sort")
    @Nullable
    public List<DataRequirementSort> sort;


    /**
     * Constructor for all required properties.
     *
     * @param type String
     */
    public DataRequirement(String type) {
        this.type = type;
    }

    @Override
    public String getResourceType() {
        return DataRequirement.resourceType;
    }


    /**
     * DataRequirement.java
     * <p>
     * Code filters specify additional constraints on the data, specifying the value set of interest for a particular
     * element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed,
     * not OR'ed.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement) on 2021-03-26
     */
    public static class DataRequirementCodeFilter extends Element {

        public static final String resourceType = "DataRequirementCodeFilter";

        // A code-valued attribute to filter on.
        @Json(name = "path")
        @Nullable
        public String path;

        // A coded (token) parameter to search on.
        @Json(name = "searchParam")
        @Nullable
        public String searchParam;

        // Valueset for the filter.
        @Json(name = "valueSet")
        @Nullable
        public Canonical valueSet;

        // What code is expected.
        @Json(name = "code")
        @Nullable
        public List<Coding> code;


        public DataRequirementCodeFilter() {
        }

        @Override
        public String getResourceType() {
            return DataRequirementCodeFilter.resourceType;
        }


    }


    /**
     * DataRequirement.java
     * <p>
     * Date filters specify additional constraints on the data in terms of the applicable date range for specific
     * elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not
     * OR'ed.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement) on 2021-03-26
     */
    public static class DataRequirementDateFilter extends Element {

        public static final String resourceType = "DataRequirementDateFilter";

        // A date-valued attribute to filter on.
        @Json(name = "path")
        @Nullable
        public String path;

        // A date valued parameter to search on.
        @Json(name = "searchParam")
        @Nullable
        public String searchParam;

        // The value of the filter, as a Period, DateTime, or Duration value.
        @Json(name = "valueDateTime")
        @Nullable
        public FhirDateTime valueDateTime;

        // The value of the filter, as a Period, DateTime, or Duration value.
        @Json(name = "valuePeriod")
        @Nullable
        public Period valuePeriod;

        // The value of the filter, as a Period, DateTime, or Duration value.
        @Json(name = "valueDuration")
        @Nullable
        public Duration valueDuration;


        public DataRequirementDateFilter() {
        }

        @Override
        public String getResourceType() {
            return DataRequirementDateFilter.resourceType;
        }


    }


    /**
     * DataRequirement.java
     * <p>
     * Specifies the order of the results to be returned.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement) on 2021-03-26
     */
    public static class DataRequirementSort extends Element {

        public static final String resourceType = "DataRequirementSort";

        // The name of the attribute to perform the sort.
        @Json(name = "path")
        public String path;

        // The direction of the sort, ascending or descending.
        @Json(name = "direction")
        public CodeSystemSortDirection direction;


        /**
         * Constructor for all required properties.
         *
         * @param path      String
         * @param direction CodeSystemSortDirection
         */
        public DataRequirementSort(String path, CodeSystemSortDirection direction) {
            this.path = path;
            this.direction = direction;
        }

        @Override
        public String getResourceType() {
            return DataRequirementSort.resourceType;
        }


    }


}