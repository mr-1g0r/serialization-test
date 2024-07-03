import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
}

group = "io.mr1g0r.serializationtest"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val buildSerializationWriter = task("buildSerializationWriter") {
    dependsOn(":serialization-writer:build")
}

val buildSerializationReader = task("buildSerializationReader") {
    dependsOn(":serialization-reader:build")
}

val buildSubmodules = task("buildSubmodules") {
    dependsOn(buildSerializationWriter, buildSerializationReader)
    finalizedBy("build")
}

defaultTasks("buildSubmodules")