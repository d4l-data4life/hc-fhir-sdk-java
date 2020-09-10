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

import javax.annotation.Nullable;

/**
 * SampledData.java
 * <p>
 * A series of measurements taken by a device, with upper and lower limits. There may be more than
 * one dimension in the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SampledData">SampledData</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SampledData) on
 * 2020-07-29
 */
public class SampledData extends Element {

    public static final String resourceType = "SampledData";

    // Decimal values with spaces, or "E" | "U" | "L".
    @Json(name = "data")
    public String data;

    // Number of sample points at each time point.
    @Json(name = "dimensions")
    public Integer dimensions;

    // Multiply data by this before adding to origin.
    @Json(name = "factor")
    @Nullable
    public FhirDecimal factor;

    // Lower limit of detection.
    @Json(name = "lowerLimit")
    @Nullable
    public FhirDecimal lowerLimit;

    // Zero value and units.
    @Json(name = "origin")
    public Quantity origin;

    // Number of milliseconds between samples.
    @Json(name = "period")
    public FhirDecimal period;

    // Upper limit of detection.
    @Json(name = "upperLimit")
    @Nullable
    public FhirDecimal upperLimit;

    /**
     * Constructor for all required properties.
     *
     * @param data       String
     * @param dimensions Integer
     * @param origin     Quantity
     * @param period     FhirDecimal
     */
    public SampledData(String data, Integer dimensions, Quantity origin, FhirDecimal period) {
        this.data = data;
        this.dimensions = dimensions;
        this.origin = origin;
        this.period = period;
    }

    @Override
    public String getResourceType() {
        return SampledData.resourceType;
    }
}
