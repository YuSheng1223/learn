package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/18 22:29
 */
public class GooseAdapter implements Quackable {


    Observable observable;

    Goose goose;


    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
