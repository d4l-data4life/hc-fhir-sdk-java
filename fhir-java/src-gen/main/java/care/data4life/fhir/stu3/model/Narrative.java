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

/**
 * Narrative.java
 *
 * A human-readable formatted text, including images
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Narrative">Narrative</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Narrative) on 2020-07-29
 */
public class Narrative extends Element {

  public static final String resourceType = "Narrative";

  // Limited xhtml content.
  @Json(name = "div")
  public String div;

  // The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
  @Json(name = "status")
  public CodeSystems.NarrativeStatus status;

  /**
   * Constructor for all required properties.
   *
   * @param div String
   * @param status CodeSystems.NarrativeStatus
   */
  public Narrative(String div, CodeSystems.NarrativeStatus status) {
    this.div = div;
    this.status = status;
  }

  @Override
  public String getResourceType() {
    return Narrative.resourceType;
  }
}
