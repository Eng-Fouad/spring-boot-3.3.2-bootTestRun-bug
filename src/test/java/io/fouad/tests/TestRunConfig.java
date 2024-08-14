package io.fouad.tests;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestRunConfig {
    
    @Bean
    @ServiceConnection("mssql")
    @RestartScope
    public MssqlServerContainer<?> mssqlServerContainer() {
        System.out.println("System.getProperty(\"azureSqlEdgeDockerImageVersion\") = " + System.getProperty("azureSqlEdgeDockerImageVersion"));
        System.out.println("System.getenv(\"azureSqlEdgeDockerImageVersion\") = " + System.getenv("azureSqlEdgeDockerImageVersion"));
        return new MssqlServerContainer<>();
    }
}