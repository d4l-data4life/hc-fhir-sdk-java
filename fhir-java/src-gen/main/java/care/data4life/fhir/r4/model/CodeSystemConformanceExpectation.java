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
 * Indicates the degree of adherence to a specified behavior or capability expected for a system to
 * be deemed conformant with a specification.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/conformance-expectation">ConformanceExpectation</a>
 */
public enum CodeSystemConformanceExpectation {

    /**
     * Support for the specified capability is required to be considered conformant.
     */
    @Json(name = "SHALL")
    SHALL,

    /**
     * Support for the specified capability is strongly encouraged, and failure to support it should
     * only occur after careful consideration.
     */
    @Json(name = "SHOULD")
    SHOULD,

    /**
     * Support for the specified capability is not necessary to be considered conformant, and the
     * requirement should be considered strictly optional.
     */
    @Json(name = "MAY")
    MAY,

    /**
     * Support for the specified capability is strongly discouraged and should occur only after
     * careful consideration.
     */
    @Json(name = "SHOULD-NOT")
    SHOULD_NOT,
}
