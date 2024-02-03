package com.enocachallenge.enocachallenge.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CartRequestDto {
    @Setter
    private int userId;

    public void setProductId(int productId) {
        this.productId = String.valueOf(productId);
    }

    private String productId;
}
