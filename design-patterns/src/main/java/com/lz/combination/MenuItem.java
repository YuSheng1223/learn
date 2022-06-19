package com.lz.combination;


import java.util.Iterator;

/**
 * @author lz
 * @Package com.lz.combination
 * @Description:
 * @date 2022/4/3 16:09
 */
// 扩展MenuComponent
public class MenuItem extends MenuComponent {

    /**
     * 菜品名称
     */
    String name;
    /***
     * 描述
     */
    String description;
    /***
     * 素食
     */
    boolean vegetarian;
    /***
     * 价格
     */
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }
    /***
     *  这和之前的实现不一样，在MenuComponent类里我们覆盖了print()方法。
     *  对菜单项来说，此方法会打印出完整的菜单项，包括 名字 描述 价格 是否为素食
     */
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    @Override
    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

}