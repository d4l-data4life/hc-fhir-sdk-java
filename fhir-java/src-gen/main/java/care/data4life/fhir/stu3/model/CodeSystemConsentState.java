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
 * Indicates the state of the consent
 *
 * @see <a href="http://hl7.org/fhir/consent-state-codes">ConsentState</a>
 */
public enum CodeSystemConsentState {

	/**
	* The consent is in development or awaiting use but is not yet intended to be acted upon.
	*/
	@Json(name = "draft")
	DRAFT,

	/**
	* The consent has been proposed but not yet agreed to by all parties. The negotiation stage.
	*/
	@Json(name = "proposed")
	PROPOSED,

	/**
	* The consent is to be followed and enforced.
	*/
	@Json(name = "active")
	ACTIVE,

	/**
	* The consent has been rejected by one or more of the parties.
	*/
	@Json(name = "rejected")
	REJECTED,

	/**
	* The consent is terminated or replaced.
	*/
	@Json(name = "inactive")
	INACTIVE,

	/**
	* The consent was created wrongly (e.g. wrong patient) and should be ignored
	*/
	@Json(name = "entered-in-error")
	ENTERED_IN_ERROR,
}
