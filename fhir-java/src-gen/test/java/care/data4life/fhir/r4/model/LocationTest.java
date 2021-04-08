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
 * LocationTest.java
 * <p>
 * Details and position information for a physical place.
 * <p>
 * Details and position information for a physical place where services are provided and resources
 * and participants may be stored, found, contained, or accommodated.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-04-08
 */
public class LocationTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testLocation1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/location-example.json");
        Location data = parser.toFhir(Location.class, sourceJson);

        assertEquals(data.address.city, "Den Burg");
        assertEquals(data.address.country, "NLD");
        assertEquals(data.address.line.get(0), "Galapagosweg 91, Building A");
        assertEquals(data.address.postalCode, "9105 PZ");
        assertEquals(data.address.use, CodeSystemAddressUse.WORK);
        assertEquals(data.alias.get(0), "BU MC, SW, F2");
        assertEquals(data.alias.get(1), "Burgers University Medical Center, South Wing, second floor");
        assertEquals(data.description, "Second floor of the Old South Wing, formerly in use by Psychiatry");
        assertEquals(data.endpoint.get(0).reference, "Endpoint/example");
        assertEquals(data.id, "1");
        assertEquals(data.identifier.get(0).value, "B1-S.F2");
        assertEquals(data.managingOrganization.reference, "Organization/f001");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.mode, CodeSystemLocationMode.INSTANCE);
        assertEquals(data.name, "South Wing, second floor");
        assertEquals(data.physicalType.coding.get(0).code, "wi");
        assertEquals(data.physicalType.coding.get(0).display, "Wing");
        assertEquals(data.physicalType.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/location-physical-type");
        assertEquals(data.position.altitude.toString(), "0");
        assertEquals(data.position.latitude.toString(), "42.25475478");
        assertEquals(data.position.longitude.toString(), "-83.6945691");
        assertEquals(data.status, CodeSystemLocationStatus.ACTIVE);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "2328");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.FAX);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(1).value, "2329");
        assertEquals(data.telecom.get(2).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(2).value, "second wing admissions");
        assertEquals(data.telecom.get(3).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.telecom.get(3).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(3).value, "http://sampleorg.com/southwing");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testLocation2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/location-example-room.json");
        Location data = parser.toFhir(Location.class, sourceJson);

        assertEquals(data.alias.get(0), "South Wing OR 5");
        assertEquals(data.alias.get(1), "Main Wing OR 2");
        assertEquals(data.description, "Old South Wing, Neuro Radiology Operation Room 1 on second floor");
        assertEquals(data.id, "2");
        assertEquals(data.identifier.get(0).value, "B1-S.F2.1.00");
        assertEquals(data.managingOrganization.reference, "Organization/f001");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.mode, CodeSystemLocationMode.INSTANCE);
        assertEquals(data.name, "South Wing Neuro OR 1");
        assertEquals(data.operationalStatus.code, "H");
        assertEquals(data.operationalStatus.display, "Housekeeping");
        assertEquals(data.operationalStatus.system, "http://terminology.hl7.org/CodeSystem/v2-0116");
        assertEquals(data.partOf.reference, "Location/1");
        assertEquals(data.physicalType.coding.get(0).code, "ro");
        assertEquals(data.physicalType.coding.get(0).display, "Room");
        assertEquals(data.physicalType.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/location-physical-type");
        assertEquals(data.status, CodeSystemLocationStatus.SUSPENDED);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).value, "2329");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor, Neuro Radiology Operation Room 1</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "RNEU");
        assertEquals(data.type.get(0).coding.get(0).display, "Neuroradiology unit");
        assertEquals(data.type.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testLocation3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/location-example-ambulance.json");
        Location data = parser.toFhir(Location.class, sourceJson);

        assertEquals(data.description, "Ambulance provided by Burgers University Medical Center");
        assertEquals(data.id, "amb");
        assertEquals(data.managingOrganization.reference, "Organization/f001");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.mode, CodeSystemLocationMode.KIND);
        assertEquals(data.name, "BUMC Ambulance");
        assertEquals(data.physicalType.coding.get(0).code, "ve");
        assertEquals(data.physicalType.coding.get(0).display, "Vehicle");
        assertEquals(data.physicalType.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/location-physical-type");
        assertEquals(data.status, CodeSystemLocationStatus.ACTIVE);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.telecom.get(0).value, "2329");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Mobile Clinic</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "AMB");
        assertEquals(data.type.get(0).coding.get(0).display, "Ambulance");
        assertEquals(data.type.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testLocation4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/location-example-ukpharmacy.json");
        Location data = parser.toFhir(Location.class, sourceJson);

        assertEquals(data.description, "All Pharmacies in the United Kingdom covered by the National Pharmacy Association");
        assertEquals(data.id, "ukp");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.mode, CodeSystemLocationMode.KIND);
        assertEquals(data.name, "UK Pharmacies");
        assertEquals(data.physicalType.coding.get(0).code, "jdn");
        assertEquals(data.physicalType.coding.get(0).display, "Jurisdiction");
        assertEquals(data.physicalType.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/location-physical-type");
        assertEquals(data.status, CodeSystemLocationStatus.ACTIVE);
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">UK Pharmacies</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "PHARM");
        assertEquals(data.type.get(0).coding.get(0).display, "Pharmacy");
        assertEquals(data.type.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testLocation5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/location-example-patients-home.json");
        Location data = parser.toFhir(Location.class, sourceJson);

        assertEquals(data.description, "Patient's Home");
        assertEquals(data.id, "ph");
        assertEquals(data.managingOrganization.reference, "Organization/f001");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.mode, CodeSystemLocationMode.KIND);
        assertEquals(data.name, "Patient's Home");
        assertEquals(data.physicalType.coding.get(0).code, "ho");
        assertEquals(data.physicalType.coding.get(0).display, "House");
        assertEquals(data.physicalType.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/location-physical-type");
        assertEquals(data.status, CodeSystemLocationStatus.ACTIVE);
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Patient's Home</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "PTRES");
        assertEquals(data.type.get(0).coding.get(0).display, "Patient's Residence");
        assertEquals(data.type.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testLocation6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/location-example-hl7hq.json");
        Location data = parser.toFhir(Location.class, sourceJson);

        assertEquals(data.address.city, "Ann Arbor");
        assertEquals(data.address.country, "USA");
        assertEquals(data.address.line.get(0), "3300 Washtenaw Avenue, Suite 227");
        assertEquals(data.address.postalCode, "48104");
        assertEquals(data.address.state, "MI");
        assertEquals(data.description, "HL7 Headquarters");
        assertEquals(data.id, "hl7");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.mode, CodeSystemLocationMode.INSTANCE);
        assertEquals(data.name, "Health Level Seven International");
        assertEquals(data.physicalType.coding.get(0).code, "bu");
        assertEquals(data.physicalType.coding.get(0).display, "Building");
        assertEquals(data.physicalType.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/location-physical-type");
        assertEquals(data.position.latitude.toString(), "-83.69471");
        assertEquals(data.position.longitude.toString(), "42.2565");
        assertEquals(data.status, CodeSystemLocationStatus.ACTIVE);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).value, "(+1) 734-677-7777");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.FAX);
        assertEquals(data.telecom.get(1).value, "(+1) 734-677-6622");
        assertEquals(data.telecom.get(2).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(2).value, "hq@HL7.org");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.get(0).coding.get(0).code, "SLEEP");
        assertEquals(data.type.get(0).coding.get(0).display, "Sleep disorders unit");
        assertEquals(data.type.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
