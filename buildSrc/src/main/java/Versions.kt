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

object Versions {
    val gradlePlugin = GradlePluginVersion

    val main = MainVersion
    val test = TestVersion
    val androidTest = AndroidTestVersion
}

object GradlePluginVersion {
    const val kotlin = Versions.main.kotlin
    const val android = "3.3.1"

    /**
     * [Gradle DownloadTask](https://github.com/michel-kraemer/gradle-download-task)
     */
    const val downloadTask = "3.4.3"
}


object MainVersion {
    // Kotlin
    const val kotlin = "1.3.61"

    // Java
    const val javaXAnnotation = "3.0.2"

    // Data
    /**
     * [moshi](https://github.com/square/moshi)
     */
    const val moshi = "1.8.0"
}

object TestVersion {
    // Junit Test
    const val jUnit = "4.13"

    /**
     * [mockito](https://github.com/mockito/mockito)
     */
    const val mockito = "2.24.0"
}

object AndroidTestVersion {
    // Android Test
    const val androidTest = "1.0.2"

    const val espresso = "3.0.2"
}
