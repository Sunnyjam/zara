package com.zara.cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart {
    private int cartId;
    private int productId;
    private String productName;
    private int productQuantity;
    private int productPrice;
    private int totalQuantity;
    private int totalPrice;

}
