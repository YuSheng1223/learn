package com.lz.decorator;

/**
 * @author lz
 * @Package com.lz.decorator
 * @Description: 浓缩咖啡
 * @date 2021/8/24 15:09
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
