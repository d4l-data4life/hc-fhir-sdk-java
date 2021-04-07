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
 * PatientTest.java
 * <p>
 * Information about an individual or animal receiving health care services.
 * <p>
 * Demographics and other administrative information about an individual or animal receiving care or other
 * health-related services.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-04-07
 */
public class PatientTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testPatient1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-xds.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "Metropolis");
        assertEquals(data.address.get(0).country, "USA");
        assertEquals(data.address.get(0).line.get(0), "100 Main St");
        assertEquals(data.address.get(0).postalCode, "44130");
        assertEquals(data.address.get(0).state, "Il");
        assertEquals(data.birthDate.toString(), "1956-05-27");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "xds");
        assertEquals(data.identifier.get(0).system, "urn:oid:1.2.3.4.5");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "89765a87b");
        assertEquals(data.managingOrganization.reference, "Organization/2");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name.get(0).family, "Doe");
        assertEquals(data.name.get(0).given.get(0), "John");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-f001-pieter.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "Amsterdam");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Van Egmondkade 23");
        assertEquals(data.address.get(0).postalCode, "1024 RJ");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.HOME);
        assertEquals(data.birthDate.toString(), "1944-11-17");
        assertEquals(data.communication.get(0).language.coding.get(0).code, "nl");
        assertEquals(data.communication.get(0).language.coding.get(0).display, "Dutch");
        assertEquals(data.communication.get(0).language.coding.get(0).system, "urn:ietf:bcp:47");
        assertEquals(data.communication.get(0).language.text, "Nederlands");
        assertEquals(data.communication.get(0).preferred, true);
        assertEquals(data.contact.get(0).name.family, "Abels");
        assertEquals(data.contact.get(0).name.given.get(0), "Sarah");
        assertEquals(data.contact.get(0).name.use, CodeSystemNameUse.USUAL);
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).code, "C");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0131");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.contact.get(0).telecom.get(0).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.contact.get(0).telecom.get(0).value, "0690383372");
        assertEquals(data.deceasedBoolean, false);
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f001");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "738472983");
        assertEquals(data.identifier.get(1).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.managingOrganization.display, "Burgers University Medical Centre");
        assertEquals(data.managingOrganization.reference, "Organization/f001");
        assertEquals(data.maritalStatus.coding.get(0).code, "M");
        assertEquals(data.maritalStatus.coding.get(0).display, "Married");
        assertEquals(data.maritalStatus.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus");
        assertEquals(data.maritalStatus.text, "Getrouwd");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.multipleBirthBoolean, true);
        assertEquals(data.name.get(0).family, "van de Heuvel");
        assertEquals(data.name.get(0).given.get(0), "Pieter");
        assertEquals(data.name.get(0).suffix.get(0), "MSc");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.USUAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.telecom.get(0).value, "0648352638");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.HOME);
        assertEquals(data.telecom.get(1).value, "p.heuvel@gmail.com");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-d.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.birthDate.toString(), "1982-08-02");
        assertEquals(data.deceasedBoolean, true);
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "pat4");
        assertEquals(data.identifier.get(0).system, "urn:oid:0.1.2.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "123458");
        assertEquals(data.managingOrganization.display, "ACME Healthcare, Inc");
        assertEquals(data.managingOrganization.reference, "Organization/1");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name.get(0).family, "Notsowell");
        assertEquals(data.name.get(0).given.get(0), "Sandy");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-infant-twin-1.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.birthDate.toString(), "2017-05-15");
        assertEquals(data.contact.get(0).name.family, "Organa");
        assertEquals(data.contact.get(0).name.given.get(0), "Leia");
        assertEquals(data.contact.get(0).name.use, CodeSystemNameUse.MAIDEN);
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).code, "72705000");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).display, "Mother");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(1).code, "N");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(1).system, "http://terminology.hl7.org/CodeSystem/v2-0131");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(2).code, "MTH");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(2).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.contact.get(0).telecom.get(0).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.contact.get(0).telecom.get(0).value, "+31201234567");
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/patient-mothersMaidenName");
        assertEquals(data.extension.get(0).valueString, "Organa");
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "infant-twin-1");
        assertEquals(data.identifier.get(0).system, "http://coruscanthealth.org/main-hospital/patient-identifier");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).value, "MRN7465737865");
        assertEquals(data.identifier.get(1).system, "http://new-republic.gov/galactic-citizen-identifier");
        assertEquals(data.identifier.get(1).value, "7465737865");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertTrue(data.multipleBirthInteger == 1);
        assertEquals(data.name.get(0).family, "Solo");
        assertEquals(data.name.get(0).given.get(0), "Jaina");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-infant-mom.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.birthDate.toString(), "1995-10-12");
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.generalPractitioner.get(0).display, "Too-Onebee");
        assertEquals(data.generalPractitioner.get(0).reference, "Practitioner/21B");
        assertEquals(data.id, "infant-mom");
        assertEquals(data.maritalStatus.coding.get(0).code, "M");
        assertEquals(data.maritalStatus.coding.get(0).display, "Married");
        assertEquals(data.maritalStatus.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name.get(0).family, "Solo");
        assertEquals(data.name.get(0).given.get(0), "Leia");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.name.get(1).family, "Organa");
        assertEquals(data.name.get(1).given.get(0), "Leia");
        assertEquals(data.name.get(1).use, CodeSystemNameUse.MAIDEN);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-newborn.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.birthDate.toString(), "2017-09-05");
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/patient-mothersMaidenName");
        assertEquals(data.extension.get(0).valueString, "Everywoman");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "newborn");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertTrue(data.multipleBirthInteger == 2);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient7() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-infant-fetal.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.contact.get(0).name.family, "Organa");
        assertEquals(data.contact.get(0).name.given.get(0), "Leia");
        assertEquals(data.contact.get(0).name.use, CodeSystemNameUse.MAIDEN);
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).code, "72705000");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).display, "Mother");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(1).code, "N");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(1).system, "http://terminology.hl7.org/CodeSystem/v2-0131");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(2).code, "MTH");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(2).system, "http://terminology.hl7.org/CodeSystem/v3-RoleCode");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.contact.get(0).telecom.get(0).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.contact.get(0).telecom.get(0).value, "+31201234567");
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/patient-mothersMaidenName");
        assertEquals(data.extension.get(0).valueString, "Organa");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "infant-fetal");
        assertEquals(data.identifier.get(0).system, "http://coruscanthealth.org/main-hospital/patient-identifier");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).value, "MRN657865757378");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient8() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-genetics-example1.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).line.get(0), "2222 Home Street");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.HOME);
        assertEquals(data.birthDate.toString(), "1973-05-31");
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "genetics-example1");
        assertEquals(data.identifier.get(0).system, "http://hl7.org/fhir/sid/us-ssn");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "SS");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).value, "444222222");
        assertEquals(data.managingOrganization.reference, "Organization/hl7");
        assertEquals(data.meta.lastUpdated.toString(), "2012-05-29T23:45:32Z");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name.get(0).family, "Everywoman");
        assertEquals(data.name.get(0).given.get(0), "Eve");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "555-555-2003");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient9() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-b.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.gender, CodeSystemAdministrativeGender.OTHER);
        assertEquals(data.id, "pat2");
        assertEquals(data.identifier.get(0).system, "urn:oid:0.1.2.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "123456");
        assertEquals(data.link.get(0).other.reference, "Patient/pat1");
        assertEquals(data.link.get(0).type, CodeSystemLinkType.SEEALSO);
        assertEquals(data.managingOrganization.display, "ACME Healthcare, Inc");
        assertEquals(data.managingOrganization.reference, "Organization/1");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name.get(0).family, "Donald");
        assertEquals(data.name.get(0).given.get(0), "Duck");
        assertEquals(data.name.get(0).given.get(1), "D");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.photo.get(0).contentType, "image/gif");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient10() throws Exception {
        String sourceJson = FileHelper.loadString("r4/patient-example-c.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.birthDate.toString(), "1982-01-23");
        assertEquals(data.deceasedDateTime.toString(), "2015-02-14T13:42:00+10:00");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "pat3");
        assertEquals(data.identifier.get(0).system, "urn:oid:0.1.2.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "123457");
        assertEquals(data.managingOrganization.display, "ACME Healthcare, Inc");
        assertEquals(data.managingOrganization.reference, "Organization/1");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.name.get(0).family, "Notsowell");
        assertEquals(data.name.get(0).given.get(0), "Simon");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
