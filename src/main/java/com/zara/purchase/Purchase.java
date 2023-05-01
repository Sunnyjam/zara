package com.zara.purchase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Purchase {
    private int purchaseId;
    private int cartId;
    private int totalQuantity;
    private int totalPrice;
    private String id;
}
