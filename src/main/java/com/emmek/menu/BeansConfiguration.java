package com.emmek.menu;

import com.emmek.menu.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    public Consumation getPizzaXl() {
        return new PizzaMargheritaXl();
    }

    @Bean
    @Primary
    Menu getMenu() {

        Consumation pizza = new PizzaMargherita();

        Consumation pizzaSalami = new PizzaMargherita("Salami Pizza");
        pizzaSalami = new ExtraSalameDecorator(pizzaSalami);

        Consumation pizzaHawaii = new PizzaMargherita("Hawaiian Pizza");
        pizzaHawaii = new ExtraAnanasDecorator(pizzaHawaii);
        pizzaHawaii = new ExtraProsciuttoDecorator(pizzaHawaii);
//        pizzaHawaii = new ExtraProsciuttoDecorator(pizzaHawaii);

        Consumation pizzaXl = new ExtraSalameDecorator(getPizzaXl());
        pizzaXl = new ExtraProsciuttoDecorator(pizzaXl);
        pizzaXl = new ExtraAnanasDecorator(pizzaXl);


        List<Consumation> pizzas = List.of(pizza, pizzaHawaii, pizzaSalami, pizzaXl);
        List<Drink> drinks = List.of(new Drink("Coca Cola", 0.33, 2.5),
                new Drink("wather", 0.5, 1),
                new AlcoholicDrink("beer", 0.33, 3, 4.5));
        List<ExtraAddictionDecorator> toppings = List.of(new ExtraSalameDecorator(pizza), new ExtraAnanasDecorator(pizza), new ExtraProsciuttoDecorator(pizza));

        return new Menu(pizzas, drinks, toppings);
    }
}
