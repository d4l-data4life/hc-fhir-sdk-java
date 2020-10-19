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
 * Codes for why the study ended prematurely.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/research-study-reason-stopped">ResearchStudyReasonStopped</a>
 */
public enum CodeSystemResearchStudyReasonStopped {

    /**
     * The study prematurely ended because the accrual goal was met.
     */
    @Json(name = "accrual-goal-met")
    ACCRUAL_GOAL_MET,

    /**
     * The study prematurely ended due to toxicity.
     */
    @Json(name = "closed-due-to-toxicity")
    CLOSED_DUE_TO_TOXICITY,

    /**
     * The study prematurely ended due to lack of study progress.
     */
    @Json(name = "closed-due-to-lack-of-study-progress")
    CLOSED_DUE_TO_LACK_OF_STUDY_PROGRESS,

    /**
     * The study prematurely ended temporarily per study design.
     */
    @Json(name = "temporarily-closed-per-study-design")
    TEMPORARILY_CLOSED_PER_STUDY_DESIGN,
}
