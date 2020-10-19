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
 * This value set includes sample Coverage Copayment Type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/coverage-copay-type">CoverageCopayTypeCodes</a>
 */
public enum CodeSystemCoverageCopayTypeCodes {

    /**
     * An office visit for a general practitioner of a discipline.
     */
    @Json(name = "gpvisit")
    GPVISIT,

    /**
     * An office visit for a specialist practitioner of a discipline
     */
    @Json(name = "spvisit")
    SPVISIT,

    /**
     * An episode in an emergency department.
     */
    @Json(name = "emergency")
    EMERGENCY,

    /**
     * An episode of an Inpatient hospital stay.
     */
    @Json(name = "inpthosp")
    INPTHOSP,

    /**
     * A visit held where the patient is remote relative to the practitioner, e.g. by phone,
     * computer or video conference.
     */
    @Json(name = "televisit")
    TELEVISIT,

    /**
     * A visit to an urgent care facility - typically a community care clinic.
     */
    @Json(name = "urgentcare")
    URGENTCARE,

    /**
     * A standard percentage applied to all classes or service or product not otherwise specified.
     */
    @Json(name = "copaypct")
    COPAYPCT,

    /**
     * A standard fixed currency amount applied to all classes or service or product not otherwise
     * specified.
     */
    @Json(name = "copay")
    COPAY,

    /**
     * The accumulated amount of patient payment before the coverage begins to pay for services.
     */
    @Json(name = "deductible")
    DEDUCTIBLE,

    /**
     * The maximum amout of payment for services which a patient, or family, is expected to incur -
     * typically annually.
     */
    @Json(name = "maxoutofpocket")
    MAXOUTOFPOCKET,
}
