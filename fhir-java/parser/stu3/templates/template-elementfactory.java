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
 * Generated from FHIR {{ info.version }}
 */
public final class FhirElementFactory {
  {% set resource_list = ["CarePlan",
      "CareTeam",
      "Condition",
      "DiagnosticReport",
      "DocumentReference",
      "FamilyMemberHistory",
      "Goal",
      "Medication",
      "MedicationRequest",
      "Observation",
      "Organization",
      "Patient",
      "Practitioner",
      "Procedure",
      "ProcedureRequest",
      "Provenance",
      "Questionnaire",
      "QuestionnaireResponse",
      "ReferralRequest",
      "Specimen",
      "Substance",
      "ValueSet"] %}

  public static <T extends FhirStu3Base> String getFhirTypeForClass(Class<T> clazz) {
    {%- for klass in classes %}{% if klass.name in resource_list %}
    if (clazz == {{ klass.name }}.class) {
      return {{ klass.resource_type }}.resourceType;
    }
    {%- endif %}{% endfor %}
    return null;
  }

  public static Class<?> getClassForFhirType(String typeName) {
    switch (typeName.toLowerCase()) {
      {%- for klass in classes %}{%if klass.name in resource_list %}
      case "{{ klass.resource_type.lower() }}":
        return {{ klass.name }}.class;
      {%-endif %}{% endfor %}

      default:
        break;
    }

    return null;
  }
}
