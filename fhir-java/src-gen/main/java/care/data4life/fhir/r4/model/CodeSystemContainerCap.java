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
 * Color of the container cap.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/container-cap">ContainerCap</a>
 */
public enum CodeSystemContainerCap {

    /**
     * red cap.
     */
    @Json(name = "red")
    RED,

    /**
     * yellow cap.
     */
    @Json(name = "yellow")
    YELLOW,

    /**
     * dark yellow cap.
     */
    @Json(name = "dark-yellow")
    DARK_YELLOW,

    /**
     * grey cap.
     */
    @Json(name = "grey")
    GREY,

    /**
     * light blue cap.
     */
    @Json(name = "light-blue")
    LIGHT_BLUE,

    /**
     * black cap.
     */
    @Json(name = "black")
    BLACK,

    /**
     * green cap.
     */
    @Json(name = "green")
    GREEN,

    /**
     * light green cap.
     */
    @Json(name = "light-green")
    LIGHT_GREEN,

    /**
     * lavender cap.
     */
    @Json(name = "lavender")
    LAVENDER,

    /**
     * brown cap.
     */
    @Json(name = "brown")
    BROWN,

    /**
     * white cap.
     */
    @Json(name = "white")
    WHITE,

    /**
     * pink cap.
     */
    @Json(name = "pink")
    PINK,
}
