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
 * Device.java
 * <p>
 * A type of a manufactured item that is used in the provision of healthcare without being
 * substantially changed through that activity. The device may be a medical or non-medical device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
public class Device extends DomainResource {

    public static final String resourceType = "Device";

    // Instance identifier.
    @Json(name = "identifier")
    @Nullable
    public List<Identifier> identifier;

    // The reference to the definition for the device.
    @Json(name = "definition")
    @Nullable
    public Reference definition;

    // Unique Device Identifier (UDI) Barcode string.
    @Json(name = "udiCarrier")
    @Nullable
    public List<DeviceUdiCarrier> udiCarrier;

    // Status of the Device availability.
    @Json(name = "status")
    @Nullable
    public CodeSystemFHIRDeviceStatus status;

    // online | paused | standby | offline | not-ready | transduc-discon | hw-discon | off.
    @Json(name = "statusReason")
    @Nullable
    public List<CodeableConcept> statusReason;

    // The distinct identification string.
    @Json(name = "distinctIdentifier")
    @Nullable
    public String distinctIdentifier;

    // Name of device manufacturer.
    @Json(name = "manufacturer")
    @Nullable
    public String manufacturer;

    // Date when the device was made.
    @Json(name = "manufactureDate")
    @Nullable
    public FhirDateTime manufactureDate;

    // Date and time of expiry of this device (if applicable).
    @Json(name = "expirationDate")
    @Nullable
    public FhirDateTime expirationDate;

    // Lot number of manufacture.
    @Json(name = "lotNumber")
    @Nullable
    public String lotNumber;

    // Serial number assigned by the manufacturer.
    @Json(name = "serialNumber")
    @Nullable
    public String serialNumber;

    // The name of the device as given by the manufacturer.
    @Json(name = "deviceName")
    @Nullable
    public List<DeviceDeviceName> deviceName;

    // The model number for the device.
    @Json(name = "modelNumber")
    @Nullable
    public String modelNumber;

    // The part number of the device.
    @Json(name = "partNumber")
    @Nullable
    public String partNumber;

    // The kind or type of device.
    @Json(name = "type")
    @Nullable
    public CodeableConcept type;

    // The capabilities supported on a  device, the standards to which the device conforms for a particular purpose, and used for the communication.
    @Json(name = "specialization")
    @Nullable
    public List<DeviceSpecialization> specialization;

    // The actual design of the device or software version running on the device.
    @Json(name = "version")
    @Nullable
    public List<DeviceVersion> version;

    // The actual configuration settings of a device as it actually operates, e.g., regulation status, time properties.
    @Json(name = "property")
    @Nullable
    public List<DeviceProperty> property;

    // Patient to whom Device is affixed.
    @Json(name = "patient")
    @Nullable
    public Reference patient;

    // Organization responsible for device.
    @Json(name = "owner")
    @Nullable
    public Reference owner;

    // Details for human/organization for support.
    @Json(name = "contact")
    @Nullable
    public List<ContactPoint> contact;

    // Where the device is found.
    @Json(name = "location")
    @Nullable
    public Reference location;

    // Network address to contact device.
    @Json(name = "url")
    @Nullable
    public String url;

    // Device notes and comments.
    @Json(name = "note")
    @Nullable
    public List<Annotation> note;

    // Safety Characteristics of Device.
    @Json(name = "safety")
    @Nullable
    public List<CodeableConcept> safety;

    // The parent device.
    @Json(name = "parent")
    @Nullable
    public Reference parent;


    public Device() {
    }

    @Override
    public String getResourceType() {
        return Device.resourceType;
    }


    /**
     * Device.java
     * <p>
     * This represents the manufacturer's name of the device as provided by the device, from a UDI
     * label, or by a person describing the Device.  This typically would be used when a person
     * provides the name(s) or when the device represents one of the names available from
     * DeviceDefinition.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
     */
    public static class DeviceDeviceName extends BackboneElement {

        public static final String resourceType = "DeviceDeviceName";

        // The name of the device.
        @Json(name = "name")
        public String name;

