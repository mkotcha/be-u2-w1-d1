package com.emmek.menu;

import com.emmek.menu.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    @Primary
    Menu getMenu() {

        Consumation pizzaMargherita = new PizzaMargherita();

        Consumation pizza = new PizzaMargherita();

        Consumation pizzaS = new PizzaMargherita();
        Consumation pizzaSalami = new ExtraSalameDecorator(pizzaS);
        pizzaS.setProductName("Salami Pizza");

        Consumation pizzaA = new PizzaMargherita();
        Consumation pizzaAnanas = new ExtraAnanasDecorator(pizzaA);
        Consumation pizzaHawaii = new ExtraProsciuttoDecorator(pizzaAnanas);
        pizzaA.setProductName("Hawaiian Pizza");

        System.out.println(pizzaHawaii.toString());
        System.out.println(pizzaSalami.toString());

        List<Consumation> pizzas = List.of(pizza, pizzaHawaii, pizzaSalami);
        List<Consumation> drinks = List.of(new CocaCola(), new Birra(), new Acqua());
        List<Consumation> toppings = List.of(new ExtraSalameDecorator(pizza), new ExtraAnanasDecorator(pizza), new ExtraProsciuttoDecorator(pizza));

        System.out.println(pizza.toString());

        return new Menu(pizzas, drinks, toppings);
    }
}
