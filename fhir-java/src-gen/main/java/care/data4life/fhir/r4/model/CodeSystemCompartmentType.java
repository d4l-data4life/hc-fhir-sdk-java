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
 * Which type a compartment definition describes.
 *
 * @see <a href="http://hl7.org/fhir/compartment-type">CompartmentType</a>
 */
public enum CodeSystemCompartmentType {

    /**
     * The compartment definition is for the patient compartment.
     */
    @Json(name = "Patient")
    PATIENT,

    /**
     * The compartment definition is for the encounter compartment.
     */
    @Json(name = "Encounter")
    ENCOUNTER,

    /**
     * The compartment definition is for the related-person compartment.
     */
    @Json(name = "RelatedPerson")
    RELATEDPERSON,

    /**
     * The compartment definition is for the practitioner compartment.
     */
    @Json(name = "Practitioner")
    PRACTITIONER,

    /**
     * The compartment definition is for the device compartment.
     */
    @Json(name = "Device")
    DEVICE,
}
