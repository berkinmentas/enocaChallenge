package com.enocachallenge.enocachallenge.controllers;

import com.enocachallenge.enocachallenge.entities.Order;
import com.enocachallenge.enocachallenge.services.OrderService;
import org.springframework.web.bind.annotation.*;

//PlaceOrder
//GetOrderForCode
//GetAllOrdersForCustomer
@RestController
@RequestMapping("/orders")
public class OrderController {
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder(@RequestBody  Order order){
        return orderService.placeNewOrder(order);
    }

    @GetMapping
    public Order getOneOrder(@RequestParam int cartId){
        return orderService.getOneOrder(cartId);
    }
    @GetMapping
    public Order getAllOrders(@RequestParam int customerId){
        return orderService.getAllOrdersForCustomer(customerId);
    }
}
