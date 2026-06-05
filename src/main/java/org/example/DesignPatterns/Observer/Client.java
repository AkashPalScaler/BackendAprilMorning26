package org.example.DesignPatterns.Observer;

import org.example.DesignPatterns.Observer.Displays.MaxDisplay;

public class Client {
    public static void main(String[] args) {
        WeatherDataStore weatherDataStore = new WeatherDataStore();
        Observer maxDisplay  = new MaxDisplay();
        weatherDataStore.register(maxDisplay);

        //Weather sensor
        weatherDataStore.setWeatherData(new WeatherData(100, 120.0f, 200));
        weatherDataStore.setWeatherData(new WeatherData(120, 100.0f, 210));
        weatherDataStore.setWeatherData(new WeatherData(90, 150.0f, 220));

        weatherDataStore.unregister(maxDisplay);

        weatherDataStore.setWeatherData(new WeatherData(80, 180.0f, 190));

        maxDisplay.display();
    }
}
