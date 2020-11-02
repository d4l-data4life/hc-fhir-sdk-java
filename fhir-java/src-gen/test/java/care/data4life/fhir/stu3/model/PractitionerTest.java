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
 * PractitionerTest.java
 * <p>
 * A person with a  formal responsibility in the provisioning of healthcare or related services.
 * <p>
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 * <p>
 * <p>
 * "Generated from FHIR 3.0.1.11917 on 2020-10-27
 */
public class PractitionerTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testPractitioner1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f203-jvg.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "Den helder");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Walvisbaai 3");
        assertEquals(data.address.get(0).postalCode, "2333ZA");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1983-04-20");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f203");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).type.text, "UZI-nummer");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "12345678903");
        assertEquals(data.identifier.get(1).system, "https://www.bigregister.nl/");
        assertEquals(data.identifier.get(1).type.text, "BIG-nummer");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(1).value, "12345678903");
        assertEquals(data.name.get(0).text, "Juri van Gelder");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "+31715269111");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f201-ab.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "Den helder");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Walvisbaai 3");
        assertEquals(data.address.get(0).line.get(1), "C4 - Automatisering");
        assertEquals(data.address.get(0).postalCode, "2333ZA");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1956-12-24");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f201");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).type.text, "UZI-nummer");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "12345678901");
        assertEquals(data.name.get(0).family, "Bronsig");
        assertEquals(data.name.get(0).given.get(0), "Arend");
        assertEquals(data.name.get(0).prefix.get(0), "Dr.");
        assertEquals(data.name.get(0).text, "Dokter Bronsig");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.qualification.get(0).code.coding.get(0).code, "41672002");
        assertEquals(data.qualification.get(0).code.coding.get(0).display, "Pulmonologist");
        assertEquals(data.qualification.get(0).code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "+31715269111");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner3() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f202-lm.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "Den helder");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Walvisbaai 3");
        assertEquals(data.address.get(0).line.get(1), "C4 - Automatisering");
        assertEquals(data.address.get(0).postalCode, "2333ZA");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1960-06-12");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f202");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).type.text, "UZI-nummer");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "12345678902");
        assertEquals(data.identifier.get(1).system, "https://www.bigregister.nl/");
        assertEquals(data.identifier.get(1).type.text, "BIG-nummer");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(1).value, "12345678902");
        assertEquals(data.name.get(0).family, "Maas");
        assertEquals(data.name.get(0).given.get(0), "Luigi");
        assertEquals(data.name.get(0).prefix.get(0), "Dr.");
        assertEquals(data.name.get(0).text, "Luigi Maas");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "+31715269111");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner4() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-xcda-author.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.id, "xcda-author");
        assertEquals(data.name.get(0).family, "Hippocrates");
        assertEquals(data.name.get(0).given.get(0), "Harold");
        assertEquals(data.name.get(0).suffix.get(0), "MD");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner5() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f003-mv.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.address.get(0).city, "Amsterdam");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Galapagosweg 91");
        assertEquals(data.address.get(0).postalCode, "1105 AZ");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1963-07-01");
        assertEquals(data.communication.get(0).coding.get(0).code, "nl");
        assertEquals(data.communication.get(0).coding.get(0).display, "Dutch");
        assertEquals(data.communication.get(0).coding.get(0).system, "urn:oid:2.16.840.1.113883.6.121");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f003");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "846100293");
        assertEquals(data.identifier.get(1).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(1).value, "243HID3RT938");
        assertEquals(data.name.get(0).family, "Versteegh");
        assertEquals(data.name.get(0).given.get(0), "Marc");
        assertEquals(data.name.get(0).suffix.get(0), "MD");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "0205562431");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(1).value, "m.versteegh@bmc.nl");
        assertEquals(data.telecom.get(2).system, CodeSystemContactPointSystem.FAX);
        assertEquals(data.telecom.get(2).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(2).value, "0205662948");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner6() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f002-pv.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.address.get(0).city, "Den Burg");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Galapagosweg 91");
        assertEquals(data.address.get(0).postalCode, "9105 PZ");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1979-04-29");
        assertEquals(data.gender, CodeSystemAdministrativeGender.MALE);
        assertEquals(data.id, "f002");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "730291637");
        assertEquals(data.identifier.get(1).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(1).value, "174BIP3JH438");
        assertEquals(data.name.get(0).family, "Voigt");
        assertEquals(data.name.get(0).given.get(0), "Pieter");
        assertEquals(data.name.get(0).suffix.get(0), "MD");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "0205569336");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(1).value, "p.voigt@bmc.nl");
        assertEquals(data.telecom.get(2).system, CodeSystemContactPointSystem.FAX);
        assertEquals(data.telecom.get(2).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(2).value, "0205669382");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner7() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.active, true);
        assertEquals(data.address.get(0).city, "PleasantVille");
        assertEquals(data.address.get(0).line.get(0), "534 Erewhon St");
        assertEquals(data.address.get(0).postalCode, "3999");
        assertEquals(data.address.get(0).state, "Vic");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.HOME);
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "http://www.acme.org/practitioners");
        assertEquals(data.identifier.get(0).value, "23");
        assertEquals(data.name.get(0).family, "Careful");
        assertEquals(data.name.get(0).given.get(0), "Adam");
        assertEquals(data.name.get(0).prefix.get(0), "Dr");
        assertEquals(data.qualification.get(0).code.coding.get(0).code, "BS");
        assertEquals(data.qualification.get(0).code.coding.get(0).display, "Bachelor of Science");
        assertEquals(data.qualification.get(0).code.coding.get(0).system, "http://hl7.org/fhir/v2/0360/2.7");
        assertEquals(data.qualification.get(0).code.text, "Bachelor of Science");
        assertEquals(data.qualification.get(0).identifier.get(0).system, "http://example.org/UniversityIdentifier");
        assertEquals(data.qualification.get(0).identifier.get(0).value, "12345");
        assertEquals(data.qualification.get(0).issuer.display, "Example University");
        assertEquals(data.qualification.get(0).period.start.toString(), "1995");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner8() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f007-sh.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.address.get(0).city, "Den Burg");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Galapagosweg 91");
        assertEquals(data.address.get(0).postalCode, "9105 PZ");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1971-11-07");
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "f007");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "874635264");
        assertEquals(data.identifier.get(1).system, "urn:oid:2.16.840.1.113883.2.4.6.3");
        assertEquals(data.identifier.get(1).use, CodeSystemIdentifierUse.USUAL);
        assertEquals(data.identifier.get(1).value, "567IUI51C154");
        assertEquals(data.name.get(0).family, "Heps");
        assertEquals(data.name.get(0).given.get(0), "Simone");
        assertEquals(data.name.get(0).suffix.get(0), "MD");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.OFFICIAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "020556936");
        assertEquals(data.telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(1).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(1).value, "S.M.Heps@bmc.nl");
        assertEquals(data.telecom.get(2).system, CodeSystemContactPointSystem.FAX);
        assertEquals(data.telecom.get(2).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(2).value, "0205669283");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner9() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-f204-ce.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.address.get(0).city, "Den helder");
        assertEquals(data.address.get(0).country, "NLD");
        assertEquals(data.address.get(0).line.get(0), "Walvisbaai 3");
        assertEquals(data.address.get(0).postalCode, "2333ZA");
        assertEquals(data.address.get(0).use, CodeSystemAddressUse.WORK);
        assertEquals(data.birthDate.toString(), "1967-11-05");
        assertEquals(data.gender, CodeSystemAdministrativeGender.FEMALE);
        assertEquals(data.id, "f204");
        assertEquals(data.identifier.get(0).system, "urn:oid:2.16.528.1.1007.3.1");
        assertEquals(data.identifier.get(0).type.text, "UZI-nummer");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "12345678904");
        assertEquals(data.name.get(0).text, "Carla Espinosa");
        assertEquals(data.name.get(0).use, CodeSystemNameUse.USUAL);
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.PHONE);
        assertEquals(data.telecom.get(0).use, CodeSystemContactPointUse.WORK);
        assertEquals(data.telecom.get(0).value, "+31715262169");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testPractitioner10() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/practitioner-example-xcda1.json");
        Practitioner data = parser.toFhir(Practitioner.class, sourceJson);

        assertEquals(data.id, "xcda1");
        assertEquals(data.identifier.get(0).system, "http://healthcare.example.org/identifiers/staff");
        assertEquals(data.identifier.get(0).use, CodeSystemIdentifierUse.OFFICIAL);
        assertEquals(data.identifier.get(0).value, "D234123");
        assertEquals(data.name.get(0).family, "Dopplemeyer");
        assertEquals(data.name.get(0).given.get(0), "Sherry");
        assertEquals(data.telecom.get(0).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.telecom.get(0).value, "john.doe@healthcare.example.org");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
