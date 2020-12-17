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

object LibraryConfig {
  const val version = "1.1.0"
  const val artifactId = "hc-fhir-sdk-java"
  const val githubGroup = "care.data4life.$artifactId"
  const val group = githubGroup
  const val name = "d4l-data4life/$artifactId"
  const val host = "github.com"
  const val url = "https://$host/$name"
  const val description = "Minimal FHIR standard models and data types for Android"
  const val year = "2020"

  // DEVELOPER
  const val developerId = "d4l-data4life"
  const val developerName = "D4L data4life gGmbH"
  const val developerEmail = "mobile@data4life.care"

  // LICENSE
  const val licenseName = ""
  const val licenseUrl = "$url/blob/main/LICENSE"
  const val licenseDistribution = "repo"

  // SCM
  const val scmUrl = "git://$host/$name.git"
  const val scmConnection = "scm:$scmUrl"
  const val scmDeveloperConnection = "$scmConnection"

}
