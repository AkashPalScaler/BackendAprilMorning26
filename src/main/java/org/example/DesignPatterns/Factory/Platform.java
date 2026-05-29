package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.Button;

public interface Platform {
    void setTheme();
    void setFrameRate();
//    Button createButton();

    UIComponentFactory createUiComponentFactory();
    HookFactory createHookFactory();



}
