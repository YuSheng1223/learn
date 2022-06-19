package com.lz.factory.simpleFactory;

/**
 * @author lz
 * @Package com.lz.factory.SimpleFactory
 * @Description:
 * @date 2021/9/11 16:54
 */
public class CheesePizze extends Pizza {

    @Override
    void prepare() {
        System.out.println("CheesePizze prepare......");
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
