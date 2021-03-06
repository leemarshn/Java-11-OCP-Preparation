package com.company.productManagement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product(String id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }



    public Rating getRating() {
        return rating;
    }

    public BigDecimal getDiscountRate(){
        return  price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public Product applyRating(Rating newRating){
        return  new Product(id, name, price, newRating);
    }




}
