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
 * A coded concept identifying level of certainty if patient has taken or has not taken the medication
 *
 * @see <a href="http://hl7.org/fhir/medication-statement-taken">MedicationStatementTaken</a>
 */
public enum CodeSystemMedicationStatementTaken {

	/**
	* Positive assertion that patient has taken medication
	*/
	@Json(name = "y")
	Y,

	/**
	* Negative assertion that patient has not taken medication
	*/
	@Json(name = "n")
	N,

	/**
	* Unknown assertion if patient has taken medication
	*/
	@Json(name = "unk")
	UNK,

	/**
	* Patient reporting does not apply
	*/
	@Json(name = "na")
	NA,
}
