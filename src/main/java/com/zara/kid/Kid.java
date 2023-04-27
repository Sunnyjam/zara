package com.zara.kid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Kid {
    private int kidId;
    private String kidTop;
    private String kidBottom;
    private int kidPrice;
    private int kidStock;
}
