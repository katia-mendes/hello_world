package com.generation3.helloworld3.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world3")
public class HelloWorldController {

		@GetMapping
		public 	String helloWorld() {
			return "HelloWorld!!!";

	}
		
		@GetMapping ("/Bsm-Generation")
		public 	String BsmGeneration() {
			return "Persistência, Mentalidade de Crescimento,Orientação ao futuro, Trabalho em equipe, Proatividade,Responsabilidade pessoal, Comunicação e Orientação aos detalhes ";

	}
		
		@GetMapping("/Objetivos-de-aprendizagem")
		public String objetivos_de_aprendizagem () {
			return "Aprender Spring Boot";
		}
}
