package com.adevpro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adevpro.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
