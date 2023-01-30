package com.anderson.desafio1;

import com.anderson.entities.Order;
import com.anderson.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.anderson"})
public class Desafio1Application  implements CommandLineRunner {
	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: "+ order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order) );
	}
}
