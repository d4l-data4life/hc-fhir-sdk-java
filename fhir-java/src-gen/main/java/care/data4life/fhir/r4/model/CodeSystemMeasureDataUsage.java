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
 * The intended usage for supplemental data elements in the measure.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/measure-data-usage">MeasureDataUsage</a>
 */
public enum CodeSystemMeasureDataUsage {

    /**
     * The data is intended to be provided as additional information alongside the measure results.
     */
    @Json(name = "supplemental-data")
    SUPPLEMENTAL_DATA,

    /**
     * The data is intended to be used to calculate and apply a risk adjustment model for the
     * measure.
     */
    @Json(name = "risk-adjustment-factor")
    RISK_ADJUSTMENT_FACTOR,
}
