package com.lz.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lz
 * @Package com.lz.template
 * @Description:
 * @date 2022/3/6 9:39
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {


    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("Boiling Water");
    }

    /***
     *  覆盖了钩子方法，并提供了自己的功能
     * @return
     */
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {

        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n) ?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }


    public static void main(String[] args) {

        CaffeineBeverageWithHook coffeeWithHook = new CoffeeWithHook();

        coffeeWithHook.prepareRecipe();
    }
}