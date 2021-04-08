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

import com.squareup.moshi.Json;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Patient.java
 * <p>
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient) on
 * 2021-04-08
 */
public class Patient extends DomainResource {

    public static final String resourceType = "Patient";

    // An identifier for this patient.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Whether this patient's record is in active use.
    @Json(name = "active")
    @Nullable
    public Boolean active;

    // A name associated with the patient.
    @Json(name = "name")
    @Nullable
    public List<HumanName> name;

    // A contact detail for the individual.
    @Json(name = "telecom")
    @Nullable
    public List<ContactPoint> telecom;

    // Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
    @Json(name = "gender")
    @Nullable
    public CodeSystemAdministrativeGender gender;

    // The date of birth for the individual.
    @Json(name = "birthDate")
    @Nullable
    public FhirDate birthDate;

    // Indicates if the individual is deceased or not.
    @Json(name = "deceasedBoolean")
    @Nullable
    public Boolean deceasedBoolean;

    // Indicates if the individual is deceased or not.
    @Json(name = "deceasedDateTime")
    @Nullable
    public FhirDateTime deceasedDateTime;

    // An address for the individual.
    @Json(name = "address")
    @Nullable
    public List<Address> address;

    // Marital (civil) status of a patient.
    @Json(name = "maritalStatus")
    @Nullable
    public CodeableConcept maritalStatus;

    // Whether patient is part of a multiple birth.
    @Json(name = "multipleBirthBoolean")
    @Nullable
    public Boolean multipleBirthBoolean;

    // Whether patient is part of a multiple birth.
    @Json(name = "multipleBirthInteger")
    @Nullable
    public Integer multipleBirthInteger;

    // Image of the patient.
    @Json(name = "photo")
    @Nullable
    public List<Attachment> photo;

    // A contact party (e.g. guardian, partner, friend) for the patient.
    @Json(name = "contact")
    @Nullable
    public List<PatientContact> contact;

    // A language which may be used to communicate with the patient about his or her health.
    @Json(name = "communication")
    @Nullable
    public List<PatientCommunication> communication;

    // Patient's nominated primary care provider.
    @Json(name = "generalPractitioner")
    @Nullable
    public List<Reference> generalPractitioner;

    // Organization that is the custodian of the patient record.
    @Json(name = "managingOrganization")
    @Nullable
    public Reference managingOrganization;

    // Link to another patient resource that concerns the same actual person.
    @Json(name = "link")
    @Nullable
    public List<PatientLink> link;


    public Patient() {
    }

    @Override
    public String getResourceType() {
        return Patient.resourceType;
    }


    /**
     * Patient.java
     * <p>
     * A language which may be used to communicate with the patient about his or her health
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient) on
     * 2021-04-08
     */
    public static class PatientCommunication extends BackboneElement {

        public static final String resourceType = "PatientCommunication";

        // The language which can be used to communicate with the patient about his or her health.
        @Json(name = "language")
        public CodeableConcept language;

        // Language preference indicator.
        @Json(name = "preferred")
        @Nullable
        public Boolean preferred;


        /**
         * Constructor for all required properties.
         *
         * @param language CodeableConcept
         */
        public PatientCommunication(CodeableConcept language) {
            this.language = language;
        }

        @Override
        public String getResourceType() {
            return PatientCommunication.resourceType;
        }


    }


    /**
     * Patient.java
     * <p>
     * A contact party (e.g. guardian, partner, friend) for the patient
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient) on
     * 2021-04-08
     */
    public static class PatientContact extends BackboneElement {

        public static final String resourceType = "PatientContact";

        // The kind of relationship.
        @Json(name = "relationship")
        @Nullable
        public List<CodeableConcept> relationship;

        // A name associated with the contact person.
        @Json(name = "name")
        @Nullable
        public HumanName name;

        // A contact detail for the person.
        @Json(name = "telecom")
        @Nullable
        public List<ContactPoint> telecom;

        // Address for the contact person.
        @Json(name = "address")
        @Nullable
        public Address address;

        // Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
        @Json(name = "gender")
        @Nullable
        public CodeSystemAdministrativeGender gender;

        // Organization that is associated with the contact.
        @Json(name = "organization")
        @Nullable
        public Reference organization;

        // The period during which this contact person or organization is valid to be contacted relating to this patient.
        @Json(name = "period")
        @Nullable
        public Period period;


        public PatientContact() {
        }

        @Override
        public String getResourceType() {
            return PatientContact.resourceType;
        }


    }


    /**
     * Patient.java
     * <p>
     * Link to another patient resource that concerns the same actual patient.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Patient">Patient</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Patient) on
     * 2021-04-08
     */
    public static class PatientLink extends BackboneElement {

        public static final String resourceType = "PatientLink";

        // The other patient or related person resource that the link refers to.
        @Json(name = "other")
        public Reference other;

        // The type of link between this patient resource and another patient resource.
        @Json(name = "type")
        public CodeSystemLinkType type;


        /**
         * Constructor for all required properties.
         *
         * @param other Reference
         * @param type  CodeSystemLinkType
         */
        public PatientLink(Reference other, CodeSystemLinkType type) {
            this.other = other;
            this.type = type;
        }

        @Override
        public String getResourceType() {
            return PatientLink.resourceType;
        }


    }


}
