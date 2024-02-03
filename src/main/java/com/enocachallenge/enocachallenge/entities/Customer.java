package com.enocachallenge.enocachallenge.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer extends BaseEntity {
    String customer_name;
    String customer_surname;
    String customer_email;
    String customer_password;

}
