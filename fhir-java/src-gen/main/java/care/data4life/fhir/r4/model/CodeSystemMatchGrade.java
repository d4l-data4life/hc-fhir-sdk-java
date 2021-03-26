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
 * A Master Patient Index (MPI) assessment of whether a candidate patient record is a match or not.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/match-grade">MatchGrade</a>
 */
public enum CodeSystemMatchGrade {

    /**
     * This record meets the matching criteria to be automatically considered as a full match.
     */
    @Json(name = "certain")
    CERTAIN,

    /**
     * This record is a close match, but not a certain match. Additional review (e.g. by a human) may be required before
     * using this as a match.
     */
    @Json(name = "probable")
    PROBABLE,

    /**
     * This record may be a matching one. Additional review (e.g. by a human) SHOULD be performed before using this as a
     * match.
     */
    @Json(name = "possible")
    POSSIBLE,

    /**
     * This record is known not to be a match. Note that usually non-matching records are not returned, but in some
     * cases records previously or likely considered as a match may specifically be negated by the matching engine.
     */
    @Json(name = "certainly-not")
    CERTAINLY_NOT,
}
