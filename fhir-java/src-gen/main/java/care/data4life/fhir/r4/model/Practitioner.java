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
 * Practitioner.java
 * <p>
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">Practitioner</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Practitioner) on
 * 2020-10-27
 */
public class Practitioner extends DomainResource {

    public static final String resourceType = "Practitioner";

    // An identifier for the person as this agent.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Whether this practitioner's record is in active use.
    @Json(name = "active")
    @Nullable
    public Boolean active;

    // The name(s) associated with the practitioner.
    @Json(name = "name")
    @Nullable
    public List<HumanName> name;

    // A contact detail for the practitioner (that apply to all roles).
    @Json(name = "telecom")
    @Nullable
    public List<ContactPoint> telecom;

    // Address(es) of the practitioner that are not role specific (typically home address).
    @Json(name = "address")
    @Nullable
    public List<Address> address;

    // Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
    @Json(name = "gender")
    @Nullable
    public CodeSystemAdministrativeGender gender;

    // The date  on which the practitioner was born.
    @Json(name = "birthDate")
    @Nullable
    public FhirDate birthDate;

    // Image of the person.
    @Json(name = "photo")
    @Nullable
    public List<Attachment> photo;

    // Certification, licenses, or training pertaining to the provision of care.
    @Json(name = "qualification")
    @Nullable
    public List<PractitionerQualification> qualification;

    // A language the practitioner can use in patient communication.
    @Json(name = "communication")
    @Nullable
    public List<CodeableConcept> communication;


    public Practitioner() {
    }

    @Override
    public String getResourceType() {
        return Practitioner.resourceType;
    }


    /**
     * Practitioner.java
     * <p>
     * The official certifications, training, and licenses that authorize or otherwise pertain to
     * the provision of care by the practitioner.  For example, a medical license issued by a
     * medical board authorizing the practitioner to practice medicine within a certian locality.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Practitioner">Practitioner</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Practitioner)
     * on 2020-10-27
     */
    public static class PractitionerQualification extends BackboneElement {

        public static final String resourceType = "PractitionerQualification";

        // An identifier for this qualification for the practitioner.
        @Json(name = "identifier")
        @Nullable
        public List<Identifier> identifier;

        // Coded representation of the qualification.
        @Json(name = "code")
        public CodeableConcept code;

        // Period during which the qualification is valid.
        @Json(name = "period")
        @Nullable
        public Period period;

        // Organization that regulates and issues the qualification.
        @Json(name = "issuer")
        @Nullable
        public Reference issuer;


        /**
         * Constructor for all required properties.
         *
         * @param code CodeableConcept
         */
        public PractitionerQualification(CodeableConcept code) {
            this.code = code;
        }

        @Override
        public String getResourceType() {
            return PractitionerQualification.resourceType;
        }


    }


}
