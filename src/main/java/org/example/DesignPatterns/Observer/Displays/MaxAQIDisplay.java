package org.example.DesignPatterns.Observer.Displays;

import org.example.DesignPatterns.Observer.Observer;
import org.example.DesignPatterns.Observer.WeatherData;

public class MaxAQIDisplay implements Observer {
    Integer maxAQI;

    public MaxAQIDisplay() {
        this.maxAQI = Integer.MIN_VALUE;
    }

    @Override
    public void notifyData(WeatherData weatherData) {
        maxAQI = Math.max(maxAQI, weatherData.getTemp());
    }

    public void display(){
        System.out.println("Max AQI today is " + maxAQI);
    }
}
