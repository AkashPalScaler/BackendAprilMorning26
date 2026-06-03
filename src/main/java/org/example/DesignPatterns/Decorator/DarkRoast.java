package org.example.DesignPatterns.Decorator;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        this.cost = 150;
        this.description = "Our best dark roasted coffee";
    }

    @Override
    public Integer getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
