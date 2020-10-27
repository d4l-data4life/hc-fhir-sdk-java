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
 * Codes that convey the current status of the research study.
 *
 * @see <a href="http://hl7.org/fhir/research-study-status">ResearchStudyStatus</a>
 */
public enum CodeSystemResearchStudyStatus {

    /**
     * Study is opened for accrual.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * Study is completed prematurely and will not resume; patients are no longer examined nor
     * treated.
     */
    @Json(name = "administratively-completed")
    ADMINISTRATIVELY_COMPLETED,

    /**
     * Protocol is approved by the review board.
     */
    @Json(name = "approved")
    APPROVED,

    /**
     * Study is closed for accrual; patients can be examined and treated.
     */
    @Json(name = "closed-to-accrual")
    CLOSED_TO_ACCRUAL,

    /**
     * Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all
     * study subjects have completed treatment or intervention but are still being followed
     * according to the primary objective of the study.
     */
    @Json(name = "closed-to-accrual-and-intervention")
    CLOSED_TO_ACCRUAL_AND_INTERVENTION,

    /**
     * Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all
     * study subjects have completed treatment or intervention but are still being followed
     * according to the primary objective of the study.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * Protocol was disapproved by the review board.
     */
    @Json(name = "disapproved")
    DISAPPROVED,

    /**
     * Protocol is submitted to the review board for approval.
     */
    @Json(name = "in-review")
    IN_REVIEW,

    /**
     * Study is temporarily closed for accrual; can be potentially resumed in the future; patients
     * can be examined and treated.
     */
    @Json(name = "temporarily-closed-to-accrual")
    TEMPORARILY_CLOSED_TO_ACCRUAL,

    /**
     * Study is temporarily closed for accrual and intervention and potentially can be resumed in
     * the future.
     */
    @Json(name = "temporarily-closed-to-accrual-and-intervention")
    TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION,

    /**
     * Protocol was withdrawn by the lead organization.
     */
    @Json(name = "withdrawn")
    WITHDRAWN,
}
