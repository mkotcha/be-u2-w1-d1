package com.emmek.menu.entities;

public abstract class Consumation {

    String productName = "";
    String ingredients = "";

    public String getProductName() {
        return productName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public abstract double getPrice();
}
