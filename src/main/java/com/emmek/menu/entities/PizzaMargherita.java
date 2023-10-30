package com.emmek.menu.entities;

public class PizzaMargherita extends Consumation {

    public PizzaMargherita(String productName) {
        this.productName = productName;
        ingredients = "pomodoro, mozzarella";
    }

    public PizzaMargherita() {
        productName = "Pizza Margherita";
        ingredients = "pomodoro, mozzarella";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
