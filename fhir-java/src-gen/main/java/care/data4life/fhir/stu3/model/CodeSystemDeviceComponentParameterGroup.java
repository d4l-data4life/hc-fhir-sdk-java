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
 * Codes identifying groupings of parameters; e.g. Cardiovascular.
 *
 * @see <a href="http://hl7.org/fhir/parameter-group">DeviceComponentParameterGroup</a>
 */
public enum CodeSystemDeviceComponentParameterGroup {

    /**
     * Haemodynamic Parameter Group - MDC_PGRP_HEMO
     */
    @Json(name = "haemodynamic")
    HAEMODYNAMIC,

    /**
     * ECG Parameter Group - MDC_PGRP_ECG
     */
    @Json(name = "ecg")
    ECG,

    /**
     * Respiratory Parameter Group - MDC_PGRP_RESP
     */
    @Json(name = "respiratory")
    RESPIRATORY,

    /**
     * Ventilation Parameter Group - MDC_PGRP_VENT
     */
    @Json(name = "ventilation")
    VENTILATION,

    /**
     * Neurological Parameter Group - MDC_PGRP_NEURO
     */
    @Json(name = "neurological")
    NEUROLOGICAL,

    /**
     * Drug Delivery Parameter Group - MDC_PGRP_DRUG
     */
    @Json(name = "drug-delivery")
    DRUG_DELIVERY,

    /**
     * Fluid Chemistry Parameter Group - MDC_PGRP_FLUID
     */
    @Json(name = "fluid-chemistry")
    FLUID_CHEMISTRY,

    /**
     * Blood Chemistry Parameter Group - MDC_PGRP_BLOOD_CHEM
     */
    @Json(name = "blood-chemistry")
    BLOOD_CHEMISTRY,

    /**
     * Miscellaneous Parameter Group - MDC_PGRP_MISC
     */
    @Json(name = "miscellaneous")
    MISCELLANEOUS,
}
