buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()

        maven("https://dl.bintray.com/data4life/maven")
    }

    dependencies {
        classpath(ProjectConfig.gradlePlugin.android)
        classpath(ProjectConfig.gradlePlugin.kotlin)
    }
}

plugins {
    dependencyUpdates()

    id("scripts.versioning")
    id("scripts.publishing")
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "6.7.1"
    distributionType = Wrapper.DistributionType.ALL
}
