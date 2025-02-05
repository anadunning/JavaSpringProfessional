package com.devsuperior.lesson;

import com.devsuperior.entities.Employee;
import com.devsuperior.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class LessonApplication implements CommandLineRunner {

	private SalaryService salaryService;

	public LessonApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(LessonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.00);
		System.out.println(salaryService.netSalary(employee));
	}
}
