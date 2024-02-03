package com.enocachallenge.enocachallenge.repos;

import com.enocachallenge.enocachallenge.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
//    Optional<Product> findByProduct_code(String product_code);
}
