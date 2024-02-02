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
@Table(name= "customers")
public class Customer extends BaseEntity{
    String customer_name;
    String customer_surname;
    String customer_email;
    String customer_password;
    @OneToOne
    @JoinColumn(name = "cart_id",nullable = false)
    private Cart cart;
    @OneToMany
    @JoinColumn(name = "order_id",nullable = false)
    private List<Order> orders = new ArrayList<>();
}
