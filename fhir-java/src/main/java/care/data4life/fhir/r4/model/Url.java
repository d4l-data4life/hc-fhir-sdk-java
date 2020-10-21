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

import javax.annotation.Nullable;

/**
 * Url.java
 * <p>
 * A URI that is a literal reference
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/url">Url</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/url) on 2020-10-15
 */
public class Url extends Element {

    public static final String resourceType = "Url";

    // Primitive value for url.
    @Json(name = "value")
    @Nullable
    public String url;


    public Url() {
    }

    @Override
    public String getResourceType() {
        return Url.resourceType;
    }


}
