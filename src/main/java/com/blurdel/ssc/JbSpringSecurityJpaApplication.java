package com.blurdel.ssc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.blurdel.ssc.repositories")
public class JbSpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JbSpringSecurityJpaApplication.class, args);
	}

}
