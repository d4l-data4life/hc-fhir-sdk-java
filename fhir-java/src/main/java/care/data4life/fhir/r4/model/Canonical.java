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

import java.util.Objects;
import javax.annotation.Nullable;

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
public class Canonical {

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

    public String getUrl() {
        return url;
    }

    @Nullable
    public String getVersion() {
        return version;
    }

    public String getResourceType() {
        return resourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Canonical other = (Canonical) o;

        return url.equals(other.url) && Objects.equals(version, other.version);
    }

    @Override
    public int hashCode() { return Objects.hash(url, version); }
}
