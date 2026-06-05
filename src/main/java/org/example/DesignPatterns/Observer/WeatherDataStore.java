package org.example.DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataStore implements Publisher{
    //Data List
    List<WeatherData> weatherDataList; // this is the sole store


    List<Observer> observerList; // All data observers
    List<AQIObserver> AQIObserverList; // Only AQI data observer

    public WeatherDataStore() {
        this.weatherDataList = new ArrayList<>();
        this.observerList = new ArrayList<>();
    }

    public void setWeatherData(WeatherData weatherData){
        weatherDataList.add(weatherData);
        notifyAllObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o:observerList){
            o.notifyData(weatherDataList.getLast());
        }
        for(AQIObserver o : AQIObserverList){
            o.notifyData(weatherDataList.getLast().AQI);
        }
    }
}
// WeatherDataStore
// Temp - 10,20,300,.........
// AQI - 100,200, .......
// PRec - 132,143,........
