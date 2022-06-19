package com.lz.factory.factory;

/**
 * @author lz
 * @Package com.lz.factory.absFactory
 * @Description:
 * @date 2021/9/11 17:33
 */
public class FactoryTest {

    public static void main(String[] args) {

        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("NYStyleCheese");

    }
}
