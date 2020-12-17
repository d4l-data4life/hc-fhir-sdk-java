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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import care.data4life.fhir.r4.model.Attachment;
import care.data4life.fhir.r4.model.DiagnosticReport;
import care.data4life.fhir.r4.model.DocumentReference;
import care.data4life.fhir.r4.model.DomainResource;
import care.data4life.fhir.r4.model.Identifier;
import care.data4life.fhir.r4.model.Patient;
import care.data4life.fhir.r4.model.Practitioner;
import care.data4life.fhir.r4.model.Questionnaire;
import care.data4life.fhir.r4.model.QuestionnaireResponse;
import care.data4life.fhir.r4.model.Reference;

public class FhirAttachmentHelper {

    public static Boolean hasAttachment(DomainResource domainResource) {
        switch (domainResource.getResourceType()) {
            case "Patient":
            case "Practitioner":
            case "DiagnosticReport":
            case "DocumentReference":
            case "Questionnaire":
            case "QuestionnaireResponse":
                return true;
            default:
                return false;
        }
    }

    public static List<Attachment> getAttachment(DomainResource domainResource) {
        switch (domainResource.getResourceType()) {
            case "Patient":
                return ((Patient) domainResource).photo;
            case "Practitioner":
                return ((Practitioner) domainResource).photo;
            case "DiagnosticReport":
                return ((DiagnosticReport) domainResource).presentedForm;
            case "DocumentReference":
                List<Attachment> documentAttachments = new ArrayList<>();
                if (((DocumentReference) domainResource).content == null) {
                    return documentAttachments;
                }
                for (DocumentReference.DocumentReferenceContent content : ((DocumentReference) domainResource).content) {
                    if (content == null || content.attachment == null) continue;
                    documentAttachments.add(content.attachment);
                }
                return documentAttachments;
            case "Questionnaire":
                List<Attachment> questionnaireAttachments = new ArrayList<>();
                Questionnaire questionnaire = ((Questionnaire) domainResource);

                if (questionnaire.item == null) return questionnaireAttachments;

                for (Questionnaire.QuestionnaireItem questionnaireItem : questionnaire.item) {
                    if (questionnaireItem.initial == null) continue;

                    for (Questionnaire.QuestionnaireItemInitial initial : questionnaireItem.initial) {
                        if (initial == null || initial.valueAttachment == null) continue;
                        questionnaireAttachments.add(initial.valueAttachment);
                    }
                }
                return questionnaireAttachments;
            case "QuestionnaireResponse":
                List<Attachment> answerAttachments = new ArrayList<>();
                if (((QuestionnaireResponse) domainResource).item == null) {
                    return answerAttachments;
                }
                for (QuestionnaireResponse.QuestionnaireResponseItem item : ((QuestionnaireResponse) domainResource).item) {
                    if (item.answer == null) continue;
                    for (QuestionnaireResponse.QuestionnaireResponseItemAnswer answer : item.answer) {
                        if (answer == null || answer.valueAttachment == null) continue;
                        answerAttachments.add(answer.valueAttachment);
                    }
                }
                return answerAttachments;
            default:
                return null;
        }
    }

