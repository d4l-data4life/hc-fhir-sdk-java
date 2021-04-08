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
 * Describes the progression, or lack thereof, towards the goal against the target.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/goal-achievement">GoalAchievementStatus</a>
 */
public enum CodeSystemGoalAchievementStatus {

    /**
     * The goal is being sought but has not yet been reached. (Also applies if the goal was reached
     * in the past but there has been regression and the goal is again being sought).
     */
    @Json(name = "in-progress")
    IN_PROGRESS,

    /**
     * The goal is being sought, and is progressing.
     */
    @Json(name = "improving")
    IMPROVING,

    /**
     * The goal is being sought, but is regressing.
     */
    @Json(name = "worsening")
    WORSENING,

    /**
     * The goal is being sought, but the trend is flat.
     */
    @Json(name = "no-change")
    NO_CHANGE,

    /**
     * The goal has been met.
     */
    @Json(name = "achieved")
    ACHIEVED,

    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal objective.
     */
    @Json(name = "sustaining")
    SUSTAINING,

    /**
     * The goal has not been met and there might or might not have been progress towards target.
     */
    @Json(name = "not-achieved")
    NOT_ACHIEVED,

    /**
     * The goal has not been met and little to no progress towards target.
     */
    @Json(name = "no-progress")
    NO_PROGRESS,

    /**
     * The goal is not possible to be met.
     */
    @Json(name = "not-attainable")
    NOT_ATTAINABLE,
}
