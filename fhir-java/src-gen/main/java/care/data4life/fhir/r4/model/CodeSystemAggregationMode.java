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
 * How resource references can be aggregated.
 *
 * @see <a href="http://hl7.org/fhir/resource-aggregation-mode">AggregationMode</a>
 */
public enum CodeSystemAggregationMode {

    /**
     * The reference is a local reference to a contained resource.
     */
    @Json(name = "contained")
    CONTAINED,

    /**
     * The reference to a resource that has to be resolved externally to the resource that includes the reference.
     */
    @Json(name = "referenced")
    REFERENCED,

    /**
     * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
     */
    @Json(name = "bundled")
    BUNDLED,
}
