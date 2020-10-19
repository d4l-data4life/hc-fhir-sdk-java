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

import com.squareup.moshi.Json;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Organization.java
 * <p>
 * A formally or informally recognized grouping of people or organizations formed for the purpose of
 * achieving some form of collective action.  Includes companies, institutions, corporations,
 * departments, community groups, healthcare practice groups, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Organization">Organization</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Organization) on
 * 2020-10-15
 */
public class Organization extends DomainResource {

    public static final String resourceType = "Organization";

    // Identifies this organization  across multiple systems.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Whether the organization's record is still in active use.
    @Json(name = "active")
    @Nullable
    public Boolean active;

    // Kind of organization.
    @Json(name = "type")
    @Nullable
    public List<CodeableConcept> type;

    // Name used for the organization.
    @Json(name = "name")
    @Nullable
    public String name;

    // A list of alternate names that the organization is known as, or was known as in the past.
    @Json(name = "alias")
    @Nullable
    public List<String> alias;

    // A contact detail for the organization.
    @Json(name = "telecom")
    @Nullable
    public List<ContactPoint> telecom;

    // An address for the organization.
    @Json(name = "address")
    @Nullable
    public List<Address> address;

    // The organization of which this organization forms a part.
    @Json(name = "partOf")
    @Nullable
    public Reference partOf;

    // Contact for the organization for a certain purpose.
    @Json(name = "contact")
    @Nullable
    public List<OrganizationContact> contact;

    // Technical endpoints providing access to services operated for the organization.
    @Json(name = "endpoint")
    @Nullable
    public List<Reference> endpoint;


    public Organization() {
    }

    @Override
    public String getResourceType() {
        return Organization.resourceType;
    }


    /**
     * Organization.java
     * <p>
     * Contact for the organization for a certain purpose
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Organization">Organization</a>
     * <p>
     * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Organization) on
     * 2020-10-15
     */
    public static class OrganizationContact extends BackboneElement {

        public static final String resourceType = "OrganizationContact";

        // The type of contact.
        @Json(name = "purpose")
        @Nullable
        public CodeableConcept purpose;

        // A name associated with the contact.
        @Json(name = "name")
        @Nullable
        public HumanName name;

        // Contact details (telephone, email, etc.)  for a contact.
        @Json(name = "telecom")
        @Nullable
        public List<ContactPoint> telecom;

        // Visiting or postal addresses for the contact.
        @Json(name = "address")
        @Nullable
        public Address address;


        public OrganizationContact() {
        }

        @Override
        public String getResourceType() {
            return OrganizationContact.resourceType;
        }


    }


}
