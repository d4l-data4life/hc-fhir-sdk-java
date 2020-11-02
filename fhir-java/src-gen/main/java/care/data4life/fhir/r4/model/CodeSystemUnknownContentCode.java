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
 * A code that indicates whether an application accepts unknown elements or extensions when reading
 * resources.
 *
 * @see <a href="http://hl7.org/fhir/unknown-content-code">UnknownContentCode</a>
 */
public enum CodeSystemUnknownContentCode {

    /**
     * The application does not accept either unknown elements or extensions.
     */
    @Json(name = "no")
    NO,

    /**
     * The application accepts unknown extensions, but not unknown elements.
     */
    @Json(name = "extensions")
    EXTENSIONS,

    /**
     * The application accepts unknown elements, but not unknown extensions.
     */
    @Json(name = "elements")
    ELEMENTS,

    /**
     * The application accepts unknown elements and extensions.
     */
    @Json(name = "both")
    BOTH,
}
