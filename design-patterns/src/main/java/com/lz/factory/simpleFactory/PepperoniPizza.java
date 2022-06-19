package com.lz.factory.simpleFactory;

/**
 * @author lz
 * @Package com.lz.factory.SimpleFactory
 * @Description:
 * @date 2021/9/11 16:56
 */
public class PepperoniPizza extends Pizza{

    @Override
    void prepare() {
        System.out.println("PepperoniPizza prepare......");
    }

    @Override
    void bake() {

    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
