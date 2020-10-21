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
 * Attachment.java
 *
 * For referring to data content defined in other formats.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Attachment">Attachment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Attachment) on 2020-10-19
 */
public class Attachment extends Element  {

	public static final String resourceType = "Attachment";
  
	// Mime type of the content, with charset etc..
    @Json(name = "contentType")
	@Nullable
	public String contentType;
  
	// Human language of the content (BCP-47).
    @Json(name = "language")
	@Nullable
	public String language;
  
	// Data inline, base64ed.
    @Json(name = "data")
	@Nullable
	public String data;
  
	// Uri where the data can be found.
    @Json(name = "url")
	@Nullable
	public Url url;
  
	// Number of bytes of content (if url provided).
    @Json(name = "size")
	@Nullable
	public Integer size;
  
	// Hash of the data (sha-1, base64ed).
    @Json(name = "hash")
	@Nullable
	public String hash;
  
	// Label to display in place of the data.
    @Json(name = "title")
	@Nullable
	public String title;
  
	// Date attachment was first created.
    @Json(name = "creation")
	@Nullable
	public FhirDateTime creation;

    
	public Attachment() {
	}
	@Override
	public String getResourceType() {
		return Attachment.resourceType;
	}



}