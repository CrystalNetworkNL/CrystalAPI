import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.9.20"
    kotlin("jvm") version "2.0.10"
}

group = "nl.crystalnetwork"
version = "1.4-SNAPSHOT"

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
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")
    compileOnly("dev.triumphteam:triumph-gui:3.1.10")
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

    register<Jar>("dokkaJar") {
        from(dokkaHtml)
        dependsOn(dokkaHtml)
        archiveClassifier.set("javadoc")
    }

    dokkaHtml {
        outputDirectory.set(file("docs/html"))
    }

    dokkaJavadoc {
        outputDirectory.set(file("docs/jd"))
    }

    dokkaGfm {
        outputDirectory.set(file("docs/md"))
    }

    build {
        dependsOn("dokkaHtml", "dokkaGfm", "dokkaJavadoc")
    }

    publish {
        dependsOn("build")
    }
}