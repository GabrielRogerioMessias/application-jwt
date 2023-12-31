package com.messias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messias.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
