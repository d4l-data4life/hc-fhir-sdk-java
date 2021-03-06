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
 * CodeSystemTest.java
 * <p>
 * A set of codes drawn from one or more code systems.
 * <p>
 * A code system resource specifies a set of codes drawn from one or more code systems.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class CodeSystemTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testCodeSystem1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/codesystem-list-example-codes.json");
        CodeSystem data = parser.toFhir(CodeSystem.class, sourceJson);

        assertEquals(data.caseSensitive, true);
        assertEquals(data.concept.get(0).code, "alerts");
        assertEquals(data.concept.get(0).definition, "A list of alerts for the patient.");
        assertEquals(data.concept.get(0).display, "Alerts");
        assertEquals(data.concept.get(1).code, "adverserxns");
        assertEquals(data.concept.get(1).definition, "A list of part adverse reactions.");
        assertEquals(data.concept.get(1).display, "Adverse Reactions");
        assertEquals(data.concept.get(2).code, "allergies");
        assertEquals(data.concept.get(2).definition, "A list of Allergies for the patient.");
        assertEquals(data.concept.get(2).display, "Allergies");
        assertEquals(data.concept.get(3).code, "medications");
        assertEquals(data.concept.get(3).definition, "A list of medication statements for the patient.");
        assertEquals(data.concept.get(3).display, "Medication List");
        assertEquals(data.concept.get(4).code, "problems");
        assertEquals(data.concept.get(4).definition, "A list of problems that the patient is known of have (or have had in the past).");
        assertEquals(data.concept.get(4).display, "Problem List");
        assertEquals(data.concept.get(5).code, "worklist");
        assertEquals(data.concept.get(5).definition, "A list of items that constitute a set of work to be performed (typically this code would be specialized for more specific uses, such as a ward round list).");
        assertEquals(data.concept.get(5).display, "Worklist");
        assertEquals(data.concept.get(6).code, "waiting");
        assertEquals(data.concept.get(6).definition, "A list of items waiting for an event (perhaps a surgical patient waiting list).");
        assertEquals(data.concept.get(6).display, "Waiting List");
        assertEquals(data.concept.get(7).code, "protocols");
        assertEquals(data.concept.get(7).definition, "A set of protocols to be followed.");
        assertEquals(data.concept.get(7).display, "Protocols");
        assertEquals(data.concept.get(8).code, "plans");
        assertEquals(data.concept.get(8).definition, "A set of care plans that apply in a particular context of care.");
        assertEquals(data.concept.get(8).display, "Care Plans");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.content, CodeSystemCodeSystemContentMode.COMPLETE);
        assertEquals(data.description, "Example use codes for the List resource - typical kinds of use.");
        assertEquals(data.experimental, true);
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-ballot-status");
        assertEquals(data.extension.get(0).valueString, "Informative");
        assertEquals(data.extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm");
        assertTrue(data.extension.get(1).valueInteger == 1);
        assertEquals(data.extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg");
        assertEquals(data.extension.get(2).valueCode, "fhir");
        assertEquals(data.id, "list-example-codes");
        assertEquals(data.identifier.system, "urn:ietf:rfc:3986");
        assertEquals(data.identifier.value, "urn:oid:2.16.840.1.113883.4.642.1.308");
        assertEquals(data.meta.lastUpdated.toString(), "2017-04-19T07:44:43.294+10:00");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/shareablecodesystem");
        assertEquals(data.name, "Example Use Codes for List");
        assertEquals(data.publisher, "FHIR Project");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/list-example-use-codes");
        assertEquals(data.valueSet, "http://hl7.org/fhir/ValueSet/list-example-codes");
        assertEquals(data.version, "3.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCodeSystem2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/codesystem-example-summary.json");
        CodeSystem data = parser.toFhir(CodeSystem.class, sourceJson);

        assertEquals(data.caseSensitive, true);
        assertEquals(data.contact.get(0).name, "FHIR project team");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.content, CodeSystemCodeSystemContentMode.NOT_PRESENT);
        assertTrue(data.count == 92);
        assertEquals(data.description, "This is an example code system summary for the ACME codes for body site.");
        assertEquals(data.experimental, true);
        assertEquals(data.id, "summary");
        assertEquals(data.jurisdiction.get(0).coding.get(0).code, "CA");
        assertEquals(data.jurisdiction.get(0).coding.get(0).system, "urn:iso:std:iso:3166");
        assertEquals(data.name, "Code system summary example for ACME body sites");
        assertEquals(data.publisher, "HL7 International");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/CodeSystem/summary");
        assertEquals(data.useContext.get(0).code.code, "species");
        assertEquals(data.useContext.get(0).code.system, "http://example.org/CodeSystem/contexttype");
        assertEquals(data.useContext.get(0).valueCodeableConcept.coding.get(0).code, "337915000");
        assertEquals(data.useContext.get(0).valueCodeableConcept.coding.get(0).display, "Homo sapiens (organism)");
        assertEquals(data.useContext.get(0).valueCodeableConcept.coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testCodeSystem3() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/codesystem-example.json");
        CodeSystem data = parser.toFhir(CodeSystem.class, sourceJson);

        assertEquals(data.caseSensitive, true);
        assertEquals(data.concept.get(0).code, "chol-mmol");
        assertEquals(data.concept.get(0).definition, "Serum Cholesterol, in mmol/L");
        assertEquals(data.concept.get(0).designation.get(0).use.code, "internal-label");
        assertEquals(data.concept.get(0).designation.get(0).use.system, "http://acme.com/config/fhir/codesystems/internal");
        assertEquals(data.concept.get(0).designation.get(0).value, "From ACME POC Testing");
        assertEquals(data.concept.get(0).display, "SChol (mmol/L)");
        assertEquals(data.concept.get(1).code, "chol-mass");
        assertEquals(data.concept.get(1).definition, "Serum Cholesterol, in mg/L");
        assertEquals(data.concept.get(1).designation.get(0).use.code, "internal-label");
        assertEquals(data.concept.get(1).designation.get(0).use.system, "http://acme.com/config/fhir/codesystems/internal");
        assertEquals(data.concept.get(1).designation.get(0).value, "From Paragon Labs");
        assertEquals(data.concept.get(1).display, "SChol (mg/L)");
        assertEquals(data.concept.get(2).code, "chol");
        assertEquals(data.concept.get(2).definition, "Serum Cholesterol");
        assertEquals(data.concept.get(2).designation.get(0).use.code, "internal-label");
        assertEquals(data.concept.get(2).designation.get(0).use.system, "http://acme.com/config/fhir/codesystems/internal");
        assertEquals(data.concept.get(2).designation.get(0).value, "Obdurate Labs uses this with both kinds of units...");
        assertEquals(data.concept.get(2).display, "SChol");
        assertEquals(data.contact.get(0).name, "FHIR project team");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.content, CodeSystemCodeSystemContentMode.COMPLETE);
        assertEquals(data.date.toString(), "2016-01-28");
        assertEquals(data.description, "This is an example code system that includes all the ACME codes for serum/plasma cholesterol from v2.36.");
        assertEquals(data.experimental, true);
        assertEquals(data.id, "example");
        assertEquals(data.identifier.system, "http://acme.com/identifiers/codesystems");
        assertEquals(data.identifier.value, "internal-cholesterol-inl");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/shareablecodesystem");
        assertEquals(data.name, "ACME Codes for Cholesterol in Serum/Plasma");
        assertEquals(data.publisher, "HL7 International");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/CodeSystem/example");
        assertEquals(data.version, "20160128");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
