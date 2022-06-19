package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/19 22:48
 */
public class Quackologist implements  Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist :" + duck + " just quacked");
    }
}
