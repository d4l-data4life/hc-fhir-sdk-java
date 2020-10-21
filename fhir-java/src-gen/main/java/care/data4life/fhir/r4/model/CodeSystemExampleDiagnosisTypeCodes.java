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
 * This value set includes example Diagnosis Type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/ex-diagnosistype">ExampleDiagnosisTypeCodes</a>
 */
public enum CodeSystemExampleDiagnosisTypeCodes {

	/**
	* The diagnosis given as the reason why the patient was admitted to the hospital.
	*/
	@Json(name = "admitting")
	ADMITTING,

	/**
	* A diagnosis made on the basis of medical signs and patient-reported symptoms, rather than diagnostic tests.
	*/
	@Json(name = "clinical")
	CLINICAL,

	/**
	* One of a set of the possible diagnoses that could be connected to the signs, symptoms, and lab findings.
	*/
	@Json(name = "differential")
	DIFFERENTIAL,

	/**
	* The diagnosis given when the patient is discharged from the hospital.
	*/
	@Json(name = "discharge")
	DISCHARGE,

	/**
	* A diagnosis based significantly on laboratory reports or test results, rather than the physical examination of the patient.
	*/
	@Json(name = "laboratory")
	LABORATORY,

	/**
	* A diagnosis which identifies people's responses to situations in their lives, such as a readiness to change or a willingness to accept assistance.
	*/
	@Json(name = "nursing")
	NURSING,

	/**
	* A diagnosis determined prior to birth.
	*/
	@Json(name = "prenatal")
	PRENATAL,

	/**
	* The single medical diagnosis that is most relevant to the patient's chief complaint or need for treatment.
	*/
	@Json(name = "principal")
	PRINCIPAL,

	/**
	* A diagnosis based primarily on the results from medical imaging studies.
	*/
	@Json(name = "radiology")
	RADIOLOGY,

	/**
	* A diagnosis determined using telemedicine techniques.
	*/
	@Json(name = "remote")
	REMOTE,

	/**
	* The labeling of an illness in a specific historical event using modern knowledge, methods and disease classifications.
	*/
	@Json(name = "retrospective")
	RETROSPECTIVE,

	/**
	* A diagnosis determined by the patient.
	*/
	@Json(name = "self")
	SELF,
}
