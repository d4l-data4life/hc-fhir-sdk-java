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
 * The lifecycle status of an artifact.
 *
 * @see <a href="http://hl7.org/fhir/publication-status">PublicationStatus</a>
 */
public enum CodeSystemPublicationStatus {

    /**
     * This resource is still under development and is not yet considered to be ready for normal use.
     */
    @Json(name = "draft")
    DRAFT,

    /**
     * This resource is ready for normal use.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * This resource has been withdrawn or superseded and should no longer be used.
     */
    @Json(name = "retired")
    RETIRED,

    /**
     * The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @Json(name = "unknown")
    UNKNOWN,
}
