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
 * ProcedureRequestTest.java
 * <p>
 * A request for a procedure or diagnostic to be performed.
 * <p>
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class ProcedureRequestTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testProcedureRequest1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example-lipid.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "LIPID");
        assertEquals(data.code.coding.get(0).system, "http://acme.org/tests");
        assertEquals(data.code.text, "Lipid Panel");
        assertEquals(data.contained.get(0).id, "fasting");
        assertEquals(data.contained.get(1).id, "serum");
        assertEquals(data.context.reference, "Encounter/example");
        assertEquals(data.id, "lipid");
        assertEquals(data.identifier.get(0).system, "urn:oid:1.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "PLAC");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/identifier-type");
        assertEquals(data.identifier.get(0).type.text, "Placer");
        assertEquals(data.identifier.get(0).value, "2345234234234");
        assertEquals(data.intent, CodeSystemRequestIntent.ORIGINAL_ORDER);
        assertEquals(data.note.get(0).text, "patient is afraid of needles");
        assertEquals(data.occurrenceDateTime.toString(), "2013-05-02T16:16:00-07:00");
        assertEquals(data.performer.reference, "Practitioner/f202");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "V173");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Fam hx-ischem heart dis");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://hl7.org/fhir/sid/icd-9");
        assertEquals(data.requester.agent.reference, "Practitioner/example");
        assertEquals(data.requester.onBehalfOf.reference, "Organization/f001");
        assertEquals(data.specimen.get(0).display, "Serum specimen");
        assertEquals(data.specimen.get(0).reference, "#serum");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.supportingInfo.get(0).display, "Fasting status");
        assertEquals(data.supportingInfo.get(0).reference, "#fasting");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example4.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "229115003");
        assertEquals(data.code.coding.get(0).display, "Bench Press (regime/therapy) ");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.id, "benchpress");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.note.get(0).text, "Start with 30kg and increase in increments of 5kg when you feel ready");
        assertTrue(data.occurrenceTiming.repeat.count == 20);
        assertTrue(data.occurrenceTiming.repeat.countMax == 30);
        assertTrue(data.occurrenceTiming.repeat.frequency == 3);
        assertEquals(data.occurrenceTiming.repeat.period.toString(), "1");
        assertEquals(data.occurrenceTiming.repeat.periodUnit, "wk");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest3() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example-edu.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2016-08-16");
        assertEquals(data.category.get(0).coding.get(0).code, "311401005");
        assertEquals(data.category.get(0).coding.get(0).display, "Patient education (procedure)");
        assertEquals(data.category.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.category.get(0).text, "Education");
        assertEquals(data.code.coding.get(0).code, "48023004");
        assertEquals(data.code.coding.get(0).display, "Breast self-examination technique education (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Health education - breast examination");
        assertEquals(data.id, "education");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.occurrenceDateTime.toString(), "2014-08-16");
        assertEquals(data.performer.display, "Pamela Educator, RN");
        assertEquals(data.reasonCode.get(0).text, "early detection of breast mass");
        assertEquals(data.requester.agent.display, "Angela Care, MD");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.display, "Jane Doe");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest4() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example-pt.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2016-09-20");
        assertEquals(data.bodySite.get(0).coding.get(0).code, "36701003");
        assertEquals(data.bodySite.get(0).coding.get(0).display, "Both knees (body structure)");
        assertEquals(data.bodySite.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.bodySite.get(0).text, "Both knees");
        assertEquals(data.category.get(0).coding.get(0).code, "386053000");
        assertEquals(data.category.get(0).coding.get(0).display, "Evaluation procedure (procedure)");
        assertEquals(data.category.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.category.get(0).text, "Evaluation");
        assertEquals(data.code.coding.get(0).code, "710830005");
        assertEquals(data.code.coding.get(0).display, "Assessment of passive range of motion (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Assessment of passive range of motion");
        assertEquals(data.id, "physical-therapy");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.occurrenceDateTime.toString(), "2016-09-27");
        assertEquals(data.performer.display, "Paul Therapist, PT");
        assertEquals(data.reasonCode.get(0).text, "assessment of mobility limitations due to osteoarthritis");
        assertEquals(data.requester.agent.display, "Ollie Ortho, MD");
        assertEquals(data.requester.onBehalfOf.display, "Sawbones Orthopedic Clinic");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest5() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-genetics-example-1.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "49874-1");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "ABCB4 gene mutation analysis");
        assertEquals(data.context.reference, "Encounter/example");
        assertEquals(data.id, "og-example1");
        assertEquals(data.intent, CodeSystemRequestIntent.ORIGINAL_ORDER);
        assertEquals(data.occurrenceDateTime.toString(), "2014-05-12T16:16:00-07:00");
        assertEquals(data.performer.reference, "Practitioner/example");
        assertEquals(data.requester.agent.reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest6() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example-di.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "24627-2");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Chest CT");
        assertEquals(data.id, "di");
        assertEquals(data.intent, CodeSystemRequestIntent.ORIGINAL_ORDER);
        assertEquals(data.occurrenceDateTime.toString(), "2013-05-08T09:33:27+07:00");
        assertEquals(data.reasonCode.get(0).text, "Check for metastatic disease");
        assertEquals(data.requester.agent.display, "Dr. Adam Careful");
        assertEquals(data.requester.agent.reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/dicom");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest7() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example-subrequest.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.basedOn.get(0).display, "Original Request");
        assertEquals(data.bodySite.get(0).coding.get(0).display, "Right arm");
        assertEquals(data.bodySite.get(0).text, "Right arm");
        assertEquals(data.code.coding.get(0).code, "35542-0");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Peanut IgG");
        assertEquals(data.definition.get(0).display, "Protocol for alergies");
        assertEquals(data.id, "subrequest");
        assertEquals(data.intent, CodeSystemRequestIntent.INSTANCE_ORDER);
        assertEquals(data.occurrenceDateTime.toString(), "2013-05-08T09:33:27+07:00");
        assertEquals(data.performerType.coding.get(0).display, "Qualified nurse");
        assertEquals(data.performerType.text, "Nurse");
        assertEquals(data.priority, CodeSystemRequestPriority.ROUTINE);
        assertEquals(data.reasonCode.get(0).text, "Check for Peanut Allergy");
        assertEquals(data.replaces.get(0).display, "Previous allergy test");
        assertEquals(data.requester.agent.display, "Dr. Adam Careful");
        assertEquals(data.requester.agent.reference, "Practitioner/example");
        assertEquals(data.requisition.value, "A13848392");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/dicom");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest8() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example2.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.asNeededCodeableConcept.text, "as needed to clear mucus");
        assertEquals(data.authoredOn.toString(), "2017-02-01T17:23:07Z");
        assertEquals(data.basedOn.get(0).reference, "CarePlan/gpvisit");
        assertEquals(data.code.coding.get(0).code, "34431008");
        assertEquals(data.code.coding.get(0).display, "Physiotherapy of chest (regime/therapy) ");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.contained.get(0).id, "signature");
        assertEquals(data.contained.get(1).id, "cystic-fibrosis");
        assertEquals(data.id, "physiotherapy");
        assertEquals(data.identifier.get(0).system, "http://goodhealth.org/placer-ids");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "PLAC");
        assertEquals(data.identifier.get(0).type.coding.get(0).display, "Placer Identifier");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/identifier-type");
        assertEquals(data.identifier.get(0).type.text, "Placer");
        assertEquals(data.identifier.get(0).value, "20170201-0001");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.occurrenceTiming.repeat.duration.toString(), "15");
        assertEquals(data.occurrenceTiming.repeat.durationMax.toString(), "25");
        assertEquals(data.occurrenceTiming.repeat.durationUnit, "min");
        assertTrue(data.occurrenceTiming.repeat.frequency == 1);
        assertTrue(data.occurrenceTiming.repeat.frequencyMax == 4);
        assertEquals(data.occurrenceTiming.repeat.period.toString(), "1");
        assertEquals(data.occurrenceTiming.repeat.periodUnit, "d");
        assertEquals(data.reasonReference.get(0).reference, "#cystic-fibrosis");
        assertEquals(data.relevantHistory.get(0).display, "Author's Signature");
        assertEquals(data.relevantHistory.get(0).reference, "#signature");
        assertEquals(data.requester.agent.display, "Dr Adam Careful");
        assertEquals(data.requester.agent.reference, "Practitioner/example");
        assertEquals(data.requester.onBehalfOf.display, "Good Health Clinic");
        assertEquals(data.requester.onBehalfOf.reference, "Organization/2");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest9() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example3.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2017-02-01T17:23:07Z");
        assertEquals(data.code.coding.get(0).code, "359962006");
        assertEquals(data.code.coding.get(0).display, "Turning patient in bed (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.doNotPerform, true);
        assertEquals(data.id, "do-not-turn");
        assertEquals(data.identifier.get(0).system, "http://goodhealth.org/placer-ids");
        assertEquals(data.identifier.get(0).value, "20170201-0002");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.priority, CodeSystemRequestPriority.STAT);
        assertEquals(data.reasonReference.get(0).display, "Patient has a spinal fracture");
        assertEquals(data.requester.agent.display, "Dr Adam Careful");
        assertEquals(data.requester.agent.reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testProcedureRequest10() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/procedurerequest-example-ambulation.json");
        ProcedureRequest data = parser.toFhir(ProcedureRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2017-03-05");
        assertEquals(data.basedOn.get(0).display, "Maternity care plan");
        assertEquals(data.basedOn.get(0).reference, "CarePlan/preg");
        assertEquals(data.code.coding.get(0).code, "62013009");
        assertEquals(data.code.coding.get(0).display, "Ambulating patient (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Ambulation");
        assertEquals(data.definition.get(0).display, "Protocol for hypertension during pregnancy");
        assertEquals(data.id, "ambulation");
        assertEquals(data.identifier.get(0).value, "45678");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.reasonReference.get(0).display, "Blood Pressure");
        assertEquals(data.reasonReference.get(0).reference, "Observation/blood-pressure");
        assertEquals(data.requester.agent.display, "Dr. Beverly Crusher");
        assertEquals(data.requester.agent.reference, "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
