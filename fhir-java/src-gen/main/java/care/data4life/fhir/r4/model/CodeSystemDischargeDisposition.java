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
 * This value set defines a set of codes that can be used to where the patient left the hospital.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/discharge-disposition">DischargeDisposition</a>
 */
public enum CodeSystemDischargeDisposition {

	/**
	* The patient was dicharged and has indicated that they are going to return home afterwards.
	*/
	@Json(name = "home")
	HOME,

	/**
	* The patient was discharged and has indicated that they are going to return home afterwards, but not the patient's home - e.g. a family member's home.
	*/
	@Json(name = "alt-home")
	ALT_HOME,

	/**
	* The patient was transferred to another healthcare facility.
	*/
	@Json(name = "other-hcf")
	OTHER_HCF,

	/**
	* The patient has been discharged into palliative care.
	*/
	@Json(name = "hosp")
	HOSP,

	/**
	* The patient has been discharged into long-term care where is likely to be monitored through an ongoing episode-of-care.
	*/
	@Json(name = "long")
	LONG,

	/**
	* The patient self discharged against medical advice.
	*/
	@Json(name = "aadvice")
	AADVICE,

	/**
	* The patient has deceased during this encounter.
	*/
	@Json(name = "exp")
	EXP,

	/**
	* The patient has been transferred to a psychiatric facility.
	*/
	@Json(name = "psy")
	PSY,

	/**
	* The patient was discharged and is to receive post acute care rehabilitation services.
	*/
	@Json(name = "rehab")
	REHAB,

	/**
	* The patient has been discharged to a skilled nursing facility for the patient to receive additional care.
	*/
	@Json(name = "snf")
	SNF,

	/**
	* The discharge disposition has not otherwise defined.
	*/
	@Json(name = "oth")
	OTH,
}
