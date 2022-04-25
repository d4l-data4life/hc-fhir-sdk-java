/*
 * Copyright (c) 2021 D4L data4life gGmbH / All rights reserved.
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
package care.data4life.gradle.fhir.dependency

object Version {
    object GradlePlugin {
        const val kotlin = Version.kotlin
        const val android = "7.0.2"
    }

    // Kotlin
    // https://github.com/JetBrains/kotlin
    const val kotlin = "1.6.10"

    // Java
    const val javaXAnnotation = "3.0.2"

    // Data
    /**
     * [moshi](https://github.com/square/moshi)
     */
    const val moshi = "1.13.0"

    // Junit Test
    const val jUnit = "4.13.2"

    /**
     * [mockito](https://github.com/mockito/mockito)
     */
    const val mockito = "4.5.1"

    const val jsonassert = "1.5.0"
}
