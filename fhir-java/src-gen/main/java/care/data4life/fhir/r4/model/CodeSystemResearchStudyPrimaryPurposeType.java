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
 * Codes for the main intent of the study.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/research-study-prim-purp-type">ResearchStudyPrimaryPurposeType</a>
 */
public enum CodeSystemResearchStudyPrimaryPurposeType {

    /**
     * One or more interventions are being evaluated for treating a disease, syndrome, or condition.
     */
    @Json(name = "treatment")
    TREATMENT,

    /**
     * One or more interventions are being assessed for preventing the development of a specific disease or health condition.
     */
    @Json(name = "prevention")
    PREVENTION,

    /**
     * One or more interventions are being evaluated for identifying a disease or health condition.
     */
    @Json(name = "diagnostic")
    DIAGNOSTIC,

    /**
     * One or more interventions are evaluated for maximizing comfort, minimizing side effects, or mitigating against a decline in the participant's health or function.
     */
    @Json(name = "supportive-care")
    SUPPORTIVE_CARE,

    /**
     * One or more interventions are assessed or examined for identifying a condition, or risk factors for a condition, in people who are not yet known to have the condition or risk factor.
     */
    @Json(name = "screening")
    SCREENING,

    /**
     * One or more interventions for evaluating the delivery, processes, management, organization, or financing of healthcare.
     */
    @Json(name = "health-services-research")
    HEALTH_SERVICES_RESEARCH,

    /**
     * One or more interventions for examining the basic mechanism of action (for example, physiology or biomechanics of an intervention).
     */
    @Json(name = "basic-science")
    BASIC_SCIENCE,

    /**
     * An intervention of a device product is being evaluated to determine the feasibility of the product or to test a prototype device and not health outcomes. Such studies are conducted to confirm the design and operating specifications of a device before beginning a full clinical trial.
     */
    @Json(name = "device-feasibility")
    DEVICE_FEASIBILITY,
}
