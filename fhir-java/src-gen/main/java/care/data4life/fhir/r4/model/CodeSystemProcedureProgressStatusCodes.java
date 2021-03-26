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
 * This value set is provided as an example. The value set to instantiate this attribute should be drawn from a robust terminology code system that consists of or contains concepts to support the procedure performance process.
 *
 * @see <a href="http://hl7.org/fhir/procedure-progress-status-code">ProcedureProgressStatusCodes</a>
 */
public enum CodeSystemProcedureProgressStatusCodes {

    /**
     * A patient is in the Operating Room.
     */
    @Json(name = "in-operating-room")
    IN_OPERATING_ROOM,

    /**
     * The patient is prepared for a procedure.
     */
    @Json(name = "prepared")
    PREPARED,

    /**
     * The patient is under anesthesia.
     */
    @Json(name = "anesthesia-induced")
    ANESTHESIA_INDUCED,

    /**
     * The patient has open incision(s).
     */
    @Json(name = "open-incision")
    OPEN_INCISION,

    /**
     * The patient has incision(s) closed.
     */
    @Json(name = "closed-incision")
    CLOSED_INCISION,

    /**
     * The patient is in the recovery room.
     */
    @Json(name = "in-recovery-room")
    IN_RECOVERY_ROOM,
}
