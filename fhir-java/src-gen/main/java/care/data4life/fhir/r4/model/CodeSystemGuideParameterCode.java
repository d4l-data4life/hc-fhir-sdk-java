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
 * Code of parameter that is input to the guide.
 *
 * @see <a href="http://hl7.org/fhir/guide-parameter-code">GuideParameterCode</a>
 */
public enum CodeSystemGuideParameterCode {

    /**
     * If the value of this string 0..* parameter is one of the metadata fields then all conformance resources will have
     * any specified [Resource].[field] overwritten with the ImplementationGuide.[field], where field is one of:
     * version, date, status, publisher, contact, copyright, experimental, jurisdiction, useContext.
     */
    @Json(name = "apply")
    APPLY,

    /**
     * The value of this string 0..* parameter is a subfolder of the build context's location that is to be scanned to
     * load resources. Scope is (if present) a particular resource type.
     */
    @Json(name = "path-resource")
    PATH_RESOURCE,

    /**
     * The value of this string 0..1 parameter is a subfolder of the build context's location that contains files that
     * are part of the html content processed by the builder.
     */
    @Json(name = "path-pages")
    PATH_PAGES,

    /**
     * The value of this string 0..1 parameter is a subfolder of the build context's location that is used as the
     * terminology cache. If this is not present, the terminology cache is on the local system, not under version
     * control.
     */
    @Json(name = "path-tx-cache")
    PATH_TX_CACHE,

    /**
     * The value of this string 0..* parameter is a parameter (name=value) when expanding value sets for this
     * implementation guide. This is particularly used to specify the versions of published terminologies such as SNOMED
     * CT.
     */
    @Json(name = "expansion-parameter")
    EXPANSION_PARAMETER,

    /**
     * The value of this string 0..1 parameter is either "warning" or "error" (default = "error"). If the value is
     * "warning" then IG build tools allow the IG to be considered successfully build even when there is no internal
     * broken links.
     */
    @Json(name = "rule-broken-links")
    RULE_BROKEN_LINKS,

    /**
     * The value of this boolean 0..1 parameter specifies whether the IG publisher creates examples in XML format. If
     * not present, the Publication Tool decides whether to generate XML.
     */
    @Json(name = "generate-xml")
    GENERATE_XML,

    /**
     * The value of this boolean 0..1 parameter specifies whether the IG publisher creates examples in JSON format. If
     * not present, the Publication Tool decides whether to generate JSON.
     */
    @Json(name = "generate-json")
    GENERATE_JSON,

    /**
     * The value of this boolean 0..1 parameter specifies whether the IG publisher creates examples in Turtle format. If
     * not present, the Publication Tool decides whether to generate Turtle.
     */
    @Json(name = "generate-turtle")
    GENERATE_TURTLE,

    /**
     * The value of this string singleton parameter is the name of the file to use as the builder template for each
     * generated page (see templating).
     */
    @Json(name = "html-template")
    HTML_TEMPLATE,
}
