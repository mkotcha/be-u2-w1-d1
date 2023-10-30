package com.emmek.menu.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public List<Consumation> pizzas = new ArrayList<>();
    public List<Consumation> beverages = new ArrayList<>();
    public List<ExtraAddictionDecorator> toppings = new ArrayList<>();

    public Menu(List<Consumation> pizzas, List<Consumation> beverages, List<ExtraAddictionDecorator> toppings) {
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

        System.out.println("\nSpring Beans Pizza Menu:\n");
        System.out.println("\n pizzas:\n");
        pizzas.forEach(System.out::println);
        System.out.println("\n toppings:\n");
        toppings.forEach(ExtraAddictionDecorator::singlePrint);
        System.out.println("\n beverages:\n");
        beverages.forEach(System.out::println);
    }
}
