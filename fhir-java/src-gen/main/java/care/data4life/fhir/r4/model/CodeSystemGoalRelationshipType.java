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
 * Types of relationships between two goals.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/goal-relationship-type">GoalRelationshipType</a>
 */
public enum CodeSystemGoalRelationshipType {

    /**
     * Indicates that the target goal is one which must be met before striving for the current
     * goal.
     */
    @Json(name = "predecessor")
    PREDECESSOR,

    /**
     * Indicates that the target goal is a desired objective once the current goal is met.
     */
    @Json(name = "successor")
    SUCCESSOR,

    /**
     * Indicates that this goal has been replaced by the target goal.
     */
    @Json(name = "replacement")
    REPLACEMENT,

    /**
     * Indicates that the target goal is considered to be a "piece" of attaining this goal.
     */
    @Json(name = "milestone")
    MILESTONE,

    /**
     * Indicates that the relationship is not covered by one of the pre-defined codes.  (An
     * extension may convey more information about the meaning of the relationship.).
     */
    @Json(name = "other")
    OTHER,
}
