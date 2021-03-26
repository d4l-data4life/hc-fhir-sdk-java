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
 * The status of the location.
 *
 * @see <a href="http://hl7.org/fhir/encounter-location-status">EncounterLocationStatus</a>
 */
public enum CodeSystemEncounterLocationStatus {

    /**
     * The patient is planned to be moved to this location at some point in the future.
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The patient is currently at this location, or was between the period specified.
     * <p>
     * A system may update these records when the patient leaves the location to either reserved, or completed.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This location is held empty for this patient.
     */
    @Json(name = "reserved")
    RESERVED,

    /**
     * The patient was at this location during the period specified.
     * <p>
     * Not to be used when the patient is currently at the location.
     */
    @Json(name = "completed")
    COMPLETED,
}
