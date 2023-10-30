package com.emmek.menu.decorator;

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

    public String getSingleIngredient() {
        return "salame";
    }

    public double getPrice() {
        return consumation.getPrice() + 1.5;
    }

    @Override
    public void singlePrint() {
        System.out.println(getSingleIngredient() + " - 1,50€\n");
    }
}
