package com.lz.factory.AbsFactory;

import com.lz.factory.AbsFactory.ingredient.Cheese;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:22
 */
public abstract class Pizza {

    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println(" bake...........");
    }

    void cut() {
        System.out.println(" cut...........");
    }


    void box() {
        System.out.println(" box...........");
    }


}
