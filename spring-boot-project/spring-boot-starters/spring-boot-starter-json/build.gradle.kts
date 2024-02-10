/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("org.springframework.boot.java-conventions")
}

dependencies {
    api(project(":spring-boot-starter"))
    api("org.springframework:spring-web:5.1.10.RELEASE")
    api("com.fasterxml.jackson.core:jackson-databind:2.9.9.3")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.9.9")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.9")
    api("com.fasterxml.jackson.module:jackson-module-parameter-names:2.9.9")
}

description = "Spring Boot Json Starter"