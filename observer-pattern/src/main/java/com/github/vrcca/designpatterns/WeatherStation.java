package com.github.vrcca.designpatterns;

import com.github.vrcca.designpatterns.model.WeatherData;
import com.github.vrcca.designpatterns.view.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 70, 29.2F);
    }
}
