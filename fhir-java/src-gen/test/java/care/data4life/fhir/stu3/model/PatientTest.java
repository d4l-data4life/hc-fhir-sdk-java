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
import static org.junit.Assert.assertTrue;

/**
 * PatientTest.java
 * <p>
 * Information about an individual or animal receiving health care services.
 * <p>
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class PatientTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testPatient1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-xds.json");
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
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/v2/0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "89765a87b");
        assertEquals(data.managingOrganization.reference, "Organization/2");
        assertEquals(data.name.get(0).family, "Doe");
        assertEquals(data.name.get(0).given.get(0), "John");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-f001-pieter.json");
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
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).system, "http://hl7.org/fhir/v2/0131");
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
        assertEquals(data.maritalStatus.coding.get(0).system, "http://hl7.org/fhir/v3/MaritalStatus");
        assertEquals(data.maritalStatus.text, "Getrouwd");
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
        String sourceJson = FileHelper.loadString("stu3/patient-example-d.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.birthDate.toString(), "1982-08-02");
        assertEquals(data.deceasedBoolean, true);
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "pat4");
        assertEquals(data.identifier.get(0).system, "urn:oid:0.1.2.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/v2/0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "123458");
        assertEquals(data.managingOrganization.display, "ACME Healthcare, Inc");
        assertEquals(data.managingOrganization.reference, "Organization/1");
        assertEquals(data.name.get(0).family, "Notsowell");
        assertEquals(data.name.get(0).given.get(0), "Sandy");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient4() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-genetics-example1.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).line.get(0), "2222 Home Street");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.HOME);
        assertEquals(data.birthDate.toString(), "1973-05-31");
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "genetics-example1");
        assertEquals(data.identifier.get(0).system, "http://hl7.org/fhir/sid/us-ssn");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "SS");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/v2/0203");
        assertEquals(data.identifier.get(0).value, "444222222");
        assertEquals(data.managingOrganization.reference, "Organization/hl7");
        assertEquals(data.meta.lastUpdated.toString(), "2012-05-29T23:45:32Z");
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
    public void testPatient5() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-b.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.gender, CodeSystemAdministrativeGender.OTHER);
        assertEquals(data.id, "pat2");
        assertEquals(data.identifier.get(0).system, "urn:oid:0.1.2.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/v2/0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "123456");
        assertEquals(data.link.get(0).other.reference, "Patient/pat1");
        assertEquals(data.link.get(0).type, CodeSystemLinkType.SEEALSO);
        assertEquals(data.managingOrganization.display, "ACME Healthcare, Inc");
        assertEquals(data.managingOrganization.reference, "Organization/1");
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
    public void testPatient6() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-c.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.birthDate.toString(), "1982-01-23");
        assertEquals(data.deceasedDateTime.toString(), "2015-02-14T13:42:00+10:00");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "pat3");
        assertEquals(data.identifier.get(0).system, "urn:oid:0.1.2.3.4.5.6.7");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/v2/0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "123457");
        assertEquals(data.managingOrganization.display, "ACME Healthcare, Inc");
        assertEquals(data.managingOrganization.reference, "Organization/1");
        assertEquals(data.name.get(0).family, "Notsowell");
        assertEquals(data.name.get(0).given.get(0), "Simon");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient7() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-ihe-pcd.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.id, "ihe-pcd");
        assertEquals(data.identifier.get(0).type.text, "Internal Identifier");
        assertEquals(data.identifier.get(0).value, "AB60001");
        assertEquals(data.name.get(0).family, "BROOKS");
        assertEquals(data.name.get(0).given.get(0), "ALBERT");
        assertEquals(data.text.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Albert Brooks, Id: AB60001</div>");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient8() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "PleasantVille");
        assertEquals(data.address.get(0).district, "Rainbow");
        assertEquals(data.address.get(0).line.get(0), "534 Erewhon St");
        assertEquals(data.address.get(0).period.start.toString(), "1974-12-25");
        assertEquals(data.address.get(0).postalCode, "3999");
        assertEquals(data.address.get(0).state, "Vic");
        assertEquals(data.address.get(0).text, "534 Erewhon St PeasantVille, Rainbow, Vic  3999");
        assertEquals(data.address.get(0).type, CodeSystemAddressType.BOTH);
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.HOME);
        assertEquals(data.birthDate.toString(), "1974-12-25");
        assertEquals(data.contact.get(0).address.city, "PleasantVille");
        assertEquals(data.contact.get(0).address.district, "Rainbow");
        assertEquals(data.contact.get(0).address.line.get(0), "534 Erewhon St");
        assertEquals(data.contact.get(0).address.period.start.toString(), "1974-12-25");
        assertEquals(data.contact.get(0).address.postalCode, "3999");
        assertEquals(data.contact.get(0).address.state, "Vic");
        assertEquals(data.contact.get(0).address.type, CodeSystemAddressType.BOTH);
        assertEquals(data.contact.get(0).address.use, CodeSystemAddressUse.HOME);
        assertEquals(data.contact.get(0).gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.contact.get(0).name.family, "du Marché");
        assertEquals(data.contact.get(0).name.given.get(0), "Bénédicte");
        assertEquals(data.contact.get(0).period.start.toString(), "2012");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).code, "N");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).system, "http://hl7.org/fhir/v2/0131");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.contact.get(0).telecom.get(0).value, "+33 (237) 998327");
        assertEquals(data.deceasedBoolean, false);
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).assigner.display, "Acme Healthcare");
        assertEquals(data.identifier.get(0).period.start.toString(), "2001-05-06");
        assertEquals(data.identifier.get(0).system, "urn:oid:1.2.36.146.595.217.0.1");
        assertEquals(data.identifier.get(0).type.coding.get(0).code, "MR");
        assertEquals(data.identifier.get(0).type.coding.get(0).system, "http://hl7.org/fhir/v2/0203");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "12345");
        assertEquals(data.managingOrganization.reference, "Organization/1");
        assertEquals(data.name.get(0).family, "Chalmers");
        assertEquals(data.name.get(0).given.get(0), "Peter");
        assertEquals(data.name.get(0).given.get(1), "James");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.name.get(1).given.get(0), "Jim");
        assertEquals(data.name.get(1).use, CodeSystemNameUse.USUAL);
        assertEquals(data.name.get(2).family, "Windsor");
        assertEquals(data.name.get(2).given.get(0), "Peter");
        assertEquals(data.name.get(2).given.get(1), "James");
        assertEquals(data.name.get(2).period.end.toString(), "2002");
        assertEquals(data.name.get(2).use, CodeSystemNameUse.MAIDEN);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.HOME);
        assertTrue(data.telecom.get(1).rank == 1);
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(1).value, "(03) 5555 6473");
        assertTrue(data.telecom.get(2).rank == 2);
        assertEquals(data.telecom.get(2).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(2).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.telecom.get(2).value, "(03) 3410 5613");
        assertEquals(data.telecom.get(3).period.end.toString(), "2014");
        assertEquals(data.telecom.get(3).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(3).use, CodeSystemContactPointUse.OLD);
        assertEquals(data.telecom.get(3).value, "(03) 5555 8834");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient9() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-proband.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.birthDate.toString(), "1966-04-04");
        assertEquals(data.deceasedBoolean, false);
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "proband");
        assertEquals(data.identifier.get(0).assigner.display, "Boston Massachesetts General Hospital");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.840.1.113883.6.117");
        assertEquals(data.identifier.get(0).type.text, "Computer-Stored Abulatory Records (COSTAR)");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(0).value, "999999999");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPatient10() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/patient-example-f201-roel.json");
        Patient data = parser.toFhir(Patient.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "Amsterdam");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Bos en Lommerplein 280");
        assertEquals(data.address.get(0).postalCode, "1055RW");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.HOME);
        assertEquals(data.birthDate.toString(), "1960-03-13");
        assertEquals(data.communication.get(0).language.coding.get(0).code, "nl-NL");
        assertEquals(data.communication.get(0).language.coding.get(0).display, "Dutch");
        assertEquals(data.communication.get(0).language.coding.get(0).system, "urn:ietf:bcp:47");
        assertEquals(data.communication.get(0).preferred, true);
        assertEquals(data.contact.get(0).name.text, "Ariadne Bor-Jansma");
        assertEquals(data.contact.get(0).name.use, CodeSystemNameUse.USUAL);
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).code, "127850001");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).display, "Wife");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(1).code, "N");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(1).system, "http://hl7.org/fhir/v2/0131");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(2).code, "WIFE");
        assertEquals(data.contact.get(0).relationship.get(0).coding.get(2).system, "http://hl7.org/fhir/v3/RoleCode");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.contact.get(0).telecom.get(0).use, CodeSystemContactPointUse.HOME);
        assertEquals(data.contact.get(0).telecom.get(0).value, "+31201234567");
        assertEquals(data.deceasedBoolean, false);
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f201");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(0).type.text, "BSN");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "123456789");
        assertEquals(data.identifier.get(1).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(1).type.text, "BSN");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(1).value, "123456789");
        assertEquals(data.managingOrganization.display, "AUMC");
        assertEquals(data.managingOrganization.reference, "Organization/f201");
        assertEquals(data.maritalStatus.coding.get(0).code, "36629006");
        assertEquals(data.maritalStatus.coding.get(0).display, "Legally married");
        assertEquals(data.maritalStatus.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.maritalStatus.coding.get(1).code, "M");
        assertEquals(data.maritalStatus.coding.get(1).system, "http://hl7.org/fhir/v3/MaritalStatus");
        assertEquals(data.multipleBirthBoolean, false);
        assertEquals(data.name.get(0).family, "Bor");
        assertEquals(data.name.get(0).given.get(0), "Roelof Olaf");
        assertEquals(data.name.get(0).prefix.get(0), "Drs.");
        assertEquals(data.name.get(0).suffix.get(0), "PDEng.");
        assertEquals(data.name.get(0).text, "Roel");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.photo.get(0).contentType, "image/jpeg");
        assertEquals(data.photo.get(0).url, "Binary/f006");
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.MOBILE);
        assertEquals(data.telecom.get(0).value, "+31612345678");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.HOME);
        assertEquals(data.telecom.get(1).value, "+31201234567");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
