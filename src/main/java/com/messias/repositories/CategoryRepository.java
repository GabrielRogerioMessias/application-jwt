package com.messias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messias.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
