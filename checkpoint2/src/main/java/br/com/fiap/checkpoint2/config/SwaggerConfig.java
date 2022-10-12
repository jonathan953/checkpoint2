package br.com.fiap.checkpoint2.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(
		title = "Aplicação de pedidos DTO", 
		version = "1.0", 
		description = "Projeto pedido DTO"))
public class SwaggerConfig {

}
