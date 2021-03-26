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
 * The status of the diagnostic report.
 *
 * @see <a href="http://hl7.org/fhir/diagnostic-report-status">DiagnosticReportStatus</a>
 */
public enum CodeSystemDiagnosticReportStatus {

    /**
     * The existence of the report is registered, but there is nothing yet available.
     */
    @Json(name = "registered")
    REGISTERED,

    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     */
    @Json(name = "partial")
    PARTIAL,

    /**
     * Verified early results are available, but not all  results are final.
     */
    @Json(name = "preliminary")
    PRELIMINARY,

    /**
     * The report is complete and verified by an authorized person.
     */
    @Json(name = "final")
    FINAL,

    /**
     * Subsequent to being final, the report has been modified.  This includes any change in the results, diagnosis, narrative text, or other content of a report that has been issued.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * Subsequent to being final, the report has been modified  to correct an error in the report or referenced results.
     */
    @Json(name = "corrected")
    CORRECTED,

    /**
     * Subsequent to being final, the report has been modified by adding new content. The existing content is unchanged.
     */
    @Json(name = "appended")
    APPENDED,

    /**
     * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    @Json(name = "cancelled")
    CANCELLED,

    /**
     * The report has been withdrawn following a previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
     */
    @Json(name = "unknown")
    UNKNOWN,
}
