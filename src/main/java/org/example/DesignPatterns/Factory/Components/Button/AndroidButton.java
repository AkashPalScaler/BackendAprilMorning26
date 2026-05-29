package org.example.DesignPatterns.Factory.Components.Button;

public class AndroidButton implements Button{
    @Override
    public void render() {
        System.out.println("Android Button rendered");
    }

    @Override
    public void onClick() {

    }
}
