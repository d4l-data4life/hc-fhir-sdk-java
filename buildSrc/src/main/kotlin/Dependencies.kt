import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

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

object GradlePluginDependency {
    const val android = "com.android.tools.build:gradle:${Versions.gradlePlugin.android}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.gradlePlugin.kotlin}"
}

fun PluginDependenciesSpec.dependencyUpdates(): PluginDependencySpec =
id("com.github.ben-manes.versions").version(Versions.gradlePlugin.dependencyUpdates)

object MainDependency {
    const val javaXAnnotation = "com.google.code.findbugs:jsr305:${Versions.main.javaXAnnotation}"

    const val moshi = "com.squareup.moshi:moshi:${Versions.main.moshi}"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Versions.main.moshi}"
}

object TestDependency {
    const val jUnit = "junit:junit:${Versions.test.jUnit}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.test.mockito}"
    const val jsonAssert = "org.skyscreamer:jsonassert:1.5.0"
}