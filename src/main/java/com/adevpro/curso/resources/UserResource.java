package com.adevpro.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adevpro.curso.entities.User;

@RestController // Anotation responsável por indicar que a classe é implementada por um
@RequestMapping(value = "/users") // Anotation que mapeia (dá nome para) o caminho para acesso à este Classe (end point).
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User(1, "Arthur", "Arthur_s.a@hotmail.com", "991528225", "123456");
		return ResponseEntity.ok().body(u);
	}
}
