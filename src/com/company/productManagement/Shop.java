package com.company.productManagement;

import java.math.BigDecimal;

/**
 * @author LeeN
 * @version  1.0
 *
 */

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setId("1234567");
        p1.setName("Sweet Mac");
        p1.setPrice(BigDecimal.valueOf(200));

        System.out.println(
                  "Product ID: " +  p1.getId()
                + " Product Name: " + p1.getName()
                + " Price: " + p1.getPrice()
                + " Discount: " + p1.getDiscountRate());

    }
}
