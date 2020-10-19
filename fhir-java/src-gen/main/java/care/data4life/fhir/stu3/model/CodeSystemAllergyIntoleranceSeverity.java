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


/**
 * Clinical assessment of the severity of a reaction event as a whole, potentially considering
 * multiple different manifestations.
 *
 * @see <a href="http://hl7.org/fhir/reaction-event-severity">AllergyIntoleranceSeverity</a>
 */
public enum CodeSystemAllergyIntoleranceSeverity {

    /**
     * Causes mild physiological effects.
     */
    @Json(name = "mild")
    MILD,

    /**
     * Causes moderate physiological effects.
     */
    @Json(name = "moderate")
    MODERATE,

    /**
     * Causes severe physiological effects.
     */
    @Json(name = "severe")
    SEVERE,
}
