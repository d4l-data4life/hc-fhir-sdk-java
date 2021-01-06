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

plugins {
  `java-library`
  jacoco

  id("scripts.publishing-config")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_7
  targetCompatibility = JavaVersion.VERSION_1_7

  sourceSets {
    main {
      java.setSrcDirs(
          setOf(
              "src/main/java",
              "src-gen/main/java"
          )
      )
    }

    test {
      java.setSrcDirs(
          setOf(
              "src/test/java",
              "src-gen/test/java"
          )
      )
      resources.setSrcDirs(
          setOf(
              "src/test/resources",
              "src-gen/test/resources"
          )
      )
    }
  }
}

dependencies {
  implementation(ProjectConfig.dependency.main.javaXAnnotation)
  implementation(ProjectConfig.dependency.main.moshi)
  implementation(ProjectConfig.dependency.main.moshiAdapters)

  testImplementation(ProjectConfig.dependency.test.jUnit)
  testImplementation(ProjectConfig.dependency.test.mockitoInline)
  testImplementation(ProjectConfig.dependency.test.jsonAssert)
}
