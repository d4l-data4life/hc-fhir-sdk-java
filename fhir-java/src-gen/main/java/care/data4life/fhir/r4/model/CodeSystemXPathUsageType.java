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
 * How a search parameter relates to the set of elements returned by evaluating its xpath query.
 *
 * @see <a href="http://hl7.org/fhir/search-xpath-usage">XPathUsageType</a>
 */
public enum CodeSystemXPathUsageType {

    /**
     * The search parameter is derived directly from the selected nodes based on the type definitions.
     */
    @Json(name = "normal")
    NORMAL,

    /**
     * The search parameter is derived by a phonetic transform from the selected nodes.
     */
    @Json(name = "phonetic")
    PHONETIC,

    /**
     * The search parameter is based on a spatial transform of the selected nodes.
     */
    @Json(name = "nearby")
    NEARBY,

    /**
     * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the
     * middle.
     */
    @Json(name = "distance")
    DISTANCE,

    /**
     * The interpretation of the xpath statement is unknown (and can't be automated).
     */
    @Json(name = "other")
    OTHER,
}
