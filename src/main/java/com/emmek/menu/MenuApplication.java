package com.emmek.menu;

import com.emmek.menu.entities.Consumation;
import com.emmek.menu.entities.ExtraAnanasDecorator;
import com.emmek.menu.entities.ExtraProsciuttoDecorator;
import com.emmek.menu.entities.PizzaMargherita;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);

        Consumation pizza = new PizzaMargherita();
        Consumation pizzaAnanas = new ExtraAnanasDecorator(pizza);
        Consumation pizzaHawaii = new ExtraProsciuttoDecorator(pizzaAnanas);
        pizza.setProductName("Hawaiian Pizza");

        System.out.println(pizzaHawaii.getProductName()
                + " ( " + pizzaHawaii.getIngredients() + " ) "
                + " price " + pizzaHawaii.getPrice() + "€");
    }


}
