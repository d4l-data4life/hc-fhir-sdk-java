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
 * This value set defines codes for resources not yet supported by (or which will never be supported by) FHIR.  Many of the codes listed here will eventually be turned into official resources.  However, there is no guarantee that any particular resource will be created nor that the scope will be exactly as defined by the codes presented here.  Codes in this set will be deprecated if/when formal resources are defined that encompass these concepts.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/basic-resource-type">BasicResourceTypes</a>
 */
public enum CodeSystemBasicResourceTypes {

    /**
     * An assertion of permission for an activity or set of activities to occur, possibly subject to particular limitations; e.g. surgical consent, information disclosure consent, etc.
     */
    @Json(name = "consent")
    CONSENT,

    /**
     * A request that care of a particular type be provided to a patient.  Could involve the transfer of care, a consult, etc.
     */
    @Json(name = "referral")
    REFERRAL,

    /**
     * An undesired reaction caused by exposure to some agent (e.g. a medication, immunization, food, or environmental agent).
     */
    @Json(name = "advevent")
    ADVEVENT,

    /**
     * A request that a time be scheduled for a type of service for a specified patient, potentially subject to other constraints
     */
    @Json(name = "aptmtreq")
    APTMTREQ,

    /**
     * The transition of a patient or set of material from one location to another
     */
    @Json(name = "transfer")
    TRANSFER,

    /**
     * The specification of a set of food and/or other nutritional material to be delivered to a patient.
     */
    @Json(name = "diet")
    DIET,

    /**
     * An occurrence of a non-care-related event in the healthcare domain, such as approvals, reviews, etc.
     */
    @Json(name = "adminact")
    ADMINACT,

    /**
     * Record of a situation where a subject was exposed to a substance.  Usually of interest to public health.
     */
    @Json(name = "exposure")
    EXPOSURE,

    /**
     * A formalized inquiry into the circumstances surrounding a particular unplanned event or potential event for the purposes of identifying possible causes and contributing factors for the event
     */
    @Json(name = "investigation")
    INVESTIGATION,

    /**
     * A financial instrument used to track costs, charges or other amounts.
     */
    @Json(name = "account")
    ACCOUNT,

    /**
     * A request for payment for goods and/or services.  Includes the idea of a healthcare insurance claim.
     */
    @Json(name = "invoice")
    INVOICE,

    /**
     * The determination of what will be paid against a particular invoice based on coverage, plan rules, etc.
     */
    @Json(name = "adjudicat")
    ADJUDICAT,

    /**
     * A request for a pre-determination of the cost that would be paid under an insurance plan for a hypothetical claim for goods or services
     */
    @Json(name = "predetreq")
    PREDETREQ,

    /**
     * An adjudication of what would be paid under an insurance plan for a hypothetical claim for goods or services
     */
    @Json(name = "predetermine")
    PREDETERMINE,

    /**
     * An investigation to determine information about a particular therapy or product
     */
    @Json(name = "study")
    STUDY,

    /**
     * A set of (possibly conditional) steps to be taken to achieve some aim.  Includes study protocols, treatment protocols, emergency protocols, etc.
     */
    @Json(name = "protocol")
    PROTOCOL,
}
