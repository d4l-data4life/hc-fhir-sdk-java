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
 * Detailed information about the type of the image - its kind, purpose, or the kind of equipment used to generate it.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/media-modality">MediaModality</a>
 */
public enum CodeSystemMediaModality {

    /**
     * A diagram. Often used in diagnostic reports
     */
    @Json(name = "diagram")
    DIAGRAM,

    /**
     * A digital record of a fax document
     */
    @Json(name = "fax")
    FAX,

    /**
     * A digital scan of a document. This is reserved for when there is not enough metadata to create a document
     * reference
     */
    @Json(name = "scan")
    SCAN,

    /**
     * A retinal image used for identification purposes
     */
    @Json(name = "retina")
    RETINA,

    /**
     * A finger print scan used for identification purposes
     */
    @Json(name = "fingerprint")
    FINGERPRINT,

    /**
     * An iris scan used for identification purposes
     */
    @Json(name = "iris")
    IRIS,

    /**
     * A palm scan used for identification purposes
     */
    @Json(name = "palm")
    PALM,

    /**
     * A face scan used for identification purposes
     */
    @Json(name = "face")
    FACE,
}
