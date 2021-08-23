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


import javax.annotation.Nullable;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.Date;

import care.data4life.fhir.stu3.FhirStu3Parser;
import care.data4life.fhir.test.util.FileHelper;

import static org.junit.Assert.*;

/**
 * ConsentTest.java
 *
 * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time.
 *
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 *
 *
 * Generated from FHIR 3.0.1.11917
 */
public class ConsentTest {

	FhirStu3Parser parser = new FhirStu3Parser();

    @Test
	public void testConsent1() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-notThis.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2015-11-18");
		assertEquals(data.except.get(0).data.get(0).meaning, CodeSystemConsentDataMeaning.RELATED);
		assertEquals(data.except.get(0).data.get(0).reference.reference, "Task/f201");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.DENY);
		assertEquals(data.id, "consent-example-notThis");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent2() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-smartonfhir.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.consentingParty.get(0).reference, "RelatedPerson/peter");
		assertEquals(data.dateTime.toString(), "2016-06-23T17:02:33+10:00");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).clazz.get(0).code, "MedicationRequest");
		assertEquals(data.except.get(0).clazz.get(0).system, "http://hl7.org/fhir/resource-types");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.id, "consent-example-smartonfhir");
		assertEquals(data.organization.get(0).reference, "Organization/example");
		assertEquals(data.patient.reference, "Patient/xcda");
		assertEquals(data.period.end.toString(), "2016-06-23T17:32:33+10:00");
		assertEquals(data.period.start.toString(), "2016-06-23T17:02:33+10:00");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent3() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-notAuthor.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2015-11-18");
		assertEquals(data.except.get(0).actor.get(0).reference.display, "Good Health Clinic");
		assertEquals(data.except.get(0).actor.get(0).reference.reference, "Organization/2.16.840.1.113883.19.5");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).code, "CST");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.DENY);
		assertEquals(data.id, "consent-example-notAuthor");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent4() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-notTime.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2015-11-18");
		assertEquals(data.except.get(0).period.end.toString(), "2015-02-01");
		assertEquals(data.except.get(0).period.start.toString(), "2015-01-01");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.DENY);
		assertEquals(data.id, "consent-example-notTime");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent5() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-signature.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.actor.get(0).reference.reference, "Practitioner/13");
		assertEquals(data.actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.category.get(0).coding.get(0).code, "HIPAA-Auth");
		assertEquals(data.category.get(0).coding.get(0).system, "http://hl7.org/fhir/consentcategorycodes");
		assertEquals(data.consentingParty.get(0).reference, "Patient/72");
		assertEquals(data.dateTime.toString(), "2016-05-26T00:41:10-04:00");
		assertEquals(data.except.get(0).actor.get(0).reference.reference, "Practitioner/xcda-author");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).code, "AUT");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).clazz.get(0).code, "application/hl7-cda+xml");
		assertEquals(data.except.get(0).clazz.get(0).system, "urn:ietf:bcp:13");
		assertEquals(data.except.get(0).code.get(0).code, "34133-9");
		assertEquals(data.except.get(0).code.get(0).system, "http://loinc.org");
		assertEquals(data.except.get(0).code.get(1).code, "18842-5");
		assertEquals(data.except.get(0).code.get(1).system, "http://loinc.org");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.id, "consent-example-signature");
		assertEquals(data.identifier.system, "urn:oid:2.16.840.1.113883.3.72.5.9.1");
		assertEquals(data.identifier.value, "494e0c7a-a69e-4fb4-9d02-6aae747790d7");
		assertEquals(data.organization.get(0).reference, "Organization/example");
		assertEquals(data.patient.reference, "Patient/72");
		assertEquals(data.period.end.toString(), "2016-10-10");
		assertEquals(data.period.start.toString(), "2015-10-10");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent6() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-notThem.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2015-11-18");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).action.get(1).coding.get(0).code, "correct");
		assertEquals(data.except.get(0).action.get(1).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).actor.get(0).reference.display, "Fictive Nurse");
		assertEquals(data.except.get(0).actor.get(0).reference.reference, "Practitioner/f204");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.DENY);
		assertEquals(data.id, "consent-example-notThem");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent7() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-grantor.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2015-11-18");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).actor.get(0).reference.display, "Good Health Psychiatric Hospital");
		assertEquals(data.except.get(0).actor.get(0).reference.reference, "Organization/2.16.840.1.113883.19.6");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).code, "CST");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).actor.get(1).reference.display, "Good Health Clinic");
		assertEquals(data.except.get(0).actor.get(1).reference.reference, "Patient/example");
		assertEquals(data.except.get(0).actor.get(1).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(0).actor.get(1).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.id, "consent-example-grantor");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-out");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent8() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-notOrg.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2015-11-18");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).action.get(1).coding.get(0).code, "correct");
		assertEquals(data.except.get(0).action.get(1).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).actor.get(0).reference.display, "Good Health Clinic");
		assertEquals(data.except.get(0).actor.get(0).reference.reference, "Organization/2.16.840.1.113883.19.5");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.DENY);
		assertEquals(data.id, "consent-example-notOrg");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-in");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent9() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example-pkb.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2016-06-16");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(0).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(0).actor.get(0).reference.display, "Non-migrated Team - Imperial College Healthcare");
		assertEquals(data.except.get(0).actor.get(0).reference.reference, "Organization/ich-nmt");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(0).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(0).securityLabel.get(0).code, "N");
		assertEquals(data.except.get(0).securityLabel.get(0).system, "http://hl7.org/fhir/v3/Confidentiality");
		assertEquals(data.except.get(0).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(1).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(1).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(1).actor.get(0).reference.display, "Non-migrated Team - Imperial College Healthcare");
		assertEquals(data.except.get(1).actor.get(0).reference.reference, "Organization/ich-nmt");
		assertEquals(data.except.get(1).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(1).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(1).securityLabel.get(0).code, "PSY");
		assertEquals(data.except.get(1).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(1).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(2).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(2).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(2).actor.get(0).reference.display, "Non-migrated Team - Imperial College Healthcare");
		assertEquals(data.except.get(2).actor.get(0).reference.reference, "Organization/ich-nmt");
		assertEquals(data.except.get(2).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(2).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(2).securityLabel.get(0).code, "SOC");
		assertEquals(data.except.get(2).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(2).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(3).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(3).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(3).actor.get(0).reference.display, "Core Information Exchange team - Imperial College Healthcare");
		assertEquals(data.except.get(3).actor.get(0).reference.reference, "Organization/ich-core");
		assertEquals(data.except.get(3).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(3).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(3).securityLabel.get(0).code, "N");
		assertEquals(data.except.get(3).securityLabel.get(0).system, "http://hl7.org/fhir/v3/Confidentiality");
		assertEquals(data.except.get(3).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(4).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(4).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(4).actor.get(0).reference.display, "Core Information Exchange team - Imperial College Healthcare");
		assertEquals(data.except.get(4).actor.get(0).reference.reference, "Organization/ich-core");
		assertEquals(data.except.get(4).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(4).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(4).securityLabel.get(0).code, "PSY");
		assertEquals(data.except.get(4).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(4).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(5).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(5).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(5).actor.get(0).reference.display, "Core Information Exchange team - Imperial College Healthcare");
		assertEquals(data.except.get(5).actor.get(0).reference.reference, "Organization/ich-core");
		assertEquals(data.except.get(5).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(5).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(5).securityLabel.get(0).code, "SOC");
		assertEquals(data.except.get(5).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(5).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(6).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(6).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(6).actor.get(0).reference.display, "Core Information Exchange team - Imperial College Healthcare");
		assertEquals(data.except.get(6).actor.get(0).reference.reference, "Organization/ich-core");
		assertEquals(data.except.get(6).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(6).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(6).securityLabel.get(0).code, "SEX");
		assertEquals(data.except.get(6).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(6).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(7).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(7).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(7).actor.get(0).reference.display, "Torbay and Source Devon Trust - Parkinson's Team");
		assertEquals(data.except.get(7).actor.get(0).reference.reference, "Organization/tsd-park");
		assertEquals(data.except.get(7).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(7).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(7).securityLabel.get(0).code, "N");
		assertEquals(data.except.get(7).securityLabel.get(0).system, "http://hl7.org/fhir/v3/Confidentiality");
		assertEquals(data.except.get(7).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(8).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(8).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(8).actor.get(0).reference.display, "Torbay and Source Devon Trust - Parkinson's Team");
		assertEquals(data.except.get(8).actor.get(0).reference.reference, "Organization/tsd-park");
		assertEquals(data.except.get(8).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(8).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(8).securityLabel.get(0).code, "PSY");
		assertEquals(data.except.get(8).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(8).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.except.get(9).action.get(0).coding.get(0).code, "access");
		assertEquals(data.except.get(9).action.get(0).coding.get(0).system, "http://hl7.org/fhir/consentaction");
		assertEquals(data.except.get(9).actor.get(0).reference.display, "Torbay and Source Devon Trust - Parkinson's Team");
		assertEquals(data.except.get(9).actor.get(0).reference.reference, "Organization/tsd-park");
		assertEquals(data.except.get(9).actor.get(0).role.coding.get(0).code, "PRCP");
		assertEquals(data.except.get(9).actor.get(0).role.coding.get(0).system, "http://hl7.org/fhir/v3/ParticipationType");
		assertEquals(data.except.get(9).securityLabel.get(0).code, "SOC");
		assertEquals(data.except.get(9).securityLabel.get(0).system, "http://hl7.org/fhir/v3/ActCode");
		assertEquals(data.except.get(9).type, CodeSystemConsentExceptType.PERMIT);
		assertEquals(data.id, "consent-example-pkb");
		assertEquals(data.organization.get(0).display, "Patients Know Best");
		assertEquals(data.organization.get(0).reference, "Organization/pkb");
		assertEquals(data.patient.display, "...example patient...");
		assertEquals(data.patient.reference, "Patient/example");
		assertEquals(data.policyRule, "http://hl7.org/fhir/ConsentPolicy/opt-out");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}

    @Test
	public void testConsent10() throws Exception {
		String sourceJson = FileHelper.loadString("stu3/consent-example.json");
		Consent data = parser.toFhir(Consent.class , sourceJson);
		
		assertEquals(data.dateTime.toString(), "2016-05-11");
		assertEquals(data.id, "consent-example-basic");
		assertEquals(data.organization.get(0).display, "Canada Infoway");
		assertEquals(data.organization.get(0).reference, "Organization/Infoway");
		assertEquals(data.patient.display, "P. van de Heuvel");
		assertEquals(data.patient.reference, "Patient/f001");
		assertEquals(data.period.end.toString(), "2016-01-01");
		assertEquals(data.period.start.toString(), "1964-01-01");
		assertEquals(data.policyRule, "http://goodhealth.org/consent/policy/opt-in");
		assertEquals(data.sourceAttachment.title, "The terms of the consent in lawyer speak.");
		assertEquals(data.status, CodeSystemConsentState.ACTIVE);
		assertEquals(data.text.status, CodeSystemNarrativeStatus.GENERATED);

		String json = parser.fromFhir(data);

		JSONAssert.assertEquals(sourceJson, json, false);
	}
}