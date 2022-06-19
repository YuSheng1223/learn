package com.lz.factory.AbsFactory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description: 抽象的披萨商店  抽象工厂 定义了产品制造的流程，但是却不限制具体的制造方法
 * @date 2021/9/11 17:21
 */
public  abstract  class PizzaStore {


    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;
    }

    /***
     * 由子类去决定如果做披萨
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
