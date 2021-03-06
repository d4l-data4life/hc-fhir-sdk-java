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
 * Identifies the style of unique identifier used to identify a namespace.
 *
 * @see <a href="http://hl7.org/fhir/namingsystem-identifier-type">NamingSystemIdentifierType</a>
 */
public enum CodeSystemNamingSystemIdentifierType {

    /**
     * An ISO object identifier; e.g. 1.2.3.4.5.
     */
    @Json(name = "oid")
    OID,

    /**
     * A universally unique identifier of the form a5afddf4-e880-459b-876e-e4591b0acc11.
     */
    @Json(name = "uuid")
    UUID,

    /**
     * A uniform resource identifier (ideally a URL - uniform resource locator); e.g.
     * http://unitsofmeasure.org.
     */
    @Json(name = "uri")
    URI,

    /**
     * Some other type of unique identifier; e.g. HL7-assigned reserved string such as LN for
     * LOINC.
     */
    @Json(name = "other")
    OTHER,
}
