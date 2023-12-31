package com.emmek.menu;

import com.emmek.menu.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
        configurationClass();

    }

    private static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuApplication.class);

        Menu menu = ctx.getBean("getMenu", Menu.class);

        menu.printMenu();
    }


}
