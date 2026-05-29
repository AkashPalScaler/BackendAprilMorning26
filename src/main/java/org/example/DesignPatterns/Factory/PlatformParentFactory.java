package org.example.DesignPatterns.Factory;

public interface PlatformParentFactory {
    UIComponentFactory createUiComponentFactory();
    HookFactory createHookFactory();
}
