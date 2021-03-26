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
 * This value set defines a set of codes that are used to indicate the supported operations of a testing engine or
 * tool.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/testscript-operation-codes">TestScriptOperationCode</a>
 */
public enum CodeSystemTestScriptOperationCode {

    /**
     * Read the current state of the resource.
     */
    @Json(name = "read")
    READ,

    /**
     * Read the state of a specific version of the resource.
     */
    @Json(name = "vread")
    VREAD,

    /**
     * Update an existing resource by its id.
     */
    @Json(name = "update")
    UPDATE,

    /**
     * Update an existing resource by its id (or create it if it is new).
     */
    @Json(name = "updateCreate")
    UPDATECREATE,

    /**
     * Patch an existing resource by its id.
     */
    @Json(name = "patch")
    PATCH,

    /**
     * Delete a resource.
     */
    @Json(name = "delete")
    DELETE,

    /**
     * Conditionally delete a single resource based on search parameters.
     */
    @Json(name = "deleteCondSingle")
    DELETECONDSINGLE,

    /**
     * Conditionally delete one or more resources based on search parameters.
     */
    @Json(name = "deleteCondMultiple")
    DELETECONDMULTIPLE,

    /**
     * Retrieve the change history for a particular resource or resource type.
     */
    @Json(name = "history")
    HISTORY,

    /**
     * Create a new resource with a server assigned id.
     */
    @Json(name = "create")
    CREATE,

    /**
     * Search based on some filter criteria.
     */
    @Json(name = "search")
    SEARCH,

    /**
     * Update, create or delete a set of resources as independent actions.
     */
    @Json(name = "batch")
    BATCH,

    /**
     * Update, create or delete a set of resources as a single transaction.
     */
    @Json(name = "transaction")
    TRANSACTION,

    /**
     * Get a capability statement for the system.
     */
    @Json(name = "capabilities")
    CAPABILITIES,

    /**
     * Realizes an ActivityDefinition in a specific context
     */
    @Json(name = "apply")
    APPLY,

    /**
     * Closure Table Maintenance
     */
    @Json(name = "closure")
    CLOSURE,

    /**
     * Finding Codes based on supplied properties
     */
    @Json(name = "find-matches")
    FIND_MATCHES,

    /**
     * Compare two systems CapabilityStatements
     */
    @Json(name = "conforms")
    CONFORMS,

    /**
     * Aggregates and returns the parameters and data requirements for a resource and all its dependencies as a single
     * module definition
     */
    @Json(name = "data-requirements")
    DATA_REQUIREMENTS,

    /**
     * Generate a Document
     */
    @Json(name = "document")
    DOCUMENT,

    /**
     * Request clinical decision support guidance based on a specific decision support module
     */
    @Json(name = "evaluate")
    EVALUATE,

    /**
     * Invoke an eMeasure and obtain the results
     */
    @Json(name = "evaluate-measure")
    EVALUATE_MEASURE,

    /**
     * Return all the related information as described in the Encounter or Patient
     */
    @Json(name = "everything")
    EVERYTHING,

    /**
     * Value Set Expansion
     */
    @Json(name = "expand")
    EXPAND,

    /**
     * Find a functional list
     */
    @Json(name = "find")
    FIND,

    /**
     * Invoke a GraphQL query
     */
    @Json(name = "graphql")
    GRAPHQL,

    /**
     * Test if a server implements a client's required operations
     */
    @Json(name = "implements")
    IMPLEMENTS,

    /**
     * Last N Observations Query
     */
    @Json(name = "lastn")
    LASTN,

    /**
     * Concept Look Up and Decomposition
     */
    @Json(name = "lookup")
    LOOKUP,

    /**
     * Find patient matches using MPI based logic
     */
    @Json(name = "match")
    MATCH,

    /**
     * Access a list of profiles, tags, and security labels
     */
    @Json(name = "meta")
    META,

    /**
     * Add profiles, tags, and security labels to a resource
     */
    @Json(name = "meta-add")
    META_ADD,

    /**
     * Delete profiles, tags, and security labels for a resource
     */
    @Json(name = "meta-delete")
    META_DELETE,

    /**
     * Populate Questionnaire
     */
    @Json(name = "populate")
    POPULATE,

    /**
     * Generate HTML for Questionnaire
     */
    @Json(name = "populatehtml")
    POPULATEHTML,

    /**
     * Generate a link to a Questionnaire completion webpage
     */
    @Json(name = "populatelink")
    POPULATELINK,

    /**
     * Process a message according to the defined event
     */
    @Json(name = "process-message")
    PROCESS_MESSAGE,

    /**
     * Build Questionnaire
     */
    @Json(name = "questionnaire")
    QUESTIONNAIRE,

    /**
     * Observation Statistics
     */
    @Json(name = "stats")
    STATS,

    /**
     * Fetch a subset of the CapabilityStatement resource
     */
    @Json(name = "subset")
    SUBSET,

    /**
     * CodeSystem Subsumption Testing
     */
    @Json(name = "subsumes")
    SUBSUMES,

    /**
     * Model Instance Transformation
     */
    @Json(name = "transform")
    TRANSFORM,

    /**
     * Concept Translation
     */
    @Json(name = "translate")
    TRANSLATE,

    /**
     * Validate a resource
     */
    @Json(name = "validate")
    VALIDATE,

    /**
     * ValueSet based Validation
     */
    @Json(name = "validate-code")
    VALIDATE_CODE,
}
