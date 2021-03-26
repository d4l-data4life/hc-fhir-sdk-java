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
 * This example value set defines a set of codes that can be used to indicate the purpose for which you would contact a contact party.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/contactentity-type">ContactEntityType</a>
 */
public enum CodeSystemContactEntityType {

    /**
     * Contact details for information regarding to billing/general finance enquiries.
     */
    @Json(name = "BILL")
    BILL,

    /**
     * Contact details for administrative enquiries.
     */
    @Json(name = "ADMIN")
    ADMIN,

    /**
     * Contact details for issues related to Human Resources, such as staff matters, OH&S etc.
     */
    @Json(name = "HR")
    HR,

    /**
     * Contact details for dealing with issues related to insurance claims/adjudication/payment.
     */
    @Json(name = "PAYOR")
    PAYOR,

    /**
     * Generic information contact for patients.
     */
    @Json(name = "PATINF")
    PATINF,

    /**
     * Dedicated contact point for matters relating to press enquiries.
     */
    @Json(name = "PRESS")
    PRESS,
}
