package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Components.Button.AndroidButton;
import org.example.DesignPatterns.Factory.Components.Button.Button;

public class AndroidPlatform implements Platform{
    @Override
    public void setTheme() {

    }

    @Override
    public void setFrameRate() {

    }

    @Override
    public UIComponentFactory createUiComponentFactory() {
        return new AndroidUIComponentFactory();
    }

//    @Override
//    public Button createButton() {
//        return new AndroidButton();
//    }


}
