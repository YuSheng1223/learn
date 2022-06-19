package com.lz.observer;

/***
 * 观察者测试  由主题主动推送的模式·
 */
public class WeatherStation {


    public static void main(String[] args) {
        // 被观察的对象 主题
        WeatherData weatherData = new WeatherData();
        // 观察者只需要注册到主题上就可以了
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 温度变化 通知所有的观察者
        weatherData.setMeasurements(80,100,120);

    }
}
