package com.lz.decorator;

/**
 * @author lz
 * @Package com.lz.decorator
 * @Description: 抽象类 饮料
 * @date 2021/8/24 15:09
 */
public abstract class Beverage {

    String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
