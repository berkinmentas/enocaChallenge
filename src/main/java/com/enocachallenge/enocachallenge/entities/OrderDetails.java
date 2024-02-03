package com.enocachallenge.enocachallenge.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class OrderDetails extends BaseEntity{
    @ManyToOne()
    @JsonBackReference // Indicates the reverse part of a bi-directional relationship
    @JoinColumn(name = "orders_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Order order;
    double priceAtOrder;
    int quantity;
}
