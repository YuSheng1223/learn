package com.lz.utilObserver;

import org.junit.Test;

/***
 * 使用java自带的Observable实现观察者模式
 * Observable中做了并发相关的处理 更加安全
 * 同时
 */
public class TestUtilObserver {

    public static void main(String[] args) {

        // 被观察的对象 主题
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,100,120);


    }

    @Test
    public void test(){

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();

        weatherData.addObserver(currentConditionDisplay);

        weatherData.setMeasurements(80,100,120);
    }
}
