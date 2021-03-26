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
 * The role that a provenance participant played
 *
 * @see <a href="http://hl7.org/fhir/provenance-participant-role">ProvenanceParticipantRole</a>
 */
public enum CodeSystemProvenanceParticipantRole {

    /**
     * A person entering the data into the originating system
     */
    @Json(name = "enterer")
    ENTERER,

    /**
     * A person, animal, organization or device that who actually and principally carries out the activity
     */
    @Json(name = "performer")
    PERFORMER,

    /**
     * A party that originates the resource and therefore has responsibility for the information given in the resource
     * and ownership of this resource
     */
    @Json(name = "author")
    AUTHOR,

    /**
     * A person who verifies the correctness and appropriateness of activity
     */
    @Json(name = "verifier")
    VERIFIER,

    /**
     * The person authenticated the content and accepted legal responsibility for its content
     */
    @Json(name = "legal")
    LEGAL,

    /**
     * A verifier who attests to the accuracy of the resource
     */
    @Json(name = "attester")
    ATTESTER,

    /**
     * A person who reported information that contributed to the resource
     */
    @Json(name = "informant")
    INFORMANT,

    /**
     * The entity that is accountable for maintaining a true an accurate copy of the original record
     */
    @Json(name = "custodian")
    CUSTODIAN,

    /**
     * A device that operates independently of an author on custodian's algorithms for data extraction of existing
     * information for purpose of generating a new artifact.
     */
    @Json(name = "assembler")
    ASSEMBLER,

    /**
     * A device used by an author to record new information, which may also be used by the author to select existing
     * information for aggregation with newly recorded information for the purpose of generating a new artifact.
     */
    @Json(name = "composer")
    COMPOSER,
}
