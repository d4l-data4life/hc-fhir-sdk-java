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
 * FhirElementFactoryTest.java
 *
 * "Generated from FHIR {{ info.version }} on {{ info.date }}
 */
public class {{ class.name }}FhirElementFactory {

        FhirStu3Parser parser = new FhirStu3Parser();
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

        @Test
        public void getFhirTypeForClassTest () throws Exception {
        {%- for klass in classes %}{% if klass.name in resource_list %}
        if(clazz == {{ klass.name }}.class){
        assertEquals(getFhirTypeForClass(Klass), {{ klass.resource_type }}.resourceType);
        }
        {%- endif %}{% endfor %}
        }

        @Test
        public void getClassForFhirTypeTest () throws Exception {
        {%- for klass in classes %}{% if klass.name in resource_list %}
        if(clazz == {{ klass.name }}.class){
        assertEquals(getClassForFhirType({{ klass.resource_type }}.resourceType.toUpperCase()), klass);
        }
        {%- endif %}{% endfor %}
        }