    public static void updateAttachmentData(DomainResource domainResource,
                                            HashMap<Attachment, String> dataHashMap) {
        switch (domainResource.getResourceType()) {
            case "Patient":
                ((Patient) domainResource).photo =
                        setHashMapAttachment(((Patient) domainResource).photo, dataHashMap);
                break;
            case "Practitioner":
                ((Practitioner) domainResource).photo =
                        setHashMapAttachment(((Practitioner) domainResource).photo, dataHashMap);
                break;
            case "DiagnosticReport":
                ((DiagnosticReport) domainResource).presentedForm =
                        setHashMapAttachment(((DiagnosticReport) domainResource).presentedForm, dataHashMap);
                break;
            case "DocumentReference":
                if (((DocumentReference) domainResource).content != null) {
                    for (DocumentReference.DocumentReferenceContent content : ((DocumentReference) domainResource).content) {
                        insertDataAttachment(content.attachment, dataHashMap);
                    }
                }
                break;
            case "Questionnaire":
                if (((Questionnaire) domainResource).item != null) {
                    for (Questionnaire.QuestionnaireItem item : ((Questionnaire) domainResource).item) {
                        if (item.initial == null) continue;
                        for (Questionnaire.QuestionnaireItemInitial initial : item.initial) {
                            insertDataAttachment(initial.valueAttachment, dataHashMap);
                        }
                    }
                }
                break;
            case "QuestionnaireResponse":
                if (((QuestionnaireResponse) domainResource).item != null) {
                    for (QuestionnaireResponse.QuestionnaireResponseItem item : ((QuestionnaireResponse) domainResource).item) {
                        if (item.answer == null) continue;
                        for (QuestionnaireResponse.QuestionnaireResponseItemAnswer answer : item.answer) {
                            insertDataAttachment(answer.valueAttachment, dataHashMap);
                        }
                    }
                }
                break;
            default:
                break;
        }
    }

    public static void insertDataAttachment(Attachment attachment,
                                            HashMap<Attachment, String> dataHashMap) {
        if (dataHashMap == null) {
            attachment.data = null;
        } else if (attachment != null) {
            attachment.data = dataHashMap.get(attachment);
        }
    }

    public static List<Attachment> setHashMapAttachment(List<Attachment> attachments,
                                                        HashMap<Attachment, String> dataHashMap) {
        for (Attachment attachment : attachments) {
            if (dataHashMap == null || dataHashMap.isEmpty()) {
                attachment.data = null;
            } else {
                attachment.data = dataHashMap.get(attachment);
            }
        }
        return attachments;
    }

    public static List<Identifier> getIdentifier(DomainResource domainResource) {
        switch (domainResource.getResourceType()) {
            case "Patient":
                return ((Patient) domainResource).identifier;
            case "Practitioner":
                return ((Practitioner) domainResource).identifier;
            case "DiagnosticReport":
                return ((DiagnosticReport) domainResource).identifier;
            case "DocumentReference":
                return ((DocumentReference) domainResource).identifier;
            case "Questionnaire":
                return ((Questionnaire) domainResource).identifier;
            case "QuestionnaireResponse":
                List<Identifier> identifierList = new ArrayList<>(
                        Collections.singleton(((QuestionnaireResponse) domainResource).identifier));
                return identifierList;
            default:
                return null;
        }
    }

    public static void setIdentifier(DomainResource domainResource, List<Identifier> newIdentifier) {
        if (newIdentifier.isEmpty()) newIdentifier = null;
        switch (domainResource.getResourceType()) {
            case "Patient":
                ((Patient) domainResource).identifier = newIdentifier;
                break;
            case "Practitioner":
                ((Practitioner) domainResource).identifier = newIdentifier;
                break;
            case "DiagnosticReport":
                ((DiagnosticReport) domainResource).identifier = newIdentifier;
                break;
            case "DocumentReference":
                ((DocumentReference) domainResource).identifier = newIdentifier;
                break;
            case "Questionnaire":
                ((Questionnaire) domainResource).identifier = newIdentifier;
                break;
            case "QuestionnaireResponse":
                ((QuestionnaireResponse) domainResource).identifier = newIdentifier.get(0);
                break;
            default:
                break;
        }
    }

    public static void appendIdentifier(DomainResource domainResource, String appendingId,
                                        String assigner) {
        List<Identifier> identifiers = getIdentifier(domainResource);
        if (identifiers == null) identifiers = new ArrayList<>();
        if (domainResource instanceof QuestionnaireResponse) {
            identifiers.set(0, buildIdentifier(appendingId, assigner));
        } else {
            identifiers.add(buildIdentifier(appendingId, assigner));
        }
        setIdentifier(domainResource, identifiers);
    }

    public static Identifier buildIdentifier(String value, String assigner) {
        Identifier i = new Identifier();
        i.value = value;
        i.assigner = new Reference();
        i.assigner.reference = assigner;
        return i;
    }
}
