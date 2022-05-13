package com.cropdeal.CropService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="Crop Api", version ="2.0", description = "This is Crop Api used for Crop services" ))
public class CropServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(CropServiceApplication.class, args);

	}

}
