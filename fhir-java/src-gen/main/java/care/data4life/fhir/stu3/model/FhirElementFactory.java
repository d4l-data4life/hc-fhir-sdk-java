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

/**
 * Generated from FHIR 3.0.1.11917
 */
public final class FhirElementFactory {


    public static <T extends FhirStu3Base> String getFhirTypeForClass(Class<T> clazz) {
        if (clazz == CarePlan.class) {
            return CarePlan.resourceType;
        }
        if (clazz == CareTeam.class) {
            return CareTeam.resourceType;
        }
        if (clazz == Condition.class) {
            return Condition.resourceType;
        }
        if (clazz == DiagnosticReport.class) {
            return DiagnosticReport.resourceType;
        }
        if (clazz == DocumentReference.class) {
            return DocumentReference.resourceType;
        }
        if (clazz == FamilyMemberHistory.class) {
            return FamilyMemberHistory.resourceType;
        }
        if (clazz == Goal.class) {
            return Goal.resourceType;
        }
        if (clazz == Medication.class) {
            return Medication.resourceType;
        }
        if (clazz == MedicationRequest.class) {
            return MedicationRequest.resourceType;
        }
        if (clazz == Observation.class) {
            return Observation.resourceType;
        }
        if (clazz == Organization.class) {
            return Organization.resourceType;
        }
        if (clazz == Patient.class) {
            return Patient.resourceType;
        }
        if (clazz == Practitioner.class) {
            return Practitioner.resourceType;
        }
        if (clazz == Procedure.class) {
            return Procedure.resourceType;
        }
        if (clazz == ProcedureRequest.class) {
            return ProcedureRequest.resourceType;
        }
        if (clazz == Provenance.class) {
            return Provenance.resourceType;
        }
        if (clazz == Questionnaire.class) {
            return Questionnaire.resourceType;
        }
        if (clazz == QuestionnaireResponse.class) {
            return QuestionnaireResponse.resourceType;
        }
        if (clazz == ReferralRequest.class) {
            return ReferralRequest.resourceType;
        }
        if (clazz == Specimen.class) {
            return Specimen.resourceType;
        }
        if (clazz == Substance.class) {
            return Substance.resourceType;
        }
        if (clazz == ValueSet.class) {
            return ValueSet.resourceType;
        }
        return null;
    }

    public static Class<?> getClassForFhirType(String typeName) {
        switch (typeName.toLowerCase()) {
            case "careplan":
                return CarePlan.class;
            case "careteam":
                return CareTeam.class;
            case "condition":
                return Condition.class;
            case "diagnosticreport":
                return DiagnosticReport.class;
            case "documentreference":
                return DocumentReference.class;
            case "familymemberhistory":
                return FamilyMemberHistory.class;
            case "goal":
                return Goal.class;
            case "medication":
                return Medication.class;
            case "medicationrequest":
                return MedicationRequest.class;
            case "observation":
                return Observation.class;
            case "organization":
                return Organization.class;
            case "patient":
                return Patient.class;
            case "practitioner":
                return Practitioner.class;
            case "procedure":
                return Procedure.class;
            case "procedurerequest":
                return ProcedureRequest.class;
            case "provenance":
                return Provenance.class;
            case "questionnaire":
                return Questionnaire.class;
            case "questionnaireresponse":
                return QuestionnaireResponse.class;
            case "referralrequest":
                return ReferralRequest.class;
            case "specimen":
                return Specimen.class;
            case "substance":
                return Substance.class;
            case "valueset":
                return ValueSet.class;

            default:
                break;
        }

        return null;
    }
}
