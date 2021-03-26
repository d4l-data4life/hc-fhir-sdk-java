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
 * Example list of general categories for flagged issues. (Not complete or necessarily appropriate.)
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/flag-category">FlagCategory</a>
 */
public enum CodeSystemFlagCategory {

    /**
     * Flags related to the subject's dietary needs.
     */
    @Json(name = "diet")
    DIET,

    /**
     * Flags related to the subject's medications.
     */
    @Json(name = "drug")
    DRUG,

    /**
     * Flags related to performing laboratory tests and related processes (e.g. phlebotomy).
     */
    @Json(name = "lab")
    LAB,

    /**
     * Flags related to administrative and financial processes.
     */
    @Json(name = "admin")
    ADMIN,

    /**
     * Flags related to coming into contact with the patient.
     */
    @Json(name = "contact")
    CONTACT,

    /**
     * Flags related to the subject's clinical data.
     */
    @Json(name = "clinical")
    CLINICAL,

    /**
     * Flags related to behavior.
     */
    @Json(name = "behavioral")
    BEHAVIORAL,

    /**
     * Flags related to research.
     */
    @Json(name = "research")
    RESEARCH,

    /**
     * Flags related to subject's advance directives.
     */
    @Json(name = "advance-directive")
    ADVANCE_DIRECTIVE,

    /**
     * Flags related to safety precautions.
     */
    @Json(name = "safety")
    SAFETY,
}
