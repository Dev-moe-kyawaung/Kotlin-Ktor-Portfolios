plugins {
    kotlin("jvm") version "2.0.21"
    id("io.ktor.plugin") version "3.4.0"
    kotlin("plugin.serialization") version "2.0.21"
}

group = "com.moe.portfolio"
version = "1.0.0"

application {
    mainClass.set("com.moe.portfolio.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:3.4.0")
    implementation("io.ktor:ktor-server-netty-jvm:3.4.0")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:3.4.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:3.4.0")
    implementation("io.ktor:ktor-server-html-builder-jvm:3.4.0")
    implementation("io.ktor:ktor-server-thymeleaf-jvm:3.4.0")
    implementation("io.ktor:ktor-server-status-pages-jvm:3.4.0")
    implementation("io.ktor:ktor-server-call-logging-jvm:3.4.0")
    implementation("io.ktor:ktor-server-default-headers-jvm:3.4.0")
    implementation("ch.qos.logback:logback-classic:1.5.12")
    implementation("org.thymeleaf:thymeleaf:3.1.2.RELEASE")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}
