package org.example.DesignPatterns.Strategy;

import org.example.DesignPatterns.Strategy.PathCalculatorStrategies.CarPathCalculator;

import java.nio.file.Path;

public class PathCalculatorStrategy {
    public static PathCalculator getStrategy(String mode){
        if(mode == "car"){
            return new CarPathCalculator();
        }
        return null;
    }
}
