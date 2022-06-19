package com.lz.factory.simpleFactory;

/**
 * @author lz
 * @Package com.lz.factory.SimpleFactory
 * @Description: 简单工厂模式测试
 * @date 2021/9/11 16:59
 */
public class FactoryTest {


    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");

    }
}
