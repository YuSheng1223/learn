package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/18 22:21
 */
public class RubberDuck implements  Quackable{

    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        System.out.println("橡皮鸭叫");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}