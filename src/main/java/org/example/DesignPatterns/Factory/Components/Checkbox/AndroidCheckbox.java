package org.example.DesignPatterns.Factory.Components.Checkbox;

public class AndroidCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Android checkbox rendered");
    }
}
