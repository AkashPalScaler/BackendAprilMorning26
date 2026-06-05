package org.example.DesignPatterns.Strategy;

public class GoogleMap {
    PathCalculator pc;
    Route findPath(String src, String dest, String mode){
        pc = PathCalculatorStrategy.getStrategy(mode);
        return pc.findPath(src, dest);
    }
}
