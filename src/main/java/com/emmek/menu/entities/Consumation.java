package com.emmek.menu.entities;

import lombok.Getter;

public abstract class Consumation {

    @Getter
    String productName = "";
    @Getter
    String ingredients = "";
    @Getter
    double price;

    @Override
    public String toString() {
        return getProductName() + " ( " + getIngredients() + " ) " + " - " + getPrice() + " €\n";
    }

}
