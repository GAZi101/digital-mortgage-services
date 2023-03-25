package id.co.gemardy.digitalmortgageservice.digitalmortgageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class DigitalMortgageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalMortgageServiceApplication.class, args);
	}

}
