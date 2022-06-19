package com.lz.observer;


/***
 * 观察者  所以实现Observer接口 并且还是布告板 实现DisplayElement接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {

        this.weatherData = weatherData;
        // 将观察者注册到主题上  这样主题相关信息变动就能通知到观察者
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + " " + humidity + " " + pressure);

    }
}
