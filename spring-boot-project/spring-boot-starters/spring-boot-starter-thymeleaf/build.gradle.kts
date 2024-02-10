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
    api("org.thymeleaf:thymeleaf-spring5:3.0.11.RELEASE")
    api("org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE")
}

description = "Spring Boot Thymeleaf Starter"
