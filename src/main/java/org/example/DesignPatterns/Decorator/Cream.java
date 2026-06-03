package org.example.DesignPatterns.Decorator;

public class Cream extends AddOn{
    public Cream(Beverage base) {
        super(base);
        this.cost = 50;
        this.description = "Additional pump of cream";
    }

    @Override
    public Integer getCost() {
        return base.getCost() + this.cost;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " - " + this.description;
    }
}
