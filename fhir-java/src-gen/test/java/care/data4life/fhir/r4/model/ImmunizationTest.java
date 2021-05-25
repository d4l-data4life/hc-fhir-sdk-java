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
 * ImmunizationTest.java
 * <p>
 * Immunization event information.
 * <p>
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 * <p>
 * <p>
 * "Generated from FHIR 4.0.1-9346c8cc45
 */
public class ImmunizationTest {

    FhirR4Parser parser = new FhirR4Parser();

    @Test
    public void testImmunization1() throws Exception {
        String sourceJson = FileHelper.loadString("r4/immunization-example.json");
        Immunization data = parser.toFhir(Immunization.class, sourceJson);

        assertEquals(data.doseQuantity.code, "mg");
        assertEquals(data.doseQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.doseQuantity.value.toString(), "5");
        assertEquals(data.education.get(0).documentType, "253088698300010311120702");
        assertEquals(data.education.get(0).presentationDate.toString(), "2013-01-10");
        assertEquals(data.education.get(0).publicationDate.toString(), "2012-07-02");
        assertEquals(data.encounter.reference, "Encounter/example");
        assertEquals(data.expirationDate.toString(), "2015-02-15");
        assertEquals(data.fundingSource.coding.get(0).code, "private");
        assertEquals(data.fundingSource.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-funding-source");
        assertEquals(data.id, "example");
        assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
        assertEquals(data.identifier.get(0).value, "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234");
        assertEquals(data.isSubpotent, true);
        assertEquals(data.location.reference, "Location/1");
        assertEquals(data.lotNumber, "AAJN11K");
        assertEquals(data.manufacturer.reference, "Organization/hl7");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Notes on adminstration of vaccine");
        assertEquals(data.occurrenceDateTime.toString(), "2013-01-10");
        assertEquals(data.patient.reference, "Patient/example");
        assertEquals(data.performer.get(0).actor.reference, "Practitioner/example");
        assertEquals(data.performer.get(0).function.coding.get(0).code, "OP");
        assertEquals(data.performer.get(0).function.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0443");
        assertEquals(data.performer.get(1).actor.reference, "Practitioner/example");
        assertEquals(data.performer.get(1).function.coding.get(0).code, "AP");
        assertEquals(data.performer.get(1).function.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0443");
        assertEquals(data.primarySource, true);
        assertEquals(data.programEligibility.get(0).coding.get(0).code, "ineligible");
        assertEquals(data.programEligibility.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility");
        assertEquals(data.reasonCode.get(0).coding.get(0).code, "429060002");
        assertEquals(data.reasonCode.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.route.coding.get(0).code, "IM");
        assertEquals(data.route.coding.get(0).display, "Injection, intramuscular");
        assertEquals(data.route.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration");
        assertEquals(data.site.coding.get(0).code, "LA");
        assertEquals(data.site.coding.get(0).display, "left arm");
        assertEquals(data.site.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActSite");
        assertEquals(data.status, CodeSystemEventStatus.COMPLETED);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.vaccineCode.coding.get(0).code, "FLUVAX");
        assertEquals(data.vaccineCode.coding.get(0).system, "urn:oid:1.2.36.1.2001.1005.17");
        assertEquals(data.vaccineCode.text, "Fluvax (Influenza)");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testImmunization2() throws Exception {
        String sourceJson = FileHelper.loadString("r4/immunization-example-historical.json");
        Immunization data = parser.toFhir(Immunization.class, sourceJson);

        assertEquals(data.id, "historical");
        assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
        assertEquals(data.identifier.get(0).value, "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234");
        assertEquals(data.location.reference, "Location/1");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Notes on adminstration of a historical vaccine");
        assertEquals(data.occurrenceString, "January 2012");
        assertEquals(data.patient.reference, "Patient/example");
        assertEquals(data.primarySource, false);
        assertEquals(data.reportOrigin.coding.get(0).code, "record");
        assertEquals(data.reportOrigin.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-origin");
        assertEquals(data.reportOrigin.text, "Written Record");
        assertEquals(data.status, CodeSystemEventStatus.COMPLETED);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.vaccineCode.coding.get(0).code, "GNFLU");
        assertEquals(data.vaccineCode.coding.get(0).system, "urn:oid:1.2.36.1.2001.1005.17");
        assertEquals(data.vaccineCode.text, "Influenza");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testImmunization3() throws Exception {
        String sourceJson = FileHelper.loadString("r4/immunization-example-protocol.json");
        Immunization data = parser.toFhir(Immunization.class, sourceJson);

        assertEquals(data.doseQuantity.code, "mg");
        assertEquals(data.doseQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.doseQuantity.value.toString(), "5");
        assertEquals(data.encounter.reference, "Encounter/example");
        assertEquals(data.expirationDate.toString(), "2018-12-15");
        assertEquals(data.fundingSource.coding.get(0).code, "private");
        assertEquals(data.fundingSource.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-funding-source");
        assertEquals(data.id, "protocol");
        assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
        assertEquals(data.identifier.get(0).value, "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234");
        assertEquals(data.isSubpotent, false);
        assertEquals(data.location.reference, "Location/1");
        assertEquals(data.lotNumber, "PT123F");
        assertEquals(data.manufacturer.reference, "Organization/hl7");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.occurrenceDateTime.toString(), "2018-06-18");
        assertEquals(data.patient.reference, "Patient/example");
        assertEquals(data.performer.get(0).actor.reference, "Practitioner/example");
        assertEquals(data.performer.get(0).function.coding.get(0).code, "OP");
        assertEquals(data.performer.get(0).function.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0443");
        assertEquals(data.performer.get(1).actor.reference, "Practitioner/example");
        assertEquals(data.performer.get(1).function.coding.get(0).code, "AP");
        assertEquals(data.performer.get(1).function.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0443");
        assertEquals(data.primarySource, true);
        assertEquals(data.programEligibility.get(0).coding.get(0).code, "ineligible");
        assertEquals(data.programEligibility.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility");
        assertTrue(data.protocolApplied.get(0).doseNumberPositiveInt == 1);
        assertEquals(data.protocolApplied.get(0).series, "2-dose");
        assertEquals(data.protocolApplied.get(0).targetDisease.get(0).coding.get(0).code, "40468003");
        assertEquals(data.protocolApplied.get(0).targetDisease.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertTrue(data.protocolApplied.get(1).doseNumberPositiveInt == 2);
        assertEquals(data.protocolApplied.get(1).series, "3-dose");
        assertEquals(data.protocolApplied.get(1).targetDisease.get(0).coding.get(0).code, "66071002");
        assertEquals(data.protocolApplied.get(1).targetDisease.get(0).coding.get(0).system, "http://snomed.info/sct");
        assertEquals(data.route.coding.get(0).code, "IM");
        assertEquals(data.route.coding.get(0).display, "Injection, intramuscular");
        assertEquals(data.route.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration");
        assertEquals(data.site.coding.get(0).code, "LA");
        assertEquals(data.site.coding.get(0).display, "left arm");
        assertEquals(data.site.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActSite");
        assertEquals(data.status, CodeSystemEventStatus.COMPLETED);
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.vaccineCode.coding.get(0).code, "104");
        assertEquals(data.vaccineCode.coding.get(0).system, "http://hl7.org/fhir/sid/cvx");
        assertEquals(data.vaccineCode.text, "Twinrix (HepA/HepB)");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testImmunization4() throws Exception {
        String sourceJson = FileHelper.loadString("r4/immunization-example-refused.json");
        Immunization data = parser.toFhir(Immunization.class, sourceJson);

        assertEquals(data.id, "notGiven");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.occurrenceDateTime.toString(), "2013-01-10");
        assertEquals(data.patient.reference, "Patient/example");
        assertEquals(data.primarySource, true);
        assertEquals(data.status, CodeSystemEventStatus.NOT_DONE);
        assertEquals(data.statusReason.coding.get(0).code, "MEDPREC");
        assertEquals(data.statusReason.coding.get(0).display, "medical precaution");
        assertEquals(data.statusReason.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.vaccineCode.coding.get(0).code, "01");
        assertEquals(data.vaccineCode.coding.get(0).display, "DTP");
        assertEquals(data.vaccineCode.coding.get(0).system, "http://hl7.org/fhir/sid/cvx");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }

    @Test
    public void testImmunization5() throws Exception {
        String sourceJson = FileHelper.loadString("r4/immunization-example-subpotent.json");
        Immunization data = parser.toFhir(Immunization.class, sourceJson);

        assertEquals(data.doseQuantity.code, "ml");
        assertEquals(data.doseQuantity.system, "http://unitsofmeasure.org");
        assertEquals(data.doseQuantity.value.toString(), "0.5");
        assertEquals(data.education.get(0).documentType, "253088698300010311120702");
        assertEquals(data.education.get(0).presentationDate.toString(), "2013-01-10");
        assertEquals(data.education.get(0).publicationDate.toString(), "2012-07-02");
        assertEquals(data.encounter.reference, "Encounter/example");
        assertEquals(data.expirationDate.toString(), "2015-02-28");
        assertEquals(data.fundingSource.coding.get(0).code, "private");
        assertEquals(data.fundingSource.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-funding-source");
        assertEquals(data.id, "subpotent");
        assertEquals(data.identifier.get(0).system, "urn:ietf:rfc:3986");
        assertEquals(data.identifier.get(0).value, "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234");
        assertEquals(data.isSubpotent, false);
        assertEquals(data.location.reference, "Location/1");
        assertEquals(data.lotNumber, "AAJN11K");
        assertEquals(data.manufacturer.reference, "Organization/hl7");
        assertEquals(data.meta.tag.get(0).code, "HTEST");
        assertEquals(data.meta.tag.get(0).display, "test health data");
        assertEquals(data.meta.tag.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActReason");
        assertEquals(data.note.get(0).text, "Notes on adminstration of vaccine");
        assertEquals(data.occurrenceDateTime.toString(), "2015-01-15");
        assertEquals(data.patient.reference, "Patient/example");
        assertEquals(data.performer.get(0).actor.reference, "Practitioner/example");
        assertEquals(data.performer.get(0).function.coding.get(0).code, "OP");
        assertEquals(data.performer.get(0).function.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0443");
        assertEquals(data.performer.get(1).actor.reference, "Practitioner/example");
        assertEquals(data.performer.get(1).function.coding.get(0).code, "AP");
        assertEquals(data.performer.get(1).function.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v2-0443");
        assertEquals(data.primarySource, true);
        assertEquals(data.programEligibility.get(0).coding.get(0).code, "ineligible");
        assertEquals(data.programEligibility.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility");
        assertEquals(data.route.coding.get(0).code, "IM");
        assertEquals(data.route.coding.get(0).display, "Injection, intramuscular");
        assertEquals(data.route.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration");
        assertEquals(data.site.coding.get(0).code, "LT");
        assertEquals(data.site.coding.get(0).display, "left thigh");
        assertEquals(data.site.coding.get(0).system, "http://terminology.hl7.org/CodeSystem/v3-ActSite");
        assertEquals(data.status, CodeSystemEventStatus.COMPLETED);
        assertEquals(data.subpotentReason.get(0).coding.get(0).code, "partial");
        assertEquals(data.subpotentReason.get(0).coding.get(0).system, "http://terminology.hl7.org/CodeSystem/immunization-subpotent-reason");
        assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);
        assertEquals(data.vaccineCode.coding.get(0).code, "GNHEP");
        assertEquals(data.vaccineCode.coding.get(0).system, "urn:oid:1.2.36.1.2001.1005.17");
        assertEquals(data.vaccineCode.text, "Hepatitis B");

        String json = parser.fromFhir(data);

        JSONAssert.assertEquals(sourceJson, json, false);
    }
}
