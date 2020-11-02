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
 * Codes identifying the stage lifecycle stage of a request
 *
 * @see <a href="http://hl7.org/fhir/request-status">RequestStatus</a>
 */
public enum CodeSystemRequestStatus {

    /**
     * The request has been created but is not yet complete or ready for action
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The request is ready to be acted upon
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The authorization/request to act has been temporarily withdrawn but is expected to resume in
     * the future
     */
    @Json(name = "suspended")
    SUSPENDED,

    /**
     * The authorization/request to act has been terminated prior to the full completion of the
     * intended actions.  No further activity should occur.
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * Activity against the request has been sufficiently completed to the satisfaction of the
     * requester
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This electronic record should never have existed, though it is possible that real-world
     * decisions were based on it.  (If real-world activity has occurred, the status should be
     * "cancelled" rather than "entered-in-error".)
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this
     * request.  Note: This concept is not to be used for "other" . One of the listed statuses is
     * presumed to apply,  but the system creating the request doesn't know.
     */
    @Json(name = "unknown")
    UNKNOWN,
}
