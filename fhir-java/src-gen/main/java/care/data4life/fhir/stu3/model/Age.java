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

/**
 * Age.java
 * <p>
 * A duration of time during which an organism (or a process) has existed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Age">Age</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Age) on 2020-10-21
 */
public class Age extends Quantity {

    public static final String resourceType = "Age";


    public Age() {
    }

    @Override
    public String getResourceType() {
        return Age.resourceType;
    }


}
