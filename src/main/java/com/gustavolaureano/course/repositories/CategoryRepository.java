package com.gustavolaureano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavolaureano.course.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
