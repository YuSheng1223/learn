package com.lz.factory.AbsFactory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:28
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("NYStyleCheesePizza prepare......");
        // 使用原料工厂创建原料
        cheese = pizzaIngredientFactory.createCheese();
    }

}
