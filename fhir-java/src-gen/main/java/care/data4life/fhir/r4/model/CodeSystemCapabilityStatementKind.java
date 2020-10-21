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
 * How a capability statement is intended to be used.
 *
 * @see <a href="http://hl7.org/fhir/capability-statement-kind">CapabilityStatementKind</a>
 */
public enum CodeSystemCapabilityStatementKind {

    /**
     * The CapabilityStatement instance represents the present capabilities of a specific system
     * instance.  This is the kind returned by /metadata for a FHIR server end-point.
     */
    @Json(name = "instance")
    INSTANCE,

    /**
     * The CapabilityStatement instance represents the capabilities of a system or piece of
     * software, independent of a particular installation.
     */
    @Json(name = "capability")
    CAPABILITY,

    /**
     * The CapabilityStatement instance represents a set of requirements for other systems to meet;
     * e.g. as part of an implementation guide or 'request for proposal'.
     */
    @Json(name = "requirements")
    REQUIREMENTS,
}
