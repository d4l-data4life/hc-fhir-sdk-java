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

import javax.annotation.Nullable;

/**
 * ParameterDefinition.java
 * <p>
 * The parameters to the module. This collection specifies both the input and output parameters.
 * Input parameters are provided by the caller as part of the $evaluate operation. Output parameters
 * are included in the GuidanceResponse.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ParameterDefinition">ParameterDefinition</a>
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ParameterDefinition)
 * on 2020-10-21
 */
public class ParameterDefinition extends Element {

    public static final String resourceType = "ParameterDefinition";

    // Name used to access the parameter value.
    @Json(name = "name")
    @Nullable
    public String name;

    // Whether the parameter is input or output for the module.
    @Json(name = "use")
    public CodeSystemOperationParameterUse use;

    // Minimum cardinality.
    @Json(name = "min")
    @Nullable
    public Integer min;

    // Maximum cardinality (a number of *).
    @Json(name = "max")
    @Nullable
    public String max;

    // A brief description of the parameter.
    @Json(name = "documentation")
    @Nullable
    public String documentation;

    // What type of value.
    @Json(name = "type")
    public String type;

    // What profile the value is expected to be.
    @Json(name = "profile")
    @Nullable
    public Canonical profile;


    /**
     * Constructor for all required properties.
     *
     * @param use  CodeSystemOperationParameterUse
     * @param type String
     */
    public ParameterDefinition(CodeSystemOperationParameterUse use, String type) {
        this.use = use;
        this.type = type;
    }

    @Override
    public String getResourceType() {
        return ParameterDefinition.resourceType;
    }


}
