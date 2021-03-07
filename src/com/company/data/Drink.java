package com.company.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public final class Drink extends Product {
    Drink(String id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

     Drink(String id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscountRate() {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17, 30))
                && now.isBefore(LocalTime.of(18, 30)))
                ? super.getDiscountRate() : BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }
}
