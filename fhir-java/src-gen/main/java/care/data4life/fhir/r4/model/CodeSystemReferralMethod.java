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
 * The methods of referral can be used when referring to a specific HealthCareService resource.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/service-referral-method">ReferralMethod</a>
 */
public enum CodeSystemReferralMethod {

    /**
     * Referrals may be accepted by fax.
     */
    @Json(name = "fax")
    FAX,

    /**
     * Referrals may be accepted over the phone from a practitioner.
     */
    @Json(name = "phone")
    PHONE,

    /**
     * Referrals may be accepted via a secure messaging system. To determine the types of secure
     * messaging systems supported, refer to the identifiers collection. Callers will need to
     * understand the specific identifier system used to know that they are able to transmit
     * messages.
     */
    @Json(name = "elec")
    ELEC,

    /**
     * Referrals may be accepted via a secure email. To send please encrypt with the services public
     * key.
     */
    @Json(name = "semail")
    SEMAIL,

    /**
     * Referrals may be accepted via regular postage (or hand delivered).
     */
    @Json(name = "mail")
    MAIL,
}
