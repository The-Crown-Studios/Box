plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

dependencies {
    shadow(project(":checker"))

    shadow("org.jetbrains:annotations:24.0.1")
    shadow("net.kyori:adventure-api:4.13.0")
}

tasks {
    build {
        finalizedBy(shadowJar)
    }
}