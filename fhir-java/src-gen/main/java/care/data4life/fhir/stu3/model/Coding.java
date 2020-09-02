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
 * Coding.java
 *
 * A reference to a code defined by a terminology system
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coding">Coding</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Coding) on 2020-07-29
 */
public class Coding extends Element {

  public static final String resourceType = "Coding";

  // Symbol in syntax defined by the system.
  @Json(name = "code")
  @Nullable
  public String code;

  // Representation defined by the system.
  @Json(name = "display")
  @Nullable
  public String display;

  // Identity of the terminology system.
  @Json(name = "system")
  @Nullable
  public String system;

  // If this coding was chosen directly by the user.
  @Json(name = "userSelected")
  @Nullable
  public Boolean userSelected;

  // Version of the system - if relevant.
  @Json(name = "version")
  @Nullable
  public String version;

  public Coding() {
  }

  @Override
  public String getResourceType() {
    return Coding.resourceType;
  }
}
