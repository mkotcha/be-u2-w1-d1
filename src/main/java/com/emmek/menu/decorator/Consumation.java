package com.emmek.menu.decorator;

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
