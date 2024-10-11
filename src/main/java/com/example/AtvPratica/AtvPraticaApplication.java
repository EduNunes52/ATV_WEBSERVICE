package com.example.AtvPratica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AtvPraticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtvPraticaApplication.class, args);
	}

}
