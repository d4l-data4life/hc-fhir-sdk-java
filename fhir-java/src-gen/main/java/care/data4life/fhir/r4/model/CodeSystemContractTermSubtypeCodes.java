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
 * This value set includes sample Contract Term SubType codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/contracttermsubtypecodes">ContractTermSubtypeCodes</a>
 */
public enum CodeSystemContractTermSubtypeCodes {

    /**
     * Terms that go to the very root of a contract.
     */
    @Json(name = "condition")
    CONDITION,

    /**
     * Less imperative than a condition, so the contract will survive a breach
     */
    @Json(name = "warranty")
    WARRANTY,

    /**
     * Breach of which might or might not go to the root of the contract depending upon the nature of the breach
     */
    @Json(name = "innominate")
    INNOMINATE,
}
