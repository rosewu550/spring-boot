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
    api("org.springframework:spring-jms:5.1.10.RELEASE")
    api("org.apache.activemq:artemis-jms-client:2.6.4")
    api("javax.jms:javax.jms-api:2.0.1")
    api("javax.json:javax.json-api:1.1.4")
}

description = "Spring Boot Artemis Starter"