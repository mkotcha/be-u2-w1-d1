package com.emmek.menu.entities;

public class Birra extends Consumation {
    public Birra() {
        productName = "Birra";
        ingredients = "alcol";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
