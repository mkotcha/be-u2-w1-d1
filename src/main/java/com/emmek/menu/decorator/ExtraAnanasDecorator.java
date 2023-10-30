package com.emmek.menu.decorator;

public class ExtraAnanasDecorator extends ExtraAddictionDecorator {


    public ExtraAnanasDecorator(Consumation consumation) {
        this.consumation = consumation;
        isXl = consumation instanceof PizzaMargheritaXl || consumation.isXl;
    }

    @Override
    public String getProductName() {
        if (isXl) {
            return "Pizza XL";
        }
        return "Hawaiian Pizza";
    }

    @Override
    public String getIngredients() {
        return consumation.getIngredients() + ", ananas";
    }

    public String getSingleIngredient() {
        return "ananas";
    }

    public double getPrice() {
        return consumation.getPrice() + 0.5;
    }

    public void singlePrint() {
        System.out.println(getSingleIngredient() + " - 0,50€\n");
    }
}
