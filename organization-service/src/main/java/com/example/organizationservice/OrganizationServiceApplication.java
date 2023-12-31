package com.example.organizationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(
		info = @Info(
				title = "Organization-Service",
				description = "Organization-service Doc",
				version = "v1.0",
				contact = @Contact(
						name = "Kiran",
						email = "saikiranankam19@gmail.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.udemy.com/"
				)
		),
		externalDocs =  @ExternalDocumentation(
				description = "Organization-service Doc",
				url = "https://www.udemy.com/"
		)
)
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
