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
 * DeviceUseStatementTest.java
 * <p>
 * Record of use of a device.
 * <p>
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class DeviceUseStatementTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testDeviceUseStatement1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/deviceusestatement-example.json");
        DeviceUseStatement data = parser.toFhir(DeviceUseStatement.class, sourceJson);

        assertEquals(data.device.reference, "Device/example");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "http:goodhealth.org/identifiers");
        assertEquals(data.identifier.get(0).value, "51ebb7a9-4e3a-4360-9a05-0cc2d869086f");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.reasonReference.get(0).display, "Appendectomy (surgery)");
        assertEquals(data.reasonReference.get(0).reference, "Procedure/example");
        assertEquals(data.status, CodeSystemDeviceUseStatementStatus.ACTIVE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
