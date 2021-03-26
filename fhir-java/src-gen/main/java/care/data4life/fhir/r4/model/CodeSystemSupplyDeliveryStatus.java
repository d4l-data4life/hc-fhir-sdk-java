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
 * Status of the supply delivery.
 *
 * @see <a href="http://hl7.org/fhir/supplydelivery-status">SupplyDeliveryStatus</a>
 */
public enum CodeSystemSupplyDeliveryStatus {

    /**
     * Supply has been requested, but not delivered.
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * Supply has been delivered ("completed").
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * Delivery was not completed.
     */
    @Json(name = "abandoned")
    ABANDONED,

    /**
     * This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "abandoned" rather than "entered-in-error".).
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
}
