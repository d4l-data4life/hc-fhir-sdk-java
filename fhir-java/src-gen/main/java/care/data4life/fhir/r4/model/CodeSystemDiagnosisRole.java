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
 * This value set defines a set of codes that can be used to express the role of a diagnosis on the Encounter or EpisodeOfCare record.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/diagnosis-role">DiagnosisRole</a>
 */
public enum CodeSystemDiagnosisRole {

    /**
     * AD
     */
    @Json(name = "AD")
    AD,

    /**
     * DD
     */
    @Json(name = "DD")
    DD,

    /**
     * CC
     */
    @Json(name = "CC")
    CC,

    /**
     * CM
     */
    @Json(name = "CM")
    CM,

    /**
     * preOp
     */
    @Json(name = "pre-op")
    PRE_OP,

    /**
     * postOp
     */
    @Json(name = "post-op")
    POST_OP,

    /**
     * billing
     */
    @Json(name = "billing")
    BILLING,
}
