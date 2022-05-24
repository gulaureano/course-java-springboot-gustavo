package com.gustavolaureano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavolaureano.course.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
