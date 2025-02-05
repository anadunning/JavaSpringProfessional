package com.anadunning.challenge_components_dependency_injection;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anadunning.challenge_components_dependency_injection.entities.Order;
import com.anadunning.challenge_components_dependency_injection.services.OrderService;

@SpringBootApplication
public class ChallengeComponentsDependencyInjectionApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeComponentsDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();	
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("Pedido código: " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
		
	}
}
