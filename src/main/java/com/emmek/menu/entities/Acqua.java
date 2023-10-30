package com.emmek.menu.entities;

public class Acqua extends Consumation {
    public Acqua() {
        productName = "Acqua";
        ingredients = "acqua";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
