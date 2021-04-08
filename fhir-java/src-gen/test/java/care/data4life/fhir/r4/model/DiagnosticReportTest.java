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
 * DiagnosticReportTest.java
 * <p>
 * A Diagnostic report - a combination of request information, atomic results, images,
 * interpretation, as well as formatted reports.
 * <p>
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients,
 * devices, and locations, and/or specimens derived from these. The report includes clinical context
 * such as requesting and provider information, and some mix of atomic results, images, textual and
 * coded interpretations, and formatted representation of diagnostic reports.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45 on 2021-04-08
 */
public class DiagnosticReportTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testDiagnosticReport1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/diagnosticreport-example-ultrasound.json");
        DiagnosticReport data = parser.toFhir(DiagnosticReport.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "394914008");
        assertEquals(data.category.get(0).coding.get(0).display, "Radiology");
        assertEquals(data.category.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.category.get(0).coding.get(1).code, "RAD");
        assertEquals(data.category.get(0).coding.get(1).system, "http://terminology.hl7.org/CodeSystem/v2-0074");
        assertEquals(data.code.coding.get(0).code, "45036003");
        assertEquals(data.code.coding.get(0).display, "Ultrasonography of abdomen");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "Abdominal Ultrasound");
        assertEquals(data.conclusion, "Unremarkable study");
        assertEquals(data.effectiveDateTime.toString(), "2012-12-01T12:00:00+01:00");
        assertEquals(data.id, "ultrasound");
        assertEquals(data.issued.toString(), "2012-12-01T12:00:00+01:00");
        assertEquals(data.media.get(0).comment, "A comment about the image");
        assertEquals(data.media.get(0).link.display, "WADO example image");
        assertEquals(data.media.get(0).link.reference, "Media/1.2.840.11361907579238403408700.3.1.04.19970327150033");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemDiagnosticReportStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testDiagnosticReport2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/diagnosticreport-example-f201-brainct.json");
        DiagnosticReport data = parser.toFhir(DiagnosticReport.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "394914008");
        assertEquals(data.category.get(0).coding.get(0).display, "Radiology");
        assertEquals(data.category.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.category.get(0).coding.get(1).code, "RAD");
        assertEquals(data.category.get(0).coding.get(1).system, "http://terminology.hl7.org/CodeSystem/v2-0074");
        assertEquals(data.code.coding.get(0).code, "429858000");
        assertEquals(data.code.coding.get(0).display, "Computed tomography (CT) of head and neck");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.code.text, "CT of head-neck");
        assertEquals(data.conclusion, "CT brains: large tumor sphenoid/clivus.");
        assertEquals(data.conclusionCode.get(0).coding.get(0).code, "188340000");
        assertEquals(data.conclusionCode.get(0).coding.get(0).display, "Malignant tumor of craniopharyngeal duct");
        assertEquals(data.conclusionCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.effectiveDateTime.toString(), "2012-12-01T12:00:00+01:00");
        assertEquals(data.id, "f201");
        assertEquals(data.imagingStudy.get(0).display, "HEAD and NECK CT DICOM imaging study");
        assertEquals(data.issued.toString(), "2012-12-01T12:00:00+01:00");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).display, "Blijdorp MC");
        assertEquals(data.performer.get(0).reference, "Organization/f203");
        assertEquals(data.status, CodeSystemDiagnosticReportStatus.FINAL);
        assertEquals(data.subject.display, "Roel");
        assertEquals(data.subject.reference, "Patient/f201");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testDiagnosticReport3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/diagnosticreport-example-papsmear.json");
        DiagnosticReport data = parser.toFhir(DiagnosticReport.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "47527-7");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.effectiveDateTime.toString(), "2013-02-11T10:33:33+11:00");
        assertEquals(data.id, "pap");
        assertEquals(data.issued.toString(), "2013-02-13T11:45:33+11:00");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).reference, "Practitioner/example");
        assertEquals(data.status, CodeSystemDiagnosticReportStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.ADDITIONAL);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testDiagnosticReport4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/diagnosticreport-example-gingival-mass.json");
        DiagnosticReport data = parser.toFhir(DiagnosticReport.class, sourceJson);

        assertEquals(data.category.get(0).coding.get(0).code, "PAT");
        assertEquals(data.category.get(0).coding.get(0).display, "Pathology (gross & histopath, not surgical)");
        assertEquals(data.category.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0074");
        assertEquals(data.category.get(0).text, "Pathology");
        assertEquals(data.code.coding.get(0).code, "4503");
        assertEquals(data.code.coding.get(0).display, "Biopsy without Microscopic Description (1 Site/Lesion)-Standard");
        assertEquals(data.code.coding.get(0).system, "https://www.acmeonline.com");
        assertEquals(data.code.text, "Biopsy without Microscopic Description (1 Site/Lesion)-Standard");
        assertEquals(data.effectiveDateTime.toString(), "2017-03-02");
        assertEquals(data.id, "gingival-mass");
        assertEquals(data.identifier.get(0).system, "https://www.acmeonline.com");
        assertEquals(data.identifier.get(0).value, "P73456090");
        assertEquals(data.issued.toString(), "2017-03-15T08:13:08Z");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).display, "Acme Animal Labs");
        assertEquals(data.presentedForm.get(0).contentType, "application/pdf");
        assertEquals(data.presentedForm.get(0).language, "en");
        assertEquals(data.presentedForm.get(0).title, "LAB ID: P73456090 MAX JONES Biopsy without Microscopic Description (1 Site/Lesion)-Standard");
        assertEquals(data.status, CodeSystemDiagnosticReportStatus.FINAL);
        assertEquals(data.subject.display, "Max Jones");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testDiagnosticReport5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/diagnosticreport-example-pgx.json");
        DiagnosticReport data = parser.toFhir(DiagnosticReport.class, sourceJson);

        assertEquals(data.basedOn.get(0).reference, "ServiceRequest/example-pgx");
        assertEquals(data.code.coding.get(0).code, "PGxReport");
        assertEquals(data.code.coding.get(0).display, "Pharmacogenetics Report");
        assertEquals(data.code.coding.get(0).system, "https://system/PGxReport");
        assertEquals(data.code.text, "Pharmacogenetics Report");
        assertEquals(data.effectiveDateTime.toString(), "2016-10-15T12:34:56+11:00");
        assertEquals(data.id, "example-pgx");
        assertEquals(data.issued.toString(), "2016-10-20T14:00:05+11:00");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).reference, "Organization/4829");
        assertEquals(data.presentedForm.get(0).contentType, "application/pdf");
        assertEquals(data.presentedForm.get(0).creation.toString(), "2016-10-20T20:00:00+11:00");
        assertEquals(data.presentedForm.get(0).data, "cGRmSW5CYXNlNjRCaW5hcnk=");
        assertEquals(data.presentedForm.get(0).hash, "571ef9c5655840f324e679072ed62b1b95eef8a0");
        assertEquals(data.presentedForm.get(0).language, "en");
        assertEquals(data.presentedForm.get(0).title, "Pharmacogenetics Report");
        assertEquals(data.result.get(0).reference, "Observation/example-phenotype");
        assertEquals(data.status, CodeSystemDiagnosticReportStatus.FINAL);
        assertEquals(data.subject.display, "Bob Smith");
        assertEquals(data.subject.reference, "Patient/899962");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testDiagnosticReport6() throws Exception {
        String sourceJson = FileHelper.loadString("r4/diagnosticreport-example-dxa.json");
        DiagnosticReport data = parser.toFhir(DiagnosticReport.class, sourceJson);

        assertEquals(data.code.coding.get(0).code, "38269-7");
        assertEquals(data.code.coding.get(0).system, "http://loinc.org");
        assertEquals(data.code.text, "DXA BONE DENSITOMETRY");
        assertEquals(data.conclusionCode.get(0).coding.get(0).code, "391040000");
        assertEquals(data.conclusionCode.get(0).coding.get(0).display, "At risk of osteoporotic fracture");
        assertEquals(data.conclusionCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.effectiveDateTime.toString(), "2008-06-17");
        assertEquals(data.id, "102");
        assertEquals(data.issued.toString(), "2008-06-18T09:23:00+10:00");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.performer.get(0).display, "Dr Henry Seven");
        assertEquals(data.performer.get(0).reference, "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809");
        assertEquals(data.result.get(0).reference, "Observation/bmd");
        assertEquals(data.status, CodeSystemDiagnosticReportStatus.FINAL);
        assertEquals(data.subject.reference, "Patient/pat2");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
