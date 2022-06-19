package com.lz.factory.AbsFactory;

import com.lz.factory.AbsFactory.ingredient.Cheese;

/***
 * 原料工厂
 */
public interface PizzaIngredientFactory {

    /***
     * 创建奶酪
     * @return
     */
    Cheese createCheese();
}
