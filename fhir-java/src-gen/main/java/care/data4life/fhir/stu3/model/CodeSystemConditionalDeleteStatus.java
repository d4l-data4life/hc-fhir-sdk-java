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
 * A code that indicates how the server supports conditional delete.
 *
 * @see <a href="http://hl7.org/fhir/conditional-delete-status">ConditionalDeleteStatus</a>
 */
public enum CodeSystemConditionalDeleteStatus {

    /**
     * No support for conditional deletes.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * Conditional deletes are supported, but only single resources at a time.
     */
    @Json(name = "single")
    SINGLE,

    /**
     * Conditional deletes are supported, and multiple resources can be deleted in a single
     * interaction.
     */
    @Json(name = "multiple")
    MULTIPLE,
}
