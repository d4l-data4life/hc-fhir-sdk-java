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
 * CarePlanTest.java
 * <p>
 * Healthcare plan for patient or group.
 * <p>
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific
 * condition or set of conditions.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class CarePlanTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testCarePlan1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-f002-lung.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "359615001");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).display, "Partial lobectomy of lung");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.doNotPerform, true);
        assertEquals(data.activity.get(0).detail.kind, CodeSystemResourceType.SERVICEREQUEST);
        assertEquals(data.activity.get(0).detail.performer.get(0).display, "M.I.M. Versteegh");
        assertEquals(data.activity.get(0).detail.performer.get(0).reference, "Practitioner/f003");
        assertEquals(data.activity.get(0).detail.scheduledString, "2011-07-07T09:30:10+01:00");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.addresses.get(0).display, "?????");
        assertEquals(data.addresses.get(0).reference, "Condition/f201");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "careteam");
        assertEquals(data.contained.get(1).id, "goal");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "f002");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/zorgportal/identifiers/careplans");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "CP2934");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.end.toString(), "2013-07-07");
        assertEquals(data.period.start.toString(), "2011-07-06");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.display, "P. van de Heuvel");
        assertEquals(data.subject.reference, "Patient/f001");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-f202-malignancy.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "367336001");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).display, "Chemotherapy");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.doNotPerform, false);
        assertEquals(data.activity.get(0).detail.kind, CodeSystemResourceType.SERVICEREQUEST);
        assertEquals(data.activity.get(0).detail.productReference.reference, "#tpf");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(0).outcomeReference.get(0).display, "Roel's Chemotherapy");
        assertEquals(data.activity.get(0).outcomeReference.get(0).reference, "Procedure/f201");
        assertEquals(data.addresses.get(0).display, "Roel's head-neck tumor");
        assertEquals(data.addresses.get(0).reference, "Condition/f202");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "doce");
        assertEquals(data.contained.get(1).id, "cisp");
        assertEquals(data.contained.get(2).id, "fluo");
        assertEquals(data.contained.get(3).id, "tpf");
        assertEquals(data.contained.get(4).id, "careteam");
        assertEquals(data.contained.get(5).id, "goal");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "f202");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Roel");
        assertEquals(data.subject.reference, "Patient/f201");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-obesity-narrative.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.id, "obesity-narrative");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Peter James Chalmers");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "3141-9");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).display, "Weight Measured");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.activity.get(0).detail.code.coding.get(1).code, "27113001");
        assertEquals(data.activity.get(0).detail.code.coding.get(1).display, "Body weight");
        assertEquals(data.activity.get(0).detail.code.coding.get(1).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.doNotPerform, false);
        assertEquals(data.activity.get(0).detail.location.display, "Patient's home");
        assertEquals(data.activity.get(0).detail.performer.get(0).display, "Peter James Chalmers");
        assertEquals(data.activity.get(0).detail.performer.get(0).reference, "Patient/example");
        assertTrue(data.activity.get(0).detail.scheduledTiming.repeat.frequency == 1);
        assertEquals(data.activity.get(0).detail.scheduledTiming.repeat.period.toString(), "1");
        assertEquals(data.activity.get(0).detail.scheduledTiming.repeat.periodUnit, "d");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.activity.get(0).detail.statusReason.text, "Achieved weight loss to mitigate diabetes risk.");
        assertEquals(data.activity.get(0).outcomeCodeableConcept.get(0).coding.get(0).code, "161832001");
        assertEquals(data.activity.get(0).outcomeCodeableConcept.get(0).coding.get(0).display, "Progressive weight loss");
        assertEquals(data.activity.get(0).outcomeCodeableConcept.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).outcomeReference.get(0).display, "Weight Measured");
        assertEquals(data.activity.get(0).outcomeReference.get(0).reference, "Observation/example");
        assertEquals(data.addresses.get(0).display, "obesity");
        assertEquals(data.addresses.get(0).reference, "#p1");
        assertEquals(data.author.display, "Dr Adam Careful");
        assertEquals(data.author.reference, "Practitioner/example");
        assertEquals(data.basedOn.get(0).display, "Management of Type 2 Diabetes");
        assertEquals(data.careTeam.get(0).reference, "CareTeam/example");
        assertEquals(data.category.get(0).text, "Weight management plan");
        assertEquals(data.contained.get(0).id, "p1");
        assertEquals(data.created.toString(), "2016-01-01");
        assertEquals(data.description, "Manage obesity and weight loss");
        assertEquals(data.encounter.reference, "Encounter/home");
        assertEquals(data.goal.get(0).reference, "Goal/example");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).value, "12345");
        assertEquals(data.instantiatesUri.get(0), "http://example.org/protocol-for-obesity");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.partOf.get(0).display, "Overall wellness plan");
        assertEquals(data.period.end.toString(), "2017-06-01");
        assertEquals(data.replaces.get(0).display, "Plan from urgent care clinic");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Peter James Chalmers");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-f201-renal.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "284093001");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).display, "Potassium supplementation");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.dailyAmount.code, "258718000");
        assertEquals(data.activity.get(0).detail.dailyAmount.system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.dailyAmount.unit, "mmol");
        assertEquals(data.activity.get(0).detail.dailyAmount.value.toString(), "80");
        assertEquals(data.activity.get(0).detail.doNotPerform, false);
        assertEquals(data.activity.get(0).detail.kind, CodeSystemResourceType.NUTRITIONORDER);
        assertEquals(data.activity.get(0).detail.productReference.display, "Potassium");
        assertEquals(data.activity.get(0).detail.productReference.reference, "Substance/f203");
        assertEquals(data.activity.get(0).detail.scheduledString, "daily");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.activity.get(1).detail.code.coding.get(0).code, "306005");
        assertEquals(data.activity.get(1).detail.code.coding.get(0).display, "Echography of kidney");
        assertEquals(data.activity.get(1).detail.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(1).detail.doNotPerform, false);
        assertEquals(data.activity.get(1).detail.kind, CodeSystemResourceType.SERVICEREQUEST);
        assertEquals(data.activity.get(1).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.addresses.get(0).display, "Roel's renal insufficiency");
        assertEquals(data.addresses.get(0).reference, "Condition/f204");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "careteam");
        assertEquals(data.contained.get(1).id, "goal");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "f201");
        assertEquals(data.intent, CodeSystemRequestIntent.PROPOSAL);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.end.toString(), "2013-03-13");
        assertEquals(data.period.start.toString(), "2013-03-11");
        assertEquals(data.status, CodeSystemRequestStatus.DRAFT);
        assertEquals(data.subject.display, "Roel");
        assertEquals(data.subject.reference, "Patient/f201");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-GPVisit.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "nursecon");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://example.org/local");
        assertEquals(data.activity.get(0).detail.code.text, "Nurse Consultation");
        assertEquals(data.activity.get(0).detail.doNotPerform, false);
        assertEquals(data.activity.get(0).detail.kind, CodeSystemResourceType.APPOINTMENT);
        assertEquals(data.activity.get(0).detail.performer.get(0).display, "Nurse Nancy");
        assertEquals(data.activity.get(0).detail.performer.get(0).reference, "Practitioner/13");
        assertEquals(data.activity.get(0).detail.scheduledPeriod.end.toString(), "2013-01-01T10:50:00+00:00");
        assertEquals(data.activity.get(0).detail.scheduledPeriod.start.toString(), "2013-01-01T10:38:00+00:00");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.activity.get(0).outcomeReference.get(0).reference, "Encounter/example");
        assertEquals(data.activity.get(1).detail.code.coding.get(0).code, "doccon");
        assertEquals(data.activity.get(1).detail.code.coding.get(0).system, "http://example.org/local");
        assertEquals(data.activity.get(1).detail.code.text, "Doctor Consultation");
        assertEquals(data.activity.get(1).detail.doNotPerform, false);
        assertEquals(data.activity.get(1).detail.kind, CodeSystemResourceType.APPOINTMENT);
        assertEquals(data.activity.get(1).detail.performer.get(0).display, "Doctor Dave");
        assertEquals(data.activity.get(1).detail.performer.get(0).reference, "Practitioner/14");
        assertEquals(data.activity.get(1).detail.status, CodeSystemCarePlanActivityStatus.SCHEDULED);
        assertEquals(data.addresses.get(0).display, "obesity");
        assertEquals(data.addresses.get(0).reference, "#p1");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "p1");
        assertEquals(data.contained.get(1).id, "careteam");
        assertEquals(data.contained.get(2).id, "goal");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "gpvisit");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.start.toString(), "2013-01-01T10:30:00+00:00");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Peter James Chalmers");
        assertEquals(data.subject.reference, "Patient/100");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan7() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-integrated.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.description, "Eve will review photos of high and low density foods and share with her parents");
        assertEquals(data.activity.get(0).detail.doNotPerform, false);
        assertEquals(data.activity.get(0).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(0).detail.extension.get(0).valueDate.toString(), "2012-09-10");
        assertEquals(data.activity.get(0).detail.goal.get(0).reference, "#g1");
        assertEquals(data.activity.get(0).detail.scheduledPeriod.start.toString(), "2012-09-10");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.NOT_STARTED);
        assertEquals(data.activity.get(0).progress.get(0).text, "Eve eats one meal a day with her parents");
        assertEquals(data.activity.get(0).progress.get(0).time.toString(), "2012-09-10");
        assertEquals(data.activity.get(1).detail.description, "Eve will ask her dad to asist her to put the head of her bed on blocks");
        assertEquals(data.activity.get(1).detail.doNotPerform, false);
        assertEquals(data.activity.get(1).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(1).detail.extension.get(0).valueDate.toString(), "2012-09-10");
        assertEquals(data.activity.get(1).detail.goal.get(0).reference, "#g1");
        assertEquals(data.activity.get(1).detail.kind, CodeSystemResourceType.COMMUNICATIONREQUEST);
        assertEquals(data.activity.get(1).detail.scheduledPeriod.start.toString(), "2012-09-10");
        assertEquals(data.activity.get(1).detail.status, CodeSystemCarePlanActivityStatus.NOT_STARTED);
        assertEquals(data.activity.get(1).progress.get(0).text, "Eve will sleep in her bed more often than the couch");
        assertEquals(data.activity.get(1).progress.get(0).time.toString(), "2012-09-10");
        assertEquals(data.activity.get(2).detail.description, "Eve will reduce her intake of coffee and chocolate");
        assertEquals(data.activity.get(2).detail.doNotPerform, false);
        assertEquals(data.activity.get(2).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(2).detail.extension.get(0).valueDate.toString(), "2012-09-10");
        assertEquals(data.activity.get(2).detail.goal.get(0).reference, "#g2");
        assertEquals(data.activity.get(2).detail.scheduledPeriod.start.toString(), "2012-09-10");
        assertEquals(data.activity.get(2).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(3).detail.description, "Eve will walk her friend's dog up and down a big hill 15-30 minutes 3 days a week");
        assertEquals(data.activity.get(3).detail.doNotPerform, false);
        assertEquals(data.activity.get(3).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(3).detail.extension.get(0).valueDate.toString(), "2012-09-10");
        assertEquals(data.activity.get(3).detail.goal.get(0).reference, "#g3");
        assertEquals(data.activity.get(3).detail.scheduledPeriod.start.toString(), "2012-08-27");
        assertEquals(data.activity.get(3).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(3).progress.get(0).text, "Eve would like to try for 5 days a week.");
        assertEquals(data.activity.get(3).progress.get(0).time.toString(), "2012-08-27");
        assertEquals(data.activity.get(3).progress.get(1).text, "Eve is still walking the dogs.");
        assertEquals(data.activity.get(3).progress.get(1).time.toString(), "2012-09-10");
        assertEquals(data.activity.get(4).detail.description, "Eve will walk 3 blocks to her parents house twice a week");
        assertEquals(data.activity.get(4).detail.doNotPerform, false);
        assertEquals(data.activity.get(4).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(4).detail.extension.get(0).valueDate.toString(), "2012-09-10");
        assertEquals(data.activity.get(4).detail.goal.get(0).reference, "#g3");
        assertEquals(data.activity.get(4).detail.scheduledPeriod.start.toString(), "2012-07-23");
        assertEquals(data.activity.get(4).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(4).progress.get(0).text, "Eve walked 4 times the last week.");
        assertEquals(data.activity.get(4).progress.get(0).time.toString(), "2012-08-13");
        assertEquals(data.activity.get(4).progress.get(1).text, "Eve did not walk to her parents the last week, but has plans to start again");
        assertEquals(data.activity.get(4).progress.get(1).time.toString(), "2012-09-10");
        assertEquals(data.activity.get(5).detail.description, "Eve will use a calendar to check off after medications are taken");
        assertEquals(data.activity.get(5).detail.doNotPerform, false);
        assertEquals(data.activity.get(5).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(5).detail.extension.get(0).valueDate.toString(), "2012-08-13");
        assertEquals(data.activity.get(5).detail.goal.get(0).reference, "#g4");
        assertEquals(data.activity.get(5).detail.scheduledPeriod.start.toString(), "2012-07-23");
        assertEquals(data.activity.get(5).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(6).detail.description, "Eve will use her lights MWF after her shower for 3 minutes");
        assertEquals(data.activity.get(6).detail.doNotPerform, false);
        assertEquals(data.activity.get(6).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(6).detail.extension.get(0).valueDate.toString(), "2012-08-27");
        assertEquals(data.activity.get(6).detail.goal.get(0).reference, "#g5");
        assertEquals(data.activity.get(6).detail.scheduledPeriod.start.toString(), "2012-07-23");
        assertEquals(data.activity.get(6).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(6).progress.get(0).text, "After restarting the vinegar soaks the psoriasis is improved and Eve plans to treat the remainder with light treatments.  She plans to start this week.");
        assertEquals(data.activity.get(6).progress.get(0).time.toString(), "2012-08-13");
        assertEquals(data.activity.get(6).progress.get(1).text, "Since her skin is improved Eve has not been using the light treatment as often, maybe once a week.  She would like to increase to 3 times a week again");
        assertEquals(data.activity.get(6).progress.get(1).time.toString(), "2012-08-27");
        assertEquals(data.activity.get(7).detail.description, "Eve will use a calendar of a chart to help her remember when to take her medications");
        assertEquals(data.activity.get(7).detail.doNotPerform, false);
        assertEquals(data.activity.get(7).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(7).detail.extension.get(0).valueDate.toString(), "2012-09-10");
        assertEquals(data.activity.get(7).detail.goal.get(0).reference, "#g4");
        assertEquals(data.activity.get(7).detail.scheduledPeriod.start.toString(), "2012-07-10");
        assertEquals(data.activity.get(7).detail.status, CodeSystemCarePlanActivityStatus.IN_PROGRESS);
        assertEquals(data.activity.get(7).progress.get(0).text, "Eve created a chart as a reminer to take the medications that do not fit in her pill box");
        assertEquals(data.activity.get(7).progress.get(0).time.toString(), "2012-07-23");
        assertEquals(data.activity.get(8).detail.description, "Eve will start using stretch bands and one step 2 days a week Mon/Wed 6-7am and maybe Friday afternoon");
        assertEquals(data.activity.get(8).detail.doNotPerform, false);
        assertEquals(data.activity.get(8).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(8).detail.extension.get(0).valueDate.toString(), "2012-08-23");
        assertEquals(data.activity.get(8).detail.goal.get(0).reference, "#g3");
        assertEquals(data.activity.get(8).detail.scheduledPeriod.start.toString(), "2012-07-23");
        assertEquals(data.activity.get(8).detail.status, CodeSystemCarePlanActivityStatus.ON_HOLD);
        assertEquals(data.activity.get(8).progress.get(0).text, "Will be able to esume exercise.");
        assertEquals(data.activity.get(8).progress.get(0).time.toString(), "2012-07-30");
        assertEquals(data.activity.get(8).progress.get(1).text, "Eve prefers to focus on walking at this time");
        assertEquals(data.activity.get(8).progress.get(1).time.toString(), "2012-08-13");
        assertEquals(data.activity.get(9).detail.description, "Eve will match a printed medication worksheet with the medication bottles at home");
        assertEquals(data.activity.get(9).detail.doNotPerform, false);
        assertEquals(data.activity.get(9).detail.extension.get(0).url, "http://example.org/fhir/StructureDefinition/RevisionDate");
        assertEquals(data.activity.get(9).detail.extension.get(0).valueDate.toString(), "2012-07-23");
        assertEquals(data.activity.get(9).detail.goal.get(0).reference, "#g4");
        assertEquals(data.activity.get(9).detail.scheduledPeriod.start.toString(), "2012-07-10");
        assertEquals(data.activity.get(9).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.addresses.get(0).display, "GERDS");
        assertEquals(data.addresses.get(0).reference, "#p1");
        assertEquals(data.addresses.get(1).display, "Obesity");
        assertEquals(data.addresses.get(1).reference, "#p2");
        assertEquals(data.addresses.get(2).display, "Psoriasis");
        assertEquals(data.addresses.get(2).reference, "#p3");
        assertEquals(data.contained.get(0).id, "p1");
        assertEquals(data.contained.get(1).id, "p2");
        assertEquals(data.contained.get(2).id, "p3");
        assertEquals(data.contained.get(3).id, "g1");
        assertEquals(data.contained.get(4).id, "g2");
        assertEquals(data.contained.get(5).id, "g3");
        assertEquals(data.contained.get(6).id, "g4");
        assertEquals(data.contained.get(7).id, "g5");
        assertEquals(data.goal.get(0).reference, "#g1");
        assertEquals(data.goal.get(1).reference, "#g2");
        assertEquals(data.goal.get(2).reference, "#g3");
        assertEquals(data.goal.get(3).reference, "#g4");
        assertEquals(data.goal.get(4).reference, "#g5");
        assertEquals(data.id, "integrate");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Patient family is not ready to commit to goal setting at this time.  Goal setting will be addressed in the future");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Eve Everywoman");
        assertEquals(data.subject.reference, "Patient/1");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan8() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-f003-pharynx.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "172960003");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).display, "Incision of retropharyngeal abscess");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.doNotPerform, true);
        assertEquals(data.activity.get(0).detail.kind, CodeSystemResourceType.SERVICEREQUEST);
        assertEquals(data.activity.get(0).detail.performer.get(0).display, "E.M. van den broek");
        assertEquals(data.activity.get(0).detail.performer.get(0).reference, "Practitioner/f001");
        assertEquals(data.activity.get(0).detail.scheduledString, "2011-06-27T09:30:10+01:00");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.addresses.get(0).display, "?????");
        assertEquals(data.addresses.get(0).reference, "Condition/f201");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "careteam");
        assertEquals(data.contained.get(1).id, "goal");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "f003");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/zorgportal/identifiers/careplans");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "CP3953");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.end.toString(), "2013-03-08T09:30:10+01:00");
        assertEquals(data.period.start.toString(), "2013-03-08T09:00:10+01:00");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.display, "P. van de Heuvel");
        assertEquals(data.subject.reference, "Patient/f001");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan9() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-f001-heart.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).detail.code.coding.get(0).code, "64915003");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).display, "Operation on heart");
        assertEquals(data.activity.get(0).detail.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.activity.get(0).detail.doNotPerform, true);
        assertEquals(data.activity.get(0).detail.kind, CodeSystemResourceType.SERVICEREQUEST);
        assertEquals(data.activity.get(0).detail.performer.get(0).display, "P. Voigt");
        assertEquals(data.activity.get(0).detail.performer.get(0).reference, "Practitioner/f002");
        assertEquals(data.activity.get(0).detail.scheduledString, "2011-06-27T09:30:10+01:00");
        assertEquals(data.activity.get(0).detail.status, CodeSystemCarePlanActivityStatus.COMPLETED);
        assertEquals(data.addresses.get(0).display, "?????");
        assertEquals(data.addresses.get(0).reference, "Condition/f201");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "careteam");
        assertEquals(data.contained.get(1).id, "goal");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "f001");
        assertEquals(data.identifier.get(0).system, "http://www.bmc.nl/zorgportal/identifiers/careplans");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "CP2903");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.end.toString(), "2011-06-27");
        assertEquals(data.period.start.toString(), "2011-06-26");
        assertEquals(data.status, CodeSystemRequestStatus.COMPLETED);
        assertEquals(data.subject.display, "P. van de Heuvel");
        assertEquals(data.subject.reference, "Patient/f001");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCarePlan10() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careplan-example-pregnancy.json");
        CarePlan data = parser.toFhir(CarePlan.class, sourceJson);

        assertEquals(data.activity.get(0).reference.display, "Prenatal vitamin MedicationRequest");
        assertEquals(data.activity.get(1).detail.code.coding.get(0).code, "1an");
        assertEquals(data.activity.get(1).detail.code.coding.get(0).system, "http://example.org/mySystem");
        assertEquals(data.activity.get(1).detail.code.text, "First Antenatal encounter");
        assertEquals(data.activity.get(1).detail.description, "The first antenatal encounter. This is where a detailed physical examination is performed.             and the pregnanacy discussed with the mother-to-be.");
        assertEquals(data.activity.get(1).detail.doNotPerform, false);
        assertEquals(data.activity.get(1).detail.kind, CodeSystemResourceType.APPOINTMENT);
        assertEquals(data.activity.get(1).detail.performer.get(0).display, "Mavis Midwife");
        assertEquals(data.activity.get(1).detail.performer.get(0).reference, "#pr1");
        assertEquals(data.activity.get(1).detail.scheduledTiming.repeat.boundsPeriod.end.toString(), "2013-02-28");
        assertEquals(data.activity.get(1).detail.scheduledTiming.repeat.boundsPeriod.start.toString(), "2013-02-14");
        assertEquals(data.activity.get(1).detail.status, CodeSystemCarePlanActivityStatus.SCHEDULED);
        assertEquals(data.activity.get(1).extension.get(0).url, "http://example.org/fhir/StructureDefinition/careplan#andetails");
        assertEquals(data.activity.get(1).extension.get(0).valueUri, "http://orionhealth.com/fhir/careplan/1andetails");
        assertEquals(data.activity.get(2).detail.code.coding.get(0).code, "an");
        assertEquals(data.activity.get(2).detail.code.coding.get(0).system, "http://example.org/mySystem");
        assertEquals(data.activity.get(2).detail.code.text, "Follow-up Antenatal encounter");
        assertEquals(data.activity.get(2).detail.description, "The second antenatal encounter. Discuss any issues that arose from the first antenatal encounter");
        assertEquals(data.activity.get(2).detail.doNotPerform, false);
        assertEquals(data.activity.get(2).detail.kind, CodeSystemResourceType.APPOINTMENT);
        assertEquals(data.activity.get(2).detail.performer.get(0).display, "Mavis Midwife");
        assertEquals(data.activity.get(2).detail.performer.get(0).reference, "#pr1");
        assertEquals(data.activity.get(2).detail.scheduledTiming.repeat.boundsPeriod.end.toString(), "2013-03-14");
        assertEquals(data.activity.get(2).detail.scheduledTiming.repeat.boundsPeriod.start.toString(), "2013-03-01");
        assertEquals(data.activity.get(2).detail.status, CodeSystemCarePlanActivityStatus.NOT_STARTED);
        assertEquals(data.activity.get(3).detail.code.coding.get(0).code, "del");
        assertEquals(data.activity.get(3).detail.code.coding.get(0).system, "http://example.org/mySystem");
        assertEquals(data.activity.get(3).detail.code.text, "Delivery");
        assertEquals(data.activity.get(3).detail.description, "The delivery.");
        assertEquals(data.activity.get(3).detail.doNotPerform, false);
        assertEquals(data.activity.get(3).detail.kind, CodeSystemResourceType.APPOINTMENT);
        assertEquals(data.activity.get(3).detail.performer.get(0).display, "Mavis Midwife");
        assertEquals(data.activity.get(3).detail.performer.get(0).reference, "#pr1");
        assertEquals(data.activity.get(3).detail.scheduledTiming.repeat.boundsPeriod.end.toString(), "2013-09-14");
        assertEquals(data.activity.get(3).detail.scheduledTiming.repeat.boundsPeriod.start.toString(), "2013-09-01");
        assertEquals(data.activity.get(3).detail.status, CodeSystemCarePlanActivityStatus.NOT_STARTED);
        assertEquals(data.addresses.get(0).display, "pregnancy");
        assertEquals(data.addresses.get(0).reference, "#p1");
        assertEquals(data.careTeam.get(0).reference, "#careteam");
        assertEquals(data.contained.get(0).id, "p1");
        assertEquals(data.contained.get(1).id, "pr1");
        assertEquals(data.contained.get(2).id, "pr2");
        assertEquals(data.contained.get(3).id, "careteam");
        assertEquals(data.contained.get(4).id, "goal");
        assertEquals(data.extension.get(0).url, "http://example.org/fhir/StructureDefinition/careplan#lmp");
        assertEquals(data.extension.get(0).valueDateTime.toString(), "2013-01-01");
        assertEquals(data.goal.get(0).reference, "#goal");
        assertEquals(data.id, "preg");
        assertEquals(data.intent, CodeSystemRequestIntent.PLAN);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.period.end.toString(), "2013-10-01");
        assertEquals(data.period.start.toString(), "2013-01-01");
        assertEquals(data.status, CodeSystemRequestStatus.ACTIVE);
        assertEquals(data.subject.display, "Eve Everywoman");
        assertEquals(data.subject.reference, "Patient/1");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
