package com.company.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {

    public Product createProduct(String id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        return new Food(id, name, price, rating, bestBefore );
    }

    public Product createProduct(String id, String name, BigDecimal price, Rating rating){
        return new Drink(id, name, price, rating);
    }
}
