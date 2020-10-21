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
 * Types of security services used with FHIR.
 *
 * @see <a href="http://hl7.org/fhir/restful-security-service">RestfulSecurityService</a>
 */
public enum CodeSystemRestfulSecurityService {

	/**
	* Oauth (unspecified version see oauth.net).
	*/
	@Json(name = "OAuth")
	OAUTH,

	/**
	* OAuth2 using SMART-on-FHIR profile (see http://docs.smarthealthit.org/).
	*/
	@Json(name = "SMART-on-FHIR")
	SMART_ON_FHIR,

	/**
	* Microsoft NTLM Authentication.
	*/
	@Json(name = "NTLM")
	NTLM,

	/**
	* Basic authentication defined in HTTP specification.
	*/
	@Json(name = "Basic")
	BASIC,

	/**
	* see http://www.ietf.org/rfc/rfc4120.txt.
	*/
	@Json(name = "Kerberos")
	KERBEROS,

	/**
	* SSL where client must have a certificate registered with the server.
	*/
	@Json(name = "Certificates")
	CERTIFICATES,
}