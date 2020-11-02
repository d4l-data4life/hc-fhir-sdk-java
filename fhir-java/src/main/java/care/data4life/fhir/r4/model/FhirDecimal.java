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

import java.math.BigDecimal;
import java.util.Objects;

import care.data4life.fhir.stu3.model.Element;

/**
 * FhirDecimal
 * <p>
 * Rational numbers that have a decimal representation.
 * <p>
 * The precision of the decimal value has significance:
 * <ul>
 * <li>e.g. 0.010 is regarded as different to 0.01, and the original precision should be
 * preserved</li>
 * </ul>
 *
 * @see <a href="http://hl7.org/fhir/datatypes.html#decimal">Decimal</a>
 */
public class FhirDecimal extends Element {

    private BigDecimal decimal;

    /**
     * Constructor
     *
     * @param decimal BigDecimal
     */
    public FhirDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }


    public BigDecimal getDecimal() {
        return decimal;
    }

    @Override
    public String toString() {
        return decimal.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FhirDecimal that = (FhirDecimal) o;
        return Objects.equals(decimal, that.decimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decimal);
    }


    public boolean isIntegerValue() {
        return decimal.signum() == 0 || decimal.scale() <= 0 || decimal.stripTrailingZeros().scale() <= 0;
    }
}
