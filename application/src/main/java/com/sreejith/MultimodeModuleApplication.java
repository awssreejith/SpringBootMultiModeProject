package com.sreejith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sreejith"})
public class MultimodeModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultimodeModuleApplication.class, args);
	}

}
