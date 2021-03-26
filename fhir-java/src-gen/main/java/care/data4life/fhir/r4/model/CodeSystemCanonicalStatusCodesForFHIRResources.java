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
 * The master set of status codes used throughout FHIR. All status codes are mapped to one of these codes.
 *
 * @see <a href="http://hl7.org/fhir/resource-status">CanonicalStatusCodesForFHIRResources</a>
 */
public enum CodeSystemCanonicalStatusCodesForFHIRResources {

    /**
     * The resource was created in error, and should not be treated as valid (note: in many cases, for various data
     * integrity related reasons, the information cannot be removed from the record)
     */
    @Json(name = "error")
    ERROR,

    /**
     * The resource describes an action or plan that is proposed, and not yet approved by the participants
     */
    @Json(name = "proposed")
    PROPOSED,

    /**
     * The resource describes a course of action that is planned and agreed/approved, but at the time of recording was
     * still future
     */
    @Json(name = "planned")
    PLANNED,

    /**
     * The information in the resource is still being prepared and edited
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * A fulfiller has been asked to perform this action, but it has not yet occurred
     */
    @Json(name = "requested")
    REQUESTED,

    /**
     * The fulfiller has received the request, but not yet agreed to carry out the action
     */
    @Json(name = "received")
    RECEIVED,

    /**
     * The fulfiller chose not to perform the action
     */
    @Json(name = "declined")
    DECLINED,

    /**
     * The fulfiller has decided to perform the action, and plans are in train to do this in the future
     */
    @Json(name = "accepted")
    ACCEPTED,

    /**
     * The pre-conditions for the action are all fulfilled, and it is imminent
     */
    @Json(name = "arrived")
    ARRIVED,

    /**
     * The resource describes information that is currently valid or a process that is presently occuring
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The process described/requested in this resource has been halted for some reason
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The process described/requested in the resource could not be completed, and no further action is planned
     */
    @Json(name = "failed")
    FAILED,

    /**
     * The information in this resource has been replaced by information in another resource
     */
    @Json(name = "replaced")
    REPLACED,

    /**
     * The process described/requested in the resource has been completed, and no further action is planned
     */
    @Json(name = "complete")
    COMPLETE,

    /**
     * The resource describes information that is no longer valid or a process that is stopped occurring
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The process described/requested in the resource did not complete - usually due to some workflow error, and no
     * further action is planned
     */
    @Json(name = "abandoned")
    ABANDONED,

    /**
     * Authoring system does not know the status
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * The information in this resource is not yet approved
     */
    @Json(name = "unconfirmed")
    UNCONFIRMED,

    /**
     * The information in this resource is approved
     */
    @Json(name = "confirmed")
    CONFIRMED,

    /**
     * The issue identified by this resource is no longer of concern
     */
    @Json(name = "resolved")
    RESOLVED,

    /**
     * This information has been ruled out by testing and evaluation
     */
    @Json(name = "refuted")
    REFUTED,

    /**
     * Potentially true?
     */
    @Json(name = "differential")
    DIFFERENTIAL,

    /**
     * This information is still being assembled
     */
    @Json(name = "partial")
    PARTIAL,

    /**
     * not available at this time/location
     */
    @Json(name = "busy-unavailable")
    BUSY_UNAVAILABLE,

    /**
     * Free for scheduling
     */
    @Json(name = "free")
    FREE,

    /**
     * Ready to act
     */
    @Json(name = "on-target")
    ON_TARGET,

    /**
     * Ahead of the planned timelines
     */
    @Json(name = "ahead-of-target")
    AHEAD_OF_TARGET,

    /**
     * behindTarget
     */
    @Json(name = "behind-target")
    BEHIND_TARGET,

    /**
     * Behind the planned timelines
     */
    @Json(name = "not-ready")
    NOT_READY,

    /**
     * The device transducer is disconnected
     */
    @Json(name = "transduc-discon")
    TRANSDUC_DISCON,

    /**
     * The hardware is disconnected
     */
    @Json(name = "hw-discon")
    HW_DISCON,
}
