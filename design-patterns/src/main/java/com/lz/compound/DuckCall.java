package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/18 22:20
 */
public class DuckCall implements  Quackable{

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        System.out.println("鸭鸣器叫");
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