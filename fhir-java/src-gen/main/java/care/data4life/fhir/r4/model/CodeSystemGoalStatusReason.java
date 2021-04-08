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
 * Example codes indicating the reason for a current status.  Note that these are in no way complete
 * and might not even be appropriate for some uses.
 *
 * @see <a href="http://hl7.org/fhir/goal-status-reason">GoalStatusReason</a>
 */
public enum CodeSystemGoalStatusReason {

    /**
     * Goal suspended or ended because of a surgical procedure.
     */
    @Json(name = "surgery")
    SURGERY,

    /**
     * Goal suspended or ended because of a significant life event (marital change, bereavement,
     * etc.).
     */
    @Json(name = "life-event")
    LIFE_EVENT,

    /**
     * Goal has been superseded by a new goal.
     */
    @Json(name = "replaced")
    REPLACED,

    /**
     * Patient wishes the goal to be set aside, at least temporarily.
     */
    @Json(name = "patient-request")
    PATIENT_REQUEST,

    /**
     * Goal cannot be reached temporarily.
     */
    @Json(name = "temp-not-attainable")
    TEMP_NOT_ATTAINABLE,

    /**
     * Goal cannot be reached permanently.
     */
    @Json(name = "permanent-not-attainable")
    PERMANENT_NOT_ATTAINABLE,

    /**
     * Goal cannot be reached due to financial barrier or reason.
     */
    @Json(name = "financial-barrier")
    FINANCIAL_BARRIER,

    /**
     * Goal cannot be reached due to a lack of transportation.
     */
    @Json(name = "lack-of-transportation")
    LACK_OF_TRANSPORTATION,

    /**
     * Goal cannot be reached due to a lack of social support.
     */
    @Json(name = "lack-of-social-support")
    LACK_OF_SOCIAL_SUPPORT,
}
