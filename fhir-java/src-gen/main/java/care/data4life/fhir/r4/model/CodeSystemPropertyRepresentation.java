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
 * How a property is represented when serialized.
 *
 * @see <a href="http://hl7.org/fhir/property-representation">PropertyRepresentation</a>
 */
public enum CodeSystemPropertyRepresentation {

	/**
	* In XML, this property is represented as an attribute not an element.
	*/
	@Json(name = "xmlAttr")
	XMLATTR,

	/**
	* This element is represented using the XML text attribute (primitives only).
	*/
	@Json(name = "xmlText")
	XMLTEXT,

	/**
	* The type of this element is indicated using xsi:type.
	*/
	@Json(name = "typeAttr")
	TYPEATTR,

	/**
	* Use CDA narrative instead of XHTML.
	*/
	@Json(name = "cdaText")
	CDATEXT,

	/**
	* The property is represented using XHTML.
	*/
	@Json(name = "xhtml")
	XHTML,
}
