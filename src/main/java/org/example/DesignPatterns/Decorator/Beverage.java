package org.example.DesignPatterns.Decorator;

public abstract class Beverage {
    String description;
    Integer cost;

    public Beverage() {
    }

    public Beverage(String description, Integer cost) {
        this.description = description;
        this.cost = cost;
    }

    public abstract Integer getCost();
    public abstract String getDescription();
}
