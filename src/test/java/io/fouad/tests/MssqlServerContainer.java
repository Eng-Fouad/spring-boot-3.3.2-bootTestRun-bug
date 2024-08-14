package io.fouad.tests;

import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.utility.DockerImageName;

public class MssqlServerContainer<T extends MssqlServerContainer<T>> extends MSSQLServerContainer<T> {
    
    private static final String MSSQL_DOCKER_IMAGE_NAME = "mcr.microsoft.com/azure-sql-edge:" +
                                                          System.getProperty("azureSqlEdgeDockerImageVersion");

    @SuppressWarnings("resource")
    public MssqlServerContainer() {
        super(DockerImageName.parse(MSSQL_DOCKER_IMAGE_NAME)
                             .asCompatibleSubstituteFor("mcr.microsoft.com/mssql/server"));
        addEnv("ACCEPT_EULA", "Y");
        getPortBindings().add("1433:1433");
        withPassword("Abcd@123");
        withReuse(true);
    }
}