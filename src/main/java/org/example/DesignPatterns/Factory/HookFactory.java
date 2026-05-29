package org.example.DesignPatterns.Factory;

import org.example.DesignPatterns.Factory.Hooks.AuthenticationHook.AuthHook;
import org.example.DesignPatterns.Factory.Hooks.LoggerHook.LoggerHook;

import java.util.logging.Logger;

public interface HookFactory {
    AuthHook createAuthhook();
    LoggerHook createLoggerHook();
}
