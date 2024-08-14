package io.fouad.tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.fouad.AppLauncher;

@SpringBootApplication
public class TestAppLauncher {
	public static void main(String[] args) {
		SpringApplication.from(AppLauncher::main).with(TestRunConfig.class).run(args);
	}
}