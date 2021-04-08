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
 * This example value set defines a set of codes that can be used to indicate a patient's gender
 * identity.
 *
 * @see <a href="http://hl7.org/fhir/gender-identity">GenderIdentity</a>
 */
public enum CodeSystemGenderIdentity {

    /**
     * the patient identifies as transgender male-to-female
     */
    @Json(name = "transgender-female")
    TRANSGENDER_FEMALE,

    /**
     * the patient identifies as transgender female-to-male
     */
    @Json(name = "transgender-male")
    TRANSGENDER_MALE,

    /**
     * the patient identifies with neither/both female and male
     */
    @Json(name = "non-binary")
    NON_BINARY,

    /**
     * the patient identifies as male
     */
    @Json(name = "male")
    MALE,

    /**
     * the patient identifies as female
     */
    @Json(name = "female")
    FEMALE,

    /**
     * other gender identity
     */
    @Json(name = "other")
    OTHER,

    /**
     * the patient does not wish to disclose his gender identity
     */
    @Json(name = "non-disclose")
    NON_DISCLOSE,
}
