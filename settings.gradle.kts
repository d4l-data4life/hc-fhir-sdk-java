pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

includeBuild("gradlePlugin/fhir-dependency")

plugins {
    id("com.gradle.enterprise") version("3.4.1")
}

include(":fhir-java")
include(":fhir-doc")

buildCache {
    local {
        isEnabled = true
        directory = File(rootDir, "build-cache")
        removeUnusedEntriesAfterDays = 30
    }
}

rootProject.name = "hc-fhir-sdk-java"
