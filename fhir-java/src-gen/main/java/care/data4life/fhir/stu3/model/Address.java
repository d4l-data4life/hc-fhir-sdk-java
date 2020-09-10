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

import java.util.List;

import javax.annotation.Nullable;

/**
 * Address.java
 * <p>
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Address">Address</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Address) on 2020-07-29
 */
public class Address extends Element {

    public static final String resourceType = "Address";

    // Name of city, town etc..
    @Json(name = "city")
    @Nullable
    public String city;

    // Country (e.g. can be ISO 3166 2 or 3 letter code).
    @Json(name = "country")
    @Nullable
    public String country;

    // District name (aka county).
    @Json(name = "district")
    @Nullable
    public String district;

    // Street name, number, direction & P.O. Box etc..
    @Json(name = "line")
    @Nullable
    public List<String> line;

    // Time period when address was/is in use.
    @Json(name = "period")
    @Nullable
    public Period period;

    // Postal code for area.
    @Json(name = "postalCode")
    @Nullable
    public String postalCode;

    // Sub-unit of country (abbreviations ok).
    @Json(name = "state")
    @Nullable
    public String state;

    // Text representation of the address.
    @Json(name = "text")
    @Nullable
    public String text;

    // Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
    @Json(name = "type")
    @Nullable
    public CodeSystems.AddressType type;

    // The purpose of this address.
    @Json(name = "use")
    @Nullable
    public CodeSystems.AddressUse use;

    public Address() {
    }

    @Override
    public String getResourceType() {
        return Address.resourceType;
    }
}
