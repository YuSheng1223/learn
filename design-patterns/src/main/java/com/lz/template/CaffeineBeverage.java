package com.lz.template;

/**
 * @author lz
 * @Package com.lz.template
 * @Description:
 * @date 2022/3/6 9:37
 */
// 咖啡因饮料是一个抽象类
public abstract class CaffeineBeverage {

    /***
     * 现在用一个prepareRecipe方法来处理茶和咖啡、prepareRecipe被生命为final。因为我们不希望子类覆盖这个方法。
     * 将步骤2和步骤4泛华成为brew()和addCondiments()
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /***
     *  因为咖啡和茶处理这些方法的做法不同，所以和两个方法必须被声明为抽象，剩余的东西留给子类去关心
     */
    abstract void addCondiments();

    abstract void brew();

    /***
     *  固定的内容 则有父类定义好
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
