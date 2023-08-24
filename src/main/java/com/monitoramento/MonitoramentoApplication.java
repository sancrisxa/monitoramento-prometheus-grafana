package com.monitoramento;

import com.monitoramento.model.Person;
import com.monitoramento.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonitoramentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoramentoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonService personService) {
		return (args) -> {
			// save few person
			Person person1 = new Person();
			person1.setfName("Peter");
			person1.setlName("Parker");

			Person person2 = new Person();
			person2.setfName("Robert");
			person2.setlName("Smith");

			personService.save(person1);
			personService.save(person2);

			// fetch all person
			System.out.println("-----List of Persons------");
			for (Person person : personService.getPersonList()) {
				System.out.println("Person Detail:" + person);
			}
		};
	}

}
