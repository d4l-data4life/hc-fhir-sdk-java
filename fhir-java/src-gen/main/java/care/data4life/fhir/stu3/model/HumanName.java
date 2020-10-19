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
 * HumanName.java
 * <p>
 * A human's name with the ability to identify parts and usage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HumanName">HumanName</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HumanName) on
 * 2020-10-15
 */
public class HumanName extends Element {

    public static final String resourceType = "HumanName";

    // Identifies the purpose for this name.
    @Json(name = "use")
    @Nullable
    public CodeSystemNameUse use;

    // Text representation of the full name.
    @Json(name = "text")
    @Nullable
    public String text;

    // Family name (often called 'Surname').
    @Json(name = "family")
    @Nullable
    public String family;

    // Given names (not always 'first'). Includes middle names.
    @Json(name = "given")
    @Nullable
    public List<String> given;

    // Parts that come before the name.
    @Json(name = "prefix")
    @Nullable
    public List<String> prefix;

    // Parts that come after the name.
    @Json(name = "suffix")
    @Nullable
    public List<String> suffix;

    // Time period when name was/is in use.
    @Json(name = "period")
    @Nullable
    public Period period;


    public HumanName() {
    }

    @Override
    public String getResourceType() {
        return HumanName.resourceType;
    }


}
