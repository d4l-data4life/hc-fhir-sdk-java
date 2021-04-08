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
 * Identifies the purpose of the naming system.
 *
 * @see <a href="http://hl7.org/fhir/namingsystem-type">NamingSystemType</a>
 */
public enum CodeSystemNamingSystemType {

    /**
     * The naming system is used to define concepts and symbols to represent those concepts; e.g.
     * UCUM, LOINC, NDC code, local lab codes, etc.
     */
    @Json(name = "codesystem")
    CODESYSTEM,

    /**
     * The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).
     */
    @Json(name = "identifier")
    IDENTIFIER,

    /**
     * The naming system is used as the root for other identifiers and naming systems.
     */
    @Json(name = "root")
    ROOT,
}
