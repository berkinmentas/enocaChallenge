package com.enocachallenge.enocachallenge.repos;

import com.enocachallenge.enocachallenge.entities.Cart;
import com.enocachallenge.enocachallenge.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    Order findByCustomerId(int oderId);
    Order findById(int orderId);

}
