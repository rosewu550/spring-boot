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
    api(project(":spring-boot-actuator"))
    api(project(":spring-boot-actuator-autoconfigure"))
    api(project(":spring-boot-autoconfigure"))
    api(project(":spring-boot-cli"))
    api(project(":spring-boot-starters"))
    api(project(":spring-boot-devtools"))
    api(project(":spring-boot-loader"))
    api(project(":spring-boot-loader-tools"))
    api(project(":spring-boot-test"))
    api(project(":spring-boot-test-autoconfigure"))
    api("io.rest-assured:rest-assured:3.1.1")
    api("org.springframework.restdocs:spring-restdocs-restassured:2.0.4.RELEASE")
    api("ch.qos.logback:logback-classic:1.2.3")
    api("com.atomikos:transactions-jms:4.0.6")
    api("com.atomikos:transactions-jta:4.0.6")
    api("com.atomikos:transactions-jdbc:4.0.6")
    api("com.couchbase.client:java-client:2.7.9")
    api("com.couchbase.client:couchbase-spring-cache:2.1.0")
    api("com.fasterxml.jackson.core:jackson-databind:2.9.9.3")
    api("com.fasterxml.jackson.datatype:jackson-datatype-joda:2.9.9")
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.9.9")
    api("com.fasterxml.jackson.module:jackson-module-parameter-names:2.9.9")
    api("com.github.ben-manes.caffeine:caffeine:2.6.2")
    api("com.google.code.gson:gson:2.8.5")
    api("com.hazelcast:hazelcast:3.11.4")
    api("com.hazelcast:hazelcast-client:3.11.4")
    api("com.hazelcast:hazelcast-spring:3.11.4")
    api("com.h2database:h2:1.4.199")
    api("com.jayway.jsonpath:json-path:2.4.0")
    api("com.samskivert:jmustache:1.14")
    api("com.sendgrid:sendgrid-java:4.3.0")
    api("com.unboundid:unboundid-ldapsdk:4.0.11")
    api("com.zaxxer:HikariCP:3.2.0")
    api("de.flapdoodle.embed:de.flapdoodle.embed.mongo:2.1.2")
    api("io.dropwizard.metrics:metrics-core:4.0.6")
    api("io.lettuce:lettuce-core:5.1.8.RELEASE")
    api("io.micrometer:micrometer-core:1.1.7")
    api("io.micrometer:micrometer-jersey2:1.1.7")
    api("io.micrometer:micrometer-registry-appoptics:1.1.7")
    api("io.micrometer:micrometer-registry-atlas:1.1.7")
    api("io.micrometer:micrometer-registry-datadog:1.1.7")
    api("io.micrometer:micrometer-registry-dynatrace:1.1.7")
    api("io.micrometer:micrometer-registry-elastic:1.1.7")
    api("io.micrometer:micrometer-registry-ganglia:1.1.7")
    api("io.micrometer:micrometer-registry-graphite:1.1.7")
    api("io.micrometer:micrometer-registry-humio:1.1.7")
    api("io.micrometer:micrometer-registry-influx:1.1.7")
    api("io.micrometer:micrometer-registry-jmx:1.1.7")
    api("io.micrometer:micrometer-registry-kairos:1.1.7")
    api("io.micrometer:micrometer-registry-new-relic:1.1.7")
    api("io.micrometer:micrometer-registry-prometheus:1.1.7")
    api("io.micrometer:micrometer-registry-signalfx:1.1.7")
    api("io.micrometer:micrometer-registry-statsd:1.1.7")
    api("io.micrometer:micrometer-registry-wavefront:1.1.7")
    api("io.projectreactor.netty:reactor-netty:0.8.12.RELEASE")
    api("io.prometheus:simpleclient_pushgateway:0.5.0")
    api("io.reactivex:rxjava-reactive-streams:1.2.1")
    api("io.undertow:undertow-servlet:2.0.26.Final")
    api("io.searchbox:jest:6.3.1")
    api("io.undertow:undertow-websockets-jsr:2.0.26.Final")
    api("javax.cache:cache-api:1.1.1")
    api("javax.jms:javax.jms-api:2.0.1")
    api("javax.json.bind:javax.json.bind-api:1.0")
    api("javax.mail:javax.mail-api:1.6.2")
    api("javax.servlet:javax.servlet-api:4.0.1")
    api("org.junit.jupiter:junit-jupiter-api:5.3.2")
    api("net.sf.ehcache:ehcache:2.10.6")
    api("net.sourceforge.htmlunit:htmlunit:2.33")
    api("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect:2.3.0")
    api("org.apache.activemq:activemq-client:5.15.10")
    api("org.apache.activemq:artemis-jms-client:2.6.4")
    api("org.apache.activemq:activemq-jms-pool:5.15.10")
    api("org.apache.activemq:artemis-jms-server:2.6.4")
    api("org.apache.activemq:activemq-pool:5.15.10")
    api("org.apache.commons:commons-pool2:2.6.2")
    api("org.apache.commons:commons-dbcp2:2.5.0")
    api("org.apache.derby:derby:10.14.2.0")
    api("org.apache.kafka:kafka-streams:2.0.1")
    api("org.apache.logging.log4j:log4j-api:2.11.2")
    api("org.apache.logging.log4j:log4j-core:2.11.2")
    api("org.apache.httpcomponents:httpclient:4.5.10")
    api("org.apache.tomcat.embed:tomcat-embed-core:9.0.26")
    api("org.apache.tomcat.embed:tomcat-embed-jasper:9.0.26")
    api("org.apache.tomcat.embed:tomcat-embed-websocket:9.0.26")
    api("org.apache.tomcat:tomcat-jdbc:9.0.26")
    api("org.aspectj:aspectjweaver:1.9.4")
    api("org.codehaus.btm:btm:2.1.4")
    api("org.codehaus.groovy:groovy:2.5.8")
    api("org.codehaus.groovy:groovy-xml:2.5.8")
    api("org.codehaus.groovy:groovy-templates:2.5.8")
    api("org.eclipse.jetty:jetty-util:9.4.19.v20190610")
    api("org.eclipse.jetty:jetty-servlets:9.4.19.v20190610")
    api("org.eclipse.jetty:jetty-webapp:9.4.19.v20190610")
    api("org.eclipse.jetty.websocket:javax-websocket-server-impl:9.4.19.v20190610")
    api("org.eclipse.jetty:jetty-alpn-conscrypt-server:9.4.19.v20190610")
    api("org.eclipse.jetty:jetty-reactive-httpclient:1.0.3")
    api("org.eclipse.jetty.http2:http2-server:9.4.19.v20190610")
    api("org.elasticsearch.client:elasticsearch-rest-high-level-client:6.4.3")
    api("org.flywaydb:flyway-core:5.2.4")
    api("org.freemarker:freemarker:2.3.29")
    api("org.glassfish.jersey.containers:jersey-container-servlet-core:2.27")
    api("org.glassfish.jersey.ext:jersey-spring4:2.27")
    api("org.glassfish.jersey.media:jersey-media-json-jackson:2.27")
    api("org.jboss:jboss-transaction-spi:7.6.0.Final")
    api("org.jboss.logging:jboss-logging:3.3.3.Final")
    api("org.jooq:jooq:3.11.12")
    api("org.hibernate:hibernate-core:5.3.12.Final")
    api("org.hibernate:hibernate-jcache:5.3.12.Final")
    api("org.hibernate.validator:hibernate-validator:6.0.17.Final")
    api("org.infinispan:infinispan-jcache:9.4.16.Final")
    api("org.infinispan:infinispan-spring4-embedded:9.4.16.Final")
    api("org.influxdb:influxdb-java:2.14")
    api("org.jolokia:jolokia-core:1.6.2")
    api("org.liquibase:liquibase-core:3.6.3")
    api("org.messaginghub:pooled-jms:1.0.6")
    api("org.mongodb:mongodb-driver-async:3.8.2")
    api("org.mongodb:mongodb-driver-reactivestreams:1.9.2")
    api("org.quartz-scheduler:quartz:2.3.1")
    api("org.skyscreamer:jsonassert:1.5.0")
    api("org.slf4j:slf4j-api:1.7.28")
    api("org.slf4j:jul-to-slf4j:1.7.28")
    api("org.seleniumhq.selenium:selenium-api:3.14.0")
    api("org.seleniumhq.selenium:htmlunit-driver:2.33.0")
    api("org.springframework:spring-context-support:5.1.10.RELEASE")
    api("org.springframework:spring-jms:5.1.10.RELEASE")
    api("org.springframework:spring-messaging:5.1.10.RELEASE")
    api("org.springframework:spring-orm:5.1.10.RELEASE")
    api("org.springframework:spring-web:5.1.10.RELEASE")
    api("org.springframework:spring-webflux:5.1.10.RELEASE")
    api("org.springframework:spring-webmvc:5.1.10.RELEASE")
    api("org.springframework:spring-websocket:5.1.10.RELEASE")
    api("org.springframework.amqp:spring-rabbit:2.1.11.RELEASE")
    api("org.springframework.batch:spring-batch-core:4.1.2.RELEASE")
    api("org.springframework.cloud:spring-cloud-connectors-core:2.0.6.RELEASE")
    api("org.springframework.cloud:spring-cloud-spring-service-connector:2.0.6.RELEASE")
    api("org.springframework.integration:spring-integration-core:5.1.8.RELEASE")
    api("org.springframework.integration:spring-integration-jdbc:5.1.8.RELEASE")
    api("org.springframework.integration:spring-integration-jmx:5.1.8.RELEASE")
    api("org.springframework.kafka:spring-kafka:2.2.9.RELEASE")
    api("org.springframework.security:spring-security-config:5.1.6.RELEASE")
    api("org.springframework.security:spring-security-oauth2-client:5.1.6.RELEASE")
    api("org.springframework.security:spring-security-oauth2-jose:5.1.6.RELEASE")
    api("org.springframework.security:spring-security-oauth2-resource-server:5.1.6.RELEASE")
    api("org.springframework.security:spring-security-test:5.1.6.RELEASE")
    api("org.springframework.session:spring-session-core:2.1.9.RELEASE")
    api("org.springframework.session:spring-session-hazelcast:2.1.9.RELEASE")
    api("org.springframework.session:spring-session-jdbc:2.1.9.RELEASE")
    api("org.springframework.session:spring-session-data-mongodb:2.1.4.RELEASE")
    api("org.springframework.session:spring-session-data-redis:2.1.9.RELEASE")
    api("org.springframework.data:spring-data-cassandra:2.1.11.RELEASE")
    api("org.springframework.data:spring-data-commons:2.1.11.RELEASE")
    api("org.springframework.data:spring-data-couchbase:3.1.11.RELEASE")
    api("org.springframework.data:spring-data-elasticsearch:3.1.11.RELEASE")
    api("org.springframework.data:spring-data-jdbc:1.0.11.RELEASE")
    api("org.springframework.data:spring-data-jpa:2.1.11.RELEASE")
    api("org.springframework.data:spring-data-ldap:2.1.11.RELEASE")
    api("org.springframework.data:spring-data-mongodb:2.1.11.RELEASE")
    api("org.springframework.data:spring-data-neo4j:5.1.11.RELEASE")
    api("org.springframework.data:spring-data-redis:2.1.11.RELEASE")
    api("org.springframework.data:spring-data-rest-core:3.1.11.RELEASE")
    api("org.springframework.data:spring-data-rest-webmvc:3.1.11.RELEASE")
    api("org.springframework.data:spring-data-solr:4.0.11.RELEASE")
    api("org.springframework.hateoas:spring-hateoas:0.25.2.RELEASE")
    api("org.springframework.restdocs:spring-restdocs-mockmvc:2.0.4.RELEASE")
    api("org.springframework.restdocs:spring-restdocs-webtestclient:2.0.4.RELEASE")
    api("org.springframework.security:spring-security-data:5.1.6.RELEASE")
    api("org.springframework.security:spring-security-web:5.1.6.RELEASE")
    api("org.springframework.ws:spring-ws-core:3.0.7.RELEASE")
    api("org.thymeleaf:thymeleaf-spring5:3.0.11.RELEASE")
    api("com.github.mxab.thymeleaf.extras:thymeleaf-extras-data-attribute:2.0.1")
    api("org.thymeleaf.extras:thymeleaf-extras-java8time:3.0.4.RELEASE")
    api("org.thymeleaf.extras:thymeleaf-extras-springsecurity5:3.0.4.RELEASE")
    api("org.yaml:snakeyaml:1.23")
    api("redis.clients:jedis:2.9.3")
    testImplementation(project(":spring-boot-test-support"))
    testImplementation(project(":spring-boot-starter-web"))
}

description = "Spring Boot Docs"
