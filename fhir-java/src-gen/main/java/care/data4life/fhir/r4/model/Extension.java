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
 * Extension.java
 * <p>
 * Optional Extension Element - found in all resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Extension">Extension</a>
 * <p>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Extension) on 2021-03-26
 */
public class Extension extends Element {

    public static final String resourceType = "Extension";

    // identifies the meaning of the extension.
    @Json(name = "url")
    public String url;

    // Value of extension.
    @Json(name = "valueBase64Binary")
    @Nullable
    public String valueBase64Binary;

    // Value of extension.
    @Json(name = "valueBoolean")
    @Nullable
    public Boolean valueBoolean;

    // Value of extension.
    @Json(name = "valueCanonical")
    @Nullable
    public Canonical valueCanonical;

    // Value of extension.
    @Json(name = "valueCode")
    @Nullable
    public String valueCode;

    // Value of extension.
    @Json(name = "valueDate")
    @Nullable
    public FhirDate valueDate;

    // Value of extension.
    @Json(name = "valueDateTime")
    @Nullable
    public FhirDateTime valueDateTime;

    // Value of extension.
    @Json(name = "valueDecimal")
    @Nullable
    public FhirDecimal valueDecimal;

    // Value of extension.
    @Json(name = "valueId")
    @Nullable
    public String valueId;

    // Value of extension.
    @Json(name = "valueInstant")
    @Nullable
    public FhirInstant valueInstant;

    // Value of extension.
    @Json(name = "valueInteger")
    @Nullable
    public Integer valueInteger;

    // Value of extension.
    @Json(name = "valueMarkdown")
    @Nullable
    public String valueMarkdown;

    // Value of extension.
    @Json(name = "valueOid")
    @Nullable
    public String valueOid;

    // Value of extension.
    @Json(name = "valuePositiveInt")
    @Nullable
    public Integer valuePositiveInt;

    // Value of extension.
    @Json(name = "valueString")
    @Nullable
    public String valueString;

    // Value of extension.
    @Json(name = "valueTime")
    @Nullable
    public FhirTime valueTime;

    // Value of extension.
    @Json(name = "valueUnsignedInt")
    @Nullable
    public Integer valueUnsignedInt;

    // Value of extension.
    @Json(name = "valueUri")
    @Nullable
    public String valueUri;

    // Value of extension.
    @Json(name = "valueUrl")
    @Nullable
    public String valueUrl;

    // Value of extension.
    @Json(name = "valueUuid")
    @Nullable
    public String valueUuid;

    // Value of extension.
    @Json(name = "valueAddress")
    @Nullable
    public Address valueAddress;

    // Value of extension.
    @Json(name = "valueAge")
    @Nullable
    public Age valueAge;

    // Value of extension.
    @Json(name = "valueAnnotation")
    @Nullable
    public Annotation valueAnnotation;

    // Value of extension.
    @Json(name = "valueAttachment")
    @Nullable
    public Attachment valueAttachment;

    // Value of extension.
    @Json(name = "valueCodeableConcept")
    @Nullable
    public CodeableConcept valueCodeableConcept;

    // Value of extension.
    @Json(name = "valueCoding")
    @Nullable
    public Coding valueCoding;

    // Value of extension.
    @Json(name = "valueContactPoint")
    @Nullable
    public ContactPoint valueContactPoint;

    // Value of extension.
    @Json(name = "valueCount")
    @Nullable
    public Count valueCount;

    // Value of extension.
    @Json(name = "valueDistance")
    @Nullable
    public Distance valueDistance;

    // Value of extension.
    @Json(name = "valueDuration")
    @Nullable
    public Duration valueDuration;

    // Value of extension.
    @Json(name = "valueHumanName")
    @Nullable
    public HumanName valueHumanName;

    // Value of extension.
    @Json(name = "valueIdentifier")
    @Nullable
    public Identifier valueIdentifier;

    // Value of extension.
    @Json(name = "valueMoney")
    @Nullable
    public Money valueMoney;

    // Value of extension.
    @Json(name = "valuePeriod")
    @Nullable
    public Period valuePeriod;

    // Value of extension.
    @Json(name = "valueQuantity")
    @Nullable
    public Quantity valueQuantity;

    // Value of extension.
    @Json(name = "valueRange")
    @Nullable
    public Range valueRange;

    // Value of extension.
    @Json(name = "valueRatio")
    @Nullable
    public Ratio valueRatio;

    // Value of extension.
    @Json(name = "valueReference")
    @Nullable
    public Reference valueReference;

    // Value of extension.
    @Json(name = "valueSampledData")
    @Nullable
    public SampledData valueSampledData;

    // Value of extension.
    @Json(name = "valueSignature")
    @Nullable
    public Signature valueSignature;

    // Value of extension.
    @Json(name = "valueTiming")
    @Nullable
    public Timing valueTiming;

    // Value of extension.
    @Json(name = "valueContactDetail")
    @Nullable
    public ContactDetail valueContactDetail;

    // Value of extension.
    @Json(name = "valueContributor")
    @Nullable
    public Contributor valueContributor;

    // Value of extension.
    @Json(name = "valueDataRequirement")
    @Nullable
    public DataRequirement valueDataRequirement;

    // Value of extension.
    @Json(name = "valueExpression")
    @Nullable
    public Expression valueExpression;

    // Value of extension.
    @Json(name = "valueParameterDefinition")
    @Nullable
    public ParameterDefinition valueParameterDefinition;

    // Value of extension.
    @Json(name = "valueRelatedArtifact")
    @Nullable
    public RelatedArtifact valueRelatedArtifact;

    // Value of extension.
    @Json(name = "valueTriggerDefinition")
    @Nullable
    public TriggerDefinition valueTriggerDefinition;

    // Value of extension.
    @Json(name = "valueUsageContext")
    @Nullable
    public UsageContext valueUsageContext;

    // Value of extension.
    @Json(name = "valueDosage")
    @Nullable
    public Dosage valueDosage;

    // Value of extension.
    @Json(name = "valueMeta")
    @Nullable
    public Meta valueMeta;


    /**
     * Constructor for all required properties.
     *
     * @param url String
     */
    public Extension(String url) {
        this.url = url;
    }

    @Override
    public String getResourceType() {
        return Extension.resourceType;
    }


}