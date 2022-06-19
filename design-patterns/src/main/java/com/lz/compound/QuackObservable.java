package com.lz.compound;


/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/19 22:29
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();
}
