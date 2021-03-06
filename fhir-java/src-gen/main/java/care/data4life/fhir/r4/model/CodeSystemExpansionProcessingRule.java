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
 * Defines how concepts are processed into the expansion when it's for UI presentation.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/expansion-processing-rule">ExpansionProcessingRule</a>
 */
public enum CodeSystemExpansionProcessingRule {

    /**
     * The expansion (when in UI mode) includes all codes *and* any defined groups (in extensions).
     */
    @Json(name = "all-codes")
    ALL_CODES,

    /**
     * The expanion (when in UI mode) lists the groups, and then any codes that have not been
     * included in a group.
     */
    @Json(name = "ungrouped")
    UNGROUPED,

    /**
     * The expansion (when in UI mode) only includes the defined groups.
     */
    @Json(name = "groups-only")
    GROUPS_ONLY,
}
