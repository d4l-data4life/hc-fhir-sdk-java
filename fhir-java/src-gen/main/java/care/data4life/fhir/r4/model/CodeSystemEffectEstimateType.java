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
 * Whether the effect estimate is an absolute effect estimate (absolute difference) or a relative effect estimate (relative difference), and the specific type of effect estimate (eg relative risk or median difference).
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/effect-estimate-type">EffectEstimateType</a>
 */
public enum CodeSystemEffectEstimateType {

    /**
     * relative risk (a type of relative effect estimate).
     */
    @Json(name = "relative-RR")
    RELATIVE_RR,

    /**
     * odds ratio (a type of relative effect estimate).
     */
    @Json(name = "relative-OR")
    RELATIVE_OR,

    /**
     * hazard ratio (a type of relative effect estimate).
     */
    @Json(name = "relative-HR")
    RELATIVE_HR,

    /**
     * absolute risk difference (a type of absolute effect estimate).
     */
    @Json(name = "absolute-ARD")
    ABSOLUTE_ARD,

    /**
     * mean difference (a type of absolute effect estimate).
     */
    @Json(name = "absolute-MeanDiff")
    ABSOLUTE_MEANDIFF,

    /**
     * standardized mean difference (a type of absolute effect estimate).
     */
    @Json(name = "absolute-SMD")
    ABSOLUTE_SMD,

    /**
     * median difference (a type of absolute effect estimate).
     */
    @Json(name = "absolute-MedianDiff")
    ABSOLUTE_MEDIANDIFF,
}
