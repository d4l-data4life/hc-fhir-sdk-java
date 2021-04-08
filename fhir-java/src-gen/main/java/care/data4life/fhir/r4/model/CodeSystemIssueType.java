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
 * A code that describes the type of issue.
 *
 * @see <a href="http://hl7.org/fhir/issue-type">IssueType</a>
 */
public enum CodeSystemIssueType {

    /**
     * Content invalid against the specification or a profile.
     */
    @Json(name = "invalid")
    INVALID,

    /**
     * A structural issue in the content such as wrong namespace, unable to parse the content
     * completely, invalid syntax, etc.
     */
    @Json(name = "structure")
    STRUCTURE,

    /**
     * A required element is missing.
     */
    @Json(name = "required")
    REQUIRED,

    /**
     * An element or header value is invalid.
     */
    @Json(name = "value")
    VALUE,

    /**
     * A content validation rule failed - e.g. a schematron rule.
     */
    @Json(name = "invariant")
    INVARIANT,

    /**
     * An authentication/authorization/permissions issue of some kind.
     */
    @Json(name = "security")
    SECURITY,

    /**
     * The client needs to initiate an authentication process.
     */
    @Json(name = "login")
    LOGIN,

    /**
     * The user or system was not able to be authenticated (either there is no process, or the
     * proferred token is unacceptable).
     */
    @Json(name = "unknown")
    UNKNOWN,

    /**
     * User session expired; a login may be required.
     */
    @Json(name = "expired")
    EXPIRED,

    /**
     * The user does not have the rights to perform this action.
     */
    @Json(name = "forbidden")
    FORBIDDEN,

    /**
     * Some information was not or might not have been returned due to business rules, consent or
     * privacy rules, or access permission constraints.  This information may be accessible through
     * alternate processes.
     */
    @Json(name = "suppressed")
    SUPPRESSED,

    /**
     * Processing issues. These are expected to be final e.g. there is no point resubmitting the
     * same content unchanged.
     */
    @Json(name = "processing")
    PROCESSING,

    /**
     * The interaction, operation, resource or profile is not supported.
     */
    @Json(name = "not-supported")
    NOT_SUPPORTED,

    /**
     * An attempt was made to create a duplicate record.
     */
    @Json(name = "duplicate")
    DUPLICATE,

    /**
     * Multiple matching records were found when the operation required only one match.
     */
    @Json(name = "multiple-matches")
    MULTIPLE_MATCHES,

    /**
     * The reference provided was not found. In a pure RESTful environment, this would be an HTTP
     * 404 error, but this code may be used where the content is not found further into the
     * application architecture.
     */
    @Json(name = "not-found")
    NOT_FOUND,

    /**
     * The reference pointed to content (usually a resource) that has been deleted.
     */
    @Json(name = "deleted")
    DELETED,

    /**
     * Provided content is too long (typically, this is a denial of service protection type of
     * error).
     */
    @Json(name = "too-long")
    TOO_LONG,

    /**
     * The code or system could not be understood, or it was not valid in the context of a
     * particular ValueSet.code.
     */
    @Json(name = "code-invalid")
    CODE_INVALID,

    /**
     * An extension was found that was not acceptable, could not be resolved, or a modifierExtension
     * was not recognized.
     */
    @Json(name = "extension")
    EXTENSION,

    /**
     * The operation was stopped to protect server resources; e.g. a request for a value set
     * expansion on all of SNOMED CT.
     */
    @Json(name = "too-costly")
    TOO_COSTLY,

    /**
     * The content/operation failed to pass some business rule and so could not proceed.
     */
    @Json(name = "business-rule")
    BUSINESS_RULE,

    /**
     * Content could not be accepted because of an edit conflict (i.e. version aware updates). (In a
     * pure RESTful environment, this would be an HTTP 409 error, but this code may be used where
     * the conflict is discovered further into the application architecture.).
     */
    @Json(name = "conflict")
    CONFLICT,

    /**
     * Transient processing issues. The system receiving the message may be able to resubmit the
     * same content once an underlying issue is resolved.
     */
    @Json(name = "transient")
    TRANSIENT,

    /**
     * A resource/record locking failure (usually in an underlying database).
     */
    @Json(name = "lock-error")
    LOCK_ERROR,

    /**
     * The persistent store is unavailable; e.g. the database is down for maintenance or similar
     * action, and the interaction or operation cannot be processed.
     */
    @Json(name = "no-store")
    NO_STORE,

    /**
     * An unexpected internal error has occurred.
     */
    @Json(name = "exception")
    EXCEPTION,

    /**
     * An internal timeout has occurred.
     */
    @Json(name = "timeout")
    TIMEOUT,

    /**
     * Not all data sources typically accessed could be reached or responded in time, so the
     * returned information might not be complete (applies to search interactions and some
     * operations).
     */
    @Json(name = "incomplete")
    INCOMPLETE,

    /**
     * The system is not prepared to handle this request due to load management.
     */
    @Json(name = "throttled")
    THROTTLED,

    /**
     * A message unrelated to the processing success of the completed operation (examples of the
     * latter include things like reminders of password expiry, system maintenance times, etc.).
     */
    @Json(name = "informational")
    INFORMATIONAL,
}
