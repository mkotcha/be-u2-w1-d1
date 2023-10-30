package com.emmek.menu.entities;

import lombok.Getter;

@Getter
public abstract class Consumation {

    String productName = "";
    String ingredients = "";
    double price;

    @Override
    public String toString() {
        return getProductName() + " ( " + getIngredients() + " ) " + " - " + getPrice() + " €\n";
    }

}
