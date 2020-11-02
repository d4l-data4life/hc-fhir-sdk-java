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
 * A set codes that define the functional status of an implanted device.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/implantStatus">ImplantStatus</a>
 */
public enum CodeSystemImplantStatus {

    /**
     * The implanted device is working normally.
     */
    @Json(name = "functional")
    FUNCTIONAL,

    /**
     * The implanted device is not working.
     */
    @Json(name = "non-functional")
    NON_FUNCTIONAL,

    /**
     * The implanted device has been turned off.
     */
    @Json(name = "disabled")
    DISABLED,

    /**
     * the functional status of the implant has not been determined.
     */
    @Json(name = "unknown")
    UNKNOWN,
}
