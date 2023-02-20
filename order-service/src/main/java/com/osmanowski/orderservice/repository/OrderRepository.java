package com.osmanowski.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osmanowski.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
