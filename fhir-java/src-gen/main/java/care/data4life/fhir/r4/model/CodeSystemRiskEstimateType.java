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
 * Whether the risk estimate is dichotomous, continuous or qualitative and the specific type of risk
 * estimate (eg proportion or median).
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/risk-estimate-type">RiskEstimateType</a>
 */
public enum CodeSystemRiskEstimateType {

    /**
     * dichotomous measure (present or absent) reported as a ratio compared to the denominator of 1
     * (A percentage is a proportion with denominator of 100).
     */
    @Json(name = "proportion")
    PROPORTION,

    /**
     * A special use case where the proportion is derived from a formula rather than derived from
     * summary evidence.
     */
    @Json(name = "derivedProportion")
    DERIVEDPROPORTION,

    /**
     * continuous numerical measure reported as an average.
     */
    @Json(name = "mean")
    MEAN,

    /**
     * continuous numerical measure reported as the middle of the range.
     */
    @Json(name = "median")
    MEDIAN,

    /**
     * descriptive measure reported as total number of items.
     */
    @Json(name = "count")
    COUNT,

    /**
     * descriptive measure reported as narrative.
     */
    @Json(name = "descriptive")
    DESCRIPTIVE,
}
