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
 * Signature.java
 * <p>
 * A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature,
 * or some other signature acceptable to the domain. This other signature may be as simple as a graphical image
 * representing a hand-written signature, or a signature ceremony Different signature approaches have different
 * utilities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Signature">Signature</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Signature) on 2021-03-26
 */
public class Signature extends Element {

    public static final String resourceType = "Signature";

    // Indication of the reason the entity signed the object(s).
    @Json(name = "type")
    public List<Coding> type;

    // When the signature was created.
    @Json(name = "when")
    public FhirInstant when;

    // Who signed.
    @Json(name = "who")
    public Reference who;

    // The party represented.
    @Json(name = "onBehalfOf")
    @Nullable
    public Reference onBehalfOf;

    // The technical format of the signed resources.
    @Json(name = "targetFormat")
    @Nullable
    public String targetFormat;

    // The technical format of the signature.
    @Json(name = "sigFormat")
    @Nullable
    public String sigFormat;

    // The actual signature content (XML DigSig. JWS, picture, etc.).
    @Json(name = "data")
    @Nullable
    public String data;


    /**
     * Constructor for all required properties.
     *
     * @param type List of Coding
     * @param when FhirInstant
     * @param who  Reference
     */
    public Signature(List<Coding> type, FhirInstant when, Reference who) {
        this.type = type;
        this.when = when;
        this.who = who;
    }

    @Override
    public String getResourceType() {
        return Signature.resourceType;
    }


}