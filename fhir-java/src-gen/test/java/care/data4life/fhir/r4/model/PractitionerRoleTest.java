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
 * PractitionerRoleTest.java
 * <p>
 * Roles/organizations the practitioner is associated with.
 * <p>
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a
 * period of time.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-03-26
 */
public class PractitionerRoleTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testPractitionerRole1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/practitionerrole-example.json");
        PractitionerRole data = parser.toFhir(PractitionerRole.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.availabilityExceptions, "Adam is generally unavailable on public holidays and during the Christmas/New Year break");
        assertEquals(data.availableTime.get(0).availableEndTime.toString(), "16:30:00");
        assertEquals(data.availableTime.get(0).availableStartTime.toString(), "09:00:00");
        assertEquals(data.availableTime.get(0).daysOfWeek.get(0), CodeSystemDaysOfWeek.MON);
        assertEquals(data.availableTime.get(0).daysOfWeek.get(1), CodeSystemDaysOfWeek.TUE);
        assertEquals(data.availableTime.get(0).daysOfWeek.get(2), CodeSystemDaysOfWeek.WED);
        assertEquals(data.availableTime.get(1).availableEndTime.toString(), "12:00:00");
        assertEquals(data.availableTime.get(1).availableStartTime.toString(), "09:00:00");
        assertEquals(data.availableTime.get(1).daysOfWeek.get(0), CodeSystemDaysOfWeek.THU);
        assertEquals(data.availableTime.get(1).daysOfWeek.get(1), CodeSystemDaysOfWeek.FRI);
        assertEquals(data.code.get(0).coding.get(0).code, "RP");
        assertEquals(data.code.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0286");
        assertEquals(data.endpoint.get(0).reference, "Endpoint/example");
        assertEquals(data.healthcareService.get(0).reference, "HealthcareService/example");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "http://www.acme.org/practitioners");
        assertEquals(data.identifier.get(0).value, "23");
        assertEquals(data.location.get(0).display, "South Wing, second floor");
        assertEquals(data.location.get(0).reference, "Location/1");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.notAvailable.get(0).description, "Adam will be on extended leave during May 2017");
        assertEquals(data.notAvailable.get(0).during.end.toString(), "2017-05-20");
        assertEquals(data.notAvailable.get(0).during.start.toString(), "2017-05-01");
        assertEquals(data.organization.reference, "Organization/f001");
        assertEquals(data.period.end.toString(), "2012-03-31");
        assertEquals(data.period.start.toString(), "2012-01-01");
        assertEquals(data.practitioner.display, "Dr Adam Careful");
        assertEquals(data.practitioner.reference, "Practitioner/example");
        assertEquals(data.specialty.get(0).coding.get(0).code, "408443003");
        assertEquals(data.specialty.get(0).coding.get(0).display, "General medical practice");
        assertEquals(data.specialty.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "(03) 5555 6473");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(1).value, "adam.southern@example.org");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}