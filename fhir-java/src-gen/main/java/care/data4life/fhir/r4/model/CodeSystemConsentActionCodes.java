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
 * This value set includes sample Consent Action codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/consentaction">ConsentActionCodes</a>
 */
public enum CodeSystemConsentActionCodes {

    /**
     * Gather retrieved information for storage
     */
    @Json(name = "collect")
    COLLECT,

    /**
     * Retrieval without permitting collection, use or disclosure. e.g., no screen-scraping for
     * collection, use or disclosure (view-only access)
     */
    @Json(name = "access")
    ACCESS,

    /**
     * Utilize the retrieved information
     */
    @Json(name = "use")
    USE,

    /**
     * Transfer retrieved information
     */
    @Json(name = "disclose")
    DISCLOSE,

    /**
     * Allow retrieval of a patient's information for the purpose of update or rectify
     */
    @Json(name = "correct")
    CORRECT,
}
