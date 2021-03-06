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
 * ContactPoint.java
 * <p>
 * Details for all kinds of technology mediated contact points for a person or organization,
 * including telephone, email, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ContactPoint">ContactPoint</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ContactPoint)
 */
public class ContactPoint extends Element {

    public static final String resourceType = "ContactPoint";

    // Telecommunications form for contact point - what communications system is required to make use of the contact.
    @Json(name = "system")
    @Nullable
    public CodeSystemContactPointSystem system;

    // The actual contact point details.
    @Json(name = "value")
    @Nullable
    public String value;

    // Identifies the purpose for the contact point.
    @Json(name = "use")
    @Nullable
    public CodeSystemContactPointUse use;

    // Specify preferred order of use (1 = highest).
    @Json(name = "rank")
    @Nullable
    public Integer rank;

    // Time period when the contact point was/is in use.
    @Json(name = "period")
    @Nullable
    public Period period;


    public ContactPoint() {
    }

    @Override
    public String getResourceType() {
        return ContactPoint.resourceType;
    }


}
