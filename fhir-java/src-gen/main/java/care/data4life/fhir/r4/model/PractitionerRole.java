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

import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;

/**
 * PractitionerRole.java
 * <p>
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRole</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PractitionerRole) on 2021-03-26
 */
public class PractitionerRole extends DomainResource {

    public static final String resourceType = "PractitionerRole";

    // Business Identifiers that are specific to a role/location.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // Whether this practitioner role record is in active use.
    @Json(name = "active")
    @Nullable
    public Boolean active;

    // The period during which the practitioner is authorized to perform in these role(s).
    @Json(name = "period")
    @Nullable
    public Period period;

    // Practitioner that is able to provide the defined services for the organization.
    @Json(name = "practitioner")
    @Nullable
    public Reference practitioner;

    // Organization where the roles are available.
    @Json(name = "organization")
    @Nullable
    public Reference organization;

    // Roles which this practitioner may perform.
    @Json(name = "code")
    @Nullable
    public List<CodeableConcept> code;

    // Specific specialty of the practitioner.
    @Json(name = "specialty")
    @Nullable
    public List<CodeableConcept> specialty;

    // The location(s) at which this practitioner provides care.
    @Json(name = "location")
    @Nullable
    public List<Reference> location;

    // The list of healthcare services that this worker provides for this role's Organization/Location(s).
    @Json(name = "healthcareService")
    @Nullable
    public List<Reference> healthcareService;

    // Contact details that are specific to the role/location/service.
    @Json(name = "telecom")
    @Nullable
    public List<ContactPoint> telecom;

    // Times the Service Site is available.
    @Json(name = "availableTime")
    @Nullable
    public List<PractitionerRoleAvailableTime> availableTime;

    // Not available during this time due to provided reason.
    @Json(name = "notAvailable")
    @Nullable
    public List<PractitionerRoleNotAvailable> notAvailable;

    // Description of availability exceptions.
    @Json(name = "availabilityExceptions")
    @Nullable
    public String availabilityExceptions;

    // Technical endpoints providing access to services operated for the practitioner with this role.
    @Json(name = "endpoint")
    @Nullable
    public List<Reference> endpoint;


    public PractitionerRole() {
    }

    @Override
    public String getResourceType() {
        return PractitionerRole.resourceType;
    }


    /**
     * PractitionerRole.java
     * <p>
     * A collection of times the practitioner is available or performing this role at the location and/or healthcareservice.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRole</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PractitionerRole) on 2021-03-26
     */
    public static class PractitionerRoleAvailableTime extends BackboneElement {

        public static final String resourceType = "PractitionerRoleAvailableTime";

        // Indicates which days of the week are available between the start and end Times.
        @Json(name = "daysOfWeek")
        @Nullable
        public List<CodeSystemDaysOfWeek> daysOfWeek;

        // Always available? e.g. 24 hour service.
        @Json(name = "allDay")
        @Nullable
        public Boolean allDay;

        // Opening time of day (ignored if allDay = true).
        @Json(name = "availableStartTime")
        @Nullable
        public FhirTime availableStartTime;

        // Closing time of day (ignored if allDay = true).
        @Json(name = "availableEndTime")
        @Nullable
        public FhirTime availableEndTime;


        public PractitionerRoleAvailableTime() {
        }

        @Override
        public String getResourceType() {
            return PractitionerRoleAvailableTime.resourceType;
        }


    }


    /**
     * PractitionerRole.java
     * <p>
     * The practitioner is not available or performing this role during this period of time due to the provided reason.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRole</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PractitionerRole) on 2021-03-26
     */
    public static class PractitionerRoleNotAvailable extends BackboneElement {

        public static final String resourceType = "PractitionerRoleNotAvailable";

        // Reason presented to the user explaining why time not available.
        @Json(name = "description")
        public String description;

        // Service not available from this date.
        @Json(name = "during")
        @Nullable
        public Period during;


        /**
         * Constructor for all required properties.
         *
         * @param description String
         */
        public PractitionerRoleNotAvailable(String description) {
            this.description = description;
        }

        @Override
        public String getResourceType() {
            return PractitionerRoleNotAvailable.resourceType;
        }


    }


}