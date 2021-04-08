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
 * ValueSetTest.java
 * <p>
 * A set of codes drawn from one or more code systems.
 * <p>
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems,
 * intended for use in a particular context. Value sets link between [CodeSystem](codesystem.html)
 * definitions and their use in [coded elements](terminologies.html).
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class ValueSetTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testValueSet1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.inactive, true);
        assertEquals(data.compose.include.get(0).concept.get(0).code, "14647-2");
        assertEquals(data.compose.include.get(0).concept.get(0).display, "Cholesterol [Moles/Volume]");
        assertEquals(data.compose.include.get(0).concept.get(1).code, "2093-3");
        assertEquals(data.compose.include.get(0).concept.get(1).display, "Cholesterol [Mass/Volume]");
        assertEquals(data.compose.include.get(0).concept.get(2).code, "35200-5");
        assertEquals(data.compose.include.get(0).concept.get(2).display, "Cholesterol [Mass Or Moles/Volume]");
        assertEquals(data.compose.include.get(0).concept.get(3).code, "9342-7");
        assertEquals(data.compose.include.get(0).concept.get(3).display, "Cholesterol [Percentile]");
        assertEquals(data.compose.include.get(0).system, "http://loinc.org");
        assertEquals(data.compose.include.get(0).version, "2.36");
        assertEquals(data.compose.lockedDate.toString(), "2012-06-13");
        assertEquals(data.contact.get(0).name, "FHIR project team");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.copyright, "This content from LOINC ® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.");
        assertEquals(data.date.toString(), "2015-06-22");
        assertEquals(data.description, "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.");
        assertEquals(data.experimental, true);
        assertEquals(data.id, "example-extensional");
        assertEquals(data.identifier.get(0).system, "http://acme.com/identifiers/valuesets");
        assertEquals(data.identifier.get(0).value, "loinc-cholesterol-int");
        assertEquals(data.jurisdiction.get(0).coding.get(0).code, "US");
        assertEquals(data.jurisdiction.get(0).coding.get(0).system, "urn:iso:std:iso:3166");
        // Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
        assertEquals(data.name, "LOINC Codes for Cholesterol in Serum/Plasma");
        assertEquals(data.publisher, "HL7 International");
        assertEquals(data.purpose, "This value set was published by ACME Inc in order to make clear which codes are used for Cholesterol by AcmeClinicals (Adult Ambulatory care support in USA)");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/example-extensional");
        assertEquals(data.useContext.get(0).code.code, "age");
        assertEquals(data.useContext.get(0).code.system, "http://terminology.hl7.org/CodeSystem/usage-context-type");
        assertEquals(data.useContext.get(0).valueQuantity.code, "a");
        assertEquals(data.useContext.get(0).valueQuantity.comparator, CodeSystemQuantityComparator.GREATER_THAN);
        assertEquals(data.useContext.get(0).valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.useContext.get(0).valueQuantity.unit, "yrs");
        assertEquals(data.useContext.get(0).valueQuantity.value.toString(), "18");
        assertEquals(data.version, "20150622");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example-hierarchical.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).concept.get(0).code, "invalid");
        assertEquals(data.compose.include.get(0).concept.get(1).code, "structure");
        assertEquals(data.compose.include.get(0).concept.get(2).code, "required");
        assertEquals(data.compose.include.get(0).concept.get(3).code, "value");
        assertEquals(data.compose.include.get(0).concept.get(4).code, "processing");
        assertEquals(data.compose.include.get(0).concept.get(5).code, "duplicate");
        assertEquals(data.compose.include.get(0).concept.get(6).code, "not-found");
        assertEquals(data.compose.include.get(0).concept.get(7).code, "conflict");
        assertEquals(data.compose.include.get(0).concept.get(8).code, "lock");
        assertEquals(data.compose.include.get(0).concept.get(9).code, "exception");
        assertEquals(data.compose.include.get(0).extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/valueset-expand-rules");
        assertEquals(data.compose.include.get(0).extension.get(0).valueCode, "groups-only");
        assertEquals(data.compose.include.get(0).extension.get(1).extension.get(0).url, "display");
        assertEquals(data.compose.include.get(0).extension.get(1).extension.get(0).valueString, "(Most common)");
        assertEquals(data.compose.include.get(0).extension.get(1).extension.get(1).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(1).extension.get(1).valueCode, "login");
        assertEquals(data.compose.include.get(0).extension.get(1).extension.get(2).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(1).extension.get(2).valueCode, "conflict");
        assertEquals(data.compose.include.get(0).extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/valueset-expand-group");
        assertEquals(data.compose.include.get(0).extension.get(2).extension.get(0).url, "code");
        assertEquals(data.compose.include.get(0).extension.get(2).extension.get(0).valueCode, "processing");
        assertEquals(data.compose.include.get(0).extension.get(2).extension.get(1).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(2).extension.get(1).valueCode, "duplicate");
        assertEquals(data.compose.include.get(0).extension.get(2).extension.get(2).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(2).extension.get(2).valueCode, "not-found");
        assertEquals(data.compose.include.get(0).extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/valueset-expand-group");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(0).url, "code");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(0).valueCode, "invalid");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(1).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(1).valueCode, "structure");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(2).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(2).valueCode, "required");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(3).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(3).extension.get(3).valueCode, "value");
        assertEquals(data.compose.include.get(0).extension.get(3).url, "http://hl7.org/fhir/StructureDefinition/valueset-expand-group");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(0).url, "code");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(0).valueCode, "transient");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(1).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(1).valueCode, "lock");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(2).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(2).valueCode, "exception");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(3).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(4).extension.get(3).valueCode, "throttled");
        assertEquals(data.compose.include.get(0).extension.get(4).url, "http://hl7.org/fhir/StructureDefinition/valueset-expand-group");
        assertEquals(data.compose.include.get(0).extension.get(5).extension.get(0).url, "code");
        assertEquals(data.compose.include.get(0).extension.get(5).extension.get(0).valueCode, "security");
        assertEquals(data.compose.include.get(0).extension.get(5).extension.get(1).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(5).extension.get(1).valueCode, "login");
        assertEquals(data.compose.include.get(0).extension.get(5).extension.get(2).url, "member");
        assertEquals(data.compose.include.get(0).extension.get(5).extension.get(2).valueCode, "unknown");
        assertEquals(data.compose.include.get(0).extension.get(5).url, "http://hl7.org/fhir/StructureDefinition/valueset-expand-group");
        assertEquals(data.compose.include.get(0).system, "#hacked");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.contained.get(0).id, "hacked");
        assertEquals(data.date.toString(), "2018-07-20");
        assertEquals(data.description, "Demonstration of extensions that build a hierarchical contains");
        assertEquals(data.expansion.contains.get(0).abstrakt, true);
        assertEquals(data.expansion.contains.get(0).contains.get(0).code, "login");
        assertEquals(data.expansion.contains.get(0).contains.get(0).display, "Login Required");
        assertEquals(data.expansion.contains.get(0).contains.get(0).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(0).contains.get(1).code, "conflict");
        assertEquals(data.expansion.contains.get(0).contains.get(1).display, "Edit Version Conflict");
        assertEquals(data.expansion.contains.get(0).contains.get(1).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(0).display, "(Most common)");
        assertEquals(data.expansion.contains.get(1).code, "processing");
        assertEquals(data.expansion.contains.get(1).contains.get(0).code, "duplicate");
        assertEquals(data.expansion.contains.get(1).contains.get(0).display, "Duplicate");
        assertEquals(data.expansion.contains.get(1).contains.get(0).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(1).contains.get(1).code, "not-found");
        assertEquals(data.expansion.contains.get(1).contains.get(1).display, "Not Found");
        assertEquals(data.expansion.contains.get(1).contains.get(1).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(1).display, "Processing Failure");
        assertEquals(data.expansion.contains.get(1).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(2).abstrakt, true);
        assertEquals(data.expansion.contains.get(2).code, "invalid");
        assertEquals(data.expansion.contains.get(2).contains.get(0).code, "structure");
        assertEquals(data.expansion.contains.get(2).contains.get(0).display, "Structural Issue");
        assertEquals(data.expansion.contains.get(2).contains.get(0).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(2).contains.get(1).code, "required");
        assertEquals(data.expansion.contains.get(2).contains.get(1).display, "Required element missing");
        assertEquals(data.expansion.contains.get(2).contains.get(1).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(2).contains.get(2).code, "value");
        assertEquals(data.expansion.contains.get(2).contains.get(2).display, "Element value invalid");
        assertEquals(data.expansion.contains.get(2).contains.get(2).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(2).display, "Invalid Content");
        assertEquals(data.expansion.contains.get(2).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(3).abstrakt, true);
        assertEquals(data.expansion.contains.get(3).code, "transient");
        assertEquals(data.expansion.contains.get(3).contains.get(0).code, "lock-error");
        assertEquals(data.expansion.contains.get(3).contains.get(0).display, "Lock Error");
        assertEquals(data.expansion.contains.get(3).contains.get(0).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(3).contains.get(1).code, "exception");
        assertEquals(data.expansion.contains.get(3).contains.get(1).display, "Exception");
        assertEquals(data.expansion.contains.get(3).contains.get(1).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(3).contains.get(2).code, "throttled");
        assertEquals(data.expansion.contains.get(3).contains.get(2).display, "Throttled");
        assertEquals(data.expansion.contains.get(3).contains.get(2).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(3).display, "Transient Issue");
        assertEquals(data.expansion.contains.get(3).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(4).abstrakt, true);
        assertEquals(data.expansion.contains.get(4).code, "security");
        assertEquals(data.expansion.contains.get(4).contains.get(0).code, "login");
        assertEquals(data.expansion.contains.get(4).contains.get(0).display, "Login Required");
        assertEquals(data.expansion.contains.get(4).contains.get(0).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(4).contains.get(1).code, "unknown");
        assertEquals(data.expansion.contains.get(4).contains.get(1).display, "Unknown User");
        assertEquals(data.expansion.contains.get(4).contains.get(1).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.contains.get(4).display, "Security Problem");
        assertEquals(data.expansion.contains.get(4).system, "http://hl7.org/fhir/hacked");
        assertEquals(data.expansion.identifier, "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc");
        assertEquals(data.expansion.parameter.get(0).name, "excludeNotForUI");
        assertEquals(data.expansion.parameter.get(0).valueUri, "false");
        assertEquals(data.expansion.timestamp.toString(), "2018-07-20T23:14:07+10:00");
        assertEquals(data.experimental, true);
        assertEquals(data.id, "example-hierarchical");
        // Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
        assertEquals(data.name, "Example Hierarchical ValueSet");
        assertEquals(data.publisher, "FHIR Project team");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/example-hierarchical");
        assertEquals(data.version, "4.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example-expansion.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).filter.get(0).op, CodeSystemFilterOperator.EQUAL);
        assertEquals(data.compose.include.get(0).filter.get(0).property, "parent");
        assertEquals(data.compose.include.get(0).filter.get(0).value, "LP43571-6");
        assertEquals(data.compose.include.get(0).system, "http://loinc.org");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.copyright, "This content from LOINC® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.");
        assertEquals(data.date.toString(), "2015-06-22");
        assertEquals(data.description, "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.");
        assertEquals(data.expansion.contains.get(0).code, "14647-2");
        assertEquals(data.expansion.contains.get(0).display, "Cholesterol [Moles/volume] in Serum or Plasma");
        assertEquals(data.expansion.contains.get(0).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(0).version, "2.50");
        assertEquals(data.expansion.contains.get(1).abstrakt, true);
        assertEquals(data.expansion.contains.get(1).contains.get(0).code, "2093-3");
        assertEquals(data.expansion.contains.get(1).contains.get(0).display, "Cholesterol [Mass/volume] in Serum or Plasma");
        assertEquals(data.expansion.contains.get(1).contains.get(0).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(1).contains.get(0).version, "2.50");
        assertEquals(data.expansion.contains.get(1).contains.get(1).code, "48620-9");
        assertEquals(data.expansion.contains.get(1).contains.get(1).display, "Cholesterol [Mass/volume] in Serum or Plasma ultracentrifugate");
        assertEquals(data.expansion.contains.get(1).contains.get(1).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(1).contains.get(1).version, "2.50");
        assertEquals(data.expansion.contains.get(1).contains.get(2).code, "9342-7");
        assertEquals(data.expansion.contains.get(1).contains.get(2).display, "Cholesterol [Percentile]");
        assertEquals(data.expansion.contains.get(1).contains.get(2).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(1).contains.get(2).version, "2.50");
        assertEquals(data.expansion.contains.get(1).display, "Cholesterol codes");
        assertEquals(data.expansion.contains.get(2).abstrakt, true);
        assertEquals(data.expansion.contains.get(2).contains.get(0).code, "2096-6");
        assertEquals(data.expansion.contains.get(2).contains.get(0).display, "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma");
        assertEquals(data.expansion.contains.get(2).contains.get(0).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(2).contains.get(0).version, "2.50");
        assertEquals(data.expansion.contains.get(2).contains.get(1).code, "35200-5");
        assertEquals(data.expansion.contains.get(2).contains.get(1).display, "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma");
        assertEquals(data.expansion.contains.get(2).contains.get(1).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(2).contains.get(1).version, "2.50");
        assertEquals(data.expansion.contains.get(2).contains.get(2).code, "48089-7");
        assertEquals(data.expansion.contains.get(2).contains.get(2).display, "Cholesterol/Apolipoprotein B [Molar ratio] in Serum or Plasma");
        assertEquals(data.expansion.contains.get(2).contains.get(2).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(2).contains.get(2).version, "2.50");
        assertEquals(data.expansion.contains.get(2).contains.get(3).code, "55838-7");
        assertEquals(data.expansion.contains.get(2).contains.get(3).display, "Cholesterol/Phospholipid [Molar ratio] in Serum or Plasma");
        assertEquals(data.expansion.contains.get(2).contains.get(3).system, "http://loinc.org");
        assertEquals(data.expansion.contains.get(2).contains.get(3).version, "2.50");
        assertEquals(data.expansion.contains.get(2).display, "Cholesterol Ratios");
        assertEquals(data.expansion.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/valueset-expansionSource");
        assertEquals(data.expansion.extension.get(0).valueUri, "http://hl7.org/fhir/ValueSet/example-extensional");
        assertEquals(data.expansion.identifier, "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc");
        assertTrue(data.expansion.offset == 0);
        assertEquals(data.expansion.parameter.get(0).name, "version");
        assertEquals(data.expansion.parameter.get(0).valueString, "2.50");
        assertEquals(data.expansion.timestamp.toString(), "2015-06-22T13:56:07Z");
        assertTrue(data.expansion.total == 8);
        assertEquals(data.experimental, true);
        assertEquals(data.id, "example-expansion");
        // Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
        assertEquals(data.name, "LOINC Codes for Cholesterol in Serum/Plasma");
        assertEquals(data.publisher, "FHIR Project team");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/example-expansion");
        assertEquals(data.version, "20150622");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example-inactive.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.inactive, true);
        assertEquals(data.compose.include.get(0).filter.get(0).op, CodeSystemFilterOperator.DESCENDENT_OF);
        assertEquals(data.compose.include.get(0).filter.get(0).property, "concept");
        assertEquals(data.compose.include.get(0).filter.get(0).value, "_ActMoodPredicate");
        assertEquals(data.compose.include.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActMood");
        assertEquals(data.description, "HL7 v3 ActMood Predicate codes, including inactive codes");
        assertEquals(data.expansion.contains.get(0).code, "CRT");
        assertEquals(data.expansion.contains.get(0).display, "criterion");
        assertEquals(data.expansion.contains.get(0).inactive, true);
        assertEquals(data.expansion.contains.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActMood");
        assertEquals(data.expansion.contains.get(1).code, "EXPEC");
        assertEquals(data.expansion.contains.get(1).contains.get(0).code, "GOL");
        assertEquals(data.expansion.contains.get(1).contains.get(0).display, "goal");
        assertEquals(data.expansion.contains.get(1).contains.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActMood");
        assertEquals(data.expansion.contains.get(1).contains.get(1).code, "RSK");
        assertEquals(data.expansion.contains.get(1).contains.get(1).display, "risk");
        assertEquals(data.expansion.contains.get(1).contains.get(1).system, "http://terminology.hl7.org/CodeSystem/v3-ActMood");
        assertEquals(data.expansion.contains.get(1).display, "expectation");
        assertEquals(data.expansion.contains.get(1).system, "http://terminology.hl7.org/CodeSystem/v3-ActMood");
        assertEquals(data.expansion.contains.get(2).code, "OPT");
        assertEquals(data.expansion.contains.get(2).display, "option");
        assertEquals(data.expansion.contains.get(2).system, "http://terminology.hl7.org/CodeSystem/v3-ActMood");
        assertEquals(data.expansion.identifier, "urn:uuid:46c00b3f-003a-4f31-9d4b-ea2de58b2a99");
        assertEquals(data.expansion.timestamp.toString(), "2017-02-26T10:00:00Z");
        assertEquals(data.id, "inactive");
        assertEquals(data.name, "Example-inactive");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "Example with inactive codes");
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/inactive");
        assertEquals(data.version, "4.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example-filter.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).filter.get(0).op, CodeSystemFilterOperator.EQUAL);
        assertEquals(data.compose.include.get(0).filter.get(0).property, "acme-plasma");
        assertEquals(data.compose.include.get(0).filter.get(0).value, "true");
        assertEquals(data.compose.include.get(0).system, "http://hl7.org/fhir/CodeSystem/example");
        assertEquals(data.contact.get(0).name, "FHIR project team");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.date.toString(), "2018-11-01");
        assertEquals(data.description, "ACME Codes for Cholesterol: Plasma only - demonstrating the use of a filter defined in a CodeSystem");
        assertEquals(data.experimental, true);
        assertEquals(data.id, "example-filter");
        assertEquals(data.name, "ACMECholCodesPlasma");
        assertEquals(data.publisher, "HL7 International");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "ACME Codes for Cholesterol: Plasma only");
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/example-filter");
        assertEquals(data.version, "4.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example-yesnodontknow.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        // Don't know how to create unit test for "compose.include.get(0).valueSet.get(0)", which is a Canonical
        assertEquals(data.compose.include.get(1).concept.get(0).code, "asked-unknown");
        assertEquals(data.compose.include.get(1).concept.get(0).display, "Don't know");
        assertEquals(data.compose.include.get(1).system, "http://terminology.hl7.org/CodeSystem/data-absent-reason");
        assertEquals(data.description, "For Capturing simple yes-no-don't know answers");
        assertEquals(data.expansion.contains.get(0).code, "Y");
        assertEquals(data.expansion.contains.get(0).display, "Yes");
        assertEquals(data.expansion.contains.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0136");
        assertEquals(data.expansion.contains.get(1).code, "N");
        assertEquals(data.expansion.contains.get(1).display, "No");
        assertEquals(data.expansion.contains.get(1).system, "http://terminology.hl7.org/CodeSystem/v2-0136");
        assertEquals(data.expansion.contains.get(2).code, "asked-unknown");
        assertEquals(data.expansion.contains.get(2).display, "Don't know");
        assertEquals(data.expansion.contains.get(2).system, "http://terminology.hl7.org/CodeSystem/data-absent-reason");
        assertEquals(data.expansion.identifier, "urn:uuid:bf99fe50-2c2b-41ad-bd63-bee6919810b4");
        assertEquals(data.expansion.timestamp.toString(), "2015-07-14T10:00:00Z");
        assertEquals(data.id, "yesnodontknow");
        assertEquals(data.name, "Yes/No/Don't Know");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/yesnodontknow");
        assertEquals(data.version, "4.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet7() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-examplescenario-actor-type.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).system, "http://hl7.org/fhir/examplescenario-actor-type");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.contact.get(0).telecom.get(1).system, CodeSystemContactPointSystem.EMAIL);
        assertEquals(data.contact.get(0).telecom.get(1).value, "fhir@lists.hl7.org");
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
        assertEquals(data.identifier.get(0).value, "urn:oid:2.16.840.1.113883.4.642.3.858");
        assertEquals(data.immutable, true);
        assertEquals(data.meta.lastUpdated.toString(), "2019-11-01T09:29:23.356+11:00");
        // Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
        assertEquals(data.name, "ExampleScenarioActorType");
        assertEquals(data.publisher, "HL7 (FHIR Project)");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "ExampleScenarioActorType");
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/examplescenario-actor-type");
        assertEquals(data.version, "4.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet8() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-list-example-codes.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).system, "http://terminology.hl7.org/CodeSystem/list-example-use-codes");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.date.toString(), "2019-11-01T09:29:23+11:00");
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
        assertEquals(data.identifier.get(0).value, "urn:oid:2.16.840.1.113883.4.642.3.316");
        assertEquals(data.immutable, true);
        assertEquals(data.meta.lastUpdated.toString(), "2019-11-01T09:29:23.356+11:00");
        // Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
        assertEquals(data.name, "ExampleUseCodesForList");
        assertEquals(data.publisher, "FHIR Project");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "Example Use Codes for List");
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/list-example-codes");
        assertEquals(data.version, "4.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet9() throws Exception {
        String sourceJson = FileHelper.loadString("r4/valueset-example-intensional.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.exclude.get(0).concept.get(0).code, "5932-9");
        assertEquals(data.compose.exclude.get(0).concept.get(0).display, "Cholesterol [Presence] in Blood by Test strip");
        assertEquals(data.compose.exclude.get(0).system, "http://loinc.org");
        assertEquals(data.compose.include.get(0).filter.get(0).op, CodeSystemFilterOperator.EQUAL);
        assertEquals(data.compose.include.get(0).filter.get(0).property, "parent");
        assertEquals(data.compose.include.get(0).filter.get(0).value, "LP43571-6");
        assertEquals(data.compose.include.get(0).system, "http://loinc.org");
        assertEquals(data.contact.get(0).name, "FHIR project team");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.copyright, "This content from LOINCÂ® is copyright Â© 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use");
        assertEquals(data.date.toString(), "2015-06-22");
        assertEquals(data.description, "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.");
        assertEquals(data.experimental, true);
        assertEquals(data.id, "example-intensional");
        assertEquals(data.identifier.get(0).system, "http://acme.com/identifiers/valuesets");
        assertEquals(data.identifier.get(0).value, "loinc-cholesterol-ext");
        // Don't know how to create unit test for "meta.profile.get(0)", which is a Canonical
        assertEquals(data.name, "LOINC Codes for Cholesterol in Serum/Plasma");
        assertEquals(data.publisher, "HL7 International");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/example-intensional");
        assertEquals(data.version, "20150622");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
