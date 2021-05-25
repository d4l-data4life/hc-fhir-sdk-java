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
 * AllergyIntoleranceTest.java
 * <p>
 * Allergy or Intolerance (generally: Risk of adverse reaction to a substance).
 * <p>
 * Risk of harmful or undesirable, physiological response which is unique to an individual and
 * associated with exposure to a substance.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class AllergyIntoleranceTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testAllergyIntolerance1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/allergyintolerance-example.json");
        AllergyIntolerance data = parser.toFhir(AllergyIntolerance.class, sourceJson);

        assertEquals(data.asserter.reference, "Patient/example");
        assertEquals(data.category.get(0), CodeSystemAllergyIntoleranceCategory.FOOD);
        assertEquals(data.clinicalStatus.coding.get(0).code, "active");
        assertEquals(data.clinicalStatus.coding.get(0).display, "Active");
        assertEquals(data.clinicalStatus.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical");
        assertEquals(data.code.coding.get(0).code, "227493005");
        assertEquals(data.code.coding.get(0).display, "Cashew nuts");
        assertEquals(data.code.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.criticality, CodeSystemAllergyIntoleranceCriticality.HIGH);
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "http://acme.com/ids/patients/risks");
        assertEquals(data.identifier.get(0).value, "49476534");
        assertEquals(data.lastOccurrence.toString(), "2012-06");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "The criticality is high becasue of the observed anaphylactic reaction when challenged with cashew extract.");
        assertEquals(data.onsetDateTime.toString(), "2004");
        assertEquals(data.patient.reference, "Patient/example");
        assertEquals(data.reaction.get(0).description, "Challenge Protocol. Severe reaction to subcutaneous cashew extract. Epinephrine administered");
        assertEquals(data.reaction.get(0).exposureRoute.coding.get(0).code, "34206005");
        assertEquals(data.reaction.get(0).exposureRoute.coding.get(0).display, "Subcutaneous route");
        assertEquals(data.reaction.get(0).exposureRoute.coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reaction.get(0).manifestation.get(0).coding.get(0).code, "39579001");
        assertEquals(data.reaction.get(0).manifestation.get(0).coding.get(0).display, "Anaphylactic reaction");
        assertEquals(data.reaction.get(0).manifestation.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reaction.get(0).onset.toString(), "2012-06-12");
        assertEquals(data.reaction.get(0).severity, CodeSystemAllergyIntoleranceSeverity.SEVERE);
        assertEquals(data.reaction.get(0).substance.coding.get(0).code, "1160593");
        assertEquals(data.reaction.get(0).substance.coding.get(0).display, "cashew nut allergenic extract Injectable Product");
        assertEquals(data.reaction.get(0).substance.coding.get(0).system, "http://www.nlm.nih.gov/research/umls/rxnorm");
        assertEquals(data.reaction.get(1).manifestation.get(0).coding.get(0).code, "64305001");
        assertEquals(data.reaction.get(1).manifestation.get(0).coding.get(0).display, "Urticaria");
        assertEquals(data.reaction.get(1).manifestation.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.reaction.get(1).note.get(0).text, "The patient reports that the onset of urticaria was within 15 minutes of eating cashews.");
        assertEquals(data.reaction.get(1).onset.toString(), "2004");
        assertEquals(data.reaction.get(1).severity, CodeSystemAllergyIntoleranceSeverity.MODERATE);
        assertEquals(data.recordedDate.toString(), "2014-10-09T14:58:00+11:00");
        assertEquals(data.recorder.reference, "Practitioner/example");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.type, CodeSystemAllergyIntoleranceType.ALLERGY);
        assertEquals(data.verificationStatus.coding.get(0).code, "confirmed");
        assertEquals(data.verificationStatus.coding.get(0).display, "Confirmed");
        assertEquals(data.verificationStatus.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/allergyintolerance-verification");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
