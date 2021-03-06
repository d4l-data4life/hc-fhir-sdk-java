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
 * The type of method used to execute a subscription.
 *
 * @see <a href="http://hl7.org/fhir/subscription-channel-type">SubscriptionChannelType</a>
 */
public enum CodeSystemSubscriptionChannelType {

    /**
     * The channel is executed by making a post to the URI. If a payload is included, the URL is
     * interpreted as the service base, and an update (PUT) is made.
     */
    @Json(name = "rest-hook")
    REST_HOOK,

    /**
     * The channel is executed by sending a packet across a web socket connection maintained by the
     * client. The URL identifies the websocket, and the client binds to this URL.
     */
    @Json(name = "websocket")
    WEBSOCKET,

    /**
     * The channel is executed by sending an email to the email addressed in the URI (which must be
     * a mailto:).
     */
    @Json(name = "email")
    EMAIL,

    /**
     * The channel is executed by sending an SMS message to the phone number identified in the URL
     * (tel:).
     */
    @Json(name = "sms")
    SMS,

    /**
     * The channel is executed by sending a message (e.g. a Bundle with a MessageHeader resource
     * etc.) to the application identified in the URI.
     */
    @Json(name = "message")
    MESSAGE,
}
