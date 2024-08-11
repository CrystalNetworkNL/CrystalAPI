import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    id("maven-publish")
    id("net.saliman.properties") version "1.5.2"
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

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/CrystalNetworkNL/CrystalAPI")

            credentials {
                username = (property("gpr.name") ?: System.getenv("GITHUB_ACTOR")).toString()
                password = (property("gpr.token") ?: System.getenv("GITHUB_TOKEN")).toString()
            }
        }
    }

    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])

            groupId = "net.crystalnetwork"
            artifactId = "api"
            version = project.version.toString()
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