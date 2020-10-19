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
 * The set of interactions defined by the RESTful part of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/restful-interaction">FHIRRestfulInteractions</a>
 */
public enum CodeSystemFHIRRestfulInteractions {

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
     * Update an existing resource by its id (or create it if it is new).
     */
    @Json(name = "update")
    UPDATE,

    /**
     * Update an existing resource by posting a set of changes to it.
     */
    @Json(name = "patch")
    PATCH,

    /**
     * Delete a resource.
     */
    @Json(name = "delete")
    DELETE,

    /**
     * Retrieve the change history for a particular resource, type of resource, or the entire
     * system.
     */
    @Json(name = "history")
    HISTORY,

    /**
     * Retrieve the change history for a particular resource.
     */
    @Json(name = "history-instance")
    HISTORY_INSTANCE,

    /**
     * Retrieve the change history for all resources of a particular type.
     */
    @Json(name = "history-type")
    HISTORY_TYPE,

    /**
     * Retrieve the change history for all resources on a system.
     */
    @Json(name = "history-system")
    HISTORY_SYSTEM,

    /**
     * Create a new resource with a server assigned id.
     */
    @Json(name = "create")
    CREATE,

    /**
     * Search a resource type or all resources based on some filter criteria.
     */
    @Json(name = "search")
    SEARCH,

    /**
     * Search all resources of the specified type based on some filter criteria.
     */
    @Json(name = "search-type")
    SEARCH_TYPE,

    /**
     * Search all resources based on some filter criteria.
     */
    @Json(name = "search-system")
    SEARCH_SYSTEM,

    /**
     * Get a Capability Statement for the system.
     */
    @Json(name = "capabilities")
    CAPABILITIES,

    /**
     * Update, create or delete a set of resources as a single transaction.
     */
    @Json(name = "transaction")
    TRANSACTION,

    /**
     * perform a set of a separate interactions in a single http operation
     */
    @Json(name = "batch")
    BATCH,

    /**
     * Perform an operation as defined by an OperationDefinition.
     */
    @Json(name = "operation")
    OPERATION,
}
