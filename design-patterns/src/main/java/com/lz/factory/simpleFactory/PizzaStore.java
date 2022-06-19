package com.lz.factory.simpleFactory;

/**
 * @author lz
 * @Package com.lz.factory.SimpleFactory
 * @Description: 披萨商店  属于工厂的客户
 * @date 2021/9/11 16:47
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;
    }
}
