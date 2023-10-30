package com.emmek.menu.entities;

public abstract class ExtraAddictionDecorator extends Consumation {
    protected Consumation consumation;

    @Override
    public abstract String getProductName();

    @Override
    public abstract String getIngredients();

}
