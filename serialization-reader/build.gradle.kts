plugins {
    id("java")
    id("application")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

group = "io.mr1g0r.serializationtest.reader"
version = "1.0-SNAPSHOT"

application {
    // Replace this with your actual main class
    mainClass.set("io.mr1g0r.serializationtest.reader.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":serialization-common"))
    implementation("org.projectlombok:lombok:1.18.20")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}