package com.lz.decorator;

/**
 * @author lz
 * @Package com.lz.decorator
 * @Description: 另一种饮料
 * @date 2021/8/24 15:09
 */
public class HouseBlend extends  Beverage{

    public HouseBlend() {
        description ="HouseBlend";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
