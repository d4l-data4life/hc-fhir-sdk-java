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
 * Indicates the level of importance associated with reaching or sustaining a goal.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/goal-priority">GoalPriority</a>
 */
public enum CodeSystemGoalPriority {

    /**
     * Indicates that the goal is of considerable importance and should be a primary focus of care delivery.
     */
    @Json(name = "high-priority")
    HIGH_PRIORITY,

    /**
     * Indicates that the goal has a reasonable degree of importance and that concrete action should be taken towards
     * the goal.  Attainment is not as critical as high-priority goals.
     */
    @Json(name = "medium-priority")
    MEDIUM_PRIORITY,

    /**
     * The goal is desirable but is not sufficiently important to devote significant resources to.  Achievement of the
     * goal may be sought when incidental to achieving other goals.
     */
    @Json(name = "low-priority")
    LOW_PRIORITY,
}
