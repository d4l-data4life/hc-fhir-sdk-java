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
 * Materials used or needed to feed the patient.
 *
 * @see <a href="http://hl7.org/fhir/feeding-device">FeedingDeviceCodes</a>
 */
public enum CodeSystemFeedingDeviceCodes {

    /**
     * Standard nipple definition:
     */
    @Json(name = "standard-nipple")
    STANDARD_NIPPLE,

    /**
     * Preemie nipple definition:
     */
    @Json(name = "preemie-nipple")
    PREEMIE_NIPPLE,

    /**
     * Orthodontic nipple definition:
     */
    @Json(name = "ortho-nipple")
    ORTHO_NIPPLE,

    /**
     * Slow flow nipple definition:
     */
    @Json(name = "sloflo-nipple")
    SLOFLO_NIPPLE,

    /**
     * Middle flow nipple definition:
     */
    @Json(name = "midflo-nipple")
    MIDFLO_NIPPLE,

    /**
     * Enlarged, cross-cut nipple definition:
     */
    @Json(name = "bigcut-nipple")
    BIGCUT_NIPPLE,

    /**
     * Haberman bottle definition:
     */
    @Json(name = "haberman-bottle")
    HABERMAN_BOTTLE,

    /**
     * Sippy cup with valve definition:
     */
    @Json(name = "sippy-valve")
    SIPPY_VALVE,

    /**
     * Sippy cup without valve definition:
     */
    @Json(name = "sippy-no-valve")
    SIPPY_NO_VALVE,

    /**
     * Provale Cup definition:
     */
    @Json(name = "provale-cup")
    PROVALE_CUP,

    /**
     * Glass with lid/sippy cup definition:
     */
    @Json(name = "glass-lid")
    GLASS_LID,

    /**
     * Double handhold on glass/cup definition:
     */
    @Json(name = "handhold-cup")
    HANDHOLD_CUP,

    /**
     * Rubber matting under tray definition:
     */
    @Json(name = "rubber-mat")
    RUBBER_MAT,

    /**
     * Straw definition:
     */
    @Json(name = "straw")
    STRAW,

    /**
     * Nose cup definition:
     */
    @Json(name = "nose-cup")
    NOSE_CUP,

    /**
     * Scoop plate definition:
     */
    @Json(name = "scoop-plate")
    SCOOP_PLATE,

    /**
     * Hand wrap utensil holder definition:
     */
    @Json(name = "utensil-holder")
    UTENSIL_HOLDER,

    /**
     * Foam handle utensils definition:
     */
    @Json(name = "foam-handle")
    FOAM_HANDLE,

    /**
     * Angled utensils definition:
     */
    @Json(name = "angled-utensil")
    ANGLED_UTENSIL,

    /**
     * Spout cup definition:
     */
    @Json(name = "spout-cup")
    SPOUT_CUP,

    /**
     * Automated feeding devices definition:
     */
    @Json(name = "autofeeding-device")
    AUTOFEEDING_DEVICE,

    /**
     * Rocker knife definition:
     */
    @Json(name = "rocker-knife")
    ROCKER_KNIFE,
}
