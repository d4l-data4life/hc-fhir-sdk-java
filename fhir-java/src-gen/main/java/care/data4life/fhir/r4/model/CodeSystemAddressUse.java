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
 * The use of an address.
 *
 * @see <a href="http://hl7.org/fhir/address-use">AddressUse</a>
 */
public enum CodeSystemAddressUse {

    /**
     * A communication address at a home.
     */
    @Json(name = "home")
    HOME,

    /**
     * An office address. First choice for business related contacts during business hours.
     */
    @Json(name = "work")
    WORK,

    /**
     * A temporary address. The period can provide more detailed information.
     */
    @Json(name = "temp")
    TEMP,

    /**
     * This address is no longer in use (or was never correct but retained for records).
     */
    @Json(name = "old")
    OLD,

    /**
     * An address to be used to send bills, invoices, receipts etc.
     */
    @Json(name = "billing")
    BILLING,
}
