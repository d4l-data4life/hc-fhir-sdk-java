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
 * The status of a subscription.
 *
 * @see <a href="http://hl7.org/fhir/subscription-status">SubscriptionStatus</a>
 */
public enum CodeSystemSubscriptionStatus {

    /**
     * The client has requested the subscription, and the server has not yet set it up.
     */
    @Json(name = "requested")
    REQUESTED,

    /**
     * The subscription is active.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The server has an error executing the notification.
     */
    @Json(name = "error")
    ERROR,

    /**
     * Too many errors have occurred or the subscription has expired.
     */
    @Json(name = "off")
    OFF,
}
