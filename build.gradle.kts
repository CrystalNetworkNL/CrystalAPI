import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    id("maven-publish")
    kotlin("jvm") version "2.0.10"
}

group = "nl.crystalnetwork"
version = "1.2-SNAPSHOT"

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

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }

        create<MavenPublication>("mavenKotlin") {
            from(components["kotlin"])
        }
    }
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