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


/**
 * How a compartment must be linked.
 *
 * @see <a href="http://hl7.org/fhir/graph-compartment-rule">GraphCompartmentRule</a>
 */
public enum CodeSystemGraphCompartmentRule {

    /**
     * The compartment must be identical (the same literal reference).
     */
    @Json(name = "identical")
    IDENTICAL,

    /**
     * The compartment must be the same - the record must be about the same patient, but the reference may be different.
     */
    @Json(name = "matching")
    MATCHING,

    /**
     * The compartment must be different.
     */
    @Json(name = "different")
    DIFFERENT,

    /**
     * The compartment rule is defined in the accompanying FHIRPath expression.
     */
    @Json(name = "custom")
    CUSTOM,
}
