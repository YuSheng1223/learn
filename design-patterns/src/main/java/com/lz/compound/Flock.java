package com.lz.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/19 22:18
 */
public class Flock  implements  Quackable{

    List quacks = new ArrayList<>();

    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }


    public void add (Quackable quackable){
        quacks.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quacks.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quacks.iterator();
        while(iterator.hasNext()){
            Quackable next = (Quackable) iterator.next();
            next.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
