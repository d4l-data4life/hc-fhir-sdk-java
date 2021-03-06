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
 * QuestionnaireTest.java
 * <p>
 * A structured set of questions.
 * <p>
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to
 * allow coherent, consistent data collection.
 * <p>
 * <p>
 * Generated from FHIR 3.0.1.11917
 */
public class QuestionnaireTest {

    FhirStu3Parser parser = new FhirStu3Parser();

    @Test
    public void testQuestionnaire1() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/questionnaire-example.json");
        Questionnaire data = parser.toFhir(Questionnaire.class, sourceJson);

        assertEquals(data.date.toString(), "2012-01");
        assertEquals(data.id, "3141");
        assertEquals(data.item.get(0).code.get(0).code, "COMORBIDITY");
        assertEquals(data.item.get(0).code.get(0).system, "http://example.org/system/code/sections");
        assertEquals(data.item.get(0).item.get(0).code.get(0).code, "COMORB");
        assertEquals(data.item.get(0).item.get(0).code.get(0).system, "http://example.org/system/code/questions");
        assertEquals(data.item.get(0).item.get(0).item.get(0).code.get(0).code, "CARDIAL");
        assertEquals(data.item.get(0).item.get(0).item.get(0).code.get(0).system, "http://example.org/system/code/sections");
        assertEquals(data.item.get(0).item.get(0).item.get(0).enableWhen.get(0).answerCoding.code, "Y");
        assertEquals(data.item.get(0).item.get(0).item.get(0).enableWhen.get(0).answerCoding.system, "http://hl7.org/fhir/v2/0136");
        assertEquals(data.item.get(0).item.get(0).item.get(0).enableWhen.get(0).question, "1.1");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).code.get(0).code, "COMORBCAR");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).code.get(0).system, "http://example.org/system/code/questions");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).code.get(0).code, "COMCAR00");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).code.get(0).display, "Angina Pectoris");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).code.get(0).system, "http://example.org/system/code/questions");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).code.get(1).code, "194828000");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).code.get(1).display, "Angina (disorder)");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).code.get(1).system, "http://snomed.info/sct");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).linkId, "1.1.1.1.1");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).options.reference, "http://hl7.org/fhir/ValueSet/yesnodontknow");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).prefix, "1.1.1");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).code.get(0).code, "22298006");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).code.get(0).display, "Myocardial infarction (disorder)");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).code.get(0).system, "http://snomed.info/sct");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).linkId, "1.1.1.1.2");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).options.reference, "http://hl7.org/fhir/ValueSet/yesnodontknow");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).prefix, "1.1.2");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).item.get(1).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).linkId, "1.1.1.1");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).options.reference, "http://hl7.org/fhir/ValueSet/yesnodontknow");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).prefix, "1.1");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(1).code.get(0).code, "COMORBVAS");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(1).code.get(0).system, "http://example.org/system/code/questions");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(1).linkId, "1.1.1.2");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(1).options.reference, "http://hl7.org/fhir/ValueSet/yesnodontknow");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(1).prefix, "1.2");
        assertEquals(data.item.get(0).item.get(0).item.get(0).item.get(1).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).item.get(0).item.get(0).linkId, "1.1.1");
        assertEquals(data.item.get(0).item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(0).item.get(0).linkId, "1.1");
        assertEquals(data.item.get(0).item.get(0).options.reference, "http://hl7.org/fhir/ValueSet/yesnodontknow");
        assertEquals(data.item.get(0).item.get(0).prefix, "1");
        assertEquals(data.item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).linkId, "1");
        assertEquals(data.item.get(0).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(1).code.get(0).code, "HISTOPATHOLOGY");
        assertEquals(data.item.get(1).code.get(0).system, "http://example.org/system/code/sections");
        assertEquals(data.item.get(1).item.get(0).code.get(0).code, "ABDOMINAL");
        assertEquals(data.item.get(1).item.get(0).code.get(0).system, "http://example.org/system/code/sections");
        assertEquals(data.item.get(1).item.get(0).item.get(0).code.get(0).code, "STADPT");
        assertEquals(data.item.get(1).item.get(0).item.get(0).code.get(0).display, "pT category");
        assertEquals(data.item.get(1).item.get(0).item.get(0).code.get(0).system, "http://example.org/system/code/questions");
        assertEquals(data.item.get(1).item.get(0).item.get(0).linkId, "2.1.2");
        assertEquals(data.item.get(1).item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(1).item.get(0).linkId, "2.1");
        assertEquals(data.item.get(1).item.get(0).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(1).linkId, "2");
        assertEquals(data.item.get(1).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.subjectType.get(0), CodeSystemResourceType.PATIENT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "Cancer Quality Forum Questionnaire 2012");
        assertEquals(data.url, "http://hl7.org/fhir/Questionnaire/3141");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testQuestionnaire2() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/questionnaire-example-f201-lifelines.json");
        Questionnaire data = parser.toFhir(Questionnaire.class, sourceJson);

        assertEquals(data.code.get(0).code, "VL 1-1, 18-65_1.2.2");
        assertEquals(data.code.get(0).display, "Lifelines Questionnaire 1 part 1");
        assertEquals(data.code.get(0).system, "http://example.org/system/code/lifelines/nl");
        assertEquals(data.date.toString(), "2010");
        assertEquals(data.id, "f201");
        assertEquals(data.item.get(0).linkId, "1");
        assertEquals(data.item.get(0).text, "Do you have allergies?");
        assertEquals(data.item.get(0).type, CodeSystemQuestionnaireItemType.BOOLEAN);
        assertEquals(data.item.get(1).item.get(0).linkId, "2.1");
        assertEquals(data.item.get(1).item.get(0).text, "What is your gender?");
        assertEquals(data.item.get(1).item.get(0).type, CodeSystemQuestionnaireItemType.STRING);
        assertEquals(data.item.get(1).item.get(1).linkId, "2.2");
        assertEquals(data.item.get(1).item.get(1).text, "What is your date of birth?");
        assertEquals(data.item.get(1).item.get(1).type, CodeSystemQuestionnaireItemType.DATE);
        assertEquals(data.item.get(1).item.get(2).linkId, "2.3");
        assertEquals(data.item.get(1).item.get(2).text, "What is your country of birth?");
        assertEquals(data.item.get(1).item.get(2).type, CodeSystemQuestionnaireItemType.STRING);
        assertEquals(data.item.get(1).item.get(3).linkId, "2.4");
        assertEquals(data.item.get(1).item.get(3).text, "What is your marital status?");
        assertEquals(data.item.get(1).item.get(3).type, CodeSystemQuestionnaireItemType.STRING);
        assertEquals(data.item.get(1).linkId, "2");
        assertEquals(data.item.get(1).text, "General questions");
        assertEquals(data.item.get(1).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(2).item.get(0).linkId, "3.1");
        assertEquals(data.item.get(2).item.get(0).text, "Do you smoke?");
        assertEquals(data.item.get(2).item.get(0).type, CodeSystemQuestionnaireItemType.BOOLEAN);
        assertEquals(data.item.get(2).item.get(1).linkId, "3.2");
        assertEquals(data.item.get(2).item.get(1).text, "Do you drink alchohol?");
        assertEquals(data.item.get(2).item.get(1).type, CodeSystemQuestionnaireItemType.BOOLEAN);
        assertEquals(data.item.get(2).linkId, "3");
        assertEquals(data.item.get(2).text, "Intoxications");
        assertEquals(data.item.get(2).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.status, CodeSystemPublicationStatus.ACTIVE);
        assertEquals(data.subjectType.get(0), CodeSystemResourceType.PATIENT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.url, "http://hl7.org/fhir/Questionnaire/f201");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testQuestionnaire3() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/questionnaire-example-gcs.json");
        Questionnaire data = parser.toFhir(Questionnaire.class, sourceJson);

        assertEquals(data.code.get(0).code, "9269-2");
        assertEquals(data.code.get(0).system, "http://loinc.org");
        assertEquals(data.contained.get(0).id, "motor");
        assertEquals(data.contained.get(1).id, "verbal");
        assertEquals(data.contained.get(2).id, "eye");
        assertEquals(data.date.toString(), "2015-08-03");
        assertEquals(data.id, "gcs");
        assertEquals(data.item.get(0).code.get(0).code, "9270-0");
        assertEquals(data.item.get(0).code.get(0).system, "http://loinc.org");
        assertEquals(data.item.get(0).linkId, "1.1");
        assertEquals(data.item.get(0).options.reference, "#verbal");
        assertEquals(data.item.get(0).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(1).code.get(0).code, "9268-4");
        assertEquals(data.item.get(1).code.get(0).system, "http://loinc.org");
        assertEquals(data.item.get(1).linkId, "1.2");
        assertEquals(data.item.get(1).options.reference, "#motor");
        assertEquals(data.item.get(1).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(2).code.get(0).code, "9267-6");
        assertEquals(data.item.get(2).code.get(0).system, "http://loinc.org");
        assertEquals(data.item.get(2).linkId, "1.3");
        assertEquals(data.item.get(2).options.reference, "#eye");
        assertEquals(data.item.get(2).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.publisher, "FHIR Project team");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.subjectType.get(0), CodeSystemResourceType.PATIENT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "Glasgow Coma Score");
        assertEquals(data.url, "http://hl7.org/fhir/Questionnaire/gcs");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testQuestionnaire4() throws Exception {
        String sourceJson = FileHelper.loadString("stu3/questionnaire-example-bluebook.json");
        Questionnaire data = parser.toFhir(Questionnaire.class, sourceJson);

        assertEquals(data.date.toString(), "2013-02-19");
        assertEquals(data.id, "bb");
        assertEquals(data.item.get(0).item.get(0).item.get(0).linkId, "nameOfChild");
        assertEquals(data.item.get(0).item.get(0).item.get(0).text, "Name of child");
        assertEquals(data.item.get(0).item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.STRING);
        assertEquals(data.item.get(0).item.get(0).item.get(1).linkId, "sex");
        assertEquals(data.item.get(0).item.get(0).item.get(1).option.get(0).valueCoding.code, "F");
        assertEquals(data.item.get(0).item.get(0).item.get(1).option.get(1).valueCoding.code, "M");
        assertEquals(data.item.get(0).item.get(0).item.get(1).text, "Sex");
        assertEquals(data.item.get(0).item.get(0).item.get(1).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).item.get(0).linkId, "group");
        assertEquals(data.item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(0).item.get(1).item.get(0).linkId, "birthWeight");
        assertEquals(data.item.get(0).item.get(1).item.get(0).text, "Birth weight (kg)");
        assertEquals(data.item.get(0).item.get(1).item.get(0).type, CodeSystemQuestionnaireItemType.DECIMAL);
        assertEquals(data.item.get(0).item.get(1).item.get(1).linkId, "birthLength");
        assertEquals(data.item.get(0).item.get(1).item.get(1).text, "Birth length (cm)");
        assertEquals(data.item.get(0).item.get(1).item.get(1).type, CodeSystemQuestionnaireItemType.DECIMAL);
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).enableWhen.get(0).hasAnswer, true);
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).enableWhen.get(0).question, "vitaminKgiven");
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).item.get(0).linkId, "vitaminiKDose1");
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).item.get(0).text, "1st dose");
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).item.get(0).type, CodeSystemQuestionnaireItemType.DATETIME);
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).item.get(1).linkId, "vitaminiKDose2");
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).item.get(1).text, "2nd dose");
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).item.get(1).type, CodeSystemQuestionnaireItemType.DATETIME);
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).linkId, "vitaminKgivenDoses");
        assertEquals(data.item.get(0).item.get(1).item.get(2).item.get(0).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(0).item.get(1).item.get(2).linkId, "vitaminKgiven");
        assertEquals(data.item.get(0).item.get(1).item.get(2).option.get(0).valueCoding.code, "INJECTION");
        assertEquals(data.item.get(0).item.get(1).item.get(2).option.get(1).valueCoding.code, "INTRAVENOUS");
        assertEquals(data.item.get(0).item.get(1).item.get(2).option.get(2).valueCoding.code, "ORAL");
        assertEquals(data.item.get(0).item.get(1).item.get(2).text, "Vitamin K given");
        assertEquals(data.item.get(0).item.get(1).item.get(2).type, CodeSystemQuestionnaireItemType.CHOICE);
        assertEquals(data.item.get(0).item.get(1).item.get(3).item.get(0).linkId, "hepBgivenDate");
        assertEquals(data.item.get(0).item.get(1).item.get(3).item.get(0).text, "Date given");
        assertEquals(data.item.get(0).item.get(1).item.get(3).item.get(0).type, CodeSystemQuestionnaireItemType.DATE);
        assertEquals(data.item.get(0).item.get(1).item.get(3).linkId, "hepBgiven");
        assertEquals(data.item.get(0).item.get(1).item.get(3).text, "Hep B given y / n");
        assertEquals(data.item.get(0).item.get(1).item.get(3).type, CodeSystemQuestionnaireItemType.BOOLEAN);
        assertEquals(data.item.get(0).item.get(1).item.get(4).linkId, "abnormalitiesAtBirth");
        assertEquals(data.item.get(0).item.get(1).item.get(4).text, "Abnormalities noted at birth");
        assertEquals(data.item.get(0).item.get(1).item.get(4).type, CodeSystemQuestionnaireItemType.STRING);
        assertEquals(data.item.get(0).item.get(1).linkId, "neonatalInformation");
        assertEquals(data.item.get(0).item.get(1).text, "Neonatal Information");
        assertEquals(data.item.get(0).item.get(1).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.item.get(0).linkId, "birthDetails");
        assertEquals(data.item.get(0).text, "Birth details - To be completed by health professional");
        assertEquals(data.item.get(0).type, CodeSystemQuestionnaireItemType.GROUP);
        assertEquals(data.jurisdiction.get(0).coding.get(0).code, "AU");
        assertEquals(data.jurisdiction.get(0).coding.get(0).system, "urn:iso:std:iso:3166");
        assertEquals(data.publisher, "New South Wales Department of Health");
        assertEquals(data.status, CodeSystemPublicationStatus.DRAFT);
        assertEquals(data.subjectType.get(0), CodeSystemResourceType.PATIENT);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.title, "NSW Government My Personal Health Record");
        assertEquals(data.url, "http://hl7.org/fhir/Questionnaire/bb");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
