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
 * This value set includes a smattering of Benefit type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/benefit-type">BenefitTypeCodes</a>
 */
public enum CodeSystemBenefitTypeCodes {

    /**
     * Maximum benefit allowable.
     */
    @Json(name = "benefit")
    BENEFIT,

    /**
     * Cost to be incurred before benefits are applied
     */
    @Json(name = "deductible")
    DEDUCTIBLE,

    /**
     * Service visit
     */
    @Json(name = "visit")
    VISIT,

    /**
     * Type of room
     */
    @Json(name = "room")
    ROOM,

    /**
     * Copayment per service
     */
    @Json(name = "copay")
    COPAY,

    /**
     * Copayment percentage per service
     */
    @Json(name = "copay-percent")
    COPAY_PERCENT,

    /**
     * Copayment maximum per service
     */
    @Json(name = "copay-maximum")
    COPAY_MAXIMUM,

    /**
     * Vision Exam
     */
    @Json(name = "vision-exam")
    VISION_EXAM,

    /**
     * Frames and lenses
     */
    @Json(name = "vision-glasses")
    VISION_GLASSES,

    /**
     * Contact Lenses
     */
    @Json(name = "vision-contacts")
    VISION_CONTACTS,

    /**
     * Medical Primary Health Coverage
     */
    @Json(name = "medical-primarycare")
    MEDICAL_PRIMARYCARE,

    /**
     * Pharmacy Dispense Coverage
     */
    @Json(name = "pharmacy-dispense")
    PHARMACY_DISPENSE,
}