        // The type of deviceName.
        @Json(name = "type")
        public CodeSystemDeviceNameType type;


        /**
         * Constructor for all required properties.
         *
         * @param name String
         * @param type CodeSystemDeviceNameType
         */
        public DeviceDeviceName(String name, CodeSystemDeviceNameType type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String getResourceType() {
            return DeviceDeviceName.resourceType;
        }


    }


    /**
     * Device.java
     * <p>
     * The actual configuration settings of a device as it actually operates, e.g., regulation
     * status, time properties
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
     */
    public static class DeviceProperty extends BackboneElement {

        public static final String resourceType = "DeviceProperty";

        // Code that specifies the property DeviceDefinitionPropetyCode (Extensible).
        @Json(name = "type")
        public CodeableConcept type;

        // Property value as a quantity.
        @Json(name = "valueQuantity")
        @Nullable
        public List<Quantity> valueQuantity;

        // Property value as a code, e.g., NTP4 (synced to NTP).
        @Json(name = "valueCode")
        @Nullable
        public List<CodeableConcept> valueCode;


        /**
         * Constructor for all required properties.
         *
         * @param type CodeableConcept
         */
        public DeviceProperty(CodeableConcept type) {
            this.type = type;
        }

        @Override
        public String getResourceType() {
            return DeviceProperty.resourceType;
        }


    }


    /**
     * Device.java
     * <p>
     * The capabilities supported on a  device, the standards to which the device conforms for a
     * particular purpose, and used for the communication
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
     */
    public static class DeviceSpecialization extends BackboneElement {

        public static final String resourceType = "DeviceSpecialization";

        // The standard that is used to operate and communicate.
        @Json(name = "systemType")
        public CodeableConcept systemType;

        // The version of the standard that is used to operate and communicate.
        @Json(name = "version")
        @Nullable
        public String version;


        /**
         * Constructor for all required properties.
         *
         * @param systemType CodeableConcept
         */
        public DeviceSpecialization(CodeableConcept systemType) {
            this.systemType = systemType;
        }

        @Override
        public String getResourceType() {
            return DeviceSpecialization.resourceType;
        }


    }


    /**
     * Device.java
     * <p>
     * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may
     * include multiple udiCarriers as it either may include just the udiCarrier for the
     * jurisdiction it is sold, or for multiple jurisdictions it could have been sold.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
     */
    public static class DeviceUdiCarrier extends BackboneElement {

        public static final String resourceType = "DeviceUdiCarrier";

        // Mandatory fixed portion of UDI.
        @Json(name = "deviceIdentifier")
        @Nullable
        public String deviceIdentifier;

        // UDI Issuing Organization.
        @Json(name = "issuer")
        @Nullable
        public String issuer;

        // Regional UDI authority.
        @Json(name = "jurisdiction")
        @Nullable
        public String jurisdiction;

        // UDI Machine Readable Barcode String.
        @Json(name = "carrierAIDC")
        @Nullable
        public String carrierAIDC;

        // UDI Human Readable Barcode String.
        @Json(name = "carrierHRF")
        @Nullable
        public String carrierHRF;

        // A coded entry to indicate how the data was entered.
        @Json(name = "entryType")
        @Nullable
        public CodeSystemUDIEntryType entryType;


        public DeviceUdiCarrier() {
        }

        @Override
        public String getResourceType() {
            return DeviceUdiCarrier.resourceType;
        }


    }


    /**
     * Device.java
     * <p>
     * The actual design of the device or software version running on the device
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
     */
    public static class DeviceVersion extends BackboneElement {

        public static final String resourceType = "DeviceVersion";

        // The type of the device version.
        @Json(name = "type")
        @Nullable
        public CodeableConcept type;

        // A single component of the device version.
        @Json(name = "component")
        @Nullable
        public Identifier component;

        // The version text.
        @Json(name = "value")
        public String value;


        /**
         * Constructor for all required properties.
         *
         * @param value String
         */
        public DeviceVersion(String value) {
            this.value = value;
        }

        @Override
        public String getResourceType() {
            return DeviceVersion.resourceType;
        }


    }


}
