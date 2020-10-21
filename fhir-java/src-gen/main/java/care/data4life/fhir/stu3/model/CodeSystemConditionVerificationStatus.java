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

package care.data4life.fhir.stu3.model;

import com.squareup.moshi.Json;


/**
 * The verification status to support or decline the clinical status of the condition or diagnosis.
 *
 * @see <a href="http://hl7.org/fhir/condition-ver-status">ConditionVerificationStatus</a>
 */
public enum CodeSystemConditionVerificationStatus {

    /**
     * This is a tentative diagnosis - still a candidate that is under consideration.
     */
    @Json(name = "provisional")
    PROVISIONAL,

    /**
     * One of a set of potential (and typically mutually exclusive) diagnoses asserted to further
     * guide the diagnostic process and preliminary treatment.
     */
    @Json(name = "differential")
    DIFFERENTIAL,

    /**
     * There is sufficient diagnostic and/or clinical evidence to treat this as a confirmed
     * condition.
     */
    @Json(name = "confirmed")
    CONFIRMED,

    /**
     * This condition has been ruled out by diagnostic and clinical evidence.
     */
    @Json(name = "refuted")
    REFUTED,

    /**
     * The statement was entered in error and is not valid.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The condition status is unknown.  Note that "unknown" is a value of last resort and every
     * attempt should be made to provide a meaningful value other than "unknown".
     */
    @Json(name = "unknown")
    UNKNOWN,
}
