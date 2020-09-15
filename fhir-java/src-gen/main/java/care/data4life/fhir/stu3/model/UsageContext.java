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

import javax.annotation.Nullable;

/**
 * UsageContext.java
 * <p>
 * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an
 * artifact. This metadata can either be specific to the applicable population (e.g., age category,
 * DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/UsageContext">UsageContext</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/UsageContext) on
 * 2020-07-29
 */
public class UsageContext extends Element {

    public static final String resourceType = "UsageContext";

    // Type of context being specified.
    @Json(name = "code")
    public Coding code;

    // Value that defines the context.
    @Json(name = "valueCodeableConcept")
    @Nullable
    public CodeableConcept valueCodeableConcept;

    // Value that defines the context.
    @Json(name = "valueQuantity")
    @Nullable
    public Quantity valueQuantity;

    // Value that defines the context.
    @Json(name = "valueRange")
    @Nullable
    public Range valueRange;

    /**
     * Constructor for all required properties.
     *
     * @param code  Coding
     * @param value as one of CodeableConcept, Quantity, Range*
     */
    public UsageContext(Coding code, Object value) {
        this.code = code;
        if (value instanceof CodeableConcept) {
            this.valueCodeableConcept = (CodeableConcept) value;
        } else if (value instanceof Quantity) {
            this.valueQuantity = (Quantity) value;
        } else if (value instanceof Range) {
            this.valueRange = (Range) value;
        } else {
            //FIXME Type: (of: value)) for property (value) is invalid, ignoring")
        }
    }

    @Override
    public String getResourceType() {
        return UsageContext.resourceType;
    }
}
