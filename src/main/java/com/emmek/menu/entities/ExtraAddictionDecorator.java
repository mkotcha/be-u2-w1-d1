package com.emmek.menu.entities;

public abstract class ExtraAddictionDecorator extends Consumation {
    protected Consumation consumation;

    @Override
    public abstract String getProductName();

    @Override
    public abstract String getIngredients();

    public abstract String getSingleIngredient();

    public void singlePrint() {
        System.out.println(getSingleIngredient() + " - 0,50€\n");
    }
}
