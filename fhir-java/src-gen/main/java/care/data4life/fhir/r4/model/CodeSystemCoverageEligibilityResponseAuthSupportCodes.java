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
 * This value set includes CoverageEligibilityResponse Auth Support codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/coverageeligibilityresponse-ex-auth-support">CoverageEligibilityResponseAuthSupportCodes</a>
 */
public enum CodeSystemCoverageEligibilityResponseAuthSupportCodes {

    /**
     * A request or authorization for laboratory diagnostic tests.
     */
    @Json(name = "laborder")
    LABORDER,

    /**
     * A report on laboratory diagnostic test(s).
     */
    @Json(name = "labreport")
    LABREPORT,

    /**
     * A request or authorization for diagnostic imaging.
     */
    @Json(name = "diagnosticimageorder")
    DIAGNOSTICIMAGEORDER,

    /**
     * A report on diagnostic image(s).
     */
    @Json(name = "diagnosticimagereport")
    DIAGNOSTICIMAGEREPORT,

    /**
     * A report from a licensed professional regarding the siutation, condition or proposed treatment.
     */
    @Json(name = "professionalreport")
    PROFESSIONALREPORT,

    /**
     * A formal accident report as would be filed with police or a simlar official body.
     */
    @Json(name = "accidentreport")
    ACCIDENTREPORT,

    /**
     * A physical model of the affected area.
     */
    @Json(name = "model")
    MODEL,

    /**
     * A photograph of the affected area.
     */
    @Json(name = "picture")
    PICTURE,
}
