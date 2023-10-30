package com.emmek.menu.entities;

public abstract class Consumation {

    String productName = "";
    String ingredients = "";

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        return getProductName() + " ( " + getIngredients() + " ) " + " - " + getPrice() + " €\n";
    }
}
