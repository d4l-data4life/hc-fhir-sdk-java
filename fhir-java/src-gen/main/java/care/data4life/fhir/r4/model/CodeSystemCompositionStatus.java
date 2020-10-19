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
 * The workflow/clinical status of the composition.
 *
 * @see <a href="http://hl7.org/fhir/composition-status">CompositionStatus</a>
 */
public enum CodeSystemCompositionStatus {

    /**
     * This is a preliminary composition or document (also known as initial or interim). The content
     * may be incomplete or unverified.
     */
    @Json(name = "preliminary")
    PRELIMINARY,

    /**
     * This version of the composition is complete and verified by an appropriate person and no
     * further work is planned. Any subsequent updates would be on a new version of the
     * composition.
     */
    @Json(name = "final")
    FINAL,

    /**
     * The composition content or the referenced resources have been modified (edited or added to)
     * subsequent to being released as "final" and the composition is complete and verified by an
     * authorized person.
     */
    @Json(name = "amended")
    AMENDED,

    /**
     * The composition or document was originally created/issued in error, and this is an amendment
     * that marks that the entire series should not be considered as valid.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
}
