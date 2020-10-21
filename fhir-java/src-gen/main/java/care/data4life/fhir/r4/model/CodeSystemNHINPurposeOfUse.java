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
 * This value set is suitable for use with the provenance resource. It is derived from, but not compatible with, the HL7 v3 Purpose of use Code system.
 *
 * @see <a href="http://healthit.gov/nhin/purposeofuse">NHINPurposeOfUse</a>
 */
public enum CodeSystemNHINPurposeOfUse {

	/**
	* Treatment
	*/
	@Json(name = "TREATMENT")
	TREATMENT,

	/**
	* Payment
	*/
	@Json(name = "PAYMENT")
	PAYMENT,

	/**
	* Healthcare Operations
	*/
	@Json(name = "OPERATIONS")
	OPERATIONS,

	/**
	* System Administration
	*/
	@Json(name = "SYSADMIN")
	SYSADMIN,

	/**
	* Fraud detection
	*/
	@Json(name = "FRAUD")
	FRAUD,

	/**
	* Use or disclosure of Psychotherapy Notes
	*/
	@Json(name = "PSYCHOTHERAPY")
	PSYCHOTHERAPY,

	/**
	* Use or disclosure by the covered entity for its own training programs
	*/
	@Json(name = "TRAINING")
	TRAINING,

	/**
	* Use or disclosure by the covered entity to defend itself in a legal action
	*/
	@Json(name = "LEGAL")
	LEGAL,

	/**
	* Marketing
	*/
	@Json(name = "MARKETING")
	MARKETING,

	/**
	* Use and disclosure for facility directories
	*/
	@Json(name = "DIRECTORY")
	DIRECTORY,

	/**
	* Disclose to a family member, other relative, or a close personal friend of the individual
	*/
	@Json(name = "FAMILY")
	FAMILY,

	/**
	* Uses and disclosures with the individual present.
	*/
	@Json(name = "PRESENT")
	PRESENT,

	/**
	* Permission cannot practicably be provided because of the individual's incapacity or an emergency.
	*/
	@Json(name = "EMERGENCY")
	EMERGENCY,

	/**
	* Use and disclosures for disaster relief purposes.
	*/
	@Json(name = "DISASTER")
	DISASTER,

	/**
	* Uses and disclosures for public health activities.
	*/
	@Json(name = "PUBLICHEALTH")
	PUBLICHEALTH,

	/**
	* Disclosures about victims of abuse, neglect or domestic violence.
	*/
	@Json(name = "ABUSE")
	ABUSE,

	/**
	* Uses and disclosures for health oversight activities.
	*/
	@Json(name = "OVERSIGHT")
	OVERSIGHT,

	/**
	* Disclosures for judicial and administrative proceedings.
	*/
	@Json(name = "JUDICIAL")
	JUDICIAL,

	/**
	* Disclosures for law enforcement purposes.
	*/
	@Json(name = "LAW")
	LAW,

	/**
	* Uses and disclosures about decedents.
	*/
	@Json(name = "DECEASED")
	DECEASED,

	/**
	* Uses and disclosures for cadaveric organ,  eye or tissue donation purposes
	*/
	@Json(name = "DONATION")
	DONATION,

	/**
	* Uses and disclosures for research purposes.
	*/
	@Json(name = "RESEARCH")
	RESEARCH,

	/**
	* Uses and disclosures to avert a serious threat to health or safety.
	*/
	@Json(name = "THREAT")
	THREAT,

	/**
	* Uses and disclosures for specialized government functions.
	*/
	@Json(name = "GOVERNMENT")
	GOVERNMENT,

	/**
	* Disclosures for workers' compensation.
	*/
	@Json(name = "WORKERSCOMP")
	WORKERSCOMP,

	/**
	* Disclosures for insurance or disability coverage determination
	*/
	@Json(name = "COVERAGE")
	COVERAGE,

	/**
	* Request of the Individual
	*/
	@Json(name = "REQUEST")
	REQUEST,
}
