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
 * The impact of the content of a message.
 *
 * @see <a href="http://hl7.org/fhir/message-significance-category">MessageSignificanceCategory</a>
 */
public enum CodeSystemMessageSignificanceCategory {

    /**
     * The message represents/requests a change that should not be processed more than once; e.g.,
     * making a booking for an appointment.
     */
    @Json(name = "Consequence")
    CONSEQUENCE,

    /**
     * The message represents a response to query for current information. Retrospective processing
     * is wrong and/or wasteful.
     */
    @Json(name = "Currency")
    CURRENCY,

    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though
     * there may be version issues created by processing old notifications.
     */
    @Json(name = "Notification")
    NOTIFICATION,
}
