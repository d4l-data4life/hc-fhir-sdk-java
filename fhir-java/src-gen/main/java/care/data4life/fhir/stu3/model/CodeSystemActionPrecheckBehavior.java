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
 * Defines selection frequency behavior for an action or group
 *
 * @see <a href="http://hl7.org/fhir/action-precheck-behavior">ActionPrecheckBehavior</a>
 */
public enum CodeSystemActionPrecheckBehavior {

    /**
     * An action with this behavior is one of the most frequent action that is, or should be,
     * included by an end user, for the particular context in which the action occurs. The system
     * displaying the action to the end user should consider "pre-checking" such an action as a
     * convenience for the user
     */
    @Json(name = "yes")
    YES,

    /**
     * An action with this behavior is one of the less frequent actions included by the end user,
     * for the particular context in which the action occurs. The system displaying the actions to
     * the end user would typically not "pre-check" such an action
     */
    @Json(name = "no")
    NO,
}
