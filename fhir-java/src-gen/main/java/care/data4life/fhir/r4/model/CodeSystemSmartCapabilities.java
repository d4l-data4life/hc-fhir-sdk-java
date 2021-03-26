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
 * Codes that define what the server is capable of.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/smart-capabilities">SmartCapabilities</a>
 */
public enum CodeSystemSmartCapabilities {

    /**
     * support for SMART’s EHR Launch mode.
     */
    @Json(name = "launch-ehr")
    LAUNCH_EHR,

    /**
     * support for SMART’s Standalone Launch mode.
     */
    @Json(name = "launch-standalone")
    LAUNCH_STANDALONE,

    /**
     * support for SMART’s public client profile (no client authentication).
     */
    @Json(name = "client-public")
    CLIENT_PUBLIC,

    /**
     * support for SMART’s confidential client profile (symmetric client secret authentication).
     */
    @Json(name = "client-confidential-symmetric")
    CLIENT_CONFIDENTIAL_SYMMETRIC,

    /**
     * support for SMART’s OpenID Connect profile.
     */
    @Json(name = "sso-openid-connect")
    SSO_OPENID_CONNECT,

    /**
     * support for “need patient banner” launch context (conveyed via need_patient_banner token parameter).
     */
    @Json(name = "context-passthrough-banner")
    CONTEXT_PASSTHROUGH_BANNER,

    /**
     * support for “SMART style URL” launch context (conveyed via smart_style_url token parameter).
     */
    @Json(name = "context-passthrough-style")
    CONTEXT_PASSTHROUGH_STYLE,

    /**
     * support for patient-level launch context (requested by launch/patient scope, conveyed via patient token
     * parameter).
     */
    @Json(name = "context-ehr-patient")
    CONTEXT_EHR_PATIENT,

    /**
     * support for encounter-level launch context (requested by launch/encounter scope, conveyed via encounter token
     * parameter).
     */
    @Json(name = "context-ehr-encounter")
    CONTEXT_EHR_ENCOUNTER,

    /**
     * support for patient-level launch context (requested by launch/patient scope, conveyed via patient token
     * parameter).
     */
    @Json(name = "context-standalone-patient")
    CONTEXT_STANDALONE_PATIENT,

    /**
     * support for encounter-level launch context (requested by launch/encounter scope, conveyed via encounter token
     * parameter).
     */
    @Json(name = "context-standalone-encounter")
    CONTEXT_STANDALONE_ENCOUNTER,

    /**
     * support for refresh tokens (requested by offline_access scope).
     */
    @Json(name = "permission-offline")
    PERMISSION_OFFLINE,

    /**
     * support for patient-level scopes (e.g. patient/Observation.read).
     */
    @Json(name = "permission-patient")
    PERMISSION_PATIENT,

    /**
     * support for user-level scopes (e.g. user/Appointment.read).
     */
    @Json(name = "permission-user")
    PERMISSION_USER,
}
