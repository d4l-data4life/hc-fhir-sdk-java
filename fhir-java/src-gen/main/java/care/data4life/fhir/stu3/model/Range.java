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
 * Range.java
 *
 * A set of ordered Quantities defined by a low and high limit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Range">Range</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Range) on 2020-07-29
 */
public class Range extends Element {

  public static final String resourceType = "Range";

  // High limit.
  @Json(name = "high")
  @Nullable
  public Quantity high;

  // Low limit.
  @Json(name = "low")
  @Nullable
  public Quantity low;

  public Range() {
  }

  @Override
  public String getResourceType() {
    return Range.resourceType;
  }
}
