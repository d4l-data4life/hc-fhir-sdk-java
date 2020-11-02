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
 * Indicates the progression of a study subject through a study
 *
 * @see <a href="http://hl7.org/fhir/research-subject-status">ResearchSubjectStatus</a>
 */
public enum CodeSystemResearchSubjectStatus {

    /**
     * The subject has been identified as a potential participant in the study but has not yet
     * agreed to participate
     */
    @Json(name = "candidate")
    CANDIDATE,

    /**
     * The subject has agreed to participate in the study but has not yet begun performing any
     * action within the study
     */
    @Json(name = "enrolled")
    ENROLLED,

    /**
     * The subject is currently being monitored and/or subject to treatment as part of the study
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The subject has temporarily discontinued monitoring/treatment as part of the study
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The subject has permanently ended participation in the study prior to completion of the
     * intended monitoring/treatment
     */
    @Json(name = "withdrawn")
    WITHDRAWN,

    /**
     * All intended monitoring/treatment of the subject has been completed and their engagement with
     * the study is now ended
     */
    @Json(name = "completed")
    COMPLETED,
}
