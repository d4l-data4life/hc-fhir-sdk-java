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
 * Location.java
 * <p>
 * Details and position information for a physical place where services are provided and resources
 * and participants may be stored, found, contained, or accommodated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">Location</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
public class Location extends DomainResource {

    public static final String resourceType = "Location";

    // Unique code or number identifying the location to its users.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
    @Json(name = "status")
    @Nullable
    public CodeSystemLocationStatus status;

    // The operational status of the location (typically only for a bed/room).
    @Json(name = "operationalStatus")
    @Nullable
    public Coding operationalStatus;

    // Name of the location as used by humans.
    @Json(name = "name")
    @Nullable
    public String name;

    // A list of alternate names that the location is known as, or was known as, in the past.
    @Json(name = "alias")
    @Nullable
    public List<String> alias;

    // Additional details about the location that could be displayed as further information to identify the location beyond its name.
    @Json(name = "description")
    @Nullable
    public String description;

    // Indicates whether a resource instance represents a specific location or a class of locations.
    @Json(name = "mode")
    @Nullable
    public CodeSystemLocationMode mode;

    // Type of function performed.
    @Json(name = "type")
    @Nullable
    public List<CodeableConcept> type;

    // Contact details of the location.
    @Json(name = "telecom")
    @Nullable
    public List<ContactPoint> telecom;

    // Physical location.
    @Json(name = "address")
    @Nullable
    public Address address;

    // Physical form of the location.
    @Json(name = "physicalType")
    @Nullable
    public CodeableConcept physicalType;

    // The absolute geographic location.
    @Json(name = "position")
    @Nullable
    public LocationPosition position;

    // Organization responsible for provisioning and upkeep.
    @Json(name = "managingOrganization")
    @Nullable
    public Reference managingOrganization;

    // Another Location this one is physically a part of.
    @Json(name = "partOf")
    @Nullable
    public Reference partOf;

    // What days/times during a week is this location usually open.
    @Json(name = "hoursOfOperation")
    @Nullable
    public List<LocationHoursOfOperation> hoursOfOperation;

    // Description of availability exceptions.
    @Json(name = "availabilityExceptions")
    @Nullable
    public String availabilityExceptions;

    // Technical endpoints providing access to services operated for the location.
    @Json(name = "endpoint")
    @Nullable
    public List<Reference> endpoint;


    public Location() {
    }

    @Override
    public String getResourceType() {
        return Location.resourceType;
    }


    /**
     * Location.java
     * <p>
     * What days/times during a week is this location usually open
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">Location</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
     */
    public static class LocationHoursOfOperation extends BackboneElement {

        public static final String resourceType = "LocationHoursOfOperation";

        // Indicates which days of the week are available between the start and end Times.
        @Json(name = "daysOfWeek")
        @Nullable
        public List<CodeSystemDaysOfWeek> daysOfWeek;

        // The Location is open all day.
        @Json(name = "allDay")
        @Nullable
        public Boolean allDay;

        // Time that the Location opens.
        @Json(name = "openingTime")
        @Nullable
        public FhirTime openingTime;

        // Time that the Location closes.
        @Json(name = "closingTime")
        @Nullable
        public FhirTime closingTime;


        public LocationHoursOfOperation() {
        }

        @Override
        public String getResourceType() {
            return LocationHoursOfOperation.resourceType;
        }


    }


    /**
     * Location.java
     * <p>
     * The absolute geographic location of the Location, expressed using the WGS84 datum (This is
     * the same co-ordinate system used in KML).
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">Location</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
     */
    public static class LocationPosition extends BackboneElement {

        public static final String resourceType = "LocationPosition";

        // Longitude with WGS84 datum.
        @Json(name = "longitude")
        public FhirDecimal longitude;

        // Latitude with WGS84 datum.
        @Json(name = "latitude")
        public FhirDecimal latitude;

        // Altitude with WGS84 datum.
        @Json(name = "altitude")
        @Nullable
        public FhirDecimal altitude;


        /**
         * Constructor for all required properties.
         *
         * @param longitude FhirDecimal
         * @param latitude  FhirDecimal
         */
        public LocationPosition(FhirDecimal longitude, FhirDecimal latitude) {
            this.longitude = longitude;
            this.latitude = latitude;
        }

        @Override
        public String getResourceType() {
            return LocationPosition.resourceType;
        }


    }


}
