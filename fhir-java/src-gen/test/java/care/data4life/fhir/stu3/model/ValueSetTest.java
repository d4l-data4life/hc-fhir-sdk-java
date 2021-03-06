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
 * ValueSetTest.java
 * <p>
 * A set of codes drawn from one or more code systems.
 * <p>
 * A value set specifies a set of codes drawn from one or more code systems.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class ValueSetTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testValueSet1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/valueset-example.json");
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
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/shareablevalueset");
        assertEquals(data.name, "LOINC Codes for Cholesterol in Serum/Plasma");
        assertEquals(data.publisher, "HL7 International");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/example-extensional");
        assertEquals(data.version, "20150622");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/valueset-example-expansion.json");
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
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/shareablevalueset");
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
    public void testValueSet3() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/valueset-example-inactive.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.inactive, true);
        assertEquals(data.compose.include.get(0).filter.get(0).op, CodeSystemFilterOperator.DESCENDENT_OF);
        assertEquals(data.compose.include.get(0).filter.get(0).property, "concept");
        assertEquals(data.compose.include.get(0).filter.get(0).value, "_ActMoodPredicate");
        assertEquals(data.compose.include.get(0).system, "http://hl7.org/fhir/v3/ActMood");
        assertEquals(data.description, "HL7 v3 ActMood Prdicate codes, including inactive codes");
        assertEquals(data.expansion.contains.get(0).code, "CRT");
        assertEquals(data.expansion.contains.get(0).display, "criterion");
        assertEquals(data.expansion.contains.get(0).inactive, true);
        assertEquals(data.expansion.contains.get(0).system, "http://hl7.org/fhir/v3/ActMood");
        assertEquals(data.expansion.contains.get(1).code, "EXPEC");
        assertEquals(data.expansion.contains.get(1).contains.get(0).code, "GOL");
        assertEquals(data.expansion.contains.get(1).contains.get(0).display, "goal");
        assertEquals(data.expansion.contains.get(1).contains.get(0).system, "http://hl7.org/fhir/v3/ActMood");
        assertEquals(data.expansion.contains.get(1).contains.get(1).code, "RSK");
        assertEquals(data.expansion.contains.get(1).contains.get(1).display, "risk");
        assertEquals(data.expansion.contains.get(1).contains.get(1).system, "http://hl7.org/fhir/v3/ActMood");
        assertEquals(data.expansion.contains.get(1).display, "expectation");
        assertEquals(data.expansion.contains.get(1).system, "http://hl7.org/fhir/v3/ActMood");
        assertEquals(data.expansion.contains.get(2).code, "OPT");
        assertEquals(data.expansion.contains.get(2).display, "option");
        assertEquals(data.expansion.contains.get(2).system, "http://hl7.org/fhir/v3/ActMood");
        assertEquals(data.expansion.identifier, "urn:uuid:46c00b3f-003a-4f31-9d4b-ea2de58b2a99");
        assertEquals(data.expansion.timestamp.toString(), "2017-02-26T10:00:00Z");
        assertEquals(data.id, "inactive");
        assertEquals(data.name, "Example-inactive");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "Example with inactive codes");
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/inactive");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet4() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/valueset-example-yesnodontknow.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).valueSet.get(0), "http://hl7.org/fhir/ValueSet/v2-0136");
        assertEquals(data.compose.include.get(1).concept.get(0).code, "asked");
        assertEquals(data.compose.include.get(1).concept.get(0).display, "Don't know");
        assertEquals(data.compose.include.get(1).system, "http://hl7.org/fhir/data-absent-reason");
        assertEquals(data.description, "For Capturing simple yes-no-don't know answers");
        assertEquals(data.expansion.contains.get(0).code, "Y");
        assertEquals(data.expansion.contains.get(0).display, "Yes");
        assertEquals(data.expansion.contains.get(0).system, "http://hl7.org/fhir/v2/0136");
        assertEquals(data.expansion.contains.get(1).code, "N");
        assertEquals(data.expansion.contains.get(1).display, "No");
        assertEquals(data.expansion.contains.get(1).system, "http://hl7.org/fhir/v2/0136");
        assertEquals(data.expansion.contains.get(2).code, "asked");
        assertEquals(data.expansion.contains.get(2).display, "Don't know");
        assertEquals(data.expansion.contains.get(2).system, "http://hl7.org/fhir/data-absent-reason");
        assertEquals(data.expansion.identifier, "urn:uuid:bf99fe50-2c2b-41ad-bd63-bee6919810b4");
        assertEquals(data.expansion.timestamp.toString(), "2015-07-14T10:00:00Z");
        assertEquals(data.id, "yesnodontknow");
        assertEquals(data.name, "Yes/No/Don't Know");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/yesnodontknow");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet5() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/valueset-list-example-codes.json");
        ValueSet data = parser.toFhir(ValueSet.class, sourceJson);

        assertEquals(data.compose.include.get(0).system, "http://hl7.org/fhir/list-example-use-codes");
        assertEquals(data.contact.get(0).telecom.get(0).system, CodeSystemContactPointSystem.URL);
        assertEquals(data.contact.get(0).telecom.get(0).value, "http://hl7.org/fhir");
        assertEquals(data.date.toString(), "2017-04-19T07:44:43+10:00");
        assertEquals(data.description, "Example use codes for the List resource - typical kinds of use.");
        assertEquals(data.experimental, true);
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-ballot-status");
        assertEquals(data.extension.get(0).valueString, "Informative");
        assertEquals(data.extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm");
        assertTrue(data.extension.get(1).valueInteger == 1);
        assertEquals(data.extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg");
        assertEquals(data.extension.get(2).valueCode, "fhir");
        assertEquals(data.id, "list-example-codes");
        assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
        assertEquals(data.identifier.get(0).value, "urn:oid:2.16.840.1.113883.4.642.3.307");
        assertEquals(data.immutable, true);
        assertEquals(data.meta.lastUpdated.toString(), "2017-04-19T07:44:43.294+10:00");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/shareablevalueset");
        assertEquals(data.name, "Example Use Codes for List");
        assertEquals(data.publisher, "FHIR Project");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/ValueSet/list-example-codes");
        assertEquals(data.version, "3.0.1");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testValueSet6() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/valueset-example-intensional.json");
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
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/shareablevalueset");
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
