plugins {
    java
    alias(deps.plugins.graalvm)
    alias(deps.plugins.springboot)
}

group = "io.fouad"
version = "1.0"

repositories {
    mavenCentral()
}

val graal by sourceSets.creating

dependencies {
    implementation(deps.libs.spring.boot.starter.web)
    runtimeOnly(deps.libs.mssql.jdbc)
    testImplementation(deps.libs.spring.boot.starter.test)
    testImplementation(deps.libs.spring.boot.starter.testcontainers)
    testImplementation(deps.libs.spring.boot.starter.devtools)
    testImplementation(deps.libs.junit.suite)
    testImplementation(deps.libs.junit.jupiter)
    testImplementation(deps.libs.testcontainers.mssql)
}

springBoot {
    mainClass.set("io.fouad.AppLauncher")
}

tasks.getByName<org.springframework.boot.gradle.plugin.ResolveMainClassName>("resolveTestMainClassName") {
    configuredMainClassName.set("io.fouad.tests.TestAppLauncher")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

//val devEnvironmentVariables = emptyMap<String, String>()
val devSystemProperties = mapOf("azureSqlEdgeDockerImageVersion" to deps.versions.azureSqlEdgeDockerImageVersion.get())

tasks.named<org.springframework.boot.gradle.tasks.run.BootRun>("bootTestRun") {
    environment(devSystemProperties)
    systemProperties(devSystemProperties)
}

tasks.test {
    useJUnitPlatform()
    environment(devSystemProperties)
    systemProperties(devSystemProperties)
}