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
 * Indicates whether this flag is active and needs to be displayed to a user, or whether it is no longer needed or was entered in error.
 *
 * @see <a href="http://hl7.org/fhir/flag-status">FlagStatus</a>
 */
public enum CodeSystemFlagStatus {

    /**
     * A current flag that should be displayed to a user. A system may use the category to determine which user roles should view the flag.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The flag no longer needs to be displayed.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The flag was added in error and should no longer be displayed.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
}
