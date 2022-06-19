package com.lz.template;

/**
 * @author lz
 * @Package com.lz.template
 * @Description:
 * @date 2022/3/6 9:38
 */
public class Tea extends CaffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

}