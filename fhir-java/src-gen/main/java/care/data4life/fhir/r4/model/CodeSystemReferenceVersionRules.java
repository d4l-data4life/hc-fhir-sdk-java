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
 * Whether a reference needs to be version specific or version independent, or whether either can be used.
 *
 * @see <a href="http://hl7.org/fhir/reference-version-rules">ReferenceVersionRules</a>
 */
public enum CodeSystemReferenceVersionRules {

    /**
     * The reference may be either version independent or version specific.
     */
    @Json(name = "either")
    EITHER,

    /**
     * The reference must be version independent.
     */
    @Json(name = "independent")
    INDEPENDENT,

    /**
     * The reference must be version specific.
     */
    @Json(name = "specific")
    SPECIFIC,
}
