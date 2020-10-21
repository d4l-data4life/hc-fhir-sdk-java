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

/**
 * Canonical.java
 * <p>
 * A URI that is a reference to a canonical URL on a FHIR resource
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/canonical">Canonical</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/canonical) on
 * 2020-10-15
 */
public class Canonical extends Element {

    public static final String resourceType = "Canonical";

    public String url;

    public String version;

    public Canonical() {
    }

    public Canonical(String url) {
        this.url = url;
    }

    public Canonical(String url, String version) {
        this.url = url;
        this.version = version;
    }

    @Override
    public String getResourceType() {
        return Canonical.resourceType;
    }


}
