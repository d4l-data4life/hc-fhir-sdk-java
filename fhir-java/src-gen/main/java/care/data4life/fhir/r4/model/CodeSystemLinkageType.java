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
 * Used to distinguish different roles a resource can play within a set of linked resources.
 *
 * @see <a href="http://hl7.org/fhir/linkage-type">LinkageType</a>
 */
public enum CodeSystemLinkageType {

    /**
     * The resource represents the "source of truth" (from the perspective of this Linkage resource) for the underlying
     * event/condition/etc.
     */
    @Json(name = "source")
    SOURCE,

    /**
     * The resource represents an alternative view of the underlying event/condition/etc.  The resource may still be
     * actively maintained, even though it is not considered to be the source of truth.
     */
    @Json(name = "alternate")
    ALTERNATE,

    /**
     * The resource represents an obsolete record of the underlying event/condition/etc.  It is not expected to be
     * actively maintained.
     */
    @Json(name = "historical")
    HISTORICAL,
}
