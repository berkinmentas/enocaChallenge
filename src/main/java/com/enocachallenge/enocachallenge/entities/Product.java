package com.enocachallenge.enocachallenge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product extends BaseEntity{
    String product_name;
    String product_desc;
    int product_stock;
    double product_price;
}
