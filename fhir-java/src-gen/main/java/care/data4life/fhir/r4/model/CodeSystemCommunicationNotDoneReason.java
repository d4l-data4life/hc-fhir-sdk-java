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
 * Codes for the reason why a communication did not happen.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/communication-not-done-reason">CommunicationNotDoneReason</a>
 */
public enum CodeSystemCommunicationNotDoneReason {

    /**
     * The communication was not done due to an unknown reason.
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * The communication was not done due to a system error.
     */
    @Json(name = "system-error")
    SYSTEM_ERROR,

    /**
     * The communication was not done due to an invalid phone number.
     */
    @Json(name = "invalid-phone-number")
    INVALID_PHONE_NUMBER,

    /**
     * The communication was not done due to the recipient being unavailable.
     */
    @Json(name = "recipient-unavailable")
    RECIPIENT_UNAVAILABLE,

    /**
     * The communication was not done due to a family objection.
     */
    @Json(name = "family-objection")
    FAMILY_OBJECTION,

    /**
     * The communication was not done due to a patient objection.
     */
    @Json(name = "patient-objection")
    PATIENT_OBJECTION,
}
