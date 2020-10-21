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
 * The availability status reason of the device.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/device-status-reason">FHIRDeviceStatusReason</a>
 */
public enum CodeSystemFHIRDeviceStatusReason {

	/**
	* The device is off.
	*/
	@Json(name = "online")
	ONLINE,

	/**
	* The device is paused.
	*/
	@Json(name = "paused")
	PAUSED,

	/**
	* The device is ready but not actively operating.
	*/
	@Json(name = "standby")
	STANDBY,

	/**
	* The device is offline.
	*/
	@Json(name = "offline")
	OFFLINE,

	/**
	* The device is not ready.
	*/
	@Json(name = "not-ready")
	NOT_READY,

	/**
	* The device transducer is disconnected.
	*/
	@Json(name = "transduc-discon")
	TRANSDUC_DISCON,

	/**
	* The device hardware is disconnected.
	*/
	@Json(name = "hw-discon")
	HW_DISCON,

	/**
	* The device is off.
	*/
	@Json(name = "off")
	OFF,
}
