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
 * Quantity.java
 * <p>
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts
 * include amounts that are not precisely quantified, including amounts involving arbitrary units
 * and floating currencies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MoneyQuantity">Quantity</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MoneyQuantity) on
 * 2020-10-27
 */
public class Quantity extends Element {

    public static final String resourceType = "Quantity";

    // Numerical value (with implicit precision).
    @Json(name = "value")
    @Nullable
    public FhirDecimal value;

    // How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
    @Json(name = "comparator")
    @Nullable
    public CodeSystemQuantityComparator comparator;

    // Unit representation.
    @Json(name = "unit")
    @Nullable
    public String unit;

    // System that defines coded unit form.
    @Json(name = "system")
    @Nullable
    public String system;

    // Coded form of the unit.
    @Json(name = "code")
    @Nullable
    public String code;


    public Quantity() {
    }

    @Override
    public String getResourceType() {
        return Quantity.resourceType;
    }


}
