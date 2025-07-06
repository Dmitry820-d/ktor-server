import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

val exposed_version: String by project
val h2_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "2.1.10"
    id("io.ktor.plugin") version "3.2.1"
    //id("com.github.johnrengelman.shadow") version "8.1.1"

    //id("com.github.johnrengelman.shadow") version "9.0.0" // shadow plugin for fat jars
}

group = "com.example"
version = "0.0.1"

application {
    mainClass = "com.example.ApplicationKt"
}

repositories {
    mavenCentral()
    google()       // Google's repository
    gradlePluginPortal() // обязательный репозиторий для Gradle плагинов
}

//tasks.withType<ShadowJar> {
//    archiveBaseName.set("${project.name}-all")
//    mergeServiceFiles() // required to merge service files from different libraries
//}



dependencies {
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-auth")
    implementation("io.ktor:ktor-server-auth-jwt")
    implementation("io.ktor:ktor-server-call-logging")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
    implementation("org.jetbrains.exposed:exposed-core:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposed_version")
    implementation("com.h2database:h2:$h2_version")
    implementation("io.ktor:ktor-server-netty")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-test-host")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
