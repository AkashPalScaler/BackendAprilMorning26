package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Button.IOSButton;
import org.example.DesignPatterns.Factory.Components.Checkbox.Checkbox;
import org.example.DesignPatterns.Factory.Components.Checkbox.IOSCheckbox;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;
import org.example.DesignPatterns.Factory.Components.Dropdown.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Checkbox createCheckbox() {
        return new IOSCheckbox();
    }
}
