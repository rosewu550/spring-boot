/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("org.springframework.boot.java-conventions")
}

dependencies {
    api(project(":spring-boot"))
    api(project(":spring-boot-configuration-metadata"))
    api("javax.validation:validation-api:2.0.1.Final")
    api(project(":spring-boot-configuration-processor"))
    testImplementation(project(":spring-boot-starter-test"))
}

description = "Spring Boot Configuration Processor Tests"