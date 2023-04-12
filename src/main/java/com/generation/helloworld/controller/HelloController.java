package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello()
	{
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm()
	{
		return "Responsabilidade pessoal. <br/>"
				+ "Mentalidade de crescimento. <br/>"
				+ "Orientação ao futuro Persistência. <br/>"
				+ "Comunicação. <br/>"
				+ "Orientação aos Detalhes. <br/>"
				+ "Trabalho em equipe. <br/>"
				+ "Proatividade. <br/>"
				+ "Persistência. <br/>";
	}
	@GetMapping("/objt")
	public String objt()
	{
		return "Responsabilidade pessoal. <br/>"
				+ "Comunicação. <br/>"
				+ "Gestao de tempo.";
	}

}
