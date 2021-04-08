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
 * This example value set defines a set of codes that can be used to indicate the physical form of
 * the Location.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/location-physical-type">LocationType</a>
 */
public enum CodeSystemLocationType {

    /**
     * A collection of buildings or other locations such as a site or a campus.
     */
    @Json(name = "si")
    SI,

    /**
     * Any Building or structure. This may contain rooms, corridors, wings, etc. It might not have
     * walls, or a roof, but is considered a defined/allocated space.
     */
    @Json(name = "bu")
    BU,

    /**
     * A Wing within a Building, this often contains levels, rooms and corridors.
     */
    @Json(name = "wi")
    WI,

    /**
     * A Ward is a section of a medical facility that may contain rooms and other types of
     * location.
     */
    @Json(name = "wa")
    WA,

    /**
     * A Level in a multi-level Building/Structure.
     */
    @Json(name = "lvl")
    LVL,

    /**
     * Any corridor within a Building, that may connect rooms.
     */
    @Json(name = "co")
    CO,

    /**
     * A space that is allocated as a room, it may have walls/roof etc., but does not require
     * these.
     */
    @Json(name = "ro")
    RO,

    /**
     * A space that is allocated for sleeping/laying on. This is not the physical bed/trolley that
     * may be moved about, but the space it may occupy.
     */
    @Json(name = "bd")
    BD,

    /**
     * A means of transportation.
     */
    @Json(name = "ve")
    VE,

    /**
     * A residential dwelling. Usually used to reference a location that a person/patient may
     * reside.
     */
    @Json(name = "ho")
    HO,

    /**
     * A container that can store goods, equipment, medications or other items.
     */
    @Json(name = "ca")
    CA,

    /**
     * A defined path to travel between 2 points that has a known name.
     */
    @Json(name = "rd")
    RD,

    /**
     * A defined physical boundary of something, such as a flood risk zone, region, postcode
     */
    @Json(name = "area")
    AREA,

    /**
     * A wide scope that covers a conceptual domain, such as a Nation (Country wide community or
     * Federal Government - e.g. Ministry of Health),  Province or State (community or Government),
     * Business (throughout the enterprise), Nation with a business scope of an agency (e.g. CDC,
     * FDA etc.) or a Business segment (UK Pharmacy), not just an physical boundary
     */
    @Json(name = "jdn")
    JDN,
}
