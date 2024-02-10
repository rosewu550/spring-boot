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
    api("org.springframework.data:spring-data-couchbase:3.1.11.RELEASE")
    api("io.projectreactor:reactor-core:3.2.12.RELEASE")
    api("io.reactivex:rxjava-reactive-streams:1.2.1")
}

description = "Spring Boot Data Couchbase Reactive Starter"