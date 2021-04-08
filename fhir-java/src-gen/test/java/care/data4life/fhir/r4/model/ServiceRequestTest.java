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
import static org.junit.Assert.assertTrue;

/**
 * ServiceRequestTest.java
 * <p>
 * A request for a service to be performed.
 * <p>
 * A record of a request for service such as diagnostic investigations, treatments, or operations to
 * be performed.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-04-08
 */
public class ServiceRequestTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testServiceRequest1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example2.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

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
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).type.text, "Placer");
        assertEquals(data.identifier.get(0).value, "20170201-0001");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
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
        assertEquals(data.requester.display, "Dr Adam Careful");
        assertEquals(data.requester.reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example3.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2017-02-01T17:23:07Z");
        assertEquals(data.code.coding.get(0).code, "359962006");
        assertEquals(data.code.coding.get(0).display, "Turning patient in bed (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.doNotPerform, true);
        assertEquals(data.id, "do-not-turn");
        assertEquals(data.identifier.get(0).system, "http://goodhealth.org/placer-ids");
        assertEquals(data.identifier.get(0).value, "20170201-0002");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.priority, CodeSystemRequestPriority.STAT);
        assertEquals(data.reasonReference.get(0).display, "Patient has a spinal fracture");
        assertEquals(data.requester.display, "Dr Adam Careful");
        assertEquals(data.requester.reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-lipid.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "LIPID");
        assertEquals(data.code.coding.get(0).system, "http://acme.org/tests");
        assertEquals(data.code.text, "Lipid Panel");
        assertEquals(data.contained.get(0).id, "fasting");
        assertEquals(data.contained.get(1).id, "serum");
        assertEquals(data.encounter.reference, "Encounter/example");
        assertEquals(data.id, "lipid");
        assertEquals(data.identifier.get(0).system, "urn:oid:1.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "PLAC");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).type.text, "Placer");
        assertEquals(data.identifier.get(0).value, "2345234234234");
        assertEquals(data.intent, CodeSystemRequestIntent.ORIGINAL_ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "patient is afraid of needles");
        assertEquals(data.occurrenceDateTime.toString(), "2013-05-02T16:16:00-07:00");
        assertEquals(data.performer.get(0).reference, "Practitioner/f202");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "V173");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Fam hx-ischem heart dis");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://hl7.org/fhir/sid/icd-9");
        assertEquals(data.requester.reference, "Practitioner/example");
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
    public void testServiceRequest4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-colonoscopy-bx.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2017-03-05");
        assertEquals(data.code.coding.get(0).code, "76164006");
        assertEquals(data.code.coding.get(0).display, "Biopsy of colon (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Biopsy of colon");
        assertEquals(data.id, "colon-biopsy");
        assertEquals(data.identifier.get(0).value, "12345");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).display, "Dr Adam Careful");
        assertEquals(data.performer.get(0).reference, "Practitioner/example");
        assertEquals(data.requester.display, "Dr. Beverly Crusher");
        assertEquals(data.requester.reference, "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809");
        assertEquals(data.requisition.system, "http://bumc.org/requisitions");
        assertEquals(data.requisition.value, "req12345");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example4.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "229115003");
        assertEquals(data.code.coding.get(0).display, "Bench Press (regime/therapy) ");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.id, "benchpress");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertTrue(data.occurrenceTiming.repeat.count == 20);
        assertTrue(data.occurrenceTiming.repeat.countMax == 30);
        assertTrue(data.occurrenceTiming.repeat.frequency == 3);
        assertEquals(data.occurrenceTiming.repeat.period.toString(), "1");
        assertEquals(data.occurrenceTiming.repeat.periodUnit, "wk");
        assertEquals(data.patientInstruction, "Start with 30kg 10-15 repetitions for three sets and increase in increments of 5kg when you feel ready");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-edu.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

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
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.occurrenceDateTime.toString(), "2014-08-16");
        assertEquals(data.performer.get(0).display, "Pamela Educator, RN");
        assertEquals(data.reasonCode.get(0).text, "early detection of breast mass");
        assertEquals(data.requester.display, "Angela Care, MD");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.display, "Jane Doe");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest7() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-ventilation.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2018-02-20");
        assertEquals(data.code.coding.get(0).code, "40617009");
        assertEquals(data.code.coding.get(0).display, "Artificial respiration (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Mechanical Ventilation");
        assertEquals(data.id, "vent");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.orderDetail.get(0).coding.get(0).code, "243144002");
        assertEquals(data.orderDetail.get(0).coding.get(0).display, "Patient triggered inspiratory assistance (procedure)");
        assertEquals(data.orderDetail.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.orderDetail.get(0).text, "IPPB");
        assertEquals(data.orderDetail.get(1).text, " Initial Settings : Sens: -1 cm H20 Pressure 15 cm H2O moderate flow:  Monitor VS every 15 minutes x 4 at the start of mechanical ventilation, then routine for unit OR every 5 hr");
        assertEquals(data.performer.get(0).display, "Dr Cecil Surgeon");
        assertEquals(data.performer.get(0).reference, "Practitioner/example");
        assertEquals(data.reasonCode.get(0).text, "chronic obstructive lung disease (COLD)");
        assertEquals(data.requester.display, "Dr. Beverly Crusher");
        assertEquals(data.requester.reference, "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest8() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-ambulation.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.authoredOn.toString(), "2017-03-05");
        assertEquals(data.basedOn.get(0).display, "Maternity care plan");
        assertEquals(data.basedOn.get(0).reference, "CarePlan/preg");
        assertEquals(data.code.coding.get(0).code, "62013009");
        assertEquals(data.code.coding.get(0).display, "Ambulating patient (procedure)");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Ambulation");
        assertEquals(data.id, "ambulation");
        assertEquals(data.identifier.get(0).value, "45678");
        assertEquals(data.intent, CodeSystemRequestIntent.ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.reasonReference.get(0).display, "Blood Pressure");
        assertEquals(data.reasonReference.get(0).reference, "Observation/blood-pressure");
        assertEquals(data.requester.display, "Dr. Beverly Crusher");
        assertEquals(data.requester.reference, "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest9() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-pt.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

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
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.occurrenceDateTime.toString(), "2016-09-27");
        assertEquals(data.performer.get(0).display, "Paul Therapist, PT");
        assertEquals(data.reasonCode.get(0).text, "assessment of mobility limitations due to osteoarthritis");
        assertEquals(data.requester.display, "Ollie Ortho, MD");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testServiceRequest10() throws Exception {
        String sourceJson = FileHelper.loadString("r4/servicerequest-example-di.json");
        ServiceRequest data = parser.toFhir(ServiceRequest.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "24627-2");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Chest CT");
        assertEquals(data.id, "di");
        assertEquals(data.intent, CodeSystemRequestIntent.ORIGINAL_ORDER);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.occurrenceDateTime.toString(), "2013-05-08T09:33:27+07:00");
        assertEquals(data.reasonCode.get(0).text, "Check for metastatic disease");
        assertEquals(data.requester.display, "Dr. Adam Careful");
        assertEquals(data.requester.reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/dicom");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
