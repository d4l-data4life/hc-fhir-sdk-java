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
 * Indicates the progression of a study subject through a study.
 *
 * @see <a href="http://hl7.org/fhir/research-subject-status">ResearchSubjectStatus</a>
 */
public enum CodeSystemResearchSubjectStatus {

    /**
     * An identified person that can be considered for inclusion in a study.
     */
    @Json(name = "candidate")
    CANDIDATE,

    /**
     * A person that has met the eligibility criteria for inclusion in a study.
     */
    @Json(name = "eligible")
    ELIGIBLE,

    /**
     * A person is no longer receiving study intervention and/or being evaluated with tests and procedures according to the protocol, but they are being monitored on a protocol-prescribed schedule.
     */
    @Json(name = "follow-up")
    FOLLOW_UP,

    /**
     * A person who did not meet one or more criteria required for participation in a study is considered to have failed screening or
     * is ineligible for the study.
     */
    @Json(name = "ineligible")
    INELIGIBLE,

    /**
     * A person for whom registration was not completed.
     */
    @Json(name = "not-registered")
    NOT_REGISTERED,

    /**
     * A person that has ended their participation on a study either because their treatment/observation is complete or through not
     * responding, withdrawal, non-compliance and/or adverse event.
     */
    @Json(name = "off-study")
    OFF_STUDY,

    /**
     * A person that is enrolled or registered on a study.
     */
    @Json(name = "on-study")
    ON_STUDY,

    /**
     * The person is receiving the treatment or participating in an activity (e.g. yoga, diet, etc.) that the study is evaluating.
     */
    @Json(name = "on-study-intervention")
    ON_STUDY_INTERVENTION,

    /**
     * The subject is being evaluated via tests and assessments according to the study calendar, but is not receiving any intervention. Note that this state is study-dependent and might not exist in all studies.  A synonym for this is "short-term follow-up".
     */
    @Json(name = "on-study-observation")
    ON_STUDY_OBSERVATION,

    /**
     * A person is pre-registered for a study.
     */
    @Json(name = "pending-on-study")
    PENDING_ON_STUDY,

    /**
     * A person that is potentially eligible for participation in the study.
     */
    @Json(name = "potential-candidate")
    POTENTIAL_CANDIDATE,

    /**
     * A person who is being evaluated for eligibility for a study.
     */
    @Json(name = "screening")
    SCREENING,

    /**
     * The person has withdrawn their participation in the study before registration.
     */
    @Json(name = "withdrawn")
    WITHDRAWN,
}
