package com.adevpro.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.adevpro.curso.entities.User;
import com.adevpro.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Stela", "Stela@hotmail.com", "969785905", "654321");
		User u2 = new User(null, "Gustavo", "Gustavo@hotmail.com", "27915250", "9876543");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
