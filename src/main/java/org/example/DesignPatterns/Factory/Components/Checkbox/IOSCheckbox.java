package org.example.DesignPatterns.Factory.Components.Checkbox;

public class IOSCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("IOS checkbox rendered");
    }
}
