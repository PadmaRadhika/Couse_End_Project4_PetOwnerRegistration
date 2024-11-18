package com.example.petclinicownerregistration;

import org.springframework.boot.SpringApplication;

public class TestPetclinicownerregistrationApplication {

	public static void main(String[] args) {
		SpringApplication.from(PetclinicownerregistrationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
