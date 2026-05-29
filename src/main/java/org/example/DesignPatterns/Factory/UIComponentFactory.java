package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Checkbox.Checkbox;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Checkbox createCheckbox();
}
