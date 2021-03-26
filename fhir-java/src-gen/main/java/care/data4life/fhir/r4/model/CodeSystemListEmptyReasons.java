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
 * General reasons for a list to be empty. Reasons are either related to a summary list (i.e. problem or medication list) or to a workflow related list (i.e. consultation list).
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/list-empty-reason">ListEmptyReasons</a>
 */
public enum CodeSystemListEmptyReasons {

    /**
     * Clinical judgment that there are no known items for this list after reasonable investigation. Note that this a positive statement by a clinical user, and not a default position asserted by a computer system in the lack of other information. Example uses:  * For allergies: the patient or patient's agent/guardian has asserted that he/she is not aware of any allergies (NKA - nil known allergies)  * For medications: the patient or patient's agent/guardian has asserted that the patient is known to be taking no medications  * For diagnoses, problems and procedures: the patient or patient's agent/guardian has asserted that there is no known event to record.
     */
    @Json(name = "nilknown")
    NILKNOWN,

    /**
     * The investigation to find out whether there are items for this list has not occurred.
     */
    @Json(name = "notasked")
    NOTASKED,

    /**
     * The content of the list was not provided due to privacy or confidentiality concerns. Note that it should not be assumed that this means that the particular information in question was withheld due to its contents - it can also be a policy decision.
     */
    @Json(name = "withheld")
    WITHHELD,

    /**
     * Information to populate this list cannot be obtained; e.g. unconscious patient.
     */
    @Json(name = "unavailable")
    UNAVAILABLE,

    /**
     * The work to populate this list has not yet begun.
     */
    @Json(name = "notstarted")
    NOTSTARTED,

    /**
     * This list has now closed or has ceased to be relevant or useful.
     */
    @Json(name = "closed")
    CLOSED,
}
