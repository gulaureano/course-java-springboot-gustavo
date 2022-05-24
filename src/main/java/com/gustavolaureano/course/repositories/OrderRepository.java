package com.gustavolaureano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavolaureano.course.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
