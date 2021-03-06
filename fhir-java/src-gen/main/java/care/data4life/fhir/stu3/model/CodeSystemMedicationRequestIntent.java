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
 * The kind of medication order
 *
 * @see <a href="http://hl7.org/fhir/medication-request-intent">MedicationRequestIntent</a>
 */
public enum CodeSystemMedicationRequestIntent {

    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to
     * ensure it occurs and without providing an authorization to act
     */
    @Json(name = "proposal")
    PROPOSAL,

    /**
     * The request represents an intension to ensure something occurs without providing an
     * authorization for others to act
     */
    @Json(name = "plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @Json(name = "order")
    ORDER,

    /**
     * The request represents an instance for the particular order, for example a medication
     * administration record.
     */
    @Json(name = "instance-order")
    INSTANCE_ORDER,
}
