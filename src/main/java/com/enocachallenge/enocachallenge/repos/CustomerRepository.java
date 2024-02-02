package com.enocachallenge.enocachallenge.repos;

import com.enocachallenge.enocachallenge.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
