package com.emmek.menu.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public List<Consumation> pizzas = new ArrayList<>();
    public List<Consumation> beverages = new ArrayList<>();
    public List<Consumation> toppings = new ArrayList<>();

    public Menu(List<Consumation> pizzas, List<Consumation> beverages, List<Consumation> toppings) {
        this.pizzas = pizzas;
        this.beverages = beverages;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "\nSpring Pizza Menu:\n" +
                " pizzas:\n" + pizzas +
                " beverages:\n" + beverages +
                " toppings:\n" + toppings +
                "\n";
    }

    public void printMenu() {
        pizzas.forEach(System.out::println);
    }
}
