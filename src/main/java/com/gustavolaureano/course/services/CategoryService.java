package com.gustavolaureano.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavolaureano.course.domain.Category;
import com.gustavolaureano.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repository;
	
	public Category findById(Long id) {
		Optional<Category> optional = repository.findById(id);
		return optional.get();
	}
	
	public List<Category> findAll(){
		return repository.findAll();
	}

}
