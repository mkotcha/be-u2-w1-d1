package com.emmek.menu.entities;

public class ExtraSalameDecorator extends ExtraAddictionDecorator {

    public ExtraSalameDecorator(Consumation consumation) {
        this.consumation = consumation;

    }

    @Override
    public String getProductName() {
        return consumation.getProductName();
    }

    @Override
    public String getIngredients() {
        return consumation.getIngredients() + ", salame";
    }

    public double getPrice() {
        return consumation.getPrice() + 0.5;
    }
}
