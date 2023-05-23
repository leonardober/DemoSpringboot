package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/*aca se cambia numero de puerto */
		/*System.setProperty("server.port", "se coloca numeo de puerto") */
		SpringApplication.run(DemoApplication.class, args);
	}

}
