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
 * This value set includes Coverage Class codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/coverage-class">CoverageClassCodes</a>
 */
public enum CodeSystemCoverageClassCodes {

    /**
     * An employee group
     */
    @Json(name = "group")
    GROUP,

    /**
     * A sub-group of an employee group
     */
    @Json(name = "subgroup")
    SUBGROUP,

    /**
     * A specific suite of benefits.
     */
    @Json(name = "plan")
    PLAN,

    /**
     * A subset of a specific suite of benefits.
     */
    @Json(name = "subplan")
    SUBPLAN,

    /**
     * A class of benefits.
     */
    @Json(name = "class")
    CLASS,

    /**
     * A subset of a class of benefits.
     */
    @Json(name = "subclass")
    SUBCLASS,

    /**
     * A sequence number associated with a short-term continuance of the coverage.
     */
    @Json(name = "sequence")
    SEQUENCE,

    /**
     * Pharmacy benefit manager's Business Identification Number.
     */
    @Json(name = "rxbin")
    RXBIN,

    /**
     * A Pharmacy Benefit Manager specified Processor Control Number.
     */
    @Json(name = "rxpcn")
    RXPCN,

    /**
     * A Pharmacy Benefit Manager specified Member ID.
     */
    @Json(name = "rxid")
    RXID,

    /**
     * A Pharmacy Benefit Manager specified Group number.
     */
    @Json(name = "rxgroup")
    RXGROUP,
}
