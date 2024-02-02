package com.enocachallenge.enocachallenge.entities;

import jakarta.persistence.*;
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
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Customer customer;
    @OneToMany
    @JoinColumn(name = "product_id",nullable = false)
    private List<Product> products  = new ArrayList<>();

}
