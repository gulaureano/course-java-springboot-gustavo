package com.gustavolaureano.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavolaureano.course.domain.Product;
import com.gustavolaureano.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Product findById(Long id) {
		Optional<Product> optional = repository.findById(id);
		return optional.get();
	}
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
}
