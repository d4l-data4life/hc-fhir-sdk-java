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
 * Overall seriousness of this event for the patient.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/adverse-event-seriousness">AdverseEventSeriousness</a>
 */
public enum CodeSystemAdverseEventSeriousness {

    /**
     * Non-serious.
     */
    @Json(name = "Non-serious")
    NON_SERIOUS,

    /**
     * Serious.
     */
    @Json(name = "Serious")
    SERIOUS,

    /**
     * Results in death.
     */
    @Json(name = "SeriousResultsInDeath")
    SERIOUSRESULTSINDEATH,

    /**
     * Is Life-threatening.
     */
    @Json(name = "SeriousIsLifeThreatening")
    SERIOUSISLIFETHREATENING,

    /**
     * Requires inpatient hospitalization or causes prolongation of existing hospitalization.
     */
    @Json(name = "SeriousResultsInHospitalization")
    SERIOUSRESULTSINHOSPITALIZATION,

    /**
     * Results in persistent or significant disability/incapacity.
     */
    @Json(name = "SeriousResultsInDisability")
    SERIOUSRESULTSINDISABILITY,

    /**
     * Is a congenital anomaly/birth defect.
     */
    @Json(name = "SeriousIsBirthDefect")
    SERIOUSISBIRTHDEFECT,

    /**
     * Requires intervention to prevent permanent impairment or damage (i.e., an important medical event that requires
     * medical judgement).
     */
    @Json(name = "SeriousRequiresPreventImpairment")
    SERIOUSREQUIRESPREVENTIMPAIRMENT,
}
