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
 * Estimate of the potential clinical harm, or seriousness, of a reaction to an identified
 * substance.
 *
 * @see <a href="http://hl7.org/fhir/allergy-intolerance-criticality">AllergyIntoleranceCriticality</a>
 */
public enum CodeSystemAllergyIntoleranceCriticality {

    /**
     * Worst case result of a future exposure is not assessed to be life-threatening or having high
     * potential for organ system failure.
     */
    @Json(name = "low")
    LOW,

    /**
     * Worst case result of a future exposure is assessed to be life-threatening or having high
     * potential for organ system failure.
     */
    @Json(name = "high")
    HIGH,

    /**
     * Unable to assess the worst case result of a future exposure.
     */
    @Json(name = "unable-to-assess")
    UNABLE_TO_ASSESS,
}
