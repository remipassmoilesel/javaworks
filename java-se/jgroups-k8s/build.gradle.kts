/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.5.1/userguide/tutorial_java_projects.html
 */

application {
    mainClassName = "jgroups.k8s.JGroupsK8s"
}

plugins {
    idea
    java
    application
    id("org.springframework.boot").version("2.1.6.RELEASE")
}

apply(plugin = "io.spring.dependency-management");

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:27.1-jre")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jgroups:jgroups:4.1.1.Final")
    implementation("io.vavr:vavr:0.10.0")
    implementation("org.jgroups.kubernetes:jgroups-kubernetes:1.0.13.Final")

    compileOnly("org.projectlombok:lombok:1.18.8")
    annotationProcessor("org.projectlombok:lombok:1.18.8")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("junit:junit:4.12")
}
