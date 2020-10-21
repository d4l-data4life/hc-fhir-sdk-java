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
 * DomainResource.java
 *
 * A resource that includes narrative, extensions, and contained resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DomainResource">DomainResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DomainResource) on 2020-10-19
 */
public class DomainResource extends Resource  {

	public static final String resourceType = "DomainResource";
  
	// Text summary of the resource, for human interpretation.
    @Json(name = "text")
	@Nullable
	public Narrative text;
  
	// Contained, inline Resources.
    @Json(name = "contained")
	@Nullable
	public List<Resource> contained;
  
	// Additional content defined by implementations.
    @Json(name = "extension")
	@Nullable
	public List<Extension> extension;
  
	// Extensions that cannot be ignored.
    @Json(name = "modifierExtension")
	@Nullable
	public List<Extension> modifierExtension;

    
	public DomainResource() {
	}
	@Override
	public String getResourceType() {
		return DomainResource.resourceType;
	}



}