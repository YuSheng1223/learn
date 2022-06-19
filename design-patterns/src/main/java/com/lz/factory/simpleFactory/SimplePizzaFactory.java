package com.lz.factory.simpleFactory;

/**
 * @author lz
 * @Package com.lz.factory.SimpleFactory
 * @Description: 披萨工厂   ---- 工厂类
 * @date 2021/9/11 16:48
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizze();
        } else if (type.equals("cheese")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
