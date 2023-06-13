package com.gestion.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class gestionEmpleados {

	public static void main(String[] args) {
		SpringApplication.run(gestionEmpleados.class, args);
		System.out.println("api corriendo...");
	}

}
