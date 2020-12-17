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

package care.data4life.fhir.r4;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import care.data4life.fhir.FhirException;
import care.data4life.fhir.r4.model.Attachment;
import care.data4life.fhir.r4.model.CodeSystemDiagnosticReportStatus;
import care.data4life.fhir.r4.model.CodeSystemDocumentReferenceStatus;
import care.data4life.fhir.r4.model.CodeableConcept;
import care.data4life.fhir.r4.model.DiagnosticReport;
import care.data4life.fhir.r4.model.DocumentReference;
import care.data4life.fhir.r4.model.Observation;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FhirStu4ParserTest {


    // SUT
    private FhirR4Parser parser;


    @Before
    public void setup() {
        parser = new FhirR4Parser();
    }


    @Test
    public void toFhir_shouldThrowException_whenMalformedJson() throws Exception {
        try {
            parser.toFhir(DocumentReference.class, "malformed");
        } catch (FhirException exception) {
            assertEquals(FhirException.ErrorType.DECODE, exception.getType());
            assertEquals(FhirException.ErrorCode.FAILED_TO_PARSE_JSON, exception.getCode());
        }
    }

    @Test
    public void toFhir_shouldParse_whenFhirTypeKnown() throws Exception {
        String documentReferenceJson = FileHelper.loadString("r4/documentreference-example.json");
        String observationJson = FileHelper.loadString("r4/observation-example.json");

        assertNotNull(parser.toFhir(DocumentReference.class, documentReferenceJson));
        assertNotNull(parser.toFhir(Observation.class, observationJson));
    }

    @Test
    public void fromFhir_shouldReturnJson_whenFhirTypeKnown() throws Exception {
        List<DocumentReference.DocumentReferenceContent> documentReferenceContentList = new ArrayList<>();
        documentReferenceContentList.add(new DocumentReference.DocumentReferenceContent(new Attachment()));

        DocumentReference documentReference = new DocumentReference(
                CodeSystemDocumentReferenceStatus.CURRENT,
                documentReferenceContentList
        );
        assertNotNull(parser.fromFhir(documentReference));


        DiagnosticReport diagnosticReport = new DiagnosticReport(CodeSystemDiagnosticReportStatus.APPENDED, new CodeableConcept());
        assertNotNull(parser.fromFhir(diagnosticReport));
    }
}
