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
 * Overall categorization of the event, e.g. product-related or situational.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/adverse-event-category">AdverseEventCategory</a>
 */
public enum CodeSystemAdverseEventCategory {

    /**
     * The adverse event pertains to a product problem.
     */
    @Json(name = "product-problem")
    PRODUCT_PROBLEM,

    /**
     * The adverse event pertains to product quality.
     */
    @Json(name = "product-quality")
    PRODUCT_QUALITY,

    /**
     * The adverse event pertains to a product use error.
     */
    @Json(name = "product-use-error")
    PRODUCT_USE_ERROR,

    /**
     * The adverse event pertains to a wrong dose.
     */
    @Json(name = "wrong-dose")
    WRONG_DOSE,

    /**
     * The adverse event pertains to incorrect perscribing information.
     */
    @Json(name = "incorrect-prescribing-information")
    INCORRECT_PRESCRIBING_INFORMATION,

    /**
     * The adverse event pertains to a wrong technique.
     */
    @Json(name = "wrong-technique")
    WRONG_TECHNIQUE,

    /**
     * The adverse event pertains to a wrong route of administration.
     */
    @Json(name = "wrong-route-of-administration")
    WRONG_ROUTE_OF_ADMINISTRATION,

    /**
     * The adverse event pertains to a wrong rate.
     */
    @Json(name = "wrong-rate")
    WRONG_RATE,

    /**
     * The adverse event pertains to a wrong duration.
     */
    @Json(name = "wrong-duration")
    WRONG_DURATION,

    /**
     * The adverse event pertains to a wrong time.
     */
    @Json(name = "wrong-time")
    WRONG_TIME,

    /**
     * The adverse event pertains to an expired drug.
     */
    @Json(name = "expired-drug")
    EXPIRED_DRUG,

    /**
     * The adverse event pertains to a medical device use error.
     */
    @Json(name = "medical-device-use-error")
    MEDICAL_DEVICE_USE_ERROR,

    /**
     * The adverse event pertains to a problem with a different manufacturer of the same medication.
     */
    @Json(name = "problem-different-manufacturer")
    PROBLEM_DIFFERENT_MANUFACTURER,

    /**
     * The adverse event pertains to an unsafe physical environment.
     */
    @Json(name = "unsafe-physical-environment")
    UNSAFE_PHYSICAL_ENVIRONMENT,
}
