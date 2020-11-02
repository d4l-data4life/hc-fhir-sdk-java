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
 * Codes for the assessment of whether the entity caused the event.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/adverse-event-causality-assess">AdverseEventCausalityAssessment</a>
 */
public enum CodeSystemAdverseEventCausalityAssessment {

    /**
     * i) Event or laboratory test abnormality, with plausible time relationship to drug intake; ii)
     * Cannot be explained by disease or other drugs; iii) Response to withdrawal plausible
     * (pharmacologically, pathologically); iv) Event definitive pharmacologically or
     * phenomenologically (i.e. an objective and specific medical disorder or a recognized
     * pharmacological phenomenon); or v) Re-challenge satisfactory, if necessary.
     */
    @Json(name = "Certain")
    CERTAIN,

    /**
     * i) Event or laboratory test abnormality, with reasonable time relationship to drug intake;
     * ii) Unlikely to be attributed to disease or other drugs; iii) Response to withdrawal
     * clinically reasonable; or iv) Re-challenge not required.
     */
    @Json(name = "Probably-Likely")
    PROBABLY_LIKELY,

    /**
     * i) Event or laboratory test abnormality, with reasonable time relationship to drug intake;
     * ii) Could also be explained by disease or other drugs; or iii) Information on drug withdrawal
     * may be lacking or unclear.
     */
    @Json(name = "Possible")
    POSSIBLE,

    /**
     * i) Event or laboratory test abnormality, with a time to drug intake that makes a relationship
     * improbable (but not impossible); or ii) Disease or other drugs provide plausible
     * explanations.
     */
    @Json(name = "Unlikely")
    UNLIKELY,

    /**
     * i) Event or laboratory test abnormality; ii) More data for proper assessment needed; or iii)
     * Additional data under examination.
     */
    @Json(name = "Conditional-Classified")
    CONDITIONAL_CLASSIFIED,

    /**
     * i) Report suggesting an adverse reaction; ii) Cannot be judged because information is
     * insufficient or contradictory; or iii) Data cannot be supplemented or verified.
     */
    @Json(name = "Unassessable-Unclassifiable")
    UNASSESSABLE_UNCLASSIFIABLE,
}
