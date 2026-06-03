package org.example.DesignPatterns.Decorator;

public class Milk extends AddOn{

    public Milk(Beverage base) {
        super(base);
        this.cost = 20;
        this.description = "Additional shot of milk";
    }

    @Override
    public Integer getCost() {
        return base.getCost() + this.cost;
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " - " +  this.description;
    }
}
