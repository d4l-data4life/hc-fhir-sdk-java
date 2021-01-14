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

package scripts

plugins {
    `java-library`
    `maven-publish`
}

tasks.named<JacocoReport>("jacocoTestReport") {
    reports {
        xml.isEnabled = true
        csv.isEnabled = false
    }
}

tasks.register<Jar>("sourcesJar") {
    from(sourceSets.main.get().allSource)
    archiveClassifier.set("sources")
}

tasks.register<Jar>("javadocJar") {
    from(tasks.javadoc)
    archiveClassifier.set("javadoc")
}

tasks.javadoc {
    isFailOnError = false
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/d4l-data4life/hc-fhir-sdk-java")
            credentials {
                username = project.findProperty("gpr.user") as String?
                        ?: System.getenv("PACKAGE_REGISTRY_USERNAME")
                password = project.findProperty("gpr.key") as String?
                        ?: System.getenv("PACKAGE_REGISTRY_TOKEN")
            }
        }

        val target = "file://${project.rootProject.buildDir}/gitPublish"

        maven {
            name = "ReleasePackages"
            url = uri("$target/releases")
        }

        maven {
            name = "SnapshotPackages"
            url = uri("$target/snapshots")
        }

        maven {
            name = "FeaturePackages"
            url = uri("$target/features")
        }
    }

    publications {
        create<MavenPublication>("jvm") {
            groupId = ProjectConfig.library.publish.groupId

            from(components["java"])
            artifact(tasks["sourcesJar"])
            artifact(tasks["javadocJar"])

            pom {
                name.set(ProjectConfig.library.publish.name)
                description.set(ProjectConfig.library.publish.description)
                url.set(ProjectConfig.library.publish.url)
                inceptionYear.set(ProjectConfig.library.publish.year)

                scm {
                    connection.set(ProjectConfig.library.publish.scmConnection)
                    developerConnection.set(ProjectConfig.library.publish.scmDeveloperConnection)
                    url.set(ProjectConfig.library.publish.scmUrl)
                }
                licenses {
                    license {
                        name.set(ProjectConfig.library.publish.licenseName)
                        url.set(ProjectConfig.library.publish.licenseUrl)
                        distribution.set(ProjectConfig.library.publish.licenseDistribution)
                    }
                }
                developers {
                    developer {
                        id.set(ProjectConfig.library.publish.developerId)
                        name.set(ProjectConfig.library.publish.developerName)
                        email.set(ProjectConfig.library.publish.developerEmail)
                    }
                }
            }
        }
    }
}
