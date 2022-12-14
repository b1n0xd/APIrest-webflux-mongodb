package com.example.webfluxapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WebfluxapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebfluxapiApplication.class, args);
		System.out.print("Ola mundo com webflux");
	}

}
