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
 * The meaning of the hierarchy of concepts in a code system.
 *
 * @see <a href="http://hl7.org/fhir/codesystem-hierarchy-meaning">CodeSystemHierarchyMeaning</a>
 */
public enum CodeSystemCodeSystemHierarchyMeaning {

    /**
     * No particular relationship between the concepts can be assumed, except what can be determined by inspection of the definitions of the elements (possible reasons to use this: importing from a source where this is not defined, or where various parts of the hierarchy have different meanings).
     */
    @Json(name = "grouped-by")
    GROUPED_BY,

    /**
     * A hierarchy where the child concepts have an IS-A relationship with the parents - that is, all the properties of the parent are also true for its child concepts. Not that is-a is a property of the concepts, so additional subsumption relationships may be defined using properties or the [subsumes](extension-codesystem-subsumes.html) extension.
     */
    @Json(name = "is-a")
    IS_A,

    /**
     * Child elements list the individual parts of a composite whole (e.g. body site).
     */
    @Json(name = "part-of")
    PART_OF,

    /**
     * Child concepts in the hierarchy may have only one parent, and there is a presumption that the code system is a "closed world" meaning all things must be in the hierarchy. This results in concepts such as "not otherwise classified.".
     */
    @Json(name = "classified-with")
    CLASSIFIED_WITH,
}
