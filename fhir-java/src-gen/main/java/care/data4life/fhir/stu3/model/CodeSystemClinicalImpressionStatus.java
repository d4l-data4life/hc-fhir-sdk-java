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
 * The workflow state of a clinical impression.
 *
 * @see <a href="http://hl7.org/fhir/clinical-impression-status">ClinicalImpressionStatus</a>
 */
public enum CodeSystemClinicalImpressionStatus {

    /**
     * The assessment is still on-going and results are not yet final.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * The assessment is done and the results are final.
     */
    @Json(name = "completed")
    COMPLETED,

    /**
     * This assessment was never actually done and the record is erroneous (e.g. Wrong patient).
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
}
