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
 * Indicates the degree of precision of the data element definition.
 *
 * @see <a href="http://hl7.org/fhir/dataelement-stringency">DataElementStringency</a>
 */
public enum CodeSystemDataElementStringency {

    /**
     * The data element is sufficiently well-constrained that multiple pieces of data captured
     * according to the constraints of the data element will be comparable (though in some cases, a
     * degree of automated conversion/normalization may be required).
     */
    @Json(name = "comparable")
    COMPARABLE,

    /**
     * The data element is fully specified down to a single value set, single unit of measure,
     * single data type, etc.  Multiple pieces of data associated with this data element are fully
     * comparable.
     */
    @Json(name = "fully-specified")
    FULLY_SPECIFIED,

    /**
     * The data element allows multiple units of measure having equivalent meaning; e.g. "cc" (cubic
     * centimeter) and "mL" (milliliter).
     */
    @Json(name = "equivalent")
    EQUIVALENT,

    /**
     * The data element allows multiple units of measure that are convertable between each other
     * (e.g. inches and centimeters) and/or allows data to be captured in multiple value sets for
     * which a known mapping exists allowing conversion of meaning.
     */
    @Json(name = "convertable")
    CONVERTABLE,

    /**
     * A convertable data element where unit conversions are different only by a power of 10; e.g.
     * g, mg, kg.
     */
    @Json(name = "scaleable")
    SCALEABLE,

    /**
     * The data element is unconstrained in units, choice of data types and/or choice of vocabulary
     * such that automated comparison of data captured using the data element is not possible.
     */
    @Json(name = "flexible")
    FLEXIBLE,
}
