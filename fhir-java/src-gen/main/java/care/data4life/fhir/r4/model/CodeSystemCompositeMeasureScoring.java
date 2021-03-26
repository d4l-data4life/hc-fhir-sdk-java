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
 * The composite scoring method of the measure.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/composite-measure-scoring">CompositeMeasureScoring</a>
 */
public enum CodeSystemCompositeMeasureScoring {

    /**
     * Opportunity scoring combines the scores from component measures by combining the numerators and denominators for
     * each component.
     */
    @Json(name = "opportunity")
    OPPORTUNITY,

    /**
     * All-or-nothing scoring includes an individual in the numerator of the composite measure if they are in the
     * numerators of all of the component measures in which they are in the denominator.
     */
    @Json(name = "all-or-nothing")
    ALL_OR_NOTHING,

    /**
     * Linear scoring gives an individual a score based on the number of numerators in which they appear.
     */
    @Json(name = "linear")
    LINEAR,

    /**
     * Weighted scoring gives an individual a score based on a weighted factor for each component numerator in which
     * they appear.
     */
    @Json(name = "weighted")
    WEIGHTED,
}
