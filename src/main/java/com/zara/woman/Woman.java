package com.zara.woman;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Woman {
    private int womanId;
    private String womanTop;
    private String womanBottom;
    private int womanPrice;
    private int womanStock;
}
