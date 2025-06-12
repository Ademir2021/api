package br.com.centroinfo.api.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		System.out.println("URL:: "+"http://localhost:8080/hello");
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World /") String name) {
		return String.format("Hello %s ", name + "\n Usuário ADMIN conectado com sucesso");
	}

}