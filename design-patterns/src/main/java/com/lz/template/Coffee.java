package com.lz.template;

/**
 * @author lz
 * @Package com.lz.template
 * @Description:
 * @date 2022/3/6 9:37
 */
public class Coffee extends CaffeineBeverage {


    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Boiling Water");
    }


}