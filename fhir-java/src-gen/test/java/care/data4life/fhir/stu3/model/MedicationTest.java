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


import javax.annotation.Nullable;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.Date;

import care.data4life.fhir.stu3.FhirStu3Parser;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.*;

/**
 * MedicationTest.java
 *
 * Definition of a Medication.
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 *
 *
 * "Generated from FHIR 3.0.1.11917 on 2020-07-29
 */
public class MedicationTest {

	FhirStu3Parser parser = new FhirStu3Parser();

    @Test
	public void testMedication1() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0307.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "0169-7501-11");
		assertEquals(data.code.coding.get(0).display, "Novolog 100u/ml");
		assertEquals(data.code.coding.get(0).system, "http://hl7.org/fhir/sid/ndc");
		assertEquals(data.contained.get(0).id, "org3");
		assertEquals(data.fhirPackage.batch.get(0).expirationDate.toString(), "2019-10-31");
		assertEquals(data.fhirPackage.batch.get(0).lotNumber, "12345");
		assertEquals(data.fhirPackage.container.coding.get(0).code, "415818006");
		assertEquals(data.fhirPackage.container.coding.get(0).display, "Vial");
		assertEquals(data.fhirPackage.container.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.fhirPackage.content.get(0).amount.code, "mL");
		assertEquals(data.fhirPackage.content.get(0).amount.system, "http://unitsofmeasure.org");
		assertEquals(data.fhirPackage.content.get(0).amount.value.toString(), "10");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).code, "325072002");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).display, "Insulin Aspart (substance)");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.form.coding.get(0).code, "385219001");
		assertEquals(data.form.coding.get(0).display, "Injection solution (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0307");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "mL");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "U");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "100");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).code, "325072002");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).display, "Insulin Aspart (substance)");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.isBrand, true);
		assertEquals(data.manufacturer.reference, "#org3");
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication2() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0311.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "373994007");
		assertEquals(data.code.coding.get(0).display, "Prednisone 5mg tablet (Product)");
		assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.contained.get(0).id, "sub03");
		assertEquals(data.form.coding.get(0).code, "385055001");
		assertEquals(data.form.coding.get(0).display, "Tablet dose form (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0311");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "TAB");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://hl7.org/fhir/v3/orderableDrugForm");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mg");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "5");
		assertEquals(data.ingredient.get(0).itemReference.reference, "#sub03");
		assertEquals(data.isBrand, false);
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication3() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0310.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "430127000");
		assertEquals(data.code.coding.get(0).display, "Oral Form Oxycodone (product)");
		assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.contained.get(0).id, "sub03");
		assertEquals(data.form.coding.get(0).code, "385055001");
		assertEquals(data.form.coding.get(0).display, "Tablet dose form (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0310");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "TAB");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://hl7.org/fhir/v3/orderableDrugForm");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mg");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "5");
		assertEquals(data.ingredient.get(0).itemReference.reference, "#sub03");
		assertEquals(data.isBrand, false);
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication4() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0306.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "51144-050-01");
		assertEquals(data.code.coding.get(0).display, "Adcetris");
		assertEquals(data.code.coding.get(0).system, "http://hl7.org/fhir/sid/ndc");
		assertEquals(data.contained.get(0).id, "org3");
		assertEquals(data.fhirPackage.batch.get(0).expirationDate.toString(), "2019-10-31");
		assertEquals(data.fhirPackage.batch.get(0).lotNumber, "12345");
		assertEquals(data.form.coding.get(0).code, "421637006");
		assertEquals(data.form.coding.get(0).display, "Lyophilized powder for injectable solution (qualifier value) ");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0306");
		assertEquals(data.isBrand, true);
		assertEquals(data.manufacturer.reference, "#org3");
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication5() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0301.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "0069-2587-10");
		assertEquals(data.code.coding.get(0).display, "Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE)");
		assertEquals(data.code.coding.get(0).system, "http://hl7.org/fhir/sid/ndc");
		assertEquals(data.contained.get(0).id, "org4");
		assertEquals(data.fhirPackage.batch.get(0).expirationDate.toString(), "2017-05-22");
		assertEquals(data.fhirPackage.batch.get(0).lotNumber, "9494788");
		assertEquals(data.fhirPackage.container.coding.get(0).code, "415818006");
		assertEquals(data.fhirPackage.container.coding.get(0).display, "Vial");
		assertEquals(data.fhirPackage.container.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.fhirPackage.content.get(0).amount.code, "mL");
		assertEquals(data.fhirPackage.content.get(0).amount.system, "http://unitsofmeasure.org");
		assertEquals(data.fhirPackage.content.get(0).amount.value.toString(), "10");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).code, "324337001");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).display, "Vancomycin 500mg powder for infusion solution vial (product)");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.form.coding.get(0).code, "385219001");
		assertEquals(data.form.coding.get(0).display, "Injection Solution (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0301");
		assertEquals(data.image.get(0).contentType, "application/pdf");
		assertEquals(data.image.get(0).title, "Vancomycin Image");
		assertEquals(data.image.get(0).url, "https://www.drugs.com/images/pills/fio/AKN07410.JPG");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "mL");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "10");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mg");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "500");
		assertEquals(data.ingredient.get(0).isActive, true);
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).code, "66955");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).display, "Vancomycin Hydrochloride");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).system, "http://www.nlm.nih.gov/research/umls/rxnorm");
		assertEquals(data.isBrand, true);
		assertEquals(data.isOverTheCounter, false);
		assertEquals(data.manufacturer.reference, "#org4");
		assertEquals(data.status, CodeSystems.MedicationStatus.ACTIVE);
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication6() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0317.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.form.coding.get(0).code, "385219001");
		assertEquals(data.form.coding.get(0).display, "Injection Solution (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.form.text, "Injection Solution (qualifier value)");
		assertEquals(data.id, "med0317");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "mL");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mEq");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "2");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).code, "204520");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).display, "Potassium Chloride");
		assertEquals(data.ingredient.get(0).itemCodeableConcept.coding.get(0).system, "http://www.nlm.nih.gov/research/umls/rxnorm");
		assertEquals(data.ingredient.get(1).amount.denominator.code, "mL");
		assertEquals(data.ingredient.get(1).amount.denominator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(1).amount.denominator.value.toString(), "100");
		assertEquals(data.ingredient.get(1).amount.numerator.code, "g");
		assertEquals(data.ingredient.get(1).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(1).amount.numerator.value.toString(), "0.9");
		assertEquals(data.ingredient.get(1).itemCodeableConcept.coding.get(0).code, "313002");
		assertEquals(data.ingredient.get(1).itemCodeableConcept.coding.get(0).display, "Sodium Chloride 0.9% injectable solution");
		assertEquals(data.ingredient.get(1).itemCodeableConcept.coding.get(0).system, "http://www.nlm.nih.gov/research/umls/rxnorm");
		assertEquals(data.isBrand, false);
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication7() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample1.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.text, "Amoxicillin 250mg/5ml Suspension");
		assertEquals(data.id, "medicationexample1");
		assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Amoxicillin 250mg/5ml Suspension</div>");
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication8() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample15.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "213293");
		assertEquals(data.code.coding.get(0).display, "Capecitabine 500mg oral tablet (Xeloda)");
		assertEquals(data.code.coding.get(0).system, "http://www.nlm.nih.gov/research/umls/rxnorm");
		assertEquals(data.contained.get(0).id, "org2");
		assertEquals(data.contained.get(1).id, "sub04");
		assertEquals(data.fhirPackage.batch.get(0).expirationDate.toString(), "2017-05-22");
		assertEquals(data.fhirPackage.batch.get(0).lotNumber, "9494788");
		assertEquals(data.fhirPackage.container.coding.get(0).code, "419672006");
		assertEquals(data.fhirPackage.container.coding.get(0).display, "Bottle - unit of produce usage (qualifier value)");
		assertEquals(data.fhirPackage.container.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).code, "134622004");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).display, "Capecitabine 500mg tablets (product)");
		assertEquals(data.fhirPackage.content.get(0).itemCodeableConcept.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.form.coding.get(0).code, "385055001");
		assertEquals(data.form.coding.get(0).display, "Tablet dose form (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "medexample015");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "TAB");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://hl7.org/fhir/v3/orderableDrugForm");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mg");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "500");
		assertEquals(data.ingredient.get(0).itemReference.reference, "#sub04");
		assertEquals(data.isBrand, true);
		assertEquals(data.manufacturer.reference, "#org2");
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication9() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0321.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "108761006");
		assertEquals(data.code.coding.get(0).display, "Capecitabine (product)");
		assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.contained.get(0).id, "sub03");
		assertEquals(data.form.coding.get(0).code, "385055001");
		assertEquals(data.form.coding.get(0).display, "Tablet dose form (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0321");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "Tablet dose form (qualifier value)");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://snomed.info/sct");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mg");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "500");
		assertEquals(data.ingredient.get(0).itemReference.reference, "#sub03");
		assertEquals(data.isBrand, false);
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testMedication10() throws Exception {
		String sourceJson = FileHelper.loadString("medicationexample0320.json");
		Medication data = parser.toFhir(Medication.class , sourceJson);
		
		assertEquals(data.code.coding.get(0).code, "324252006");
		assertEquals(data.code.coding.get(0).display, "Azithromycin 250mg capsule (product)");
		assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.contained.get(0).id, "sub03");
		assertEquals(data.form.coding.get(0).code, "385055001");
		assertEquals(data.form.coding.get(0).display, "Tablet dose form (qualifier value)");
		assertEquals(data.form.coding.get(0).system, "http://snomed.info/sct");
		assertEquals(data.id, "med0320");
		assertEquals(data.ingredient.get(0).amount.denominator.code, "TAB");
		assertEquals(data.ingredient.get(0).amount.denominator.system, "http://hl7.org/fhir/v3/orderableDrugForm");
		assertEquals(data.ingredient.get(0).amount.denominator.value.toString(), "1");
		assertEquals(data.ingredient.get(0).amount.numerator.code, "mg");
		assertEquals(data.ingredient.get(0).amount.numerator.system, "http://unitsofmeasure.org");
		assertEquals(data.ingredient.get(0).amount.numerator.value.toString(), "250");
		assertEquals(data.ingredient.get(0).itemReference.reference, "#sub03");
		assertEquals(data.isBrand, false);
		assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}
}