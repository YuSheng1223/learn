package com.lz.observer;

/***
 * 观察者
 */
public interface Observer {

    /***
     * 当发生改变时，主题会把这些状态值当做方法的参数，传递给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);

}
