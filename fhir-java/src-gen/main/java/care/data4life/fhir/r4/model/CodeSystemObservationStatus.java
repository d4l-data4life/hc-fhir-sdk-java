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
 * Codes providing the status of an observation.
 *
 * @see <a href="http://hl7.org/fhir/observation-status">ObservationStatus</a>
 */
public enum CodeSystemObservationStatus {

	/**
	* The existence of the observation is registered, but there is no result yet available.
	*/
	@Json(name = "registered")
	REGISTERED,

	/**
	* This is an initial or interim observation: data may be incomplete or unverified.
	*/
	@Json(name = "preliminary")
	PRELIMINARY,

	/**
	* The observation is complete and there are no further actions needed. Additional information such "released", "signed", etc would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.
	*/
	@Json(name = "final")
	FINAL,

	/**
	* Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.
	*/
	@Json(name = "amended")
	AMENDED,

	/**
	* Subsequent to being Final, the observation has been modified to correct an error in the test result.
	*/
	@Json(name = "corrected")
	CORRECTED,

	/**
	* The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
	*/
	@Json(name = "cancelled")
	CANCELLED,

	/**
	* The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,

	/**
	* The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
	*/
	@Json(name = "unknown")
	UNKNOWN,
}
