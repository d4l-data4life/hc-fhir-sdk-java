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


import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import care.data4life.fhir.r4.FhirR4Parser;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.assertEquals;

/**
 * SubstanceTest.java
 * <p>
 * A homogeneous material with a definite composition.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-03-26
 */
public class SubstanceTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testSubstance1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/substance-example-silver-nitrate-product.json");
        Substance data = parser.toFhir(Substance.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "chemical");
        assertEquals(data.category.get(0).coding.get(0).display, "Chemical");
        assertEquals(data.category.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/substance-category");
        assertEquals(data.code.coding.get(0).code, "333346007");
        assertEquals(data.code.coding.get(0).display, "Silver nitrate 20% solution (product)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.description, "Solution for silver nitrate stain");
        assertEquals(data.id, "f204");
        assertEquals(data.identifier.get(0).system, "http://acme.org/identifiers/substances");
        assertEquals(data.identifier.get(0).value, "15970");
        assertEquals(data.instance.get(0).expiry.toString(), "2018-01-01");
        assertEquals(data.instance.get(0).identifier.system, "http://acme.org/identifiers/substances/lot");
        assertEquals(data.instance.get(0).identifier.value, "AB94687");
        assertEquals(data.instance.get(0).quantity.code, "mL");
        assertEquals(data.instance.get(0).quantity.system, "http://unitsofmeasure.org");
        assertEquals(data.instance.get(0).quantity.unit, "mL");
        assertEquals(data.instance.get(0).quantity.value.toString(), "100");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSubstance2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/substance-example-amoxicillin-clavulanate.json");
        Substance data = parser.toFhir(Substance.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "drug");
        assertEquals(data.category.get(0).coding.get(0).display, "Drug or Medicament");
        assertEquals(data.category.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/substance-category");
        assertEquals(data.code.coding.get(0).code, "392259005");
        assertEquals(data.code.coding.get(0).display, "Amoxicillin + clavulanate potassium 875mg/125mg tablet (product)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.contained.get(0).id, "ingr1");
        assertEquals(data.contained.get(1).id, "ingr2");
        assertEquals(data.description, "Augmentin 875");
        assertEquals(data.id, "f205");
        assertEquals(data.ingredient.get(0).quantity.denominator.code, "mg");
        assertEquals(data.ingredient.get(0).quantity.denominator.system, "http://unitsofmeasure.org");
        assertEquals(data.ingredient.get(0).quantity.denominator.unit, "mg");
        assertEquals(data.ingredient.get(0).quantity.denominator.value.toString(), "1000");
        assertEquals(data.ingredient.get(0).quantity.numerator.code, "mg");
        assertEquals(data.ingredient.get(0).quantity.numerator.system, "http://unitsofmeasure.org");
        assertEquals(data.ingredient.get(0).quantity.numerator.unit, "mg");
        assertEquals(data.ingredient.get(0).quantity.numerator.value.toString(), "875");
        assertEquals(data.ingredient.get(0).substanceReference.reference, "#ingr1");
        assertEquals(data.ingredient.get(1).quantity.denominator.code, "mg");
        assertEquals(data.ingredient.get(1).quantity.denominator.system, "http://unitsofmeasure.org");
        assertEquals(data.ingredient.get(1).quantity.denominator.unit, "mg");
        assertEquals(data.ingredient.get(1).quantity.denominator.value.toString(), "1000");
        assertEquals(data.ingredient.get(1).quantity.numerator.code, "mg");
        assertEquals(data.ingredient.get(1).quantity.numerator.system, "http://unitsofmeasure.org");
        assertEquals(data.ingredient.get(1).quantity.numerator.unit, "mg");
        assertEquals(data.ingredient.get(1).quantity.numerator.value.toString(), "125");
        assertEquals(data.ingredient.get(1).substanceReference.reference, "#ingr2");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSubstance3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/substance-example-f203-potassium.json");
        Substance data = parser.toFhir(Substance.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "chemical");
        assertEquals(data.category.get(0).coding.get(0).display, "Chemical");
        assertEquals(data.category.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/substance-category");
        assertEquals(data.code.coding.get(0).code, "88480006");
        assertEquals(data.code.coding.get(0).display, "Potassium");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.id, "f203");
        assertEquals(data.identifier.get(0).system, "http://acme.org/identifiers/substances");
        assertEquals(data.identifier.get(0).value, "1234");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSubstance4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/substance-example-f201-dust.json");
        Substance data = parser.toFhir(Substance.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "406466009");
        assertEquals(data.code.coding.get(0).display, "House dust allergen");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.id, "f201");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSubstance5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/substance-example.json");
        Substance data = parser.toFhir(Substance.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "allergen");
        assertEquals(data.category.get(0).coding.get(0).display, "Allergen");
        assertEquals(data.category.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/substance-category");
        assertEquals(data.code.text, "apitoxin (Honey Bee Venom)");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "http://acme.org/identifiers/substances");
        assertEquals(data.identifier.get(0).value, "1463");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.status, CodeSystemFHIRSubstanceStatus.ACTIVE);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSubstance6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/substance-example-f202-staphylococcus.json");
        Substance data = parser.toFhir(Substance.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "3092008");
        assertEquals(data.code.coding.get(0).display, "Staphylococcus Aureus");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.id, "f202");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}