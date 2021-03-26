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
 * Use of contact point.
 *
 * @see <a href="http://hl7.org/fhir/contact-point-use">ContactPointUse</a>
 */
public enum CodeSystemContactPointUse {

    /**
     * A communication contact point at a home; attempted contacts for business purposes might intrude privacy and chances are one will contact family or other household members instead of the person one wishes to call. Typically used with urgent cases, or if no other contacts are available.
     */
    @Json(name = "home")
    HOME,

    /**
     * An office contact point. First choice for business related contacts during business hours.
     */
    @Json(name = "work")
    WORK,

    /**
     * A temporary contact point. The period can provide more detailed information.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * This contact point is no longer in use (or was never correct, but retained for records).
     */
    @Json(name = "old")
    OLD,

    /**
     * A telecommunication device that moves and stays with its owner. May have characteristics of all other use codes, suitable for urgent matters, not the first choice for routine business.
     */
    @Json(name = "mobile")
    MOBILE,
}
