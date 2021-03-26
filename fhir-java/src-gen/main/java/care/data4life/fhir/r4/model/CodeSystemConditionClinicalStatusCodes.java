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
 * Preferred value set for Condition Clinical Status.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/condition-clinical">ConditionClinicalStatusCodes</a>
 */
public enum CodeSystemConditionClinicalStatusCodes {

    /**
     * The subject is currently experiencing the symptoms of the condition or there is evidence of the condition.
     */
    @Json(name = "active")
    ACTIVE,

    /**
     * The subject is experiencing a re-occurence or repeating of a previously resolved condition, e.g. urinary tract infection, pancreatitis, cholangitis, conjunctivitis.
     */
    @Json(name = "recurrence")
    RECURRENCE,

    /**
     * The subject is experiencing a return of a condition, or signs and symptoms after a period of improvement or remission, e.g. relapse of cancer, multiple sclerosis, rheumatoid arthritis, systemic lupus erythematosus, bipolar disorder, [psychotic relapse of] schizophrenia, etc.
     */
    @Json(name = "relapse")
    RELAPSE,

    /**
     * The subject is no longer experiencing the symptoms of the condition or there is no longer evidence of the condition.
     */
    @Json(name = "inactive")
    INACTIVE,

    /**
     * The subject is no longer experiencing the symptoms of the condition, but there is a risk of the symptoms returning.
     */
    @Json(name = "remission")
    REMISSION,

    /**
     * The subject is no longer experiencing the symptoms of the condition and there is a negligible perceived risk of the symptoms returning.
     */
    @Json(name = "resolved")
    RESOLVED,
}
