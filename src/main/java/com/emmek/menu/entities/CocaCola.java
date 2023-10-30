package com.emmek.menu.entities;

public class CocaCola extends Consumation {
    public CocaCola() {
        productName = "Coca Cola";
        ingredients = "zucchero, cola";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
