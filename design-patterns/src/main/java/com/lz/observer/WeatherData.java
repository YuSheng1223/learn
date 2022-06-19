package com.lz.observer;

import java.util.ArrayList;

/***
 * 气象站  实现主题接口
 */
public class WeatherData implements Subject {

    private ArrayList observerList;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observerList = new ArrayList();
    }


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {

        for (int i = 0; i < observerList.size(); i++) {
            Observer o = (Observer) observerList.get(i);
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
