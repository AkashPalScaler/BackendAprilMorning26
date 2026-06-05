package org.example.DesignPatterns.Observer.Displays;

import org.example.DesignPatterns.Observer.Observer;
import org.example.DesignPatterns.Observer.WeatherData;

public class MaxDisplay implements Observer {
    Integer maxTemp;
    Float maxPrec;
    Integer maxAQI;

    public MaxDisplay() {
        this.maxTemp = Integer.MIN_VALUE;
        this.maxPrec = Float.MIN_VALUE;
        this.maxAQI = Integer.MIN_VALUE;
    }

    @Override
    public void notifyData(WeatherData weatherData) {
        System.out.println("Max display observer is notified");
        maxTemp = Math.max(maxTemp, weatherData.getTemp());
        maxPrec = Math.max(maxPrec, weatherData.getPrecipitation());
        maxAQI = Math.max(maxAQI, weatherData.getAQI());
    }

    public void display(){
        System.out.println("Max Temp today is " + maxTemp);
        System.out.println("Max Precipitation today is " + maxPrec);
        System.out.println("Max AQI today is " + maxAQI);
    }
}
