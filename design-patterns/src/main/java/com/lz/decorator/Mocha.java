package com.lz.decorator;

/**
 * @author lz
 * @Package com.lz.decorator
 * @Description: 具体的装饰者 mocha 继承与调料抽象类r
 * @date 2021/8/24 15:15
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
