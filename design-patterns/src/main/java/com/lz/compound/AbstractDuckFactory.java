package com.lz.compound;

/**
 * @author lz
 * @Package com.lz.compound
 * @Description:
 * @date 2022/4/18 22:42
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
