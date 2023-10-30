package com.emmek.menu.entities;

public class PizzaMargherita extends Consumation {

    public PizzaMargherita(String productName) {
        this.productName = productName;
        ingredients = "pomodoro, mozzarella";
        price = 5.0;
    }

    public PizzaMargherita() {
        productName = "Pizza Margherita";
        ingredients = "pomodoro, mozzarella";
        price = 5.0;
    }
}
