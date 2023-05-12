package com.tekwill.lesson39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson39Application implements CommandLineRunner {


	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(Lesson39Application.class, args);

		// Inversion Of Control -  Schimb de control
		// Dependency Injection -  Injectarea de dependinte
	}

	@Override
	public void run(String... args) throws Exception {
		personService.getPersons();
	}
}
