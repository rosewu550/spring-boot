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
    api("org.springframework:spring-messaging:5.1.10.RELEASE")
    api("org.springframework.amqp:spring-rabbit:2.1.11.RELEASE")
}

description = "Spring Boot AMQP Starter"
