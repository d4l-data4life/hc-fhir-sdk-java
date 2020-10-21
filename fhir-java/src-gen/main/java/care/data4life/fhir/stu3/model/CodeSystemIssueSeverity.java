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
 * How the issue affects the success of the action.
 *
 * @see <a href="http://hl7.org/fhir/issue-severity">IssueSeverity</a>
 */
public enum CodeSystemIssueSeverity {

    /**
     * The issue caused the action to fail, and no further checking could be performed.
     */
    @Json(name = "fatal")
    FATAL,

    /**
     * The issue is sufficiently important to cause the action to fail.
     */
    @Json(name = "error")
    ERROR,

    /**
     * The issue is not important enough to cause the action to fail, but may cause it to be
     * performed suboptimally or in a way that is not as desired.
     */
    @Json(name = "warning")
    WARNING,

    /**
     * The issue has no relation to the degree of success of the action.
     */
    @Json(name = "information")
    INFORMATION,
}
