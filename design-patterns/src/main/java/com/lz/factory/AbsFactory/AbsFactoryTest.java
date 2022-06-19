package com.lz.factory.AbsFactory;

/**
 * @author lz
 * @Package com.lz.factory.AbsFactory
 * @Description:
 * @date 2021/9/11 18:26
 */
public class AbsFactoryTest {

    public static void main(String[] args) {

        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        nyPizzaStore.orderPizza("NYStyleCheese");

    }
}
