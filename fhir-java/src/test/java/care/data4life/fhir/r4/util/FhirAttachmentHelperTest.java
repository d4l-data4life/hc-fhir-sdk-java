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

package care.data4life.fhir.r4.util;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import care.data4life.fhir.r4.FhirR4Parser;
import care.data4life.fhir.r4.model.Attachment;
import care.data4life.fhir.r4.model.CarePlan;
import care.data4life.fhir.r4.model.DocumentReference;
import care.data4life.fhir.r4.model.Identifier;
import care.data4life.fhir.r4.model.Observation;
import care.data4life.fhir.r4.model.Patient;
import care.data4life.fhir.r4.model.QuestionnaireResponse;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class FhirAttachmentHelperTest {

    private static final String ADDITIONAL_ID = "additionalId";
    private static final String ASSIGNER = "assigner";
    private static final String DATA = "data";

    FhirR4Parser parser = new FhirR4Parser();

    //SUT
    String jsonPatient;
    String jsonCarePlan;
    String jsonObservation;
    String jsonQuestionnaireResponse;
    Attachment attachment;


    @Before
    public void setup() throws Exception {
        DocumentReference documentReference = parser.toFhir(DocumentReference.class, FileHelper.loadString("r4/documentreference-example.json"));
        attachment = documentReference.content.get(0).attachment;

        jsonPatient = FileHelper.loadString("r4/patient-example-b.json");
        jsonCarePlan = FileHelper.loadString("r4/careplan-example.json");
        jsonQuestionnaireResponse = FileHelper.loadString("r4/questionnaireresponse-example-gcs.json");
    }

    @Test
    public void hasAttachment_shouldReturnTrueWhenAttachment() throws Exception {
        //given
        Patient patient = parser.toFhir(Patient.class, jsonPatient);

        //when
        Boolean hasAttachment = FhirAttachmentHelper.hasAttachment(patient);

        //then
        assertEquals(hasAttachment, true);
    }

    @Test
    public void hasAttachment_shouldReturnFalseWhenNoAttachment() throws Exception {
        //given
        CarePlan carePlan = parser.toFhir(CarePlan.class, jsonCarePlan);


        //when
        Boolean hasAttachment = FhirAttachmentHelper.hasAttachment(carePlan);

        //then
        assertEquals(hasAttachment, false);
    }

    @Test
    public void getAttachments_shouldExtractAttachments() throws Exception {
        //given
        Patient patient = parser.toFhir(Patient.class, jsonPatient);

        //when
        List<Attachment> attachments = FhirAttachmentHelper.getAttachment(patient);

        //then
        assertEquals(attachments.size(), 1);
        assertEquals(attachments.get(0), patient.photo.get(0));
    }


    @Test
    public void getAttachments_shouldExtractAttachments_QuestionnaireResponse() throws Exception {
        //given
        QuestionnaireResponse response = parser.toFhir(QuestionnaireResponse.class, jsonQuestionnaireResponse);
        response.item.get(0).answer.get(0).valueAttachment = attachment;

        //when
        List<Attachment> attachments = FhirAttachmentHelper.getAttachment(response);

        //then
        assertEquals(attachments.size(), 1);
        assertEquals(attachments.get(0), response.item.get(0).answer.get(0).valueAttachment);
    }


    @Test
    public void setAttachmentData_shouldReplaceDataWhenRestore() throws Exception {
        //given
        Patient patient = parser.toFhir(Patient.class, jsonPatient);
        HashMap<Attachment, String> uploadData = new HashMap<>();
        uploadData.put(patient.photo.get(0), DATA);

        //when
        FhirAttachmentHelper.updateAttachmentData(patient, uploadData);

        //then
        assertEquals(patient.photo.size(), 1);
        assertEquals(patient.photo.get(0).data, DATA);
    }

    @Test
    public void setAttachmentData_shouldReplaceDataWhenRestore_QuestionnaireResponse() throws Exception {
        //given
        QuestionnaireResponse response = parser.toFhir(QuestionnaireResponse.class, jsonQuestionnaireResponse);
        response.item.get(0).answer.get(0).valueAttachment = attachment;
        HashMap<Attachment, String> uploadData = new HashMap<>();
        uploadData.put(response.item.get(0).answer.get(0).valueAttachment, DATA);

        //when
        FhirAttachmentHelper.updateAttachmentData(response, uploadData);

        //then
        assertNotNull(response.item.get(0).answer.get(0).valueAttachment);
        assertEquals(response.item.get(0).answer.get(0).valueAttachment.data, DATA);
    }

    @Test
    public void setAttachmentData_shouldDeleteDataWhenRemove() throws Exception {
        //given
        Patient patient = parser.toFhir(Patient.class, jsonPatient);
        HashMap<Attachment, String> uploadData = new HashMap<>();
        uploadData.put(patient.photo.get(0), null);

        //when
        FhirAttachmentHelper.updateAttachmentData(patient, uploadData);

        //then
        assertEquals(patient.photo.size(), 1);
        assertNull(patient.photo.get(0).data);
    }

    @Test
    public void setAttachmentData_shouldDeleteDataWhenRemove_QuestionnaireResponse() throws Exception {
        //given
        QuestionnaireResponse response = parser.toFhir(QuestionnaireResponse.class, jsonQuestionnaireResponse);
        response.item.get(0).answer.get(0).valueAttachment = attachment;
        HashMap<Attachment, String> uploadData = new HashMap<>();
        uploadData.put(response.item.get(0).answer.get(0).valueAttachment, null);

        //when
        FhirAttachmentHelper.updateAttachmentData(response, uploadData);

        //then
        assertNotNull(response.item.get(0).answer);
        assertNull(response.item.get(0).answer.get(0).valueAttachment.data);
    }


    @Test
    public void getIdentifier_shouldReturnIdentifier() throws Exception {
        //given
        Patient patient = parser.toFhir(Patient.class, jsonPatient);
        Identifier identifier = FhirAttachmentHelper.buildIdentifier(ADDITIONAL_ID, ASSIGNER);
        List<Identifier> identifiers = new ArrayList<>();
        identifiers.add(identifier);
        patient.identifier = identifiers;
        String newAdditionalId = "newAdditionalId";


        //when identifiers are null
        List<Identifier> result = FhirAttachmentHelper.getIdentifier(patient);

        //then
        assertEquals(result.size(), 1);
        assertEquals(result.get(0).value, identifier.value);
        assertEquals(result.get(0).assigner.reference, ASSIGNER);


        //when identifiers are not null
        FhirAttachmentHelper.appendIdentifier(patient, newAdditionalId, ASSIGNER);

        //then
        assertEquals(patient.identifier.size(), 2);
        assertEquals(patient.identifier.get(0), identifier);
        assertEquals(patient.identifier.get(1).value, newAdditionalId);
        assertEquals(patient.identifier.get(1).assigner.reference, ASSIGNER);
    }


    @Test
    public void appendIdentifier_shouldAppendIdentifier() throws Exception {
        //given
        Patient patient = parser.toFhir(Patient.class, jsonPatient);
        Identifier identifier = FhirAttachmentHelper.buildIdentifier(ADDITIONAL_ID, ASSIGNER);
        List<Identifier> identifiers = new ArrayList<>();
        identifiers.add(identifier);
        String newAdditionalId = "newAdditionalId";


        //when identifiers are null
        List<Identifier> result = FhirAttachmentHelper.getIdentifier(patient);
        patient.identifier = identifiers;

        //then
        //assertEquals(result.size(), 1);
        assertEquals(patient.identifier.get(0).value, ADDITIONAL_ID);
        assertEquals(patient.identifier.get(0).assigner.reference, ASSIGNER);


        //when identifiers are not null
        FhirAttachmentHelper.appendIdentifier(patient, newAdditionalId, ASSIGNER);

        //then
        assertEquals(patient.identifier.size(), 2);
        assertEquals(patient.identifier.get(0), identifier);
        assertEquals(patient.identifier.get(1).value, newAdditionalId);
        assertEquals(patient.identifier.get(1).assigner.reference, ASSIGNER);
    }

    @Test
    public void appendIdentifier_shouldAppendIdentifier_QuestionnaireResponse() throws Exception {
        //given
        QuestionnaireResponse response = parser.toFhir(QuestionnaireResponse.class, jsonQuestionnaireResponse);
        response.item.get(0).answer.get(0).valueAttachment = attachment;
        Identifier identifier = FhirAttachmentHelper.buildIdentifier(ADDITIONAL_ID, ASSIGNER);
        response.identifier = identifier;
        String newAdditionalId = "newAdditionalId";


        //when identifiers are null
        List<Identifier> result = FhirAttachmentHelper.getIdentifier(response);
        FhirAttachmentHelper.appendIdentifier(response, newAdditionalId, ASSIGNER);

        //then
        assertEquals(response.identifier.value, newAdditionalId);
        assertEquals(response.identifier.assigner.reference, ASSIGNER);


        //when identifiers are not null
        FhirAttachmentHelper.appendIdentifier(response, newAdditionalId, ASSIGNER);

        //then
        assertNotNull(response.identifier);
        assertEquals(response.identifier.value, newAdditionalId);
        assertEquals(response.identifier.assigner.reference, ASSIGNER);
    }

    @Test
    public void buildIdentifier_shouldBuildIdentifier() {
        //given
        String value = "value";

        //when
        Identifier identifier = FhirAttachmentHelper.buildIdentifier(value, ASSIGNER);

        //then
        assertEquals(identifier.value, value);
        assertEquals(identifier.assigner.reference, ASSIGNER);
    }


    @Test
    public void extractAttachments_shouldReturnEmpty_whenContentIsNull() {
        //given
        List<DocumentReference.DocumentReferenceContent> content = null;
        DocumentReference doc = new DocumentReference(null, content);

        //when
        List<Attachment> attachments = FhirAttachmentHelper.getAttachment(doc);

        //then
        assertEquals(attachments.size(), 0);
    }

    @Test
    public void extractAttachments_shouldReturnEmpty_whenContentIsEmpty() {
        //given
        List<DocumentReference.DocumentReferenceContent> content = new ArrayList<>();
        DocumentReference doc = new DocumentReference(null, content);

        //when
        List<Attachment> attachments = FhirAttachmentHelper.getAttachment(doc);

        //then
        assertEquals(attachments.size(), 0);
    }

    @Test
    public void extractAttachments_shouldReturnEmpty_whenItemIsEmpty() {
        //given
        List<QuestionnaireResponse.QuestionnaireResponseItem> items = new ArrayList<>();
        QuestionnaireResponse res = new QuestionnaireResponse(null);
        res.item = items;

        //when
        List<Attachment> attachments = FhirAttachmentHelper.getAttachment(res);

        //then
        assertEquals(attachments.size(), 0);
    }

    @Test
    public void extractAttachments_shouldReturnEmpty_whenItemAnswerIsNull() {
        //given
        List<QuestionnaireResponse.QuestionnaireResponseItem> items = new ArrayList<>();
        items.add(new QuestionnaireResponse.QuestionnaireResponseItem(""));
        QuestionnaireResponse res = new QuestionnaireResponse(null);
        res.item = items;

        //when
        List<Attachment> attachments = FhirAttachmentHelper.getAttachment(res);

        //then
        assertEquals(attachments.size(), 0);
    }
}
