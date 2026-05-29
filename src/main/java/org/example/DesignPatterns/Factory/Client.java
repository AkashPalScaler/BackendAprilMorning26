package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Button.IOSButton;
import org.example.DesignPatterns.Factory.Components.Checkbox.Checkbox;
import org.example.DesignPatterns.Factory.Components.Dropdown.Dropdown;


public class Client {
    public static void main(String[] args) {
        String platform_config = "IOS"; //From env variable

        Platform platform = PlatformFactory.getPlatform(platform_config);

        UIComponentFactory uiComponentFactory = platform.createUiComponentFactory();

        Button b = uiComponentFactory.createButton();
        Dropdown d = uiComponentFactory.createDropdown();
        Checkbox c = uiComponentFactory.createCheckbox();

        b.render();
        d.render();
        c.render();

        b.onClick();

    }
}
// After implementing Factory of factory
//  Platform platform = PlatformFactory.getPlatform(platform_config);
// UIComponentFactory uiComponentFactory =
// platform.createParentFactory.createUIComponentFactory();