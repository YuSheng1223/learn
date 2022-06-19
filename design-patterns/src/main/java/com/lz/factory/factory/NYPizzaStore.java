package com.lz.factory.factory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:28
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("NYStyleCheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("NYStyleVeggie".equals(type)) {
            return new NYStyleVeggiePizza();
        }

        return null;
    }
}
