package com.lz.factory.factory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:28
 */
public class NYStyleCheesePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("NYStyleCheesePizza prepare......");
    }

    @Override
    void bake() {
        System.out.println("NYStyleCheesePizza bake......");
    }

    @Override
    void cut() {
        System.out.println("NYStyleCheesePizza cut......");
    }

    @Override
    void box() {
        System.out.println("NYStyleCheesePizza box......");
    }
}
