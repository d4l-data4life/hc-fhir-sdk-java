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

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import care.data4life.fhir.stu3.FhirStu3Parser;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * MedicationRequestTest.java
 * <p>
 * Ordering of medication for patient or group.
 * <p>
 * An order or request for both supply of the medication and the instructions for administration of
 * the medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and
 * outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * <p>
 * <p>
 * "Generated from FHIR 3.0.1.11917 on 2020-07-29
 */
public class MedicationRequestTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testMedicationRequest1() throws Exception {
        String sourceJson = FileHelper.loadString("medicationrequestexample1.json");
        MedicationRequest data = parser.toFhir(MedicationRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2015-01-15");
        assertEquals(data.contained.get(0).id, "med0316");
        assertEquals(data.context.display, "encounter who leads to this prescription");
        assertEquals(data.context.reference, "Encounter/f001");
        assertEquals(data.dispenseRequest.expectedSupplyDuration.code, "d");
        assertEquals(data.dispenseRequest.expectedSupplyDuration.system, "http://unitsofmeasure.org");
        assertEquals(data.dispenseRequest.expectedSupplyDuration.unit, "days");
        assertEquals(data.dispenseRequest.expectedSupplyDuration.value.toString(), "30");
        assertTrue(data.dispenseRequest.numberOfRepeatsAllowed == 1);
        assertEquals(data.dispenseRequest.quantity.code, "TAB");
        assertEquals(data.dispenseRequest.quantity.system, "http://hl7.org/fhir/v3/orderableDrugForm");
        assertEquals(data.dispenseRequest.quantity.unit, "TAB");
        assertEquals(data.dispenseRequest.quantity.value.toString(), "30");
        assertEquals(data.dispenseRequest.validityPeriod.end.toString(), "2016-01-15");
        assertEquals(data.dispenseRequest.validityPeriod.start.toString(), "2015-01-15");
        assertEquals(data.dosageInstruction.get(0).additionalInstruction.get(0).coding.get(0).code,
                "311504000");
        assertEquals(data.dosageInstruction.get(0).additionalInstruction.get(0).coding.get(0).display,
                "With or after food");
        assertEquals(data.dosageInstruction.get(0).additionalInstruction.get(0).coding.get(0).system,
                "http://snomed.info/sct");
        assertEquals(data.dosageInstruction.get(0).doseQuantity.code, "TAB");
        assertEquals(data.dosageInstruction.get(0).doseQuantity.system,
                "http://hl7.org/fhir/v3/orderableDrugForm");
        assertEquals(data.dosageInstruction.get(0).doseQuantity.unit, "TAB");
        assertEquals(data.dosageInstruction.get(0).doseQuantity.value.toString(), "1");
        assertEquals(data.dosageInstruction.get(0).method.coding.get(0).code, "421521009");
        assertEquals(data.dosageInstruction.get(0).method.coding.get(0).display,
                "Swallow - dosing instruction imperative (qualifier value)");
        assertEquals(data.dosageInstruction.get(0).method.coding.get(0).system,
                "http://snomed.info/sct");
        assertEquals(data.dosageInstruction.get(0).route.coding.get(0).code, "26643006");
        assertEquals(data.dosageInstruction.get(0).route.coding.get(0).display, "Oral Route");
        assertEquals(data.dosageInstruction.get(0).route.coding.get(0).system,
                "http://snomed.info/sct");
        assertTrue(data.dosageInstruction.get(0).sequence == 1);
        assertEquals(data.dosageInstruction.get(0).text, "One tablet daily");
        assertEquals(data.dosageInstruction.get(0).timing.code.coding.get(0).code, "QD");
        assertEquals(data.dosageInstruction.get(0).timing.code.coding.get(0).display, "QD");
        assertEquals(data.dosageInstruction.get(0).timing.code.coding.get(0).system,
                "http://hl7.org/fhir/v3/GTSAbbreviation");
        assertEquals(data.id, "medrx0311");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/portal/prescriptions");
        assertEquals(data.identifier.get(0).use, CodeSystems.IdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "12345689");
        assertEquals(data.intent, CodeSystems.MedicationRequestIntent.ORDER);
        assertEquals(data.medicationReference.reference, "#med0316");
        assertEquals(data.note.get(0).text,
                "Chlorthalidone increases urniation so take it in the morning");
        assertEquals(data.reasonReference.get(0).display, "condition for prescribing this medication");
        assertEquals(data.reasonReference.get(0).reference, "Condition/f201");
        assertEquals(data.requester.agent.display, "Patrick Pump");
        assertEquals(data.requester.agent.reference, "Practitioner/f007");
        assertEquals(data.requester.onBehalfOf.reference, "Organization/f002");
        assertEquals(data.status, CodeSystems.MedicationRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Donald Duck");
        assertEquals(data.subject.reference, "Patient/pat1");
        assertEquals(data.substitution.allowed, true);
        assertEquals(data.substitution.reason.coding.get(0).code, "CT");
        assertEquals(data.substitution.reason.coding.get(0).display, "continuing therapy");
        assertEquals(data.substitution.reason.coding.get(0).system, "http://hl7.org/fhir/v3/ActReason");
        assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testMedicationRequest2() throws Exception {
        String sourceJson = FileHelper.loadString("medicationrequestexample2.json");
        MedicationRequest data = parser.toFhir(MedicationRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2015-03-01");
        assertEquals(data.context.display, "encounter that leads to this prescription");
        assertEquals(data.context.reference, "Encounter/f001");
        assertTrue(data.dosageInstruction.get(0).sequence == 1);
        assertEquals(data.dosageInstruction.get(0).text, "Take one tablet daily as directed");
        assertEquals(data.id, "medrx002");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/portal/prescriptions");
        assertEquals(data.identifier.get(0).use, CodeSystems.IdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "12345");
        assertEquals(data.intent, CodeSystems.MedicationRequestIntent.ORDER);
        assertEquals(data.medicationReference.display, "prescribed medication");
        assertEquals(data.medicationReference.reference, "Medication/med0316");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "59621000");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Essential hypertension (disorder)");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.requester.agent.display, "Patrick Pump");
        assertEquals(data.requester.agent.reference, "Practitioner/f007");
        assertEquals(data.requester.onBehalfOf.reference, "Organization/f002");
        assertEquals(data.status, CodeSystems.MedicationRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Donald Duck");
        assertEquals(data.subject.reference, "Patient/pat1");
        assertEquals(data.text.status, CodeSystems.NarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}