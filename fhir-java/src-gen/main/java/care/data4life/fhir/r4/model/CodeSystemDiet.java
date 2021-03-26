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
 * This value set defines a set of codes that can be used to indicate dietary preferences or restrictions a patient may have.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/diet">Diet</a>
 */
public enum CodeSystemDiet {

    /**
     * Food without meat, poultry or seafood.
     */
    @Json(name = "vegetarian")
    VEGETARIAN,

    /**
     * Excludes dairy products.
     */
    @Json(name = "dairy-free")
    DAIRY_FREE,

    /**
     * Excludes ingredients containing nuts.
     */
    @Json(name = "nut-free")
    NUT_FREE,

    /**
     * Excludes ingredients containing gluten.
     */
    @Json(name = "gluten-free")
    GLUTEN_FREE,

    /**
     * Food without meat, poultry, seafood, eggs, dairy products and other animal-derived substances.
     */
    @Json(name = "vegan")
    VEGAN,

    /**
     * Foods that conform to Islamic law.
     */
    @Json(name = "halal")
    HALAL,

    /**
     * Foods that conform to Jewish dietary law.
     */
    @Json(name = "kosher")
    KOSHER,
}
