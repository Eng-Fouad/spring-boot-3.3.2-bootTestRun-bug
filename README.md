#### Using spring boot 3.3.2:

- Run `/gradlew bootTestRun`

You will see in output:

```
System.getProperty("azureSqlEdgeDockerImageVersion") = null
System.getenv("azureSqlEdgeDockerImageVersion") = null
```

#### Using spring boot 3.3.1:

- Change spring boot version to 3.3.1 in `settings.gradle.kts`
- Run `/gradlew bootTestRun`

You will see in output:

```
System.getProperty("azureSqlEdgeDockerImageVersion") = 1.0.7
System.getenv("azureSqlEdgeDockerImageVersion") = 1.0.7
```