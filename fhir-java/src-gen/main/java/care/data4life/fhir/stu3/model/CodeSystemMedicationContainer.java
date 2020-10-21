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
 * A coded concept defining the kind of container a medication package is packaged in
 *
 * @see <a href="http://hl7.org/fhir/medication-package-form">MedicationContainer</a>
 */
public enum CodeSystemMedicationContainer {

	/**
	* A sealed glass capsule containing a liquid
	*/
	@Json(name = "ampoule")
	AMPOULE,

	/**
	* A container, typically made of glass or plastic and with a narrow neck, used for storing liquids.
	*/
	@Json(name = "bottle")
	BOTTLE,

	/**
	* A container with a flat base and sides, typically square or rectangular and having a lid.
	*/
	@Json(name = "box")
	BOX,

	/**
	* A device of various configuration and composition used with a syringe for the application of anesthetic or other materials to a patient.
	*/
	@Json(name = "cartridge")
	CARTRIDGE,

	/**
	* A package intended to store pharmaceuticals.
	*/
	@Json(name = "container")
	CONTAINER,

	/**
	* A long, hollow cylinder of metal, plastic, glass, etc., for holding medications, typically creams or ointments
	*/
	@Json(name = "tube")
	TUBE,

	/**
	* A dose of medicine prepared in an individual package for convenience, safety or monitoring.
	*/
	@Json(name = "unitdose")
	UNITDOSE,

	/**
	* A small container, typically cylindrical and made of glass, used especially for holding liquid medications.
	*/
	@Json(name = "vial")
	VIAL,
}
