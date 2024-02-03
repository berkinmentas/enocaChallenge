package com.enocachallenge.enocachallenge.services;

import com.enocachallenge.enocachallenge.entities.Customer;
import com.enocachallenge.enocachallenge.repos.CartRepository;
import com.enocachallenge.enocachallenge.repos.CustomerRepository;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CustomerService {
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer createNewCustomer(Customer newCustomer) {

        return customerRepository.save(newCustomer);
    }
    public Customer findById(int id){
        return customerRepository.findById((id)).orElse(null);
    }
}
