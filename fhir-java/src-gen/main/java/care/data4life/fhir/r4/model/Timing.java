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
 * Timing.java
 * <p>
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned,
 * expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used
 * when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were
 * carried out.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">Timing</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Timing) on 2021-03-26
 */
public class Timing extends BackboneElement {

    public static final String resourceType = "Timing";

    // When the event occurs.
    @Json(name = "event")
    @Nullable
    public List<FhirDateTime> event;

    // When the event is to occur.
    @Json(name = "repeat")
    @Nullable
    public TimingRepeat repeat;

    // BID | TID | QID | AM | PM | QD | QOD | +.
    @Json(name = "code")
    @Nullable
    public CodeableConcept code;


    public Timing() {
    }

    @Override
    public String getResourceType() {
        return Timing.resourceType;
    }


    /**
     * Timing.java
     * <p>
     * A set of rules that describe when the event is scheduled.
     *
     * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">Timing</a>
     * <p>
     * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Timing) on 2021-03-26
     */
    public static class TimingRepeat extends Element {

        public static final String resourceType = "TimingRepeat";

        // Length/Range of lengths, or (Start and/or end) limits.
        @Json(name = "boundsDuration")
        @Nullable
        public Duration boundsDuration;

        // Length/Range of lengths, or (Start and/or end) limits.
        @Json(name = "boundsRange")
        @Nullable
        public Range boundsRange;

        // Length/Range of lengths, or (Start and/or end) limits.
        @Json(name = "boundsPeriod")
        @Nullable
        public Period boundsPeriod;

        // Number of times to repeat.
        @Json(name = "count")
        @Nullable
        public Integer count;

        // Maximum number of times to repeat.
        @Json(name = "countMax")
        @Nullable
        public Integer countMax;

        // How long when it happens.
        @Json(name = "duration")
        @Nullable
        public FhirDecimal duration;

        // How long when it happens (Max).
        @Json(name = "durationMax")
        @Nullable
        public FhirDecimal durationMax;

        // s | min | h | d | wk | mo | a - unit of time (UCUM).
        @Json(name = "durationUnit")
        @Nullable
        public String durationUnit;

        // Event occurs frequency times per period.
        @Json(name = "frequency")
        @Nullable
        public Integer frequency;

        // Event occurs up to frequencyMax times per period.
        @Json(name = "frequencyMax")
        @Nullable
        public Integer frequencyMax;

        // Event occurs frequency times per period.
        @Json(name = "period")
        @Nullable
        public FhirDecimal period;

        // Upper limit of period (3-4 hours).
        @Json(name = "periodMax")
        @Nullable
        public FhirDecimal periodMax;

        // s | min | h | d | wk | mo | a - unit of time (UCUM).
        @Json(name = "periodUnit")
        @Nullable
        public String periodUnit;

        // If one or more days of week is provided, then the action happens only on the specified day(s).
        @Json(name = "dayOfWeek")
        @Nullable
        public List<CodeSystemDaysOfWeek> dayOfWeek;

        // Time of day for action.
        @Json(name = "timeOfDay")
        @Nullable
        public List<FhirTime> timeOfDay;

        // Code for time period of occurrence.
        @Json(name = "when")
        @Nullable
        public List<String> when;

        // Minutes from event (before or after).
        @Json(name = "offset")
        @Nullable
        public Integer offset;


        public TimingRepeat() {
        }

        @Override
        public String getResourceType() {
            return TimingRepeat.resourceType;
        }


    }


}