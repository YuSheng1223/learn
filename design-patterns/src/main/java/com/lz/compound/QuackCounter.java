package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/18 22:33
 */
public class QuackCounter implements  Quackable {

    Quackable duck;

    static int numberOfQuacks;

    Observable observable;

    public QuackCounter(Quackable quackable) {
        this.duck = quackable;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }


    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();;
    }
}
