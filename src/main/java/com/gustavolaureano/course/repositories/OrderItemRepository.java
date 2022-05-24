package com.gustavolaureano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavolaureano.course.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
