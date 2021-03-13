package com.adevpro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adevpro.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
