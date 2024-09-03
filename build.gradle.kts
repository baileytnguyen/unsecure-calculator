plugins {
    id("java")
    id("application")
    id("distribution")
}

group = "edu.uta"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }
}

application {
    mainClass = "edu.uta.unsecurecalculator.CalculatorCLI"
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}