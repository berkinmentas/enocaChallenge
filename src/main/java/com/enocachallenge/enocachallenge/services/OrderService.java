package com.enocachallenge.enocachallenge.services;

import com.enocachallenge.enocachallenge.entities.Order;
import com.enocachallenge.enocachallenge.repos.OrderRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeNewOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOneOrder(int cartId) {
        return orderRepository.findById(cartId);
    }

    public Order getAllOrdersForCustomer(int customerId) {
        return (Order) orderRepository.findAll(Pageable.ofSize(customerId));
    }
}
