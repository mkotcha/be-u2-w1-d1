package com.emmek.menu.entities;

public class ExtraProsciuttoDecorator extends ExtraAddictionDecorator {

    public ExtraProsciuttoDecorator(Consumation consumation) {
        this.consumation = consumation;

    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " con prosciutto";
    }

    @Override
    public String getIngredients() {
        return "prosciutto";
    }

    public double getPrice() {
        return consumation.getPrice() + 0.5;
    }
}
