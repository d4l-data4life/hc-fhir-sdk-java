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
 * A list of all the definition resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/definition-resource-types">DefinitionResourceType</a>
 */
public enum CodeSystemDefinitionResourceType {

    /**
     * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
     */
    @Json(name = "ActivityDefinition")
    ACTIVITYDEFINITION,

    /**
     * The EventDefinition resource provides a reusable description of when a particular event can occur.
     */
    @Json(name = "EventDefinition")
    EVENTDEFINITION,

    /**
     * The Measure resource provides the definition of a quality measure.
     */
    @Json(name = "Measure")
    MEASURE,

    /**
     * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
     */
    @Json(name = "OperationDefinition")
    OPERATIONDEFINITION,

    /**
     * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
     */
    @Json(name = "PlanDefinition")
    PLANDEFINITION,

    /**
     * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
     */
    @Json(name = "Questionnaire")
    QUESTIONNAIRE,
}
