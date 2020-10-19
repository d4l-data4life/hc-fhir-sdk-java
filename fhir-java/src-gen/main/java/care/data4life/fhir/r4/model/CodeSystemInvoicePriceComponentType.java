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
 * Codes indicating the kind of the price component.
 *
 * @see <a href="http://hl7.org/fhir/invoice-priceComponentType">InvoicePriceComponentType</a>
 */
public enum CodeSystemInvoicePriceComponentType {

    /**
     * the amount is the base price used for calculating the total price before applying surcharges,
     * discount or taxes.
     */
    @Json(name = "base")
    BASE,

    /**
     * the amount is a surcharge applied on the base price.
     */
    @Json(name = "surcharge")
    SURCHARGE,

    /**
     * the amount is a deduction applied on the base price.
     */
    @Json(name = "deduction")
    DEDUCTION,

    /**
     * the amount is a discount applied on the base price.
     */
    @Json(name = "discount")
    DISCOUNT,

    /**
     * the amount is the tax component of the total price.
     */
    @Json(name = "tax")
    TAX,

    /**
     * the amount is of informational character, it has not been applied in the calculation of the
     * total price.
     */
    @Json(name = "informational")
    INFORMATIONAL,
}
