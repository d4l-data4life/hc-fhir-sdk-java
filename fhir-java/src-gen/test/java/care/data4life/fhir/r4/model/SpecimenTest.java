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
 * SpecimenTest.java
 * <p>
 * Sample for analysis.
 * <p>
 * A sample to be used for analysis.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-04-08
 */
public class SpecimenTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testSpecimen1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/specimen-example-isolate.json");
        Specimen data = parser.toFhir(Specimen.class, sourceJson);

        assertEquals(data.accessionIdentifier.system, "http://lab.acme.org/specimens/2011");
        assertEquals(data.accessionIdentifier.value, "X352356-ISO1");
        assertEquals(data.collection.collectedDateTime.toString(), "2015-08-16T07:03:00Z");
        assertEquals(data.collection.collector.reference, "Practitioner/f202");
        assertEquals(data.collection.method.coding.get(0).code, "BAP");
        assertEquals(data.collection.method.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0488");
        assertEquals(data.contained.get(0).id, "stool");
        assertEquals(data.id, "isolate");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Patient dropped off specimen");
        assertEquals(data.parent.get(0).reference, "#stool");
        assertEquals(data.receivedTime.toString(), "2015-08-18T07:03:00Z");
        assertEquals(data.status, CodeSystemSpecimenStatus.AVAILABLE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.coding.get(0).code, "429951000124103");
        assertEquals(data.type.coding.get(0).display, "Bacterial isolate specimen");
        assertEquals(data.type.coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSpecimen2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/specimen-example-pooled-serum.json");
        Specimen data = parser.toFhir(Specimen.class, sourceJson);

        assertEquals(data.accessionIdentifier.system, "https://vetmed.iastate.edu/vdl");
        assertEquals(data.accessionIdentifier.value, "20171120-1234");
        assertEquals(data.collection.collectedDateTime.toString(), "2017-11-14");
        assertEquals(data.collection.collector.display, "James Herriot, FRCVS");
        assertEquals(data.container.get(0).type.coding.get(0).code, "RTT");
        assertEquals(data.container.get(0).type.coding.get(0).display, "Red Top Tube");
        assertEquals(data.container.get(0).type.coding.get(0).system, "https://vetmed.iastate.edu/vdl");
        assertEquals(data.container.get(0).type.text, "Red Top Blood Collection Tube");
        assertEquals(data.id, "pooled-serum");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Pooled serum sample from 30 individuals");
        assertEquals(data.subject.reference, "Group/herd1");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.coding.get(0).code, "Serum sample, pooled");
        assertEquals(data.type.coding.get(0).display, "Serum sample, pooled");
        assertEquals(data.type.coding.get(0).system, "https://vetmed.iastate.edu/vdl");
        assertEquals(data.type.text, "Pooled serum sample");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSpecimen3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/specimen-example-urine.json");
        Specimen data = parser.toFhir(Specimen.class, sourceJson);

        assertEquals(data.accessionIdentifier.system, "http://lab.acme.org/specimens/2015");
        assertEquals(data.accessionIdentifier.value, "X352356");
        assertEquals(data.collection.collectedDateTime.toString(), "2015-08-18T07:03:00Z");
        assertEquals(data.collection.collector.reference, "Practitioner/f202");
        assertEquals(data.container.get(0).capacity.unit, "mls");
        assertEquals(data.container.get(0).capacity.value.toString(), "50");
        assertEquals(data.container.get(0).specimenQuantity.unit, "mls");
        assertEquals(data.container.get(0).specimenQuantity.value.toString(), "10");
        assertEquals(data.container.get(0).type.text, "Non-sterile specimen container");
        assertEquals(data.id, "vma-urine");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.processing.get(0).additive.get(0).display, "6 N HCl");
        assertEquals(data.processing.get(0).description, "Acidify to pH < 3.0 with 6 N HCl.");
        assertEquals(data.processing.get(0).procedure.coding.get(0).code, "ACID");
        assertEquals(data.processing.get(0).procedure.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0373");
        assertEquals(data.processing.get(0).timeDateTime.toString(), "2015-08-18T08:10:00Z");
        assertEquals(data.receivedTime.toString(), "2015-08-18T07:03:00Z");
        assertEquals(data.status, CodeSystemSpecimenStatus.AVAILABLE);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.coding.get(0).code, "RANDU");
        assertEquals(data.type.coding.get(0).display, "Urine, Random");
        assertEquals(data.type.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0487");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSpecimen4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/specimen-example-serum.json");
        Specimen data = parser.toFhir(Specimen.class, sourceJson);

        assertEquals(data.accessionIdentifier.system, "http://acme.com/labs/accession-ids");
        assertEquals(data.accessionIdentifier.value, "20150816-00124");
        assertEquals(data.collection.collectedDateTime.toString(), "2015-08-16T06:40:17Z");
        assertEquals(data.collection.collector.reference, "Practitioner/f202");
        assertEquals(data.container.get(0).type.coding.get(0).code, "SST");
        assertEquals(data.container.get(0).type.coding.get(0).display, "Serum Separator Tube");
        assertEquals(data.container.get(0).type.coding.get(0).system, "http://acme.com/labs");
        assertEquals(data.id, "sst");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.request.get(0).reference, "ServiceRequest/ft4");
        assertEquals(data.subject.reference, "Patient/pat2");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.coding.get(0).code, "119364003");
        assertEquals(data.type.coding.get(0).display, "Serum sample");
        assertEquals(data.type.coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testSpecimen5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/specimen-example.json");
        Specimen data = parser.toFhir(Specimen.class, sourceJson);

        assertEquals(data.accessionIdentifier.system, "http://lab.acme.org/specimens/2011");
        assertEquals(data.accessionIdentifier.value, "X352356");
        assertEquals(data.collection.bodySite.coding.get(0).code, "49852007");
        assertEquals(data.collection.bodySite.coding.get(0).display, "Structure of median cubital vein (body structure)");
        assertEquals(data.collection.bodySite.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.collection.bodySite.text, "Right median cubital vein");
        assertEquals(data.collection.collectedDateTime.toString(), "2011-05-30T06:15:00Z");
        assertEquals(data.collection.collector.reference, "Practitioner/example");
        assertEquals(data.collection.method.coding.get(0).code, "LNV");
        assertEquals(data.collection.method.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0488");
        assertEquals(data.collection.quantity.unit, "mL");
        assertEquals(data.collection.quantity.value.toString(), "6");
        assertEquals(data.contained.get(0).id, "hep");
        assertEquals(data.container.get(0).additiveReference.reference, "#hep");
        assertEquals(data.container.get(0).capacity.unit, "mL");
        assertEquals(data.container.get(0).capacity.value.toString(), "10");
        assertEquals(data.container.get(0).description, "Green Gel tube");
        assertEquals(data.container.get(0).identifier.get(0).value, "48736-15394-75465");
        assertEquals(data.container.get(0).specimenQuantity.unit, "mL");
        assertEquals(data.container.get(0).specimenQuantity.value.toString(), "6");
        assertEquals(data.container.get(0).type.text, "Vacutainer");
        assertEquals(data.id, "101");
        assertEquals(data.identifier.get(0).system, "http://ehr.acme.org/identifiers/collections");
        assertEquals(data.identifier.get(0).value, "23234352356");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Specimen is grossly lipemic");
        assertEquals(data.receivedTime.toString(), "2011-03-04T07:03:00Z");
        assertEquals(data.request.get(0).reference, "ServiceRequest/example");
        assertEquals(data.status, CodeSystemSpecimenStatus.AVAILABLE);
        assertEquals(data.subject.display, "Peter Patient");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type.coding.get(0).code, "122555007");
        assertEquals(data.type.coding.get(0).display, "Venous blood specimen");
        assertEquals(data.type.coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
