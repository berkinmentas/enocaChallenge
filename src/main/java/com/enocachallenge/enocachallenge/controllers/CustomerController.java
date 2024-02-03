package com.enocachallenge.enocachallenge.controllers;

import com.enocachallenge.enocachallenge.entities.Customer;
import com.enocachallenge.enocachallenge.services.CartService;
import com.enocachallenge.enocachallenge.services.CustomerService;
import org.springframework.web.bind.annotation.*;
import com.enocachallenge.enocachallenge.entities.Cart;

import java.util.List;
//AddCustomer
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;
    private CartService cartService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer newCustomer){
       return customerService.createNewCustomer(newCustomer);
    }
}
