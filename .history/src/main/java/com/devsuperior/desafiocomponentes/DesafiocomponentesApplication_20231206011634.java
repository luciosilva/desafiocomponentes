package com.devsuperior.desafiocomponentes;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafiocomponentes.entities.Order;

@SpringBootApplication
public class DesafiocomponentesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafiocomponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Order order new Order();
		order.setCode(sc.nextInt());

		sc.close();
		System.out.println("Pedido código " +);
	}

}
