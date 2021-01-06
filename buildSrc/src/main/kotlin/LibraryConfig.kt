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

    const val group = "care.data4life"
    const val name = "hc-fhir-sdk-java"

    const val githubOwner = "d4l-data4life"
    const val githubRepository = "hc-fhir-sdk-java"

    val publish = PublishConfig
    object PublishConfig {
        const val name = LibraryConfig.name
        const val groupId = LibraryConfig.group
        const val description = "Minimal FHIR 3 + 4 standard models and data types for Android and Java."
        const val year = "2020"

        // URL
        const val host = "github.com"
        const val path = "$githubOwner/$githubRepository"

        const val url = "https://$host/$path"

        // DEVELOPER
        const val developerId = "d4l-data4life"
        const val developerName = "D4L data4life gGmbH"
        const val developerEmail = "mobile@data4life.care"

        // LICENSE
        const val licenseName = "Private"
        const val licenseUrl = "$url/blob/main/LICENSE"
        const val licenseDistribution = "repo"

        // SCM
        const val scmUrl = "git://$host/$path.git"
        const val scmConnection = "scm:$scmUrl"
        const val scmDeveloperConnection = scmConnection
    }
}