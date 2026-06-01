package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.Button;
import org.example.DesignPatterns.Factory.Components.Button.IOSButton;

public class IOSPlatform implements Platform{
    @Override
    public void setTheme() {

    }

    @Override
    public void setFrameRate() {

    }

    @Override
    public UIComponentFactory createUiComponentFactory() {
        return new IOSUIComponentFactory();
    }

    @Override
    public HookFactory createHookFactory() {
        return null;
    }

//    @Override
//    public Button createButton() {
//        return new IOSButton();
//    }


}
