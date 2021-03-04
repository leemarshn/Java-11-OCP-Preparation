package com.company.productManagement;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
//        price  = BigDecimal.valueOf(80);
        this.price = price;
    }


    public BigDecimal getDiscountRate(){
        return  price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }




}
