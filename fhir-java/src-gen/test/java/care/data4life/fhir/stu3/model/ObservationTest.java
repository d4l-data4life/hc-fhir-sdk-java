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
 * ObservationTest.java
 * <p>
 * Measurements and simple assertions.
 * <p>
 * Measurements and simple assertions made about a patient, device or other subject.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class ObservationTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testObservation1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-genetics-1.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "55233-1");
        assertEquals(data.code.coding.get(0).display, "Genetic analysis master panel-- This is the parent OBR for the panel holding all of the associated observations that can be reported with a molecular genetics analysis result.");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsDNASequenceVariantName");
        assertEquals(data.extension.get(0).valueCodeableConcept.text, "NG_007726.3:g.146252T>G");
        assertEquals(data.extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsGene");
        assertEquals(data.extension.get(1).valueCodeableConcept.coding.get(0).code, "3236");
        assertEquals(data.extension.get(1).valueCodeableConcept.coding.get(0).display, "EGFR");
        assertEquals(data.extension.get(1).valueCodeableConcept.coding.get(0).system, "http://www.genenames.org");
        assertEquals(data.extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsDNARegionName");
        assertEquals(data.extension.get(2).valueString, "Exon 21");
        assertEquals(data.extension.get(3).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsGenomicSourceClass");
        assertEquals(data.extension.get(3).valueCodeableConcept.coding.get(0).code, "LA6684-0");
        assertEquals(data.extension.get(3).valueCodeableConcept.coding.get(0).display, "somatic");
        assertEquals(data.extension.get(3).valueCodeableConcept.coding.get(0).system, "http://loinc.org");
        assertEquals(data.id, "example-genetics-1");
        assertEquals(data.issued.toString(), "2013-04-03T15:30:10+01:00");
        assertEquals(data.performer.get(0).display, "Molecular Diagnostics Laboratory");
        assertEquals(data.performer.get(0).reference, "Practitioner/example");
        assertEquals(data.specimen.display, "Molecular Specimen ID: MLD45-Z4-1234");
        assertEquals(data.specimen.reference, "Specimen/genetics-example1-somatic");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.display, "Molecular Lab Patient ID: HOSP-23456");
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueCodeableConcept.coding.get(0).code, "10828004");
        assertEquals(data.valueCodeableConcept.coding.get(0).display, "Positive");
        assertEquals(data.valueCodeableConcept.coding.get(0).system, "http://snomed.info/sct");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-bmd.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.bodySite.coding.get(0).code, "71341001:272741003=7771000");
        assertEquals(data.bodySite.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.bodySite.text, "Left Femur");
        assertEquals(data.code.coding.get(0).code, "24701-5");
        assertEquals(data.code.coding.get(0).display, "Femur DXA Bone density");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "BMD - Left Femur");
        assertEquals(data.id, "bmd");
        assertEquals(data.performer.get(0).display, "Acme Imaging Diagnostics");
        assertEquals(data.performer.get(0).reference, "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/pat2");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "g/cm-2");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "g/cm²");
        assertEquals(data.valueQuantity.value.toString(), "0.887");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation3() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-respiratory-rate.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "vital-signs");
        assertEquals(data.category.get(0).coding.get(0).display, "Vital Signs");
        assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/observation-category");
        assertEquals(data.category.get(0).text, "Vital Signs");
        assertEquals(data.code.coding.get(0).code, "9279-1");
        assertEquals(data.code.coding.get(0).display, "Respiratory rate");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Respiratory rate");
        assertEquals(data.effectiveDateTime.toString(), "1999-07-02");
        assertEquals(data.id, "respiratory-rate");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/vitalsigns");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "/min");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "breaths/minute");
        assertEquals(data.valueQuantity.value.toString(), "26");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation4() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "vital-signs");
        assertEquals(data.category.get(0).coding.get(0).display, "Vital Signs");
        assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/observation-category");
        assertEquals(data.code.coding.get(0).code, "29463-7");
        assertEquals(data.code.coding.get(0).display, "Body Weight");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.coding.get(1).code, "3141-9");
        assertEquals(data.code.coding.get(1).display, "Body weight Measured");
        assertEquals(data.code.coding.get(1).system, "http://loinc.org");
        assertEquals(data.code.coding.get(2).code, "27113001");
        assertEquals(data.code.coding.get(2).display, "Body weight");
        assertEquals(data.code.coding.get(2).system, "http://snomed.info/sct");
        assertEquals(data.code.coding.get(3).code, "body-weight");
        assertEquals(data.code.coding.get(3).display, "Body Weight");
        assertEquals(data.code.coding.get(3).system, "http://acme.org/devices/clinical-codes");
        assertEquals(data.context.reference, "Encounter/example");
        assertEquals(data.effectiveDateTime.toString(), "2016-03-28");
        assertEquals(data.id, "example");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "[lb_av]");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "lbs");
        assertEquals(data.valueQuantity.value.toString(), "185");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation5() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-haplotype2.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "55233-1");
        assertEquals(data.code.coding.get(0).display, "Genetic analysis master panel-- This is the parent OBR for the panel holding all of the associated observations that can be reported with a molecular genetics analysis result.");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.extension.get(0).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsGene");
        assertEquals(data.extension.get(0).valueCodeableConcept.coding.get(0).code, "2623");
        assertEquals(data.extension.get(0).valueCodeableConcept.coding.get(0).display, "CYP2C9");
        assertEquals(data.extension.get(0).valueCodeableConcept.coding.get(0).system, "http://www.genenames.org");
        assertEquals(data.extension.get(1).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsSequence");
        assertEquals(data.extension.get(1).valueReference.reference, "Sequence/example-sequence1");
        assertEquals(data.extension.get(2).url, "http://hl7.org/fhir/StructureDefinition/observation-geneticsSequence");
        assertEquals(data.extension.get(2).valueReference.reference, "Sequence/example-sequence2");
        assertEquals(data.id, "example-haplotype2");
        assertEquals(data.issued.toString(), "2013-04-03T15:30:10+01:00");
        assertEquals(data.related.get(0).target.reference, "Sequence/example-pgx-1");
        assertEquals(data.related.get(0).type, CodeSystemObservationRelationshipType.DERIVED_FROM);
        assertEquals(data.related.get(1).target.reference, "Sequence/example-pgx-2");
        assertEquals(data.related.get(1).type, CodeSystemObservationRelationshipType.DERIVED_FROM);
        assertEquals(data.specimen.display, "Molecular Specimen ID: MLD45-Z4-1234");
        assertEquals(data.specimen.reference, "Specimen/genetics-example1-somatic");
        assertEquals(data.status, CodeSystemObservationStatus.UNKNOWN);
        assertEquals(data.subject.display, "J*********** C***********");
        assertEquals(data.subject.reference, "Patient/727127");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueCodeableConcept.coding.get(0).code, "PA16581679");
        assertEquals(data.valueCodeableConcept.coding.get(0).display, "*4");
        assertEquals(data.valueCodeableConcept.coding.get(0).system, "http://pharmakb.org");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation6() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-mbp.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "vital-signs");
        assertEquals(data.category.get(0).coding.get(0).display, "Vital Signs");
        assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/observation-category");
        assertEquals(data.category.get(0).text, "Vital Signs");
        assertEquals(data.code.coding.get(0).code, "8478-0");
        assertEquals(data.code.coding.get(0).display, "Mean blood pressure");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Mean blood pressure");
        assertEquals(data.effectiveDateTime.toString(), "1999-07-02");
        assertEquals(data.id, "mbp");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "mm[Hg]");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "mm[Hg]");
        assertEquals(data.valueQuantity.value.toString(), "80");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation7() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-bmi.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "vital-signs");
        assertEquals(data.category.get(0).coding.get(0).display, "Vital Signs");
        assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/observation-category");
        assertEquals(data.category.get(0).text, "Vital Signs");
        assertEquals(data.code.coding.get(0).code, "39156-5");
        assertEquals(data.code.coding.get(0).display, "Body mass index (BMI) [Ratio]");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "BMI");
        assertEquals(data.effectiveDateTime.toString(), "1999-07-02");
        assertEquals(data.id, "bmi");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/vitalsigns");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "kg/m2");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "kg/m2");
        assertEquals(data.valueQuantity.value.toString(), "16.2");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation8() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-body-height.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "vital-signs");
        assertEquals(data.category.get(0).coding.get(0).display, "Vital Signs");
        assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/observation-category");
        assertEquals(data.category.get(0).text, "Vital Signs");
        assertEquals(data.code.coding.get(0).code, "8302-2");
        assertEquals(data.code.coding.get(0).display, "Body height");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Body height");
        assertEquals(data.effectiveDateTime.toString(), "1999-07-02");
        assertEquals(data.id, "body-height");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/vitalsigns");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "[in_i]");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "in");
        assertEquals(data.valueQuantity.value.toString(), "66.899999999999991");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation9() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-eye-color.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.code.text, "eye color");
        assertEquals(data.effectiveDateTime.toString(), "2016-05-18");
        assertEquals(data.id, "eye-color");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueString, "blue");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testObservation10() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/observation-example-body-temperature.json");
        Observation data = parser.toFhir(Observation.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "vital-signs");
        assertEquals(data.category.get(0).coding.get(0).display, "Vital Signs");
        assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/observation-category");
        assertEquals(data.category.get(0).text, "Vital Signs");
        assertEquals(data.code.coding.get(0).code, "8310-5");
        assertEquals(data.code.coding.get(0).display, "Body temperature");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "Body temperature");
        assertEquals(data.effectiveDateTime.toString(), "1999-07-02");
        assertEquals(data.id, "body-temperature");
        assertEquals(data.meta.profile.get(0), "http://hl7.org/fhir/StructureDefinition/vitalsigns");
        assertEquals(data.status, CodeSystemObservationStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.valueQuantity.code, "Cel");
        assertEquals(data.valueQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.valueQuantity.unit, "C");
        assertEquals(data.valueQuantity.value.toString(), "36.5");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
