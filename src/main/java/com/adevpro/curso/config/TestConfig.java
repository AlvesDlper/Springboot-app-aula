package com.adevpro.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.adevpro.curso.entities.Order;
import com.adevpro.curso.entities.User;
import com.adevpro.curso.entities.enums.OrderStatus;
import com.adevpro.curso.repositories.OrderRepository;
import com.adevpro.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Stela", "Stela@hotmail.com", "969785905", "654321");
		User u2 = new User(null, "Gustavo", "Gustavo@hotmail.com", "27915250", "9876543");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.CANCELED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.PAID, u1);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
