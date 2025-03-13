package com.teste.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController

public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	@GetMapping("/mago")
	public String hello(@RequestParam(value = "nome", defaultValue = "Grande Mago") String nome) {
		return String.format("Olá %s!", nome);
	}

	@GetMapping("/hello")
	public String hello2(@RequestParam(value = "nome", defaultValue = "World") String nome) {
		return String.format("Hello %s!", nome);
	}

}
