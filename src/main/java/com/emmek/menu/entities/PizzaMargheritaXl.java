package com.emmek.menu.entities;

public class PizzaMargheritaXl extends Consumation {
    public PizzaMargheritaXl() {
        productName = "Pizza Margherita XL";
        ingredients = "pomodoro, mozzarella";
    }

    @Override
    public double getPrice() {
        return 8.0;
    }
}
