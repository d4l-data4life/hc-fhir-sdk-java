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
 * Substance category codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/substance-category">SubstanceCategoryCodes</a>
 */
public enum CodeSystemSubstanceCategoryCodes {

    /**
     * A substance that causes an allergic reaction.
     */
    @Json(name = "allergen")
    ALLERGEN,

    /**
     * A substance that is produced by or extracted from a biological source.
     */
    @Json(name = "biological")
    BIOLOGICAL,

    /**
     * A substance that comes directly from a human or an animal (e.g. blood, urine, feces, tears,
     * etc.).
     */
    @Json(name = "body")
    BODY,

    /**
     * Any organic or inorganic substance of a particular molecular identity, including -- (i) any
     * combination of such substances occurring in whole or in part as a result of a chemical
     * reaction or occurring in nature and (ii) any element or uncombined radical
     * (http://www.epa.gov/opptintr/import-export/pubs/importguide.pdf).
     */
    @Json(name = "chemical")
    CHEMICAL,

    /**
     * A food, dietary ingredient, or dietary supplement for human or animal.
     */
    @Json(name = "food")
    FOOD,

    /**
     * A substance intended for use in the diagnosis, cure, mitigation, treatment, or prevention of
     * disease in man or other animals (Federal Food Drug and Cosmetic Act).
     */
    @Json(name = "drug")
    DRUG,

    /**
     * A finished product which is not normally ingested, absorbed or injected (e.g. steel, iron,
     * wood, plastic and paper).
     */
    @Json(name = "material")
    MATERIAL,
}
