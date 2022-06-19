package com.lz.decorator;

/**
 * @author lz
 * @Package com.lz.decorator
 * @Description: 具体的装饰者 whip
 * @date 2021/8/24 15:19
 */
public class Whip extends  CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
