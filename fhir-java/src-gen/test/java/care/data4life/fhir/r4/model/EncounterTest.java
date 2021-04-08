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
 * EncounterTest.java
 * <p>
 * An interaction during which services are provided to the patient.
 * <p>
 * An interaction between a patient and healthcare provider(s) for the purpose of providing
 * healthcare service(s) or assessing the health status of a patient.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class EncounterTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testEncounter1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-home.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "HH");
        assertEquals(data.clazz.display, "home health");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.contained.get(0).id, "home");
        assertEquals(data.id, "home");
        assertEquals(data.location.get(0).location.display, "Client's home");
        assertEquals(data.location.get(0).location.reference, "#home");
        assertEquals(data.location.get(0).period.end.toString(), "2015-01-17T16:30:00+10:00");
        assertEquals(data.location.get(0).period.start.toString(), "2015-01-17T16:00:00+10:00");
        assertEquals(data.location.get(0).status, CodeSystemEncounterLocationStatus.COMPLETED);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.display, "Dr Adam Careful");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/example");
        assertEquals(data.participant.get(0).period.end.toString(), "2015-01-17T16:30:00+10:00");
        assertEquals(data.participant.get(0).period.start.toString(), "2015-01-17T16:00:00+10:00");
        assertEquals(data.period.end.toString(), "2015-01-17T16:30:00+10:00");
        assertEquals(data.period.start.toString(), "2015-01-17T16:00:00+10:00");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Encounter with patient @example who is at home</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-f201-20130404.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "AMB");
        assertEquals(data.clazz.display, "ambulatory");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.id, "f201");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.TEMP);
        assertEquals(data.identifier.get(0).value, "Encounter_Roel_20130404");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/f201");
        assertEquals(data.priority.coding.get(0).code, "17621005");
        assertEquals(data.priority.coding.get(0).display, "Normal");
        assertEquals(data.priority.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reasonCode.get(0).text, "The patient had fever peaks over the last couple of days. He is worried about these peaks.");
        assertEquals(data.serviceProvider.reference, "Organization/f201");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.display, "Roel");
        assertEquals(data.subject.reference, "Patient/f201");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "11429006");
        assertEquals(data.type.get(0).coding.get(0).display, "Consultation");
        assertEquals(data.type.get(0).coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-f003-abscess.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "AMB");
        assertEquals(data.clazz.display, "ambulatory");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.hospitalization.admitSource.coding.get(0).code, "305956004");
        assertEquals(data.hospitalization.admitSource.coding.get(0).display, "Referral by physician");
        assertEquals(data.hospitalization.admitSource.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).code, "306689006");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).display, "Discharge to home");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.preAdmissionIdentifier.system, "http://www.bmc.nl/zorgportal/identifiers/pre-admissions");
        assertEquals(data.hospitalization.preAdmissionIdentifier.use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.hospitalization.preAdmissionIdentifier.value, "93042");
        assertEquals(data.id, "f003");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/zorgportal/identifiers/encounters");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "v6751");
        assertEquals(data.length.code, "min");
        assertEquals(data.length.system, "http://unitsofmeasure.org");
        assertEquals(data.length.unit, "min");
        assertEquals(data.length.value.toString(), "90");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.display, "E.M. van den Broek");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/f001");
        assertEquals(data.priority.coding.get(0).code, "103391001");
        assertEquals(data.priority.coding.get(0).display, "Non-urgent ear, nose and throat admission");
        assertEquals(data.priority.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "18099001");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Retropharyngeal abscess");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.serviceProvider.reference, "Organization/f001");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.display, "P. van de Heuvel");
        assertEquals(data.subject.reference, "Patient/f001");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "270427003");
        assertEquals(data.type.get(0).coding.get(0).display, "Patient-initiated encounter");
        assertEquals(data.type.get(0).coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "IMP");
        assertEquals(data.clazz.display, "inpatient encounter");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.id, "example");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.status, CodeSystemEncounterStatus.IN_PROGRESS);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Encounter with patient @example</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-f002-lung.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "AMB");
        assertEquals(data.clazz.display, "ambulatory");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.hospitalization.admitSource.coding.get(0).code, "305997006");
        assertEquals(data.hospitalization.admitSource.coding.get(0).display, "Referral by radiologist");
        assertEquals(data.hospitalization.admitSource.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).code, "306689006");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).display, "Discharge to home");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.preAdmissionIdentifier.system, "http://www.bmc.nl/zorgportal/identifiers/pre-admissions");
        assertEquals(data.hospitalization.preAdmissionIdentifier.use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.hospitalization.preAdmissionIdentifier.value, "98682");
        assertEquals(data.id, "f002");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/zorgportal/identifiers/encounters");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "v3251");
        assertEquals(data.length.code, "min");
        assertEquals(data.length.system, "http://unitsofmeasure.org");
        assertEquals(data.length.unit, "min");
        assertEquals(data.length.value.toString(), "140");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.display, "M.I.M Versteegh");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/f003");
        assertEquals(data.priority.coding.get(0).code, "103391001");
        assertEquals(data.priority.coding.get(0).display, "Urgent");
        assertEquals(data.priority.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "34068001");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Partial lobectomy of lung");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.serviceProvider.display, "BMC");
        assertEquals(data.serviceProvider.reference, "Organization/f001");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.display, "P. van de Heuvel");
        assertEquals(data.subject.reference, "Patient/f001");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "270427003");
        assertEquals(data.type.get(0).coding.get(0).display, "Patient-initiated encounter");
        assertEquals(data.type.get(0).coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-f203-20130311.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.account.get(0).reference, "Account/example");
        assertEquals(data.appointment.get(0).reference, "Appointment/example");
        assertEquals(data.basedOn.get(0).reference, "ServiceRequest/myringotomy");
        assertEquals(data.clazz.code, "IMP");
        assertEquals(data.clazz.display, "inpatient encounter");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.diagnosis.get(0).condition.reference, "Condition/stroke");
        assertTrue(data.diagnosis.get(0).rank == 1);
        assertEquals(data.diagnosis.get(0).use.coding.get(0).code, "AD");
        assertEquals(data.diagnosis.get(0).use.coding.get(0).display, "Admission diagnosis");
        assertEquals(data.diagnosis.get(0).use.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/diagnosis-role");
        assertEquals(data.diagnosis.get(1).condition.reference, "Condition/f201");
        assertEquals(data.diagnosis.get(1).use.coding.get(0).code, "DD");
        assertEquals(data.diagnosis.get(1).use.coding.get(0).display, "Discharge diagnosis");
        assertEquals(data.diagnosis.get(1).use.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/diagnosis-role");
        assertEquals(data.episodeOfCare.get(0).reference, "EpisodeOfCare/example");
        assertEquals(data.hospitalization.admitSource.coding.get(0).code, "309902002");
        assertEquals(data.hospitalization.admitSource.coding.get(0).display, "Clinical Oncology Department");
        assertEquals(data.hospitalization.admitSource.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.destination.reference, "Location/2");
        assertEquals(data.hospitalization.dietPreference.get(0).coding.get(0).code, "276026009");
        assertEquals(data.hospitalization.dietPreference.get(0).coding.get(0).display, "Fluid balance regulation");
        assertEquals(data.hospitalization.dietPreference.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.origin.reference, "Location/2");
        assertEquals(data.hospitalization.reAdmission.coding.get(0).display, "readmitted");
        assertEquals(data.hospitalization.specialArrangement.get(0).coding.get(0).code, "wheel");
        assertEquals(data.hospitalization.specialArrangement.get(0).coding.get(0).display, "Wheelchair");
        assertEquals(data.hospitalization.specialArrangement.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/encounter-special-arrangements");
        assertEquals(data.hospitalization.specialCourtesy.get(0).coding.get(0).code, "NRM");
        assertEquals(data.hospitalization.specialCourtesy.get(0).coding.get(0).display, "normal courtesy");
        assertEquals(data.hospitalization.specialCourtesy.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-EncounterSpecialCourtesy");
        assertEquals(data.id, "f203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.TEMP);
        assertEquals(data.identifier.get(0).value, "Encounter_Roel_20130311");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.partOf.reference, "Encounter/f203");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/f201");
        assertEquals(data.participant.get(0).type.get(0).coding.get(0).code, "PART");
        assertEquals(data.participant.get(0).type.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ParticipationType");
        assertEquals(data.period.end.toString(), "2013-03-20");
        assertEquals(data.period.start.toString(), "2013-03-11");
        assertEquals(data.priority.coding.get(0).code, "394849002");
        assertEquals(data.priority.coding.get(0).display, "High priority");
        assertEquals(data.priority.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reasonCode.get(0).text, "The patient seems to suffer from bilateral pneumonia and renal insufficiency, most likely due to chemotherapy.");
        assertEquals(data.serviceProvider.reference, "Organization/2");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.statusHistory.get(0).period.start.toString(), "2013-03-08");
        assertEquals(data.statusHistory.get(0).status, CodeSystemEncounterStatus.ARRIVED);
        assertEquals(data.subject.display, "Roel");
        assertEquals(data.subject.reference, "Patient/f201");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "183807002");
        assertEquals(data.type.get(0).coding.get(0).display, "Inpatient stay for nine days");
        assertEquals(data.type.get(0).coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter7() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-xcda.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "AMB");
        assertEquals(data.clazz.display, "ambulatory");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.id, "xcda");
        assertEquals(data.identifier.get(0).system, "http://healthcare.example.org/identifiers/enocunter");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "1234213.52345873");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/xcda1");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "T-D8200");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Arm");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://ihe.net/xds/connectathon/eventCodes");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.reference, "Patient/xcda");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter8() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-f202-20130128.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "AMB");
        assertEquals(data.clazz.display, "ambulatory");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.diagnosis.get(0).condition.display, "Complications from Roel's TPF chemotherapy on January 28th, 2013");
        assertTrue(data.diagnosis.get(0).rank == 2);
        assertEquals(data.diagnosis.get(0).use.coding.get(0).code, "AD");
        assertEquals(data.diagnosis.get(0).use.coding.get(0).display, "Admission diagnosis");
        assertEquals(data.diagnosis.get(0).use.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/diagnosis-role");
        assertEquals(data.diagnosis.get(1).condition.display, "The patient is treated for a tumor");
        assertTrue(data.diagnosis.get(1).rank == 1);
        assertEquals(data.diagnosis.get(1).use.coding.get(0).code, "CC");
        assertEquals(data.diagnosis.get(1).use.coding.get(0).display, "Chief complaint");
        assertEquals(data.diagnosis.get(1).use.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/diagnosis-role");
        assertEquals(data.id, "f202");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.TEMP);
        assertEquals(data.identifier.get(0).value, "Encounter_Roel_20130128");
        assertEquals(data.length.code, "min");
        assertEquals(data.length.system, "http://unitsofmeasure.org");
        assertEquals(data.length.unit, "minutes");
        assertEquals(data.length.value.toString(), "56");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/f201");
        assertEquals(data.priority.coding.get(0).code, "103391001");
        assertEquals(data.priority.coding.get(0).display, "Urgent");
        assertEquals(data.priority.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reasonCode.get(0).text, "The patient is treated for a tumor.");
        assertEquals(data.serviceProvider.reference, "Organization/f201");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.display, "Roel");
        assertEquals(data.subject.reference, "Patient/f201");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "367336001");
        assertEquals(data.type.get(0).coding.get(0).display, "Chemotherapy");
        assertEquals(data.type.get(0).coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter9() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-emerg.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.classHistory.get(0).clazz.code, "EMER");
        assertEquals(data.classHistory.get(0).clazz.display, "emergency");
        assertEquals(data.classHistory.get(0).clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.classHistory.get(0).period.end.toString(), "2017-02-01T09:27:00+10:00");
        assertEquals(data.classHistory.get(0).period.start.toString(), "2017-02-01T07:15:00+10:00");
        assertEquals(data.classHistory.get(1).clazz.code, "IMP");
        assertEquals(data.classHistory.get(1).clazz.display, "inpatient encounter");
        assertEquals(data.classHistory.get(1).clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.classHistory.get(1).period.start.toString(), "2017-02-01T09:27:00+10:00");
        assertEquals(data.clazz.code, "IMP");
        assertEquals(data.clazz.display, "inpatient encounter");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.hospitalization.admitSource.coding.get(0).code, "emd");
        assertEquals(data.hospitalization.admitSource.coding.get(0).display, "From accident/emergency department");
        assertEquals(data.hospitalization.admitSource.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/admit-source");
        assertEquals(data.id, "emerg");
        assertEquals(data.location.get(0).location.display, "Emergency Waiting Room");
        assertEquals(data.location.get(0).period.end.toString(), "2017-02-01T08:45:00+10:00");
        assertEquals(data.location.get(0).period.start.toString(), "2017-02-01T07:15:00+10:00");
        assertEquals(data.location.get(0).status, CodeSystemEncounterLocationStatus.ACTIVE);
        assertEquals(data.location.get(1).location.display, "Emergency");
        assertEquals(data.location.get(1).period.end.toString(), "2017-02-01T09:27:00+10:00");
        assertEquals(data.location.get(1).period.start.toString(), "2017-02-01T08:45:00+10:00");
        assertEquals(data.location.get(1).status, CodeSystemEncounterLocationStatus.ACTIVE);
        assertEquals(data.location.get(2).location.display, "Ward 1, Room 42, Bed 1");
        assertEquals(data.location.get(2).period.end.toString(), "2017-02-01T12:15:00+10:00");
        assertEquals(data.location.get(2).period.start.toString(), "2017-02-01T09:27:00+10:00");
        assertEquals(data.location.get(2).status, CodeSystemEncounterLocationStatus.ACTIVE);
        assertEquals(data.location.get(3).location.display, "Ward 1, Room 42, Bed 1");
        assertEquals(data.location.get(3).period.end.toString(), "2017-02-01T12:45:00+10:00");
        assertEquals(data.location.get(3).period.start.toString(), "2017-02-01T12:15:00+10:00");
        assertEquals(data.location.get(3).status, CodeSystemEncounterLocationStatus.RESERVED);
        assertEquals(data.location.get(4).location.display, "Ward 1, Room 42, Bed 1");
        assertEquals(data.location.get(4).period.start.toString(), "2017-02-01T12:45:00+10:00");
        assertEquals(data.location.get(4).status, CodeSystemEncounterLocationStatus.ACTIVE);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.start.toString(), "2017-02-01T07:15:00+10:00");
        assertEquals(data.status, CodeSystemEncounterStatus.IN_PROGRESS);
        assertEquals(data.statusHistory.get(0).period.end.toString(), "2017-02-01T07:35:00+10:00");
        assertEquals(data.statusHistory.get(0).period.start.toString(), "2017-02-01T07:15:00+10:00");
        assertEquals(data.statusHistory.get(0).status, CodeSystemEncounterStatus.ARRIVED);
        assertEquals(data.statusHistory.get(1).period.end.toString(), "2017-02-01T08:45:00+10:00");
        assertEquals(data.statusHistory.get(1).period.start.toString(), "2017-02-01T07:35:00+10:00");
        assertEquals(data.statusHistory.get(1).status, CodeSystemEncounterStatus.TRIAGED);
        assertEquals(data.statusHistory.get(2).period.end.toString(), "2017-02-01T12:15:00+10:00");
        assertEquals(data.statusHistory.get(2).period.start.toString(), "2017-02-01T08:45:00+10:00");
        assertEquals(data.statusHistory.get(2).status, CodeSystemEncounterStatus.IN_PROGRESS);
        assertEquals(data.statusHistory.get(3).period.end.toString(), "2017-02-01T12:45:00+10:00");
        assertEquals(data.statusHistory.get(3).period.start.toString(), "2017-02-01T12:15:00+10:00");
        assertEquals(data.statusHistory.get(3).status, CodeSystemEncounterStatus.ONLEAVE);
        assertEquals(data.statusHistory.get(4).period.start.toString(), "2017-02-01T12:45:00+10:00");
        assertEquals(data.statusHistory.get(4).status, CodeSystemEncounterStatus.IN_PROGRESS);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Emergency visit that escalated into inpatient patient @example</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testEncounter10() throws Exception {
        String sourceJson = FileHelper.loadString("r4/encounter-example-f001-heart.json");
        Encounter data = parser.toFhir(Encounter.class, sourceJson);

        assertEquals(data.clazz.code, "AMB");
        assertEquals(data.clazz.display, "ambulatory");
        assertEquals(data.clazz.system, "http://terminology.hl7.org/CodeSystem/v3-ActCode");
        assertEquals(data.hospitalization.admitSource.coding.get(0).code, "305956004");
        assertEquals(data.hospitalization.admitSource.coding.get(0).display, "Referral by physician");
        assertEquals(data.hospitalization.admitSource.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).code, "306689006");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).display, "Discharge to home");
        assertEquals(data.hospitalization.dischargeDisposition.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.hospitalization.preAdmissionIdentifier.system, "http://www.amc.nl/zorgportal/identifiers/pre-admissions");
        assertEquals(data.hospitalization.preAdmissionIdentifier.use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.hospitalization.preAdmissionIdentifier.value, "93042");
        assertEquals(data.id, "f001");
        assertEquals(data.identifier.get(0).system, "http://www.amc.nl/zorgportal/identifiers/visits");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "v1451");
        assertEquals(data.length.code, "min");
        assertEquals(data.length.system, "http://unitsofmeasure.org");
        assertEquals(data.length.unit, "min");
        assertEquals(data.length.value.toString(), "140");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.participant.get(0).individual.display, "P. Voigt");
        assertEquals(data.participant.get(0).individual.reference, "Practitioner/f002");
        assertEquals(data.priority.coding.get(0).code, "310361003");
        assertEquals(data.priority.coding.get(0).display, "Non-urgent cardiological admission");
        assertEquals(data.priority.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "34068001");
        assertEquals(data.reasonCode.get(0).coding.get(0).display, "Heart valve replacement");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.serviceProvider.display, "Burgers University Medical Center");
        assertEquals(data.serviceProvider.reference, "Organization/f001");
        assertEquals(data.status, CodeSystemEncounterStatus.FINISHED);
        assertEquals(data.subject.display, "P. van de Heuvel");
        assertEquals(data.subject.reference, "Patient/f001");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "270427003");
        assertEquals(data.type.get(0).coding.get(0).display, "Patient-initiated encounter");
        assertEquals(data.type.get(0).coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
