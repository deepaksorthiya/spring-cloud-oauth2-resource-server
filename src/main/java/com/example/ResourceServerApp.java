package com.example;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ResourceServerApp {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServerApp.class, args);
	}

	@GetMapping("/user")
	public Principal getPrincipal(Principal principal) {
		return principal;
	}
}
