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
 * Money.java
 * <p>
 * An amount of economic utility in some recognized currency
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Money">Money</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Money) on
 * 2021-04-08
 */
public class Money extends Element {

    public static final String resourceType = "Money";

    // Numerical value (with implicit precision).
    @Json(name = "value")
    @Nullable
    public FhirDecimal value;

    // ISO 4217 Currency Code.
    @Json(name = "currency")
    @Nullable
    public String currency;


    public Money() {
    }

    @Override
    public String getResourceType() {
        return Money.resourceType;
    }


}
