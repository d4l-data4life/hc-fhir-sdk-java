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
 * Indicates the status of the care team.
 *
 * @see <a href="http://hl7.org/fhir/care-team-status">CareTeamStatus</a>
 */
public enum CodeSystemCareTeamStatus {

    /**
     * The care team has been drafted and proposed, but not yet participating in the coordination
     * and delivery of patient care.
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * The care team is currently participating in the coordination and delivery of care.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The care team is temporarily on hold or suspended and not participating in the coordination
     * and delivery of care.
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The care team was, but is no longer, participating in the coordination and delivery of care.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The care team should have never existed.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
}
