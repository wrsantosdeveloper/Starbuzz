package com.starbuzz;

public class Creme extends CondimentDecorator {

    Beverage beverage;

    public Creme(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Creme";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
