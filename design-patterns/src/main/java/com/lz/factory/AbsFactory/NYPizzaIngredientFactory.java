package com.lz.factory.AbsFactory;

import com.lz.factory.AbsFactory.ingredient.Cheese;

/**
 * @author lz
 * @Package com.lz.factory.AbsFactory
 * @Description:
 * @date 2021/9/11 18:18
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Cheese createCheese() {
        return new Cheese();
    }
}
