package com.company.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {

    private LocalDate bestBefore;

     Food(String id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

     Food(String id, String name, BigDecimal price, LocalDate bestBefore) {
        super(id, name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

//    @Override
//    public String toString() {
//        return  super.toString() + ", bestBefore=" + bestBefore;
//    }

    @Override
    public BigDecimal getDiscountRate() {
        return (bestBefore.isEqual(LocalDate.now())) ? super.getDiscountRate() :BigDecimal.ZERO;
    }

    @Override
    public Food applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(), newRating, bestBefore);
    }
}
