package com.lz.template;

/**
 * @author lz
 * @Package com.lz.template
 * @Description:
 * @date 2022/3/6 9:39
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void addCondiments();

    abstract void brew();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /***
     *   这里定义了一个方法，(通常)是空的缺省实现。这个方法只会返回true，不做别的事情
     *
     *   这就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做
     *
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
