package com.orderservice.repository;

import com.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public Interface OrderRepository extends JpaRepository<Order, Long> {


}
