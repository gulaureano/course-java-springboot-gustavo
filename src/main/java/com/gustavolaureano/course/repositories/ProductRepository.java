package com.gustavolaureano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavolaureano.course.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
