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
import javax.annotation.Nullable;

/**
 * Identifier.java
 *
 * A technical identifier - identifies some entity uniquely and unambiguously.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Identifier">Identifier</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Identifier) on 2020-07-29
 */
public class Identifier extends Element {

  public static final String resourceType = "Identifier";

  // Organization that issued id (may be just text).
  @Json(name = "assigner")
  @Nullable
  public Reference assigner;

  // Time period when id is/was valid for use.
  @Json(name = "period")
  @Nullable
  public Period period;

  // The namespace for the identifier value.
  @Json(name = "system")
  @Nullable
  public String system;

  // Description of identifier.
  @Json(name = "type")
  @Nullable
  public CodeableConcept type;

  // The purpose of this identifier.
  @Json(name = "use")
  @Nullable
  public CodeSystems.IdentifierUse use;

  // The value that is unique.
  @Json(name = "value")
  @Nullable
  public String value;

  public Identifier() {
  }

  @Override
  public String getResourceType() {
    return Identifier.resourceType;
  }
}
