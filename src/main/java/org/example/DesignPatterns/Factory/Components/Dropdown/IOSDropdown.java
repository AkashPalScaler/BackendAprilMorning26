package org.example.DesignPatterns.Factory.Components.Dropdown;

public class IOSDropdown implements Dropdown{
    @Override
    public void render() {
        System.out.println("IOS dropdown rendered");
    }
}
