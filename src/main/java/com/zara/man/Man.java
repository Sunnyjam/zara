package com.zara.man;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Man {
    private int manId;
    private String manTop;
    private String manBottom;
    private int manPrice;
    private int manStock;
}
