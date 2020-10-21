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
 * Codes representing the current status of the device - on, off, suspended, etc.
 *
 * @see <a href="http://hl7.org/fhir/operational-status">DeviceComponentOperationalStatus</a>
 */
public enum CodeSystemDeviceComponentOperationalStatus {

    /**
     * The device is off.
     */
    @Json(name = "off")
    OFF,

    /**
     * The device is fully operational.
     */
    @Json(name = "on")
    ON,

    /**
     * The device is not ready.
     */
    @Json(name = "not-ready")
    NOT_READY,

    /**
     * The device is ready but not actively operating.
     */
    @Json(name = "standby")
    STANDBY,

    /**
     * The device transducer is diconnected.
     */
    @Json(name = "transduc-discon")
    TRANSDUC_DISCON,

    /**
     * The device hardware is disconnected.
     */
    @Json(name = "hw-discon")
    HW_DISCON,

    /**
     * The device was entered in error.
     */
    @Json(name = "entered-in-error")
    ENTERED_IN_ERROR,
}
