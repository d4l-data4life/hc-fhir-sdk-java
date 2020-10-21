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
 * The kind of an included page.
 *
 * @see <a href="http://hl7.org/fhir/guide-page-kind">GuidePageKind</a>
 */
public enum CodeSystemGuidePageKind {

	/**
	* This is a page of content that is included in the implementation guide. It has no particular function.
	*/
	@Json(name = "page")
	PAGE,

	/**
	* This is a page that represents a human readable rendering of an example.
	*/
	@Json(name = "example")
	EXAMPLE,

	/**
	* This is a page that represents a list of resources of one or more types.
	*/
	@Json(name = "list")
	LIST,

	/**
	* This is a page showing where an included guide is injected.
	*/
	@Json(name = "include")
	INCLUDE,

	/**
	* This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section.
	*/
	@Json(name = "directory")
	DIRECTORY,

	/**
	* This is a page that creates the listed resources as a dictionary.
	*/
	@Json(name = "dictionary")
	DICTIONARY,

	/**
	* This is a generated page that contains the table of contents.
	*/
	@Json(name = "toc")
	TOC,

	/**
	* This is a page that represents a presented resource. This is typically used for generated conformance resource presentations.
	*/
	@Json(name = "resource")
	RESOURCE,
}
