package com.lz.factory.AbsFactory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:28
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        Pizza pizza = null;
        // 创建原料工厂
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();

        if ("NYStyleCheese".equals(type)) {
            pizza =  new CheesePizza(nyPizzaIngredientFactory);
        } else if ("NYStyleVeggie".equals(type)) {
            pizza =  new VeggiePizza();
        }

        return pizza;
    }
}
