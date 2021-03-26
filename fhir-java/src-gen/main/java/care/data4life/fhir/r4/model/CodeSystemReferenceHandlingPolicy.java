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
 * A set of flags that defines how references are supported.
 *
 * @see <a href="http://hl7.org/fhir/reference-handling-policy">ReferenceHandlingPolicy</a>
 */
public enum CodeSystemReferenceHandlingPolicy {

    /**
     * The server supports and populates Literal references (i.e. using Reference.reference) where they are known (this code does not guarantee that all references are literal; see 'enforced').
     */
    @Json(name = "literal")
    LITERAL,

    /**
     * The server allows logical references (i.e. using Reference.identifier).
     */
    @Json(name = "logical")
    LOGICAL,

    /**
     * The server will attempt to resolve logical references to literal references - i.e. converting Reference.identifier to Reference.reference (if resolution fails, the server may still accept resources; see logical).
     */
    @Json(name = "resolves")
    RESOLVES,

    /**
     * The server enforces that references have integrity - e.g. it ensures that references can always be resolved. This is typically the case for clinical record systems, but often not the case for middleware/proxy systems.
     */
    @Json(name = "enforced")
    ENFORCED,

    /**
     * The server does not support references that point to other servers.
     */
    @Json(name = "local")
    LOCAL,
}
