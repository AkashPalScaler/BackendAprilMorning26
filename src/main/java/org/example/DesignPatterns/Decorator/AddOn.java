package org.example.DesignPatterns.Decorator;

public abstract class AddOn extends Beverage {
    Beverage base;

    public AddOn(Beverage base) {
        if(base == null) throw new RuntimeException("Base beverage can't be null");
        this.base = base;
    }
}
