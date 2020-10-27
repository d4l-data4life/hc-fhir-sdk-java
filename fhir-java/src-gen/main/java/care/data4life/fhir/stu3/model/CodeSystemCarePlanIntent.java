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

package care.data4life.fhir.stu3.model;

import com.squareup.moshi.Json;


/**
 * Codes indicating the degree of authority/intentionality associated with a care plan
 *
 * @see <a href="http://hl7.org/fhir/care-plan-intent">CarePlanIntent</a>
 */
public enum CodeSystemCarePlanIntent {

    /**
     * The care plan is a suggestion made by someone/something that doesn't have an intention to
     * ensure it occurs and without providing an authorization to act
     */
    @Json(name = "proposal")
    PROPOSAL,

    /**
     * The care plan represents an intention to ensure something occurs without providing an
     * authorization for others to act
     */
    @Json(name = "plan")
    PLAN,

    /**
     * The care plan represents a request/demand and authorization for action
     */
    @Json(name = "order")
    ORDER,

    /**
     * The care plan represents a component or option for a RequestGroup that establishes timing,
     * conditionality and/or other constraints among a set of requests.
     * <p>
     * Refer to [[[RequestGroup]]] for additional information on how this status is used
     */
    @Json(name = "option")
    OPTION,
}
