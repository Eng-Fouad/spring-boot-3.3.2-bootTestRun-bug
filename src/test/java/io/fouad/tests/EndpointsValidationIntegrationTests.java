package io.fouad.tests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.Import;
import io.fouad.AppLauncher;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = AppLauncher.class)
@Import(TestRunConfig.class)
public class EndpointsValidationIntegrationTests {
    
    @Test void test(){}
}