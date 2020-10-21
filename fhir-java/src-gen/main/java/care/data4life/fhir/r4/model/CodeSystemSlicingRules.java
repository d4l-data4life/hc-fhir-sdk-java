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
 * How slices are interpreted when evaluating an instance.
 *
 * @see <a href="http://hl7.org/fhir/resource-slicing-rules">SlicingRules</a>
 */
public enum CodeSystemSlicingRules {

    /**
     * No additional content is allowed other than that described by the slices in this profile.
     */
    @Json(name = "closed")
    CLOSED,

    /**
     * Additional content is allowed anywhere in the list.
     */
    @Json(name = "open")
    OPEN,

    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires
     * that the slices be ordered, which makes it hard to share uses. This should only be done where
     * absolutely required.
     */
    @Json(name = "openAtEnd")
    OPENATEND,
}
