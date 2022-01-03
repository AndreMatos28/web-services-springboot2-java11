package com.example.spring.repositories;

import com.example.spring.entities.OrderItem;
import com.example.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
