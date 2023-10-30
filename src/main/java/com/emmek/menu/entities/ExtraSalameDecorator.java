package com.emmek.menu.entities;

public class ExtraSalameDecorator extends ExtraAddictionDecorator {

    public ExtraSalameDecorator(Consumation consumation) {
        this.consumation = consumation;

    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " con prosciutto";
    }

    @Override
    public String getIngredients() {
        return "salame";
    }

    public double getPrice() {
        return consumation.getPrice() + 0.5;
    }
}
