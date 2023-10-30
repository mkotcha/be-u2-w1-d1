package com.emmek.menu.entities;

public class ExtraProsciuttoDecorator extends ExtraAddictionDecorator {

    public ExtraProsciuttoDecorator(Consumation consumation) {
        this.consumation = consumation;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName();
    }

    @Override
    public String getIngredients() {
        return consumation.getIngredients() + ", prosciutto";
    }

    public String getSingleIngredient() {
        return "prosciutto";
    }

    @Override
    public void singlePrint() {
        System.out.println(getSingleIngredient() + " - 1,00€\n");
    }

    public double getPrice() {
        return consumation.getPrice() + 1;
    }
}
