package com.emmek.menu.entities;

public class PizzaMargherita extends Consumation {
    public PizzaMargherita() {
        productName = "Pizza Margherita";
        ingredients = "pomodoro, mozzarella";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
