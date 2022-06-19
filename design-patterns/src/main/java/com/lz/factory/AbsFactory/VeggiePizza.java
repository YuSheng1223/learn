package com.lz.factory.AbsFactory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:29
 */
public class VeggiePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("NYStyleVeggiePizza prepare......");
    }

    @Override
    void bake() {
        System.out.println("NYStyleVeggiePizza bake......");
    }

    @Override
    void cut() {
        System.out.println("NYStyleVeggiePizza cut......");
    }

    @Override
    void box() {
        System.out.println("NYStyleVeggiePizza box......");
    }
}
