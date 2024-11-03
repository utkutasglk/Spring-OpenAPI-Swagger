package com.example.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Account Rest API Definition",
				description = "Account Rest API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Utku Tasguluk",
						email = "utku.tasguluk@gmail.com",
						url="linkedin./utku"
				),
				license = @License(
						name = "Apache 2.0",
						url = "utku.com"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Account Rest API Documentation",
				url = "utku.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
