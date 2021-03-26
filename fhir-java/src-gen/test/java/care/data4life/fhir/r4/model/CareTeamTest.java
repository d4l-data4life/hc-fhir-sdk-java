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


import javax.annotation.Nullable;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.Date;

import care.data4life.fhir.r4.FhirR4Parser;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.*;

/**
 * CareTeamTest.java
 * <p>
 * Planned participants in the coordination and delivery of care for a patient or group.
 * <p>
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-03-26
 */
public class CareTeamTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testCareTeam1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/careteam-example.json");
        CareTeam data = parser.toFhir(CareTeam.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "LA27976-2");
        assertEquals(data.category.get(0).coding.get(0).display, "Encounter-focused care team");
        assertEquals(data.category.get(0).coding.get(0).system, "http://loinc.org");
        assertEquals(data.contained.get(0).id, "pr1");
        assertEquals(data.encounter.reference, "Encounter/example");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).value, "12345");
        assertEquals(data.managingOrganization.get(0).reference, "Organization/f001");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name, "Peter James Charlmers Care Plan for Inpatient Encounter");
        assertEquals(data.participant.get(0).member.display, "Peter James Chalmers");
        assertEquals(data.participant.get(0).member.reference, "Patient/example");
        assertEquals(data.participant.get(0).role.get(0).text, "responsiblePerson");
        assertEquals(data.participant.get(1).member.display, "Dorothy Dietition");
        assertEquals(data.participant.get(1).member.reference, "#pr1");
        assertEquals(data.participant.get(1).onBehalfOf.reference, "Organization/f001");
        assertEquals(data.participant.get(1).period.end.toString(), "2013-01-01");
        assertEquals(data.participant.get(1).role.get(0).text, "adviser");
        assertEquals(data.period.end.toString(), "2013-01-01");
        assertEquals(data.status, CodeSystemCareTeamStatus.ACTIVE);
        assertEquals(data.subject.display, "Peter James Chalmers");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Care Team</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}