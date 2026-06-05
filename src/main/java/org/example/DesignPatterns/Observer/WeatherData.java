package org.example.DesignPatterns.Observer;

public class WeatherData {
    Integer temp;
    Float precipitation;
    Integer AQI;

    public WeatherData(Integer temp, Float precipitation, Integer AQI) {
        this.temp = temp;
        this.precipitation = precipitation;
        this.AQI = AQI;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Float getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Float precipitation) {
        this.precipitation = precipitation;
    }

    public Integer getAQI() {
        return AQI;
    }

    public void setAQI(Integer AQI) {
        this.AQI = AQI;
    }
}
