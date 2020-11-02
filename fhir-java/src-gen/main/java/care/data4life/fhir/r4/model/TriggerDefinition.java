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
 * TriggerDefinition.java
 * <p>
 * A description of a triggering event. Triggering events can be named events, data events, or
 * periodic, as determined by the type element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TriggerDefinition">TriggerDefinition</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TriggerDefinition)
 * on 2020-10-27
 */
public class TriggerDefinition extends Element {

    public static final String resourceType = "TriggerDefinition";

    // The type of triggering event.
    @Json(name = "type")
    public CodeSystemTriggerType type;

    // Name or URI that identifies the event.
    @Json(name = "name")
    @Nullable
    public String name;

    // Timing of the event.
    @Json(name = "timingTiming")
    @Nullable
    public Timing timingTiming;

    // Timing of the event.
    @Json(name = "timingReference")
    @Nullable
    public Reference timingReference;

    // Timing of the event.
    @Json(name = "timingDate")
    @Nullable
    public FhirDate timingDate;

    // Timing of the event.
    @Json(name = "timingDateTime")
    @Nullable
    public FhirDateTime timingDateTime;

    // Triggering data of the event (multiple = 'and').
    @Json(name = "data")
    @Nullable
    public List<DataRequirement> data;

    // Whether the event triggers (boolean expression).
    @Json(name = "condition")
    @Nullable
    public Expression condition;


    /**
     * Constructor for all required properties.
     *
     * @param type CodeSystemTriggerType
     */
    public TriggerDefinition(CodeSystemTriggerType type) {
        this.type = type;
    }

    @Override
    public String getResourceType() {
        return TriggerDefinition.resourceType;
    }


}
