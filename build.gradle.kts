import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    kotlin("jvm") version "2.0.10"
}

group = "nl.crystalnetwork"
version = "1.0-SNAPSHOT"

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
    kotlin.srcDirs("src/main/kotlin")
}

repositories {
    mavenCentral()
    mavenLocal()

    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
}

kotlin {
    jvmToolchain(21)
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release.set(21)
        options.compilerArgs = listOf("-parameters")
    }

    compileKotlin {
        compilerOptions.javaParameters = true
        compilerOptions.jvmTarget.set(JvmTarget.JVM_21)
    }
}