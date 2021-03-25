package com.company.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Product implements Rateable<Product>, Serializable {
    private String id;
    private String name;
    private BigDecimal price;
    private Rating rating;

     Product(String id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    Product(String id, String name, BigDecimal price) {
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

//    public abstract Product applyRating(Rating newRating);

    @Override
    public String toString() {
        return  "id='" + id  + ", name= " + name  + ", price=" + price + ", Discount Rate="+ getDiscountRate() + ", Best Before="+getBestBefore() + ", rating=" + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

}
