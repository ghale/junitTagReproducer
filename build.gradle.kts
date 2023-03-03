plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.withType<Test> {
    useJUnitPlatform {
        excludeTags("develop", "restdocs")
    }
}

tasks.register<Test>("restDocsTest") {
    group = "verification"
    useJUnitPlatform {
        includeTags("restdocs")
    }
}