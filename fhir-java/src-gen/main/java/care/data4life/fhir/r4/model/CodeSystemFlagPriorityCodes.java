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
 * This value set is provided as an exemplar. The value set is driven by IHE Table B.8-4: Abnormal Flags, Alert
 * Priority.
 *
 * @see <a href="http://hl7.org/fhir/flag-priority-code">FlagPriorityCodes</a>
 */
public enum CodeSystemFlagPriorityCodes {

    /**
     * No alarm.
     */
    @Json(name = "PN")
    PN,

    /**
     * Low priority.
     */
    @Json(name = "PL")
    PL,

    /**
     * Medium priority.
     */
    @Json(name = "PM")
    PM,

    /**
     * High priority.
     */
    @Json(name = "PH")
    PH,
}
