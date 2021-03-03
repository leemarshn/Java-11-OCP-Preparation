package com.company;

import java.math.BigDecimal;

public class BigDecimal1 {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(787.2336);
        BigDecimal tax = BigDecimal.valueOf(0.2);
        BigDecimal totalRev = price.add(tax);

        System.out.println(totalRev);

    }
}
