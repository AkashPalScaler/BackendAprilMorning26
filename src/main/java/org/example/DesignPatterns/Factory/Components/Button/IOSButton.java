package org.example.DesignPatterns.Factory.Components.Button;

public class IOSButton implements Button{
    @Override
    public void render() {
        System.out.println("IOS Button Rendered");
    }

    @Override
    public void onClick() {

    }
}
