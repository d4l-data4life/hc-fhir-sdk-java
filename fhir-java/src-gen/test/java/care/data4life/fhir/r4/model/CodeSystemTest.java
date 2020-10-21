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
 * CodeSystemTest.java
 *
 * Declares the existence of and describes a code system or code system supplement.
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 *
 *
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2020-10-19
 */
public class CodeSystemTest {

	FhirR4Parser parser = new FhirR4Parser();

    @Test
	public void testCodeSystem1() throws Exception {
		String sourceJson = FileHelper.loadString("r4/codesystem-example-supplement.json");
		CodeSystem data = parser.toFhir(CodeSystem.class , sourceJson);
		
		assertEquals(data.concept.get(0).code, "chol-mmol");
		assertEquals(data.concept.get(0).property.get(0).code, "legacy");
		assertEquals(data.concept.get(0).property.get(0).valueBoolean, false);
		assertEquals(data.concept.get(1).code, "chol-mass");
		assertEquals(data.concept.get(1).property.get(0).code, "legacy");
		assertEquals(data.concept.get(1).property.get(0).valueBoolean, true);
		assertEquals(data.concept.get(2).code, "chol");
		assertEquals(data.concept.get(2).property.get(0).code, "legacy");
		assertEquals(data.concept.get(2).property.get(0).valueBoolean, true);
		assertEquals(data.contact.get(0).name, "FHIR project team");
		assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
		assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
		assertEquals(data.content, CodeSystemCodeSystemContentMode.SUPPLEMENT);
		assertEquals(data.date.toString(), "2016-01-28");
		assertEquals(data.experimental, true);
		assertEquals(data.id, "example-supplement");
		assertEquals(data.name, "CholCodeLegacyStatus");
		assertEquals(data.property.get(0).code, "legacy");
		assertEquals(data.property.get(0).description, "hether the test is currently performed");
		assertEquals(data.property.get(0).type, CodeSystemPropertyType.BOOLEAN);
		assertEquals(data.publisher, "ACME Co");
		assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
		// Don't know how to create unit test for "supplements", which is a Canonical
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
		assertEquals(data.url, "http://hl7.org/fhir/CodeSystem/example-supplement");
		assertEquals(data.version, "201801103");

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testCodeSystem2() throws Exception {
		String sourceJson = FileHelper.loadString("r4/codesystem-list-example-codes.json");
		CodeSystem data = parser.toFhir(CodeSystem.class , sourceJson);
		
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
		assertEquals(data.experimental, false);
		assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg");
		assertEquals(data.extension.get(0).valueCode, "fhir");
		assertEquals(data.extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status");
		assertEquals(data.extension.get(1).valueCode, "draft");
		assertEquals(data.extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm");
        assertTrue(data.extension.get(2).valueInteger == 1);
		assertEquals(data.id, "list-example-codes");
		assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
		assertEquals(data.identifier.get(0).value, "urn:oid:2.16.840.1.113883.4.642.4.1105");
		assertEquals(data.meta.lastUpdated.toString(), "2019-11-01T09:29:23.356+11:00");
		// Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
		assertEquals(data.name, "ExampleUseCodesForList");
		assertEquals(data.publisher, "FHIR Project");
		assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
		assertEquals(data.title, "Example Use Codes for List");
		assertEquals(data.url, "http://terminology.hl7.org/CodeSystem/list-example-use-codes");
		// Don't know how to create unit test for "valueSet", which is a Canonical
		assertEquals(data.version, "4.0.1");

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testCodeSystem3() throws Exception {
		String sourceJson = FileHelper.loadString("r4/codesystem-examplescenario-actor-type.json");
		CodeSystem data = parser.toFhir(CodeSystem.class , sourceJson);
		
		assertEquals(data.caseSensitive, true);
		assertEquals(data.concept.get(0).code, "person");
		assertEquals(data.concept.get(0).definition, "A person.");
		assertEquals(data.concept.get(0).display, "Person");
		assertEquals(data.concept.get(1).code, "entity");
		assertEquals(data.concept.get(1).definition, "A system.");
		assertEquals(data.concept.get(1).display, "System");
		assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
		assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
		assertEquals(data.contact.get(0).telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
		assertEquals(data.contact.get(0).telecom.get(1).value, "fhir@lists.hl7.org");
		assertEquals(data.content, CodeSystemCodeSystemContentMode.COMPLETE);
		assertEquals(data.date.toString(), "2019-11-01T09:29:23+11:00");
		assertEquals(data.description, "The type of actor - system or human.");
		assertEquals(data.experimental, false);
		assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg");
		assertEquals(data.extension.get(0).valueCode, "fhir");
		assertEquals(data.extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status");
		assertEquals(data.extension.get(1).valueCode, "trial-use");
		assertEquals(data.extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm");
        assertTrue(data.extension.get(2).valueInteger == 0);
		assertEquals(data.id, "examplescenario-actor-type");
		assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
		assertEquals(data.identifier.get(0).value, "urn:oid:2.16.840.1.113883.4.642.4.859");
		assertEquals(data.meta.lastUpdated.toString(), "2019-11-01T09:29:23.356+11:00");
		assertEquals(data.name, "ExampleScenarioActorType");
		assertEquals(data.publisher, "HL7 (FHIR Project)");
		assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
		assertEquals(data.title, "ExampleScenarioActorType");
		assertEquals(data.url, "http://hl7.org/fhir/examplescenario-actor-type");
		// Don't know how to create unit test for "valueSet", which is a Canonical
		assertEquals(data.version, "4.0.1");

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testCodeSystem4() throws Exception {
		String sourceJson = FileHelper.loadString("r4/codesystem-example-summary.json");
		CodeSystem data = parser.toFhir(CodeSystem.class , sourceJson);
		
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
		assertEquals(data.version, "4.0.1");

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testCodeSystem5() throws Exception {
		String sourceJson = FileHelper.loadString("r4/codesystem-example.json");
		CodeSystem data = parser.toFhir(CodeSystem.class , sourceJson);
		
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
		assertEquals(data.filter.get(0).code, "acme-plasma");
		assertEquals(data.filter.get(0).description, "An internal filter used to select codes that are only used with plasma");
		assertEquals(data.filter.get(0).operator.get(0), CodeSystemFilterOperator.EQUAL);
		assertEquals(data.filter.get(0).value, "the value of this filter is either 'true' or 'false'");
		assertEquals(data.id, "example");
		assertEquals(data.identifier.get(0).system, "http://acme.com/identifiers/codesystems");
		assertEquals(data.identifier.get(0).value, "internal-cholesterol-inl");
		// Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
		assertEquals(data.name, "ACMECholCodesBlood");
		assertEquals(data.publisher, "Acme Co");
		assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
		assertEquals(data.title, "ACME Codes for Cholesterol in Serum/Plasma");
		assertEquals(data.url, "http://hl7.org/fhir/CodeSystem/example");
		assertEquals(data.version, "20160128");

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}
}