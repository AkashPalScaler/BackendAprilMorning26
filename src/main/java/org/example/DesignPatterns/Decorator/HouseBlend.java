package org.example.DesignPatterns.Decorator;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        this.cost = 200;
        this.description = "Our unique in house blended coffee";
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
