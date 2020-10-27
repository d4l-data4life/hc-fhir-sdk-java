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
 * Attached is vocabulary for the 27 record lifecycle events, as per ISO TS 21089-2017, Health
 * Informatics - Trusted End-to-End Information Flows, Section 3, Terms and Definitions (2017, at
 * ISO Central Secretariat, passed ballot and ready for publication).  This will also be included in
 * the FHIR EHR Record Lifecycle Event Implementation Guide, balloted and (to be) published with
 * FHIR STU-3.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle">ISO210892017HealthRecordLifecycleEvents</a>
 */
public enum CodeSystemISO210892017HealthRecordLifecycleEvents {

    /**
     * Occurs when an agent causes the system to obtain and open a record entry for inspection or
     * review.
     */
    @Json(name = "access")
    ACCESS,

    /**
     * Occurs when an agent causes the system to tag or otherwise indicate special access management
     * and suspension of record entry deletion/destruction, if deemed relevant to a lawsuit or which
     * are reasonably anticipated to be relevant or to fulfill organizational policy under the legal
     * doctrine of “duty to preserve”.
     */
    @Json(name = "hold")
    HOLD,

    /**
     * Occurs when an agent makes any change to record entry content currently residing in storage
     * considered permanent (persistent).
     */
    @Json(name = "amend")
    AMEND,

    /**
     * Occurs when an agent causes the system to create and move archive artifacts containing record
     * entry content, typically to long-term offline storage.
     */
    @Json(name = "archive")
    ARCHIVE,

    /**
     * Occurs when an agent causes the system to capture the agent’s digital signature (or
     * equivalent indication) during formal validation of record entry content.
     */
    @Json(name = "attest")
    ATTEST,

    /**
     * Occurs when an agent causes the system to decode record entry content from a cipher.
     */
    @Json(name = "decrypt")
    DECRYPT,

    /**
     * Occurs when an agent causes the system to scrub record entry content to reduce the
     * association between a set of identifying data and the data subject in a way that might or
     * might not be reversible.
     */
    @Json(name = "deidentify")
    DEIDENTIFY,

    /**
     * Occurs when an agent causes the system to tag record entry(ies) as obsolete, erroneous or
     * untrustworthy, to warn against its future use.
     */
    @Json(name = "deprecate")
    DEPRECATE,

    /**
     * Occurs when an agent causes the system to permanently erase record entry content from the
     * system.
     */
    @Json(name = "destroy")
    DESTROY,

    /**
     * Occurs when an agent causes the system to release, transfer, provision access to, or
     * otherwise divulge record entry content.
     */
    @Json(name = "disclose")
    DISCLOSE,

    /**
     * Occurs when an agent causes the system to encode record entry content in a cipher.
     */
    @Json(name = "encrypt")
    ENCRYPT,

    /**
     * Occurs when an agent causes the system to selectively pull out a subset of record entry
     * content, based on explicit criteria.
     */
    @Json(name = "extract")
    EXTRACT,

    /**
     * Occurs when an agent causes the system to connect related record entries.
     */
    @Json(name = "link")
    LINK,

    /**
     * Occurs when an agent causes the system to combine or join content from two or more record
     * entries, resulting in a single logical record entry.
     */
    @Json(name = "merge")
    MERGE,

    /**
     * Occurs when an agent causes the system to: a) initiate capture of potential record content,
     * and b) incorporate that content into the storage considered a permanent part of the health
     * record.
     */
    @Json(name = "originate")
    ORIGINATE,

    /**
     * Occurs when an agent causes the system to remove record entry content to reduce the
     * association between a set of identifying data and the data subject in a way that may be
     * reversible.
     */
    @Json(name = "pseudonymize")
    PSEUDONYMIZE,

    /**
     * Occurs when an agent causes the system to recreate or restore full status to record entries
     * previously deleted or deprecated.
     */
    @Json(name = "reactivate")
    REACTIVATE,

    /**
     * Occurs when an agent causes the system to a) initiate capture of data content from elsewhere,
     * and b) incorporate that content into the storage considered a permanent part of the health
     * record.
     */
    @Json(name = "receive")
    RECEIVE,

    /**
     * Occurs when an agent causes the system to restore information to data that allows
     * identification of information source and/or information subject.
     */
    @Json(name = "reidentify")
    REIDENTIFY,

    /**
     * Occurs when an agent causes the system to remove a tag or other cues for special access
     * management had required to fulfill organizational policy under the legal doctrine of “duty to
     * preserve”.
     */
    @Json(name = "unhold")
    UNHOLD,

    /**
     * Occurs when an agent causes the system to produce and deliver record entry content in a
     * particular form and manner.
     */
    @Json(name = "report")
    REPORT,

    /**
     * Occurs when an agent causes the system to recreate record entries and their content from a
     * previous created archive artefact.
     */
    @Json(name = "restore")
    RESTORE,

    /**
     * Occurs when an agent causes the system to change the form, language or code system used to
     * represent record entry content.
     */
    @Json(name = "transform")
    TRANSFORM,

    /**
     * Occurs when an agent causes the system to send record entry content from one (EHR/PHR/other)
     * system to another.
     */
    @Json(name = "transmit")
    TRANSMIT,

    /**
     * Occurs when an agent causes the system to disconnect two or more record entries previously
     * connected, rendering them separate (disconnected) again.
     */
    @Json(name = "unlink")
    UNLINK,

    /**
     * Occurs when an agent causes the system to reverse a previous record entry merge operation,
     * rendering them separate again.
     */
    @Json(name = "unmerge")
    UNMERGE,

    /**
     * Occurs when an agent causes the system to confirm compliance of data or data objects with
     * regulations, requirements, specifications, or other imposed conditions based on
     * organizational policy.
     */
    @Json(name = "verify")
    VERIFY,
}
