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
 * ResearchSubjectTest.java
 * <p>
 * Physical entity which is the primary unit of interest in the study.
 * <p>
 * A physical entity which is the primary unit of operational and/or administrative interest in a
 * study.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class ResearchSubjectTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testResearchSubject1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/researchsubject-example.json");
        ResearchSubject data = parser.toFhir(ResearchSubject.class, sourceJson);

        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "http://example.org/studysubjectids");
        assertEquals(data.identifier.get(0).type.text, "Subject id");
        assertEquals(data.identifier.get(0).value, "123");
        assertEquals(data.individual.reference, "Patient/example");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.status, CodeSystemResearchSubjectStatus.CANDIDATE);
        assertEquals(data.study.reference, "ResearchStudy/example");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
