package com.chuwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.chuwei.dao.repository")
@ComponentScan(basePackages = "com.chuwei")
public class CwSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CwSystemApplication.class, args);
	}
}
