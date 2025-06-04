package com.vendasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
	servers = {@Server(url = "/", description = "Default Server URL")},
	info = @io.swagger.v3.oas.annotations.info.Info(
		title = "Vendas API",
		version = "1.0.0",
		description = "API para gerenciamento de vendas"
	)
)
@SpringBootApplication
public class VendasapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendasapiApplication.class, args);
	}

}
