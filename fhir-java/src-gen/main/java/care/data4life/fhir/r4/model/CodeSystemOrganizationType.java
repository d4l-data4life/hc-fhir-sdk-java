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
 * This example value set defines a set of codes that can be used to indicate a type of
 * organization.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/organization-type">OrganizationType</a>
 */
public enum CodeSystemOrganizationType {

    /**
     * An organization that provides healthcare services.
     */
    @Json(name = "prov")
    PROV,

    /**
     * A department or ward within a hospital (Generally is not applicable to top level
     * organizations)
     */
    @Json(name = "dept")
    DEPT,

    /**
     * An organizational team is usually a grouping of practitioners that perform a specific
     * function within an organization (which could be a top level organization, or a department).
     */
    @Json(name = "team")
    TEAM,

    /**
     * A political body, often used when including organization records for government bodies such
     * as a Federal Government, State or Local Government.
     */
    @Json(name = "govt")
    GOVT,

    /**
     * A company that provides insurance to its subscribers that may include healthcare related
     * policies.
     */
    @Json(name = "ins")
    INS,

    /**
     * A company, charity, or governmental organization, which processes claims and/or issues
     * payments to providers on behalf of patients or groups of patients.
     */
    @Json(name = "pay")
    PAY,

    /**
     * An educational institution that provides education or research facilities.
     */
    @Json(name = "edu")
    EDU,

    /**
     * An organization that is identified as a part of a religious institution.
     */
    @Json(name = "reli")
    RELI,

    /**
     * An organization that is identified as a Pharmaceutical/Clinical Research Sponsor.
     */
    @Json(name = "crs")
    CRS,

    /**
     * An un-incorporated community group.
     */
    @Json(name = "cg")
    CG,

    /**
     * An organization that is a registered business or corporation but not identified by other
     * types.
     */
    @Json(name = "bus")
    BUS,

    /**
     * Other type of organization not already specified.
     */
    @Json(name = "other")
    OTHER,
}
