package com.psi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.psi.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDbApplication.class, args);
	}

}
