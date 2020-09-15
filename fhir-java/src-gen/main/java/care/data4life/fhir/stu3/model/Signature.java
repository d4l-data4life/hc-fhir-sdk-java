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

import java.util.List;

import javax.annotation.Nullable;

/**
 * Signature.java
 * <p>
 * A digital signature along with supporting context. The signature may be electronic/cryptographic
 * in nature, or a graphical image representing a hand-written signature, or a signature process.
 * Different signature approaches have different utilities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Signature">Signature</a>
 * <p>
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Signature) on
 * 2020-07-29
 */
public class Signature extends Element {

    public static final String resourceType = "Signature";

    // The actual signature content (XML DigSig. JWT, picture, etc.).
    @Json(name = "blob")
    @Nullable
    public String blob;

    // The technical format of the signature.
    @Json(name = "contentType")
    @Nullable
    public String contentType;

    // The party represented.
    @Json(name = "onBehalfOfReference")
    @Nullable
    public Reference onBehalfOfReference;

    // The party represented.
    @Json(name = "onBehalfOfUri")
    @Nullable
    public String onBehalfOfUri;

    // Indication of the reason the entity signed the object(s).
    @Json(name = "type")
    public List<Coding> type;

    // When the signature was created.
    @Json(name = "when")
    public FhirInstant when;

    // Who signed.
    @Json(name = "whoReference")
    @Nullable
    public Reference whoReference;

    // Who signed.
    @Json(name = "whoUri")
    @Nullable
    public String whoUri;

    /**
     * Constructor for all required properties.
     *
     * @param type List of Coding
     * @param when FhirInstant
     * @param who  as one of String, Reference*
     */
    public Signature(List<Coding> type, FhirInstant when, Object who) {
        this.type = type;
        this.when = when;
        if (who instanceof String) {
            this.whoUri = (String) who;
        } else if (who instanceof Reference) {
            this.whoReference = (Reference) who;
        } else {
            //FIXME Type: (of: who)) for property (who) is invalid, ignoring")
        }
    }

    @Override
    public String getResourceType() {
        return Signature.resourceType;
    }
}
