package com.company.productManagement;

import java.math.BigDecimal;

/**
 * @author LeeN
 * @version  1.0
 *
 */

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("312FDS21", "MACINTOSH", BigDecimal.valueOf(1.99));
        Product p2 = new Product("DFSKJ23K", "toshiba", BigDecimal.valueOf(0.99), Rating.FIVE_STAR);
        Product p5 = p2.applyRating(Rating.FOUR_STAR);


        System.out.println(
                " Product ID: " + p1.getId()
                        + " Product Name: " + p1.getName()
                        + " Price: " + p1.getPrice()
                        + " Discount: " + p1.getDiscountRate()
                        + " Rating: " + p1.getRating().getStars());


        System.out.println(
                " Product ID: " + p2.getId()
                        + " Product Name: " + p2.getName()
                        + " Price: " + p2.getPrice()
                        + " Discount: " + p2.getDiscountRate()
                        + " Rating: " + p2.getRating().getStars());
        System.out.println(
                " Product ID: " + p5.getId()
                        + " Product Name: " + p5.getName()
                        + " Price: " + p5.getPrice()
                        + " Discount: " + p5.getDiscountRate()
                        + " Rating: " + p5.getRating().getStars());



    }
}
