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
 * The type of relationship to the related artifact
 *
 * @see <a href="http://hl7.org/fhir/related-artifact-type">RelatedArtifactType</a>
 */
public enum CodeSystemRelatedArtifactType {

	/**
	* Additional documentation for the knowledge resource. This would include additional instructions on usage as well as additional information on clinical context or appropriateness
	*/
	@Json(name = "documentation")
	DOCUMENTATION,

	/**
	* A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or other clinically important information. This information is intended to provide a way to make the justification for the knowledge resource available to the consumer of interventions or results produced by the knowledge resource
	*/
	@Json(name = "justification")
	JUSTIFICATION,

	/**
	* Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is intended to allow for citation of related material, but that was not necessarily specifically prepared in connection with this knowledge resource
	*/
	@Json(name = "citation")
	CITATION,

	/**
	* The previous version of the knowledge resource
	*/
	@Json(name = "predecessor")
	PREDECESSOR,

	/**
	* The next version of the knowledge resource
	*/
	@Json(name = "successor")
	SUCCESSOR,

	/**
	* The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which a particular knowledge resource is based on the content of another artifact, but is modified to capture either a different set of overall requirements, or a more specific set of requirements such as those involved in a particular institution or clinical setting
	*/
	@Json(name = "derived-from")
	DERIVED_FROM,

	/**
	* The knowledge resource depends on the given related artifact
	*/
	@Json(name = "depends-on")
	DEPENDS_ON,

	/**
	* The knowledge resource is composed of the given related artifact
	*/
	@Json(name = "composed-of")
	COMPOSED_OF,
}
