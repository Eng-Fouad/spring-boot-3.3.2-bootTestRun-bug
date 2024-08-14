dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            version("graalvmPluginVersion", "0.10.2") // https://central.sonatype.com/artifact/org.graalvm.buildtools.native/org.graalvm.buildtools.native.gradle.plugin
            version("springBootLibVersion", "3.3.2") // https://central.sonatype.com/artifact/org.springframework.boot/spring-boot-dependencies
            version("testContainersLibVersion", "1.20.1") // https://central.sonatype.com/artifact/org.testcontainers/testcontainers-bom
            version("junitPlatformSuiteEngineLibVersion", "1.10.3") // https://central.sonatype.com/artifact/org.junit.platform/junit-platform-suite-engine
            version("junitJupiterEngineLibVersion", "5.10.3") // https://central.sonatype.com/artifact/org.junit.jupiter/junit-jupiter-engine
            version("mssqlJdbcLibVersion", "12.8.0.jre11") // https://central.sonatype.com/artifact/com.microsoft.sqlserver/mssql-jdbc
            version("azureSqlEdgeDockerImageVersion", "1.0.7") // https://learn.microsoft.com/en-us/azure/azure-sql-edge/release-notes
            
            plugin("graalvm", "org.graalvm.buildtools.native").versionRef("graalvmPluginVersion")
            plugin("springboot", "org.springframework.boot").versionRef("springBootLibVersion")

            library("libs.spring.boot.starter.web", "org.springframework.boot", "spring-boot-starter-web").versionRef("springBootLibVersion")
            library("libs.spring.boot.starter.test", "org.springframework.boot", "spring-boot-starter-test").versionRef("springBootLibVersion")
            library("libs.spring.boot.starter.testcontainers", "org.springframework.boot", "spring-boot-testcontainers").versionRef("springBootLibVersion")
            library("libs.spring.boot.starter.devtools", "org.springframework.boot", "spring-boot-devtools").versionRef("springBootLibVersion")
            library("libs.mssql.jdbc", "com.microsoft.sqlserver", "mssql-jdbc").versionRef("mssqlJdbcLibVersion")
            library("libs.testcontainers.mssql", "org.testcontainers", "mssqlserver").versionRef("testContainersLibVersion")
            library("libs.junit.suite", "org.junit.platform", "junit-platform-suite-engine").versionRef("junitPlatformSuiteEngineLibVersion")
            library("libs.junit.jupiter", "org.junit.jupiter", "junit-jupiter-engine").versionRef("junitJupiterEngineLibVersion")
        }
    }
}

rootProject.name = "spring-boot-3.3.2-bootTestRun-bug"