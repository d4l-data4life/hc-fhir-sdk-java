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
 * This example value set defines a set of codes that can be used to indicate the role of a
 * Practitioner.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/practitioner-role">PractitionerRole</a>
 */
public enum CodeSystemPractitionerRole {

    /**
     * A qualified/registered medical practitioner
     */
    @Json(name = "doctor")
    DOCTOR,

    /**
     * A practitioner with nursing experience that may be qualified/registered
     */
    @Json(name = "nurse")
    NURSE,

    /**
     * A qualified/registered/licensed pharmacist
     */
    @Json(name = "pharmacist")
    PHARMACIST,

    /**
     * A practitioner that may perform research
     */
    @Json(name = "researcher")
    RESEARCHER,

    /**
     * Someone who is able to provide educational services
     */
    @Json(name = "teacher")
    TEACHER,

    /**
     * Someone who is qualified in Information and Communication Technologies
     */
    @Json(name = "ict")
    ICT,
}
