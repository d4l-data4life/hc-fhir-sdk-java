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
 * This value set includes Financial Task Input Type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/financialtaskinputtype">FinancialTaskInputTypeCodes</a>
 */
public enum CodeSystemFinancialTaskInputTypeCodes {

    /**
     * The name of a resource to include in a selection.
     */
    @Json(name = "include")
    INCLUDE,

    /**
     * The name of a resource to not include in a selection.
     */
    @Json(name = "exclude")
    EXCLUDE,

    /**
     * A reference to the response resource to the original processing of a resource.
     */
    @Json(name = "origresponse")
    ORIGRESPONSE,

    /**
     * A reference value which must be quoted to authorize an action.
     */
    @Json(name = "reference")
    REFERENCE,

    /**
     * The sequence number associated with an item for reprocessing.
     */
    @Json(name = "item")
    ITEM,

    /**
     * The reference period for the action being requested.
     */
    @Json(name = "period")
    PERIOD,

    /**
     * The processing status from a check on the processing status of a resource such as the adjudication of a claim.
     */
    @Json(name = "status")
    STATUS,
}
