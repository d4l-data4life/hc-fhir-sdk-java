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
 * A code specifying the types of information being requested.
 *
 * @see <a href="http://hl7.org/fhir/eligibilityrequest-purpose">EligibilityRequestPurpose</a>
 */
public enum CodeSystemEligibilityRequestPurpose {

    /**
     * The prior authorization requirements for the listed, or discovered if specified, converages for the categories of
     * service and/or specifed biling codes are requested.
     */
    @Json(name = "auth-requirements")
    AUTH_REQUIREMENTS,

    /**
     * The plan benefits and optionally benefits consumed  for the listed, or discovered if specified, converages are
     * requested.
     */
    @Json(name = "benefits")
    BENEFITS,

    /**
     * The insurer is requested to report on any coverages which they are aware of in addition to any specifed.
     */
    @Json(name = "discovery")
    DISCOVERY,

    /**
     * A check that the specified coverages are in-force is requested.
     */
    @Json(name = "validation")
    VALIDATION,
}
