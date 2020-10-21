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
 * MedicationKnowledge Package Type Codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/medicationknowledge-package-type">MedicationKnowledgePackageTypeCodes</a>
 */
public enum CodeSystemMedicationKnowledgePackageTypeCodes {

    /**
     * amp
     */
    @Json(name = "amp")
    AMP,

    /**
     * bag
     */
    @Json(name = "bag")
    BAG,

    /**
     * blstrpk
     */
    @Json(name = "blstrpk")
    BLSTRPK,

    /**
     * bot
     */
    @Json(name = "bot")
    BOT,

    /**
     * box
     */
    @Json(name = "box")
    BOX,

    /**
     * can
     */
    @Json(name = "can")
    CAN,

    /**
     * cart
     */
    @Json(name = "cart")
    CART,

    /**
     * disk
     */
    @Json(name = "disk")
    DISK,

    /**
     * doset
     */
    @Json(name = "doset")
    DOSET,

    /**
     * jar
     */
    @Json(name = "jar")
    JAR,

    /**
     * jug
     */
    @Json(name = "jug")
    JUG,

    /**
     * minim
     */
    @Json(name = "minim")
    MINIM,

    /**
     * nebamp
     */
    @Json(name = "nebamp")
    NEBAMP,

    /**
     * ovul
     */
    @Json(name = "ovul")
    OVUL,

    /**
     * pch
     */
    @Json(name = "pch")
    PCH,

    /**
     * pkt
     */
    @Json(name = "pkt")
    PKT,

    /**
     * sash
     */
    @Json(name = "sash")
    SASH,

    /**
     * strip
     */
    @Json(name = "strip")
    STRIP,

    /**
     * tin
     */
    @Json(name = "tin")
    TIN,

    /**
     * tub
     */
    @Json(name = "tub")
    TUB,

    /**
     * tube
     */
    @Json(name = "tube")
    TUBE,

    /**
     * vial
     */
    @Json(name = "vial")
    VIAL,
}
