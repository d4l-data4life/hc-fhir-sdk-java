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
 * Reference.java
 *
 * A reference from one resource to another
 * 
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Reference">Reference</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Reference) on 2020-10-19
 */
public class Reference extends Element  {

	public static final String resourceType = "Reference";
  
	// Literal reference, Relative, internal or absolute URL.
    @Json(name = "reference")
	@Nullable
	public String reference;
  
	// Type the reference refers to (e.g. "Patient").
    @Json(name = "type")
	@Nullable
	public String type;
  
	// Logical reference, when literal reference is not known.
    @Json(name = "identifier")
	@Nullable
	public Identifier identifier;
  
	// Text alternative for the resource.
    @Json(name = "display")
	@Nullable
	public String display;

    
	public Reference() {
	}
	@Override
	public String getResourceType() {
		return Reference.resourceType;
	}



}