package com.lz.utilObserver;

import com.lz.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;

    private float humidity;

    private float pressure;


    public CurrentConditionDisplay() {
    }

    public CurrentConditionDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + " " + humidity + " " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
