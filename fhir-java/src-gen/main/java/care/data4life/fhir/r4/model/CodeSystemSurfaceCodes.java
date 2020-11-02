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
 * This value set includes a smattering of FDI tooth surface codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/FDI-surface">SurfaceCodes</a>
 */
public enum CodeSystemSurfaceCodes {

    /**
     * The surface of a tooth that is closest to the midline (middle) of the face.
     */
    @Json(name = "M")
    M,

    /**
     * The chewing surface of posterior teeth.
     */
    @Json(name = "O")
    O,

    /**
     * The biting edge of anterior teeth.
     */
    @Json(name = "I")
    I,

    /**
     * The surface of a tooth that faces away from the midline of the face.
     */
    @Json(name = "D")
    D,

    /**
     * The surface of a posterior tooth facing the cheeks.
     */
    @Json(name = "B")
    B,

    /**
     * The surface of a tooth facing the lips.
     */
    @Json(name = "V")
    V,

    /**
     * The surface of a tooth facing the tongue.
     */
    @Json(name = "L")
    L,

    /**
     * The Mesioclusal surfaces of a tooth.
     */
    @Json(name = "MO")
    MO,

    /**
     * The Distoclusal surfaces of a tooth.
     */
    @Json(name = "DO")
    DO,

    /**
     * The Distoincisal surfaces of a tooth.
     */
    @Json(name = "DI")
    DI,

    /**
     * The Mesioclusodistal surfaces of a tooth.
     */
    @Json(name = "MOD")
    MOD,
}
