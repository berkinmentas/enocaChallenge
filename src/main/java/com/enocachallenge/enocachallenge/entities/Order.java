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
@Table(name= "orders")
public class Order extends BaseEntity{
    @ManyToOne()
    @JoinColumn(name = "customer_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Customer customer;
    @OneToMany
    @JoinColumn(name = "order_details_id",nullable = false)
    private List<OrderDetails> orderDetails  = new ArrayList<>();
    int amount;
    double total_price;
    String status;

}
