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
 * Codes indicating the type of validation to perform.
 *
 * @see <a href="http://hl7.org/fhir/resource-validation-mode">ResourceValidationMode</a>
 */
public enum CodeSystemResourceValidationMode {

    /**
     * The server checks the content, and then checks that the content would be acceptable as a
     * create (e.g. that the content would not violate any uniqueness constraints).
     */
    @Json(name = "create")
    CREATE,

    /**
     * The server checks the content, and then checks that it would accept it as an update against
     * the nominated specific resource (e.g. that there are no changes to immutable fields the
     * server does not allow to change and checking version integrity if appropriate).
     */
    @Json(name = "update")
    UPDATE,

    /**
     * The server ignores the content and checks that the nominated resource is allowed to be
     * deleted (e.g. checking referential integrity rules).
     */
    @Json(name = "delete")
    DELETE,

    /**
     * The server checks an existing resource (must be nominated by id, not provided as a parameter)
     * as valid against the nominated profile.
     */
    @Json(name = "profile")
    PROFILE,
}
