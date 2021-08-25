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

/**
 * ResearchSubjectTest.java
 * <p>
 * Investigation to increase healthcare-related patient-independent knowledge.
 * <p>
 * A process where a researcher or organization plans and then executes a series of steps intended
 * to increase the field of healthcare-related knowledge.  This includes studies of safety,
 * efficacy, comparative effectiveness and other information about medications, devices, therapies
 * and other interventional and investigative techniques.  A ResearchStudy involves the gathering of
 * information about human or animal subjects.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class ResearchSubjectTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testResearchSubject1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/researchsubject-example.json");
        ResearchSubject data = parser.toFhir(ResearchSubject.class, sourceJson);

        assertEquals(data.id, "example");
        assertEquals(data.identifier.system, "http://example.org/studysubjectids");
        assertEquals(data.identifier.type.text, "Subject id");
        assertEquals(data.identifier.value, "123");
        assertEquals(data.individual.reference, "Patient/example");
        assertEquals(data.status, CodeSystemResearchSubjectStatus.CANDIDATE);
        assertEquals(data.study.reference, "ResearchStudy/example");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
