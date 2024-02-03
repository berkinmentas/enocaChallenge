package com.enocachallenge.enocachallenge.repos;

import com.enocachallenge.enocachallenge.entities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}
