package com.emmek.menu;

import com.emmek.menu.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);

//        Consumation pizzaMargherita = new PizzaMargherita();
//
//        Consumation pizza = new PizzaMargherita();
//
//        Consumation pizzaS = new PizzaMargherita();
//        Consumation pizzaSalami = new ExtraSalameDecorator(pizzaS);
//        pizzaS.setProductName("Salami Pizza");
//
//        Consumation pizzaA = new PizzaMargherita();
//        Consumation pizzaAnanas = new ExtraAnanasDecorator(pizzaA);
//        Consumation pizzaHawaii = new ExtraProsciuttoDecorator(pizzaAnanas);
//        pizzaA.setProductName("Hawaiian Pizza");
//
//        System.out.println(pizzaHawaii.toString());
//        System.out.println(pizzaSalami.toString());
//
//        List<Consumation> pizzas = List.of(pizza, pizzaHawaii, pizzaSalami);
//        List<Consumation> drinks = List.of(new CocaCola(), new Birra(), new Acqua());
//        List<Consumation> toppings = List.of(new ExtraSalameDecorator(pizza), new ExtraAnanasDecorator(pizza), new ExtraProsciuttoDecorator(pizza));
//
//        System.out.println(pizza.toString());
//
//        Menu menu = new Menu(pizzas, drinks, toppings);

        configurationClass();

    }

    private static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuApplication.class);

        Menu menu = ctx.getBean("getMenu", Menu.class);

        menu.printMenu();
    }


}
