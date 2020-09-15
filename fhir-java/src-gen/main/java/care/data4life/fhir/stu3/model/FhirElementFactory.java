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
        switch (typeName) {
            case "CarePlan":
                return CarePlan.class;
            case "CareTeam":
                return CareTeam.class;
            case "Condition":
                return Condition.class;
            case "DiagnosticReport":
                return DiagnosticReport.class;
            case "DocumentReference":
                return DocumentReference.class;
            case "FamilyMemberHistory":
                return FamilyMemberHistory.class;
            case "Goal":
                return Goal.class;
            case "Medication":
                return Medication.class;
            case "MedicationRequest":
                return MedicationRequest.class;
            case "Observation":
                return Observation.class;
            case "Organization":
                return Organization.class;
            case "Patient":
                return Patient.class;
            case "Practitioner":
                return Practitioner.class;
            case "Procedure":
                return Procedure.class;
            case "ProcedureRequest":
                return ProcedureRequest.class;
            case "Provenance":
                return Provenance.class;
            case "Questionnaire":
                return Questionnaire.class;
            case "QuestionnaireResponse":
                return QuestionnaireResponse.class;
            case "ReferralRequest":
                return ReferralRequest.class;
            case "Specimen":
                return Specimen.class;
            case "Substance":
                return Substance.class;
            case "ValueSet":
                return ValueSet.class;

            default:
                break;
        }

        return null;
    }
}
