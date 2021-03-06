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
 * GoalTest.java
 * <p>
 * Describes the intended objective(s) for a patient, group or organization.
 * <p>
 * Describes the intended objective(s) for a patient, group or organization care, for example,
 * weight loss, restoring an activity of daily living, obtaining herd immunity via immunization,
 * meeting a process improvement objective, etc.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class GoalTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testGoal1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/goal-example.json");
        Goal data = parser.toFhir(Goal.class, sourceJson);

        assertEquals(data.addresses.get(0).display, "obesity condition");
        assertEquals(data.category.get(0).coding.get(0).code, "dietary");
        assertEquals(data.category.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/goal-category");
        assertEquals(data.description.text, "Target weight is 160 to 180 lbs.");
        assertEquals(data.expressedBy.display, "Peter James Chalmers");
        assertEquals(data.expressedBy.reference, "Patient/example");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).value, "123");
        assertEquals(data.lifecycleStatus, CodeSystemGoalLifecycleStatus.ON_HOLD);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.outcomeReference.get(0).display, "Body Weight Measured");
        assertEquals(data.outcomeReference.get(0).reference, "Observation/example");
        assertEquals(data.priority.coding.get(0).code, "high-priority");
        assertEquals(data.priority.coding.get(0).display, "High Priority");
        assertEquals(data.priority.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/goal-priority");
        assertEquals(data.priority.text, "high");
        assertEquals(data.startDate.toString(), "2015-04-05");
        assertEquals(data.statusDate.toString(), "2016-02-14");
        assertEquals(data.statusReason, "Patient wants to defer weight loss until after honeymoon.");
        assertEquals(data.subject.display, "Peter James Chalmers");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.target.get(0).detailRange.high.code, "[lb_av]");
        assertEquals(data.target.get(0).detailRange.high.system, "http://unitsofmeasure.org");
        assertEquals(data.target.get(0).detailRange.high.unit, "lbs");
        assertEquals(data.target.get(0).detailRange.high.value.toString(), "180");
        assertEquals(data.target.get(0).detailRange.low.code, "[lb_av]");
        assertEquals(data.target.get(0).detailRange.low.system, "http://unitsofmeasure.org");
        assertEquals(data.target.get(0).detailRange.low.unit, "lbs");
        assertEquals(data.target.get(0).detailRange.low.value.toString(), "160");
        assertEquals(data.target.get(0).dueDate.toString(), "2016-04-05");
        assertEquals(data.target.get(0).measure.coding.get(0).code, "3141-9");
        assertEquals(data.target.get(0).measure.coding.get(0).display, "Weight Measured");
        assertEquals(data.target.get(0).measure.coding.get(0).system, "http://loinc.org");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testGoal2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/goal-example-stop-smoking.json");
        Goal data = parser.toFhir(Goal.class, sourceJson);

        assertEquals(data.achievementStatus.coding.get(0).code, "achieved");
        assertEquals(data.achievementStatus.coding.get(0).display, "Achieved");
        assertEquals(data.achievementStatus.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/goal-achievement");
        assertEquals(data.achievementStatus.text, "Achieved");
        assertEquals(data.description.text, "Stop smoking");
        assertEquals(data.id, "stop-smoking");
        assertEquals(data.identifier.get(0).value, "123");
        assertEquals(data.lifecycleStatus, CodeSystemGoalLifecycleStatus.COMPLETED);
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.outcomeCode.get(0).coding.get(0).code, "8517006");
        assertEquals(data.outcomeCode.get(0).coding.get(0).display, "Ex-smoker (finding)");
        assertEquals(data.outcomeCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.outcomeCode.get(0).text, "Former smoker");
        assertEquals(data.startDate.toString(), "2015-04-05");
        assertEquals(data.subject.display, "Peter James Chalmers");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
