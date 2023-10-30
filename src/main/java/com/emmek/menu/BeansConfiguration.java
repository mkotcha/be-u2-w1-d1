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

        Consumation pizza = new PizzaMargherita();

        Consumation pizzaSalami = new PizzaMargherita("Salami Pizza");
        pizzaSalami = new ExtraSalameDecorator(pizzaSalami);

        Consumation pizzaHawaii = new PizzaMargherita("Hawaiian Pizza");
        pizzaHawaii = new ExtraAnanasDecorator(pizzaHawaii);
        pizzaHawaii = new ExtraProsciuttoDecorator(pizzaHawaii);

        List<Consumation> pizzas = List.of(pizza, pizzaHawaii, pizzaSalami);
        List<Consumation> drinks = List.of(new CocaCola(), new Birra(), new Acqua());
        List<ExtraAddictionDecorator> toppings = List.of(new ExtraSalameDecorator(pizza), new ExtraAnanasDecorator(pizza), new ExtraProsciuttoDecorator(pizza));

        return new Menu(pizzas, drinks, toppings);
    }
}
