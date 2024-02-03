package com.enocachallenge.enocachallenge.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "cart")
public class Cart extends BaseEntity {
    @JsonBackReference
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private double totalPrice;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
}
