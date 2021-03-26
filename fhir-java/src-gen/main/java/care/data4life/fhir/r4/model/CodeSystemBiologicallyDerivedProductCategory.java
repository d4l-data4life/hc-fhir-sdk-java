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
 * Biologically Derived Product Category.
 *
 * @see <a href="http://hl7.org/fhir/product-category">BiologicallyDerivedProductCategory</a>
 */
public enum CodeSystemBiologicallyDerivedProductCategory {

    /**
     * A collection of tissues joined in a structural unit to serve a common function.
     */
    @Json(name = "organ")
    ORGAN,

    /**
     * An ensemble of similar cells and their extracellular matrix from the same origin that together carry out a
     * specific function.
     */
    @Json(name = "tissue")
    TISSUE,

    /**
     * Body fluid.
     */
    @Json(name = "fluid")
    FLUID,

    /**
     * Collection of cells.
     */
    @Json(name = "cells")
    CELLS,

    /**
     * Biological agent of unspecified type.
     */
    @Json(name = "biologicalAgent")
    BIOLOGICALAGENT,
}
