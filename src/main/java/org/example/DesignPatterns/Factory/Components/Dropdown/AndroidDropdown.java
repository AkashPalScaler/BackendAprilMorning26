package org.example.DesignPatterns.Factory.Components.Dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public void render() {
        System.out.println("Android dropdown rendered");
    }
}
